package com.example.sparken02.layoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FrameLayoutDemo extends AppCompatActivity {
    private Intent intentFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_demo);
    }
    public void nextCoordinate(View view){
        intentFrame = new Intent(FrameLayoutDemo.this,CoordinatelayoutDemo.class);
        startActivity(intentFrame);
    }


}
