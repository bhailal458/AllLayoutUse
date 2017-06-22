package com.example.sparken02.layoutpractice;

import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlowLayoutDemo extends AppCompatActivity {

    private Button btnflow;
    private Intent intentFlow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_layout_demo);

        btnflow = (Button) findViewById(R.id.btnFlowLayout);
        btnflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentFlow = new Intent(FlowLayoutDemo.this, ParcticeCoordinateLAyouot.class);
                startActivity(intentFlow);
            }
        });
    }
}
