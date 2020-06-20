package com.njsg.darkmode6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    TextView textNextActivity;
    CardView MechSem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        textNextActivity=findViewById(R.id.textNextActivity);
        MechSem3=findViewById(R.id.MechSem3);

        textNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NextActivity.this,com.njsg.darkmode6.TestActivity.class);
                startActivity(intent);
            }
        });

        MechSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(NextActivity.this,TestActivity.class);
                startActivity(i);
            }
        });

    }
}