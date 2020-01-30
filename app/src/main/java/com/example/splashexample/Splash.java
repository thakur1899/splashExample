package com.example.splashexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (Exception t){}
                finally{
                    Intent obj = new Intent(Splash.this,MainActivity.class);
                    startActivity(obj);
                    finish();
                }

            }
        };
        th.start();
    }
}
