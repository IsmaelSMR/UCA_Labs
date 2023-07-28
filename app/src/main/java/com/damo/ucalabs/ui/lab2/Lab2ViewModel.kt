package com.damo.ucalabs.ui.lab2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Lab2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "puta"
    }
    val text: LiveData<String> = _text
}