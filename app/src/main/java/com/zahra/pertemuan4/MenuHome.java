package com.zahra.pertemuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MenuHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_home);
        }
        protected void onStart(){
            super.onStart();
            Toast.makeText( this, "Aplikasi Start", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(this, "Aplikasi Stop", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Toast.makeText(this, "Aplikasi Restart", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "Aplikasi Resume", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this, "Aplikasi Pause", Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onDestroy(){
            super.onDestroy();
            Toast.makeText(this, "Aplikasi Destory", Toast.LENGTH_SHORT).show();
    }
}