package com.udacity.shoestore.ui.instructions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.udacity.shoestore.databinding.ItemListInstructionsBinding
import com.udacity.shoestore.models.Instruction
import timber.log.Timber

class InstructionAdapter :
    ListAdapter<Instruction, InstructionAdapter.ViewHolder>(InstructionCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    class ViewHolder private constructor(val binding: ItemListInstructionsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Instruction) {
            binding.instruction = data

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemListInstructionsBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class InstructionCallback : DiffUtil.ItemCallback<Instruction>() {

    override fun areItemsTheSame(oldItem: Instruction, newItem: Instruction): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Instruction, newItem: Instruction): Boolean {
        return oldItem == newItem
    }
}