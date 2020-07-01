package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBindingImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val userVM: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val dataBinding: ActivityMainBindingImpl = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding.userViewModel = userVM

        dataBinding.button.setOnClickListener {
            if (userVM.firstName.get().isNullOrEmpty() || userVM.lastName.get().isNullOrEmpty()
                    || userVM.firstName.get().equals("long") || userVM.lastName.get().equals("click")) {
                userVM.firstName.set("qin")
                userVM.lastName.set("peng")
            }
        }

        // kotlin support.
        button.setOnLongClickListener {
            userVM.firstName.set("long")
            userVM.lastName.set("click")
            true
        }
    }
}
