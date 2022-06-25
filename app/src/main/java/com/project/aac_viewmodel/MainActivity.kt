package com.project.aac_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.project.aac_viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //ViewModel 사용 회전시 데이터 보존
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getInputText().observe(this, Observer {
            binding.resultText.text = it
        })

        binding.button.setOnClickListener {
            viewModel.updateText(binding.editText.text.toString())
        }

//        //ViewModel 미사용 회전시 데이터 미보존
//        binding.button.setOnClickListener {
//            resultText.text = editText.text
//        }
    }
}