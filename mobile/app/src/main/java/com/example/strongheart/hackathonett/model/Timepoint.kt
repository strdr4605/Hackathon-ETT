package com.example.strongheart.hackathonett.model

import com.example.strongheart.hackathonett.adapter.ViewType

data class Timepoint(val timepoint: String): ViewType {
    override fun getViewType(): Int = ViewType.LINE
}