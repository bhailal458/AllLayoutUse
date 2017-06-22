package com.example.sparken02.layoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CoordinatelayoutDemo extends AppCompatActivity {

    private Intent intentGride;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinatelayout_demo);
    }

    public void nextGrid(View view) {
        intentGride = new Intent(CoordinatelayoutDemo.this,GridLayoutDemo.class);
        startActivity(intentGride);
    }
}
