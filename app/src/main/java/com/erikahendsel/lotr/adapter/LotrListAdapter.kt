package com.erikahendsel.lotr.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.erikahendsel.lotr.databinding.ListItemBinding
import com.erikahendsel.lotr.model.CharacterDetails

class LotrListAdapter() : ListAdapter<CharacterDetails,
        LotrListAdapter.LotrViewHolder>(DiffCallback) {

    class LotrViewHolder(private var binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(CharacterDetails: CharacterDetails) {
            binding.character = CharacterDetails
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<CharacterDetails>() {
        override fun areItemsTheSame(
            oldItem: CharacterDetails,
            newItem: CharacterDetails
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: CharacterDetails,
            newItem: CharacterDetails
        ): Boolean {
            return oldItem.name == newItem.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LotrViewHolder {
        return LotrViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun onBindViewHolder(holder: LotrViewHolder, position: Int) {
        val character = getItem(position)
        holder.bind(character)
    }
}