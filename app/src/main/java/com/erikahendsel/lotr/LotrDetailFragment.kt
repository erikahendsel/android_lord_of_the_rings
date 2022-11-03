package com.erikahendsel.lotr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.erikahendsel.lotr.databinding.FragmentLotrDetailBinding
import com.erikahendsel.lotr.viewModel.LotrViewModel

class LotrDetailFragment : Fragment() {
    private val viewModel: LotrViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLotrDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // Inflates the layout for this fragment
        return binding.root
    }
}