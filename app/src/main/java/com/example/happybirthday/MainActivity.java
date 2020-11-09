package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.wish);
    }
    public void birthdaywish(View view) {
        String name = editText.getText().toString();
        Intent intent = new Intent(this, birthday.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
}