package com.njsg.darkmode6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    TextView tvChangeTheme;
    Switch switchMode;
    CardView cvMechSem3;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.mode) {
           Intent i=new Intent(MainActivity.this,com.njsg.darkmode6.ModeActivity.class);
           startActivity(i);

        }


        return super.onOptionsItemSelected(item);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        tvChangeTheme=findViewById(R.id.tvChangeTheme);
        cvMechSem3=findViewById(R.id.cvMechSem3);

      /*  tvChangeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                startActivity(new Intent(MainActivity.this, MainActivity.this.getClass()));

                finish();
              // startActivity(new Intent(MainActivity.this, MainActivity.this.getClass()));
            }
        });*/


        tvChangeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,com.njsg.darkmode6.NextActivity.class);
                startActivity(i);
            }
        });

        cvMechSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);
            }
        });

//        Intent intent=new Intent(getApplicationContext(),ModeActivity.class);
//        startActivity(intent);
//        finish();

    }



}