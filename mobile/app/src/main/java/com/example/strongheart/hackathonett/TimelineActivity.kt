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
        for (i in 0..5) {
            timelineRecyclerAdapter.addTimepoint(timepoints[i])
            timelineRecyclerAdapter.addEvent(eventList[i])
        }
    }

    companion object FakeData {

        val timepoints: ArrayList<Timepoint> = arrayListOf(
                Timepoint("6 hours"),
                Timepoint("24 hours"),
                Timepoint("1 day"),
                Timepoint("2 days"),
                Timepoint("3 days"),
                Timepoint("1 week"))

        val eventList: ArrayList<Event> = arrayListOf(
                Event("calculus", "bestTest", 24),
                Event("calculus", "bestTest", 24),
                Event("calculus", "bestTest", 24),
                Event("calculus", "bestTest", 24),
                Event("calculus", "bestTest", 24),
                Event("calculus", "bestTest", 24, true)
        )

    }

}
