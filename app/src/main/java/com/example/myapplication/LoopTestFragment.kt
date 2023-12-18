package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentLoopTestBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class LoopTestFragment : Fragment() {

    private var _binding : FragmentLoopTestBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel : AstronautViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}

        requireActivity().onBackPressedDispatcher.addCallback(this) {showReturnDialog()}
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoopTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel.reinitializeData(false)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
        }
        updatePlateOnScreen()
        binding.answer1.setOnClickListener {
            onAnswerSelected(1)
        }
        binding.answer2.setOnClickListener {
            onAnswerSelected(2)
        }
        binding.answer3.setOnClickListener {
            onAnswerSelected(3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun onAnswerSelected(answer: Int) {
        sharedViewModel.checkedAnswerWrong(answer)
        if(sharedViewModel.currentAnswerCount.value == sharedViewModel.MAX_NO_OF_PLATES) {
            findNavController().navigate(R.id.action_loopTestFragment_to_resultsTestFragment)
        } else {
            sharedViewModel.getNextPlate()
            updatePlateOnScreen()
        }
    }

    private fun updatePlateOnScreen() {
        binding.plateImage.setImageResource(sharedViewModel.currentPlate.value!!.imageResource)
        val answerOrder = listOf<Int>(0, 1, 2)
        sharedViewModel.setOrder(answerOrder)
        binding.answer1.text = sharedViewModel.currentPlate.value!!.answers[answerOrder[0]].answer
        binding.answer2.text = sharedViewModel.currentPlate.value!!.answers[answerOrder[1]].answer
        binding.answer3.text = sharedViewModel.currentPlate.value!!.answers[answerOrder[2]].answer
    }

    private fun showReturnDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.return_dialog))
            .setMessage(getString(R.string.return_dialog_detail))
            .setCancelable(false)
            .setPositiveButton(getString(R.string.confirm_btn)) { _, _ ->
                findNavController().navigate(R.id.action_loopTestFragment_to_chooseModeFragment)
            }
            .setNegativeButton(getString(R.string.cancel_btn)) { _, _ ->

            }
            .show()
    }
}