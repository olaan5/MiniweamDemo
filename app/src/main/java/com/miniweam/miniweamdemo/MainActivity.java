package com.miniweam.miniweamdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button enterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterBtn = findViewById(R.id.enter_btn);
        enterBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,
                MainActivity2.class)));
    }
}