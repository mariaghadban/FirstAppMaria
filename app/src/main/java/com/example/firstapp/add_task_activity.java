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

import com.example.firstapp.MyTask.MyTask;
import com.example.firstapp.UsersTable.MyUser;
import com.example.firstapp.data.usersTable.MySubject;
import com.example.firstapp.data.usersTable.mySubjectQurey;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.List;

public class add_task_activity extends AppCompatActivity {
    private Button saveBtnTask;
    private Button cancelBtnTask;
    private TextView tvImportance;
    private SeekBar seekBarIm;
    private TextInputEditText titleShort;
    private TextInputEditText etTextAd;
    private AutoCompleteTextView AutoEtSubj;
    private AutoCompleteTextView etSubj;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);
        setContentView(R.layout.add_task_activity);
        AutoEtSubj = findViewById(R.id.etSubj);
        initAutoEtSubjects();


        etTextAd = findViewById(R.id.etTextAd);
        titleShort = findViewById(R.id.titleShort);
        seekBarIm = findViewById(R.id.seekBarIm);
        tvImportance = findViewById(R.id.tvImportance);
        cancelBtnTask = findViewById(R.id.cancelBtnTask);
        saveBtnTask = findViewById(R.id.saveBtnTask);
        etSubj = findViewById(R.id.etSubj);
    }

    private void initAutoEtSubjects() {
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        mySubjectQurey subjectQurey = db.getMySubjectQuery();
        List<MySubject> allSubject = subjectQurey.getAllSubjects();
        ArrayAdapter<MySubject> adapter = new ArrayAdapter<MySubject>(this, android.R.layout.simple_dropdown_item_1line);
        adapter.addAll(allSubject);
        AutoEtSubj.setAdapter(adapter);
        AutoEtSubj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AutoEtSubj.showDropDown();
            }
        });


    }

    private void checkAndSaveTask() {

        boolean isAllOk=true; // يحوي نتيجة فحص الحقول ان كانت سليمة
        String shortTitle=titleShort.getText().toString();
        String text=etTextAd.getText().toString();
        String subjectText=etSubj.getText().toString();
        int importancee=seekBarIm.getProgress();

        if (shortTitle.length()<1) {
            isAllOk=false;
            titleShort.setError("short title is empty");
        }

        if (text.length()<1) {
            isAllOk=false;
            etTextAd.setError("text is empty");
        }

        if (subjectText.length()<1) {
            isAllOk=false;
            etSubj.setError("you didn't chose the subject");

        }

        if (isAllOk) {
            Toast.makeText(this,"All ok", Toast.LENGTH_SHORT).show();
            AppDatabase db=AppDatabase.getDB(getApplicationContext());
            mySubjectQurey subjectQuery=db.getMySubjectQuery();


            if (mySubjectQurey.checkSubject(subjectText)==null) // فحص هل الموضوع من قبل بالجدول
            {
                //بناء موضوع جديد واضافته
                MySubject subject=new MySubject();
                subject.name=subjectText;
                subjectQuery.insertAll(subject);
            }
            //استخراج id الموضوع لأننا بحاجة لرقمه التسلسلي

            MySubject subject= mySubjectQurey.checkSubject(subjectText);


            MyTask task=new MyTask();
            task.importance=importancee;
            task.text=text;
            //task.titleShort=titleShort;
            task.subId=subject.getKeyId();//تحديد رقم الموضوع للمهة
            db.getMyTaskQuery().insert(task);//اضافة المهمة للجدول
            finish();
        }


    }


}
