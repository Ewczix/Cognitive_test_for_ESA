package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentChooseModeBinding

class ChooseModeFragment : Fragment() {

    private var _binding : FragmentChooseModeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChooseModeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.testOption.setOnClickListener{
            changeDescription(false)
        }
        binding.versusOption.setOnClickListener{
            changeDescription(true)
        }
        binding.startGame.setOnClickListener{
            if(binding.selectMode.checkedButtonId ==R.id.test_option){
                findNavController().navigate(R.id.action_chooseModeFragment_to_loopTestFragment)
            } else {
                findNavController().navigate(R.id.action_chooseModeFragment_to_loopVersusFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun changeDescription(state: Boolean) {
        if(state)
        {
            _binding!!.descriptionImage.setImageResource(R.drawable.podium)
            _binding!!.descriptionText.setText(R.string.versus_description)
        }
        else
        {
            _binding!!.descriptionImage.setImageResource(R.drawable.brain)
            _binding!!.descriptionText.setText(R.string.test_description)
        }
    }

}