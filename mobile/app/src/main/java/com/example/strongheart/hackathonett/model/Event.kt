package com.example.strongheart.hackathonett.model

import com.example.strongheart.hackathonett.adapter.ViewType

data class Event(val subject: String,
                 val name: String,
                 val points: Int,
                 val isLastItem: Boolean = false) : ViewType {

    override fun getViewType(): Int = ViewType.ITEM
}