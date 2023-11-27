package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstapp.MyTask.MyTask;
import com.example.firstapp.MyTask.MyTaskQurey;
import com.example.firstapp.data.usersTable.MySubject;
import com.example.firstapp.data.usersTable.mySubjectQurey;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.ItemHistory)
        {
        }
        if (item.getItemId()==R.id.ItemSetting)
        {
        }
        if (item.getItemId()==R.id.ItemSignOut)
        {
        }
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
    private void initSubjectSpnr(){
        AppDatabase db=AppDatabase.getDB(getApplicationContext());
        mySubjectQurey subjectQuery=db.getMySubjectQuery();
        List<MySubject> allSubjects= subjectQuery.getAllSubjects();
        ArrayAdapter<String> subjectAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line);
        subjectAdapter.add("ALL");
        for (MySubject subject  : allSubjects){ //اضافة المواضيع للوسيط
            subjectAdapter.add(subject.tName);
        }
        spnrSubject.setAdapter(subjectAdapter);
        //ليبين للمستخدم انو بعد في تقدم وبن هو يعني بعدو عم بجيب معطيات..

    }
    private void initAllListView() {
        AppDatabase db=AppDatabase.getDB(getApplicationContext());
        MyTaskQurey taskQuery =db.getMyTaskQuery();
        List<MyTask> allTasks= taskQuery.getAllTasks();
        ArrayAdapter<String> taskAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line);
        taskAdapter.addAll(String.valueOf(allTasks));
        listt.setAdapter(taskAdapter);
        
    }
    private void initListViewSubjId(long keyId){
        AppDatabase db=AppDatabase.getDB(getApplicationContext());
        MyTaskQurey taskQuery =db.getMyTaskQuery();
        List<MyTask> allTasks= taskQuery.getTasksBySubjId(keyId);



    }






}