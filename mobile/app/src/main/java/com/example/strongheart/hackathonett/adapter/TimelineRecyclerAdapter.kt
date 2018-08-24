package com.example.strongheart.hackathonett.adapter

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.strongheart.hackathonett.model.Event
import com.example.strongheart.hackathonett.model.Timepoint

class TimelineRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: ArrayList<ViewType>

    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()

    init {
        items = ArrayList()
        delegateAdapters.put(ViewType.LINE, TimePointItemDelegateAdapter())
        delegateAdapters.put(ViewType.ITEM, EventItemDelegateAdapter())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, items[position])
    }

    override fun getItemViewType(position: Int) = items[position].getViewType()


    fun addEvent(item: Event) {
        this.items.add(item)
        notifyDataSetChanged()
    }

    fun addTimepoint(item: Timepoint) {
        this.items.add(item)
        notifyDataSetChanged()
    }
}