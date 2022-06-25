package com.project.aac_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var inputText: MutableLiveData<String> = MutableLiveData()

    fun getInputText() = inputText

    fun updateText(newText: String) {
        inputText.value = newText
    }
}