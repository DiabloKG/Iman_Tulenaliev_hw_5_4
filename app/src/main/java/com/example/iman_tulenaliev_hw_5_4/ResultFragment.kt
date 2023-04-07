package com.example.iman_tulenaliev_hw_5_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iman_tulenaliev_hw_5_4.databinding.FragmentResultBinding
import com.example.iman_tulenaliev_hw_5_4.remote.LoveModel

class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
    }

    private fun setData() {
        if (arguments != null){
            val data = arguments?.getSerializable("love") as LoveModel
            with(binding){
                tvResult.text = data.percentage
                tvScore.text = data.result
                tvFirstName.text = data.fname
                tvSecondName.text = data.sname
            }
        }
    }
}