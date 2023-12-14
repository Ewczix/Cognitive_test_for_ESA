package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class LoopTestFragment : Fragment() {

    private var _binding : FramentLoopTestBidning? = null
    private val binding get() = _binding!!

    private val sharedViewModel : AstronautViewModel by activitiViewModels()

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
}