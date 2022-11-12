package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vier(View view) {
        String apikey="20489f9e3d7b5cf83babefe79e8103bb";
        String url="https://pro.openweathermap.org/data/2.5/forecast/climate?q={delhi},{country code}&appid={API key}";
    }
}