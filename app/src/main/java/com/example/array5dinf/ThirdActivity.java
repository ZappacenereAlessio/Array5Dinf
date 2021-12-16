package com.example.array5dinf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        ImageView img =(ImageView) findViewById(R.id.images);

        img.setImageResource(getIntent().getIntExtra("img", 0));
    }
}