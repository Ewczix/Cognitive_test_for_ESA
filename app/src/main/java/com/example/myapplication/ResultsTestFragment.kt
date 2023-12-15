package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ResultsTestFragment : Fragment() {

    private var _binding : FragmentResultsTestBinding? = null
    private val binding get() = _binding!!
    private val viewModel : AstronautViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {  }
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            findNavController().navigate(R.id.action_resultsTestFragment_to_chooseModeFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultsTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

        val astronautsResults = translateResults()
        binding.leaderbooardDescription.text = astronautsResults

        binding.returnToMenu.setOnClickListener {
            findNavController().navigate(R.id.action_resultsTestFragment_to_chooseModeFragment)
        }
    }

    fun translateResults() : String{
        var resultString = ""
        val visualScore = viewModel.astronautsResults.value!![1]
        val technicScore = viewModel.astronautsResults.value!![2]
        val englishScore = viewModel.astronautsResults.value!![3]
        val mathScore = viewModel.astronautsResults.value!![4]

        resultString += ("Visual: $visualScore")
        resultString += ("Technic: $technicScore")
        resultString += ("English: $englishScore")
        resultString += ("Math: $mathScore")

        return resultString
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}