package com.example.strongheart.hackathonett

import android.os.Bundle
import android.app.Activity
import android.support.v7.widget.LinearLayoutManager
import com.example.strongheart.hackathonett.adapter.TimelineRecyclerAdapter
import com.example.strongheart.hackathonett.model.Event
import com.example.strongheart.hackathonett.model.Timepoint
import kotlinx.android.synthetic.main.activity_time_line.*

class TimelineActivity : Activity() {
    lateinit var timelineRecyclerAdapter: TimelineRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_line)
        timelineRecyclerAdapter = TimelineRecyclerAdapter()
        recycler_view.adapter = timelineRecyclerAdapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        for (i in 0..10) {
            val timepoint = Timepoint("24 hours")
            timelineRecyclerAdapter.addTimepoint(timepoint)
            val event = Event("calculus", "bestTest", 24)
            timelineRecyclerAdapter.addEvent(event)
        }
    }
}
