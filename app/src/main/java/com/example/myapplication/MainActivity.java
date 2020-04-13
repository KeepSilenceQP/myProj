package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends ComponentActivity {

    MyViewModel myViewModel;

    TextView txtShowCounter;
    Button btnAddCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        txtShowCounter = findViewById(R.id.txt_show_counter);
        btnAddCounter = findViewById(R.id.btn_add_counter);

        showCounter();
        btnAddCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.counter++;
                showCounter();
            }
        });
    }

    private void showCounter() {
        txtShowCounter.setText(
                String.format(
                        getResources().getString(R.string.counter_value),
                        myViewModel.counter
                ));
    }
}
