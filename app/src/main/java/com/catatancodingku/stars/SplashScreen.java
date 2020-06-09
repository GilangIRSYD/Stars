package com.catatancodingku.stars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Handler mhandler = new Handler();

        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent onBoarding = new Intent(SplashScreen.this, OnBoarding.class);
                startActivity(onBoarding);
                finish();
            }
        },2500);
    }
}
