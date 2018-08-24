package com.example.strongheart.hackathonett.adapter

interface ViewType {
    fun getViewType(): Int

    companion object {
        val LINE = 1
        val ITEM = 2
    }
}