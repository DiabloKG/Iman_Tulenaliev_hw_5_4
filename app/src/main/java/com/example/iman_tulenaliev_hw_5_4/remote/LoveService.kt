package com.example.iman_tulenaliev_hw_5_4.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoveService {
    private var retrofit =
        Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/").addConverterFactory(
            GsonConverterFactory.create()
        ).build()

    var api = retrofit.create(LoveApi::class.java)
}