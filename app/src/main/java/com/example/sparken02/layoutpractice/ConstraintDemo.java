package com.example.sparken02.layoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintDemo extends AppCompatActivity {
    private Button btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_demo);
        btnConstraint = (Button) findViewById(R.id.btnconstraint);
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentConstraint = new Intent(ConstraintDemo.this,FrameLayoutDemo.class);
                startActivity(intentConstraint);
            }
        });
    }
}
