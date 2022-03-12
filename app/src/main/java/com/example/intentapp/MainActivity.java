package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent);
    }

    public void clickHospital(View view) {
        //icon rumah sakit
        Intent intent = new Intent(this, hospital.class);
        startActivity(intent);
    }
}