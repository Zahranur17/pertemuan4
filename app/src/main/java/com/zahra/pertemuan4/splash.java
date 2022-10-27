package com.zahra.pertemuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            // This method wilrl be executed once the timer is over
            Intent i = new Intent(splash.this, Relatif_layout.class);
            startActivity(i);
            finish();
        }
    },5000);
    }
}