package com.MAD_APP.catchthepuppy.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.MAD_APP.catchthepuppy.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private var _binding : FragmentResultBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(layoutInflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val point = ResultFragmentArgs.fromBundle(it).point
            binding.scoreText.text = "Your Score:$point"
        }

        binding.homeBtn.setOnClickListener {
            val action = ResultFragmentDirections.actionResultFragmentToStartFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}