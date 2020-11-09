package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class birthday extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        textView = findViewById(R.id.happy);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText("Happy Birthday \n "+name);
    }
}