package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gdf
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
        protected void onRestart()
        {
            super.onRestart();
            Log.d("","");
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
        protected void onResum()
        {
        super.onResume();
        Log.d()
        }



}