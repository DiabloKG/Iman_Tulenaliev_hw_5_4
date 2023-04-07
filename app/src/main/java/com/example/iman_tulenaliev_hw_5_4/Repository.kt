package com.example.iman_tulenaliev_hw_5_4

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.iman_tulenaliev_hw_5_4.remote.LoveModel
import com.example.iman_tulenaliev_hw_5_4.remote.LoveService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getPercentage(firstname: String, secondname: String): MutableLiveData<LoveModel>{
        val mutableLiveData = MutableLiveData<LoveModel>()
        LoveService().api.getPercentage(firstname, secondname).enqueue(object : Callback<LoveModel>{
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful){
                    mutableLiveData.postValue(response.body())
                    Log.e("shh", "onResponse ${response.body()}")
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("shh", "onFailure: ${t.message}")
            }

        })
        return mutableLiveData
    }
}