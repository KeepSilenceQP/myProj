package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends ComponentActivity {

    MyViewModel myViewModel;

//    TextView txtShowCounter;
//    Button btnAddCounter;

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
//        txtShowCounter = findViewById(R.id.txt_show_counter);
//        btnAddCounter = findViewById(R.id.btn_add_counter);

        showCounter();
//        btnAddCounter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.counter++;
//                showCounter();
//            }
//        });
//        activityMainBinding.btnAddCounter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myViewModel.counter++;
//                showCounter();
//            }
//        });
        //include layout的情况。
        activityMainBinding.includes.btnAddCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.counter++;
                showCounter();
            }
        });

        setContentView(activityMainBinding.getRoot());
    }

    private void showCounter() {
//        txtShowCounter.setText(
//                String.format(
//                        getResources().getString(R.string.counter_value),
//                        myViewModel.counter)
//        );
        activityMainBinding.txtShowCounter.setText(
                String.format(
                        getResources().getString(R.string.counter_value),
                        myViewModel.counter)
        );
    }
}
