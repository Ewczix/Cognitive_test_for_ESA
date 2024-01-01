package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentResultsVersusBinding

class ResultsVersusFragment : Fragment() {
    private var _binding: FragmentResultsVersusBinding? = null
    private val binding get() = _binding!!

    private val viewModel : AstronautViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}

        requireActivity().onBackPressedDispatcher.addCallback(this) {
            findNavController().navigate(R.id.action_resultsVersusFragment_to_chooseModeFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultsVersusBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.scoreValue.text = viewModel.currentPlate.value.toString()
        binding.returnToMenu.setOnClickListener {
            findNavController().navigate(R.id.action_resultsVersusFragment_to_chooseModeFragment)
        }
        binding.submit.setOnClickListener {
            viewModel.setName(binding.displayedName.editText?.text.toString().trim() ?: "error")
            findNavController().navigate(R.id.action_resultsVersusFragment_to_leaderboardFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}