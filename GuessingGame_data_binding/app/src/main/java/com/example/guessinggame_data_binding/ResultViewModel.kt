package com.example.guessinggame_data_binding

import androidx.lifecycle.ViewModel

class ResultViewModel(finalResult: String) : ViewModel(){
    val result = finalResult
}