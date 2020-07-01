package com.example.databindingdemo

import android.widget.TextView
import androidx.databinding.BindingAdapter

class CommonBindingAdapter {

    companion object {
        @JvmStatic
        @BindingAdapter("android:text")
        fun setMyText(textView: TextView, content: String) {
            textView.setText("$content All with suffix!!!")
        }
    }

}