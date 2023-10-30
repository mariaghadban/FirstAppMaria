package com.example.firstapp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
public class add_task extends AppCompatActivity {
    private Button saveBtnTask;
    private Button cancelBtnTask;
    private TextView tvImportance;
    private SeekBar seekBarIm;
    private TextInputLayout titleShort;
    private TextInputLayout etTextAdd;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);

        etTextAdd=findViewById(R.id.etTextAd);
        titleShort=findViewById(R.id.titleShort);
        seekBarIm=findViewById(R.id.seekBarIm);
        tvImportance=findViewById(R.id.tvImportance);
        cancelBtnTask=findViewById(R.id.cancelBtnTask);
        saveBtnTask=findViewById(R.id.saveBtnTask);


    }
}
