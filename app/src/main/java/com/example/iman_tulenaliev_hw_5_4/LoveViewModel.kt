package com.example.iman_tulenaliev_hw_5_4

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.iman_tulenaliev_hw_5_4.remote.LoveModel

class LoveViewModel: ViewModel() {

    private val repository = Repository()

    fun getLiveLoveModel(firstname: String, secondname: String): LiveData<LoveModel>{
        return repository.getPercentage(firstname, secondname)
    }
}