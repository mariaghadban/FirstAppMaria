package com.example.firstapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private SearchView srchVeiw;
    private Spinner spnrSubject;
    private ListView listt;
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srchVeiw = findViewById(R.id.srchVeiw);
        spnrSubject = findViewById(R.id.spnrSubject);
        listt = findViewById(R.id.listt);
        floatingActionButton = findViewById(R.id.floatingActionButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;

    }

    protected void onRestart() {
        super.onRestart();
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {
        super.onPause();
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    protected void onStop() {
        super.onStop();
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {
        super.onStart();
        Log.d("", "");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }






}