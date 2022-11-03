package com.erikahendsel.lotr.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.erikahendsel.lotr.model.CharacterDetails

@BindingAdapter("listData")
fun bindRecyclerView(
    recyclerView: RecyclerView,
    data: List<CharacterDetails>?
) {
    val adapter = recyclerView.adapter as LotrListAdapter
    adapter.submitList(data)
}