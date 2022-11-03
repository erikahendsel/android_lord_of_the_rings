package com.erikahendsel.lotr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.erikahendsel.lotr.adapter.LotrListAdapter
import com.erikahendsel.lotr.adapter.LotrListener
import com.erikahendsel.lotr.databinding.FragmentLotrListBinding
import com.erikahendsel.lotr.viewModel.LotrViewModel


class LotrListFragment : Fragment() {

    private val viewModel: LotrViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //with fragments, the layout is inflated inside onCreateView
        val binding = FragmentLotrListBinding.inflate(inflater)
        viewModel.getLotrCharacters()
        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = this

        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel

        binding.lotrRecyclerView.adapter = LotrListAdapter(LotrListener { character ->
            viewModel.onLotrCharacterClicked(character)
            findNavController()
                .navigate(R.id.action_lotrListNewFragment_to_lotrDetailFragment)
        })

        return binding.root
    }
}