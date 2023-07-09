package com.gy25m.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.gy25m.retrofit.databinding.RecyclerItemBinding

class MyAdapter(private var items:List<Person>) : Adapter<MyAdapter.VH>() {
    inner class VH(var binding: RecyclerItemBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
    = VH(DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.recycler_item,parent,false))

    override fun getItemCount(): Int=items.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.person=items[position]
    }
}