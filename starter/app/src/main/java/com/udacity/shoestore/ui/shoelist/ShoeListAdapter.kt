package com.udacity.shoestore.ui.shoelist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.udacity.shoestore.databinding.ItemListShoesBinding
import com.udacity.shoestore.models.Shoe

class ShoeAdapter :
    ListAdapter<Shoe, ShoeAdapter.ViewHolder>(ShoeCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    class ViewHolder private constructor(val binding: ItemListShoesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Shoe) {
            binding.shoe = data

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemListShoesBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class ShoeCallback : DiffUtil.ItemCallback<Shoe>() {

    override fun areItemsTheSame(oldItem: Shoe, newItem: Shoe): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Shoe, newItem: Shoe): Boolean {
        return oldItem == newItem
    }
}