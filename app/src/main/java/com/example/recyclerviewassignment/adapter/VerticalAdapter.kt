package com.example.recyclerviewassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewassignment.R
import com.example.recyclerviewassignment.model.MockModel

class VerticalAdapter(private val data:List<MockModel>):  RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {
    inner class VerticalViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private var tvString: TextView = itemView.findViewById<TextView>(R.id.tvString)

        fun bindData(mockModel: MockModel){
            tvString.text = mockModel.item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        return VerticalViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.single_vertical_view, parent,false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.bindData(data[position])

    }
}