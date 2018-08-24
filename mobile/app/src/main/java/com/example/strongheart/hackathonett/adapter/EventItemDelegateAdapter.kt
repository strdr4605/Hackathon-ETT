package com.example.strongheart.hackathonett.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.strongheart.hackathonett.R
import com.example.strongheart.hackathonett.model.Event
import kotlinx.android.synthetic.main.item_event.view.*
import pl.hypeapp.materialtimelineview.MaterialTimelineView

class EventItemDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = EventItemViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as EventItemViewHolder
        holder.bind(item as Event)
    }

    inner class EventItemViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)) {

        fun bind(item: Event) = with(itemView) {
            // If is last item we need to change position type to last.
            if (item.isLastItem) {
                item_event_timeline.position = MaterialTimelineView.POSITION_LAST
            }
            subject.text = item.subject
            name.text = item.name
            points.text = item.points.toString()
        }

    }
}