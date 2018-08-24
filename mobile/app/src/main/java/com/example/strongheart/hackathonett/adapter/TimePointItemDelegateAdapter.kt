package com.example.strongheart.hackathonett.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.strongheart.hackathonett.R
import com.example.strongheart.hackathonett.model.Timepoint
import kotlinx.android.synthetic.main.item_time_point.view.*

class TimePointItemDelegateAdapter: ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = TimePointItemViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TimePointItemViewHolder
        holder.bind(item as Timepoint)
    }

    inner class TimePointItemViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_time_point, parent, false)) {

        fun bind(item: Timepoint) = with(itemView) {
            time.text = item.timepoint
        }
    }
}