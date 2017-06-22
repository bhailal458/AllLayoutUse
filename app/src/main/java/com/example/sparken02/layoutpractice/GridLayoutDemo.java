package com.example.sparken02.layoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GridLayoutDemo extends AppCompatActivity {

    private Intent intentflow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout_demo);
    }

    public void nextflow(View view) {
        intentflow = new Intent(GridLayoutDemo.this,FlowLayoutDemo.class);
        startActivity(intentflow);

    }
}
