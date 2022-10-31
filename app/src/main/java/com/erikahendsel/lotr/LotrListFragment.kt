package com.erikahendsel.lotr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erikahendsel.lotr.adapter.LotrListAdapter
import com.erikahendsel.lotr.data.Datasource
import com.erikahendsel.lotr.databinding.FragmentLotrListBinding

class LotrListFragment : Fragment() {

    //Why make _binding nullable? Because you can't inflate the layout until onCreateView() is called.
    private var _binding: FragmentLotrListBinding? = null
    //We make sure to give binding a value, so we can add !! so we don't have to litter our code with "?" question marks
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private var charactersDataSet = Datasource().loadCharacters()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //with fragments, the layout is inflated inside onCreateView
        _binding = FragmentLotrListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.lotrRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)

        recyclerView.adapter = LotrListAdapter(charactersDataSet)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }

    //reset _binding property as the view no longer exists
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}