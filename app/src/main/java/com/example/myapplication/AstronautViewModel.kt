package com.example.myapplication

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.AstronautTest
import com.example.myapplication.data.Datasource
import com.example.myapplication.data.answerMeaning
import com.example.myapplication.network.LeaderboardScore
import com.example.myapplication.network.ResponseScore
import kotlinx.coroutines.launch

class AstronautViewModel : ViewModel() {
    var MAX_NO_OF_PLATES = 102
    val VERSUS_COUNT = 10
    val TEST_COUNT = 36
    val SCORE_DECREASE = 7
    val COUNTDOWN_TIME = 30.0f

    private val _scores = MutableLiveData<List<LeaderboardScore>>()
    val scores : LiveData<List<LeaderboardScore>> = _scores

    private val _wrongScores = MutableLiveData(mutableListOf(0, 0, 0, 0, 0))
    val wrongScores : LiveData<MutableList<Int>> = _wrongScores

    private val _displayedName = MutableLiveData<String>()
    val displayedName : LiveData<String> = _displayedName

    private val _currentScore = MutableLiveData<Float>(100f)
    val currentScore: LiveData<Float>
        get() = _currentScore

    private val _currentAnswerCount = MutableLiveData<Int>(0)
    val currentAnswerCount: LiveData<Int>
        get() = _currentAnswerCount

    private var platesList: MutableList<AstronautTest> = mutableListOf()

    private val _currentPlate = MutableLiveData<AstronautTest>()
    val currentPlate: LiveData<AstronautTest>
        get() = _currentPlate

    private var _binding: FragmentLoopVersusBinding? = null
    private val binding get() = _binding!!

    private val _currentTime = MutableLiveData<Float>(30f)
    val currentTime: LiveData<Float>
        get() = _currentTime

    private var _answerOrder: List<Int> = listOf()

    var onTimerEnd = {}

    fun getNextPlate() {
        _currentPlate.value = platesList[currentAnswerCount.value!!]
        _currentAnswerCount.value = (_currentAnswerCount.value ?: 0) + 1
    }

    fun getPlateList() {
        val datasource = Datasource()
        platesList = datasource.loadPlates()
            .shuffled()
            .take(MAX_NO_OF_PLATES)
            .toMutableList()
    }

    fun reinitializeData(isVersus: Boolean) {
        if(isVersus) {
            MAX_NO_OF_PLATES = VERSUS_COUNT
        } else {
            MAX_NO_OF_PLATES = TEST_COUNT
        }
        _currentScore.value = 100f
        _currentAnswerCount.value = 0
        _wrongScores.value = mutableListOf(0, 0, 0, 0, 0)
        getPlateList()
        getNextPlate()
    }

    fun checkedAnswer(answer: Int) {
        if(currentPlate.value!!.answers[_answerOrder[answer-1]].meaning != answerMeaning.CORRECT)
        {
            _currentScore.value = _currentScore.value!!.minus(SCORE_DECREASE)
        }
    }

    fun checkedAnswerWrong(answer: Int) {
        _wrongScores.value!![currentPlate.value!!.answers[_answerOrder[answer - 1]].meaning.number] =
            _wrongScores.value!![currentPlate.value!!.answers[_answerOrder[answer - 1]].meaning.number] + 1
    }

    fun setOrder(order: List<Int>) {
        _answerOrder = order
    }

    fun startCountdown() {
        object : CountDownTimer((COUNTDOWN_TIME *1000).toLong(), 100){
            override fun onTick(millisUntilFinished: Long) {
                _currentTime.value = (millisUntilFinished / 100).toFloat() / 10
            }

            override fun onFinish() {
                onTimerEnd()
            }
        }.start()
    }

    fun timeSubtraction() {
        _currentScore.value = _currentScore.value!!.minus(COUNTDOWN_TIME - _currentTime.value!!)
        _currentScore.value = _currentScore.value!!.minus((MAX_NO_OF_PLATES - currentAnswerCount.value!!) * SCORE_DECREASE)
        onTimerEnd()
    }

    fun setName(name: String) {
        _displayedName.value = name
    }

    fun updateLeaderboard() {
        viewModelScope.launch{
            val response = LearboardApi.retrofitService.addRecord(ResponseScore(_displayedName.value.toString(), _currentScore.value!!.toFloat()))

            if(response.isSuccessful) {
                _scores.value = LeaderboardApi.retrofitService.getLeaderboard()
            } else {
                _scores.value = listOf()
            }
        }
    }
}