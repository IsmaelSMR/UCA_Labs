package com.damo.ucalabs.ui.lab3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Lab3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "no c"
    }
    val text: LiveData<String> = _text
}