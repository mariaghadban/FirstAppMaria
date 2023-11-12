package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class splashScreenActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreenactivity);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);


        //gdf
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Handler h=new Handler();
        Runnable r=new Runnable() {
            @Override
            public void run()
            {
                //to open new activity from current to next

                Intent i= new Intent(splashScreenActivity.this, signinactivity.class);
                startActivity(i);
                //to close current activity
                finish();
            }
        };
        h.postDelayed(r,3000);
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