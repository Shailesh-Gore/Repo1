package com.njsg.darkmode6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class ModeActivity extends AppCompatActivity {
Switch switchMode;
Button buttonToMain;


   // @Override
//    public void onBackPressed(){
//        super.onBackPressed();
//        finish();
//        startActivity(getIntent());
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.activity_mode);
       // buttonToMain=findViewById(R.id.buttonToMain);
        switchMode=findViewById(R.id.switchMode);
        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b)
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                }

                else
                {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }



            }

        });

//
 //finish();
  //     startActivity(getIntent());
//        Intent intent=new Intent(getApplicationContext(),ModeActivity.class);
//        startActivity(intent);
//        finish();


    }
}