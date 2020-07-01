package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
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
        dataBinding.listeners = Listeners(userVM)
        dataBinding.hiStr = "little brother!"

//        dataBinding.counter = userVM.counter

        dataBinding.counter = 0

//        dataBinding.button.setOnClickListener {
//            if (userVM.firstName.get().isNullOrEmpty() || userVM.lastName.get().isNullOrEmpty()
//                    || userVM.firstName.get().equals("long") || userVM.lastName.get().equals("click")) {
//                userVM.firstName.set("qin")
//                userVM.lastName.set("peng")
//            }
//        }

        dataBinding.button.setOnClickListener {
//            userVM.counter = userVM.counter.plus(1)
//            dataBinding.counter = userVM.counter
            var i : Int = dataBinding.counter as Int
            dataBinding.counter = i.plus(1)
        }

        // kotlin support.
        button.setOnLongClickListener {
            userVM.firstName.set("long")
            userVM.lastName.set("click")
            true
        }
    }

    class Listeners(private val user: UserViewModel) {
        // for Button click listener, form one
        fun onButtonClick(v: View) {
            user.firstName.set("U Clicked!!!")
            user.lastName.set("U Clicked!!!")
        }

        // for Button click listener, form two
        fun onButtonClick() {
            user.firstName.set("U Clicked!!!")
            user.lastName.set("U Clicked!!!")
        }

        // for EditText text change listener, form one
        fun afterEditTxtChanged(e: Editable) {
            user.firstName.set(e.toString())
        }

        // for EditText text change listener, form two
        fun afterEditTxtChanged(e: Editable, s: String) {
            user.firstName.set("$e, i am from xml: $s")
        }
    }
}
