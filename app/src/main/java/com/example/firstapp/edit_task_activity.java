package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class edit_task_activity extends AppCompatActivity {
    private Button updateBtn;
    private Button cancelBtn;
    private TextView tvImportance2;
    private SeekBar seekBarUpdate;
    private TextInputLayout etTextAd;
    private TextInputLayout titleShort;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);

        etTextAd=findViewById(R.id.etTextAd);
        titleShort=findViewById(R.id.titleShort);
        seekBarUpdate=findViewById(R.id.seekBarUpdate);
        tvImportance2=findViewById(R.id.tvImportance2);
        cancelBtn=findViewById(R.id.cancelBtn);
        updateBtn=findViewById(R.id.updateBtn);


    }
}