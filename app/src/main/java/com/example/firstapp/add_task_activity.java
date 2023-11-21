package com.example.firstapp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstapp.data.usersTable.MySubject;
import com.example.firstapp.data.usersTable.mySubjectQurey;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Arrays;
import java.util.List;

public class add_task_activity extends AppCompatActivity {
    private Button saveBtnTask;
    private Button cancelBtnTask;
    private TextView tvImportance;
    private SeekBar seekBarIm;
    private TextInputLayout titleShort;
    private TextInputLayout etTextAdd;
    private AutoCompleteTextView AutoEtSubj;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);
        setContentView(R.layout.add_task_activity);
        AutoEtSubj=findViewById(R.id.etSubj);
        initAutoEtSubjects();



        etTextAdd=findViewById(R.id.etTextAd);
        titleShort=findViewById(R.id.titleShort);
        seekBarIm=findViewById(R.id.seekBarIm);
        tvImportance=findViewById(R.id.tvImportance);
        cancelBtnTask=findViewById(R.id.cancelBtnTask);
        saveBtnTask=findViewById(R.id.saveBtnTask);
    }

    private void initAutoEtSubjects()
    {
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        mySubjectQurey subjectQurey=db.getMySubjectQuery();
        List<MySubject>allSubject =subjectQurey.getAllSubjects();
        ArrayAdapter<MySubject>adapter=new ArrayAdapter<MySubject>(this, android.R.layout.simple_dropdown_item_1line);
        adapter.addAll(allSubject);
        AutoEtSubj.setAdapter(adapter);
        AutoEtSubj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             AutoEtSubj.showDropDown();
            }
        });


    }
    private void checkAndSaveTask{
        boolean isAllOk = true;
        if (isAllOk){
            AppDatabase db = AppDatabase.getDB(getApplicationContext());
            mySubjectQurey subjectQurey=db.getMySubjectQuery();
            if (subjectQurey.)

        }
    }



}
