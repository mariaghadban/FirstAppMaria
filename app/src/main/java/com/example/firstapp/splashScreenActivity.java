package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class splashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreenactivity);
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
        protected void onResume()
        {
            super.onResume();
            Log.d("","");
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }

        protected void onPause() {
            super.onPause();
            Log.d("","");
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
        protected void onStop(){
            super.onStop();
            Log.d("","");
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
        protected void onDestroy(){
            super.onDestroy();
            Log.d("","");
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }

        protected void onStart(){
            super.onStart();
            Log.d("","");
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }


}