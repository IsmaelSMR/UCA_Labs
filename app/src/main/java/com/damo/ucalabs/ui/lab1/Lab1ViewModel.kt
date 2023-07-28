package com.damo.ucalabs.ui.lab1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Lab1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "coño de la madre"
    }
    val text: LiveData<String> = _text
}