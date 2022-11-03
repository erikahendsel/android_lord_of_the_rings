package com.erikahendsel.lotr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.erikahendsel.lotr.adapter.LotrListAdapter
import com.erikahendsel.lotr.data.LotrApi
import com.erikahendsel.lotr.databinding.FragmentLotrListNewBinding
import com.erikahendsel.lotr.viewModel.LotrViewModel


class LotrListNewFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    private val viewModel: LotrViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //with fragments, the layout is inflated inside onCreateView
        val binding = FragmentLotrListNewBinding.inflate(inflater)
        viewModel.getLotrCharacters()
        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = this

        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel

        binding.lotrRecyclerView.adapter = LotrListAdapter()

        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
////        recyclerView = binding.lotrRecyclerView
////        recyclerView.layoutManager = LinearLayoutManager(context)
////
////        //recyclerView.adapter = LotrListAdapter(charactersDataSet)
////
////        // Use this setting to improve performance if you know that changes
////        // in content do not change the layout size of the RecyclerView
////        recyclerView.setHasFixedSize(true)
//
//    }
//
//    //reset _binding property as the view no longer exists
//    override fun onDestroy() {
//        super.onDestroy()
//    }
}