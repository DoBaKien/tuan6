package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showText(String input) {
        BlankFragment2 bottomFragment
                = (BlankFragment2) this.getSupportFragmentManager()
                .findFragmentById(R.id.fragbot);
        bottomFragment.showText(input);
    }
}