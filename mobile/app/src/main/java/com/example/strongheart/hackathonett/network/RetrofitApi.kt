package com.example.strongheart.hackathonett.network

import com.example.strongheart.hackathonett.network.models.GetDataResponse
import retrofit2.Call
import retrofit2.http.POST

interface RetrofitApi {
    @POST("/")
    fun getData(): Call<GetDataResponse>
}