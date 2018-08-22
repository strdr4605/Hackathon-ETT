package com.example.strongheart.hackathonett.network

import android.util.Log
import com.example.strongheart.hackathonett.network.models.GetDataResponse
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APICommunication: APIService {

    lateinit var retrofitApi: RetrofitApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://url.md/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        retrofitApi = retrofit.create(RetrofitApi::class.java)
    }

    override fun getData() {
        val request = retrofitApi.getData()

        request.enqueue(object : Callback<GetDataResponse> {
            override fun onResponse(call: Call<GetDataResponse>, response: retrofit2.Response<GetDataResponse>) {
                Log.v("Response", "" + response.body()!!)
            }

            override fun onFailure(call: Call<GetDataResponse>, throwable: Throwable) {
                Log.e("Throwable", "" + throwable)
            }
        })
    }
}