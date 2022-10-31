package com.erikahendsel.lotr.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.erikahendsel.lotr.databinding.ListItemBinding
import com.erikahendsel.lotr.model.CharacterDetails

class LotrListAdapter(
    private val dataset: List<CharacterDetails>
    )
    : RecyclerView.Adapter<LotrListAdapter.LotrItemViewHolder>(){

    inner class LotrItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LotrItemViewHolder {
        // create a new view
        return LotrItemViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LotrItemViewHolder, position: Int) {
        holder.binding.apply {
            val item = dataset[position]
            itemTitle.text = item.name
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}