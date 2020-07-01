package com.example.databindingdemo

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    val firstName: ObservableField<String> = ObservableField("")
    val lastName: ObservableField<String> = ObservableField("")

    var counter: Int = 0
}
