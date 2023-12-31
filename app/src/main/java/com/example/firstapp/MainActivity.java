package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Spinner;
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

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.settingItem) {
        }
        if (item.getItemId() == R.id.logOutItem) {
            showYesNoDialog();

        }
        if (item.getItemId() == R.id.addTaskItem) {
        }
        return true;
    }

    public void showPopUpMenu(View v, MyTask t) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.inflate(R.menu.main_menu);
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.logOutItem) {
                    Toast.makeText(MainActivity.this, " signOut ", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, add_task_activity.class);
                    startActivity(i);
                }
                if (item.getItemId() == R.id.addTaskItem) {
                    Toast.makeText(MainActivity.this, "add task", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.settingItem) {
                    Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();

                }
                return true;

            }
        });
        popup.show();

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


    private void initAllListView() {
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        MyTaskQurey taskQuery = db.getMyTaskQuery();
        List<MyTask> getAll = taskQuery.getAll();
        ArrayAdapter<MyTask> taskAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line);
        taskAdapter.addAll();
        listt.setAdapter(taskAdapter);
        listt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showPopUpMenu(view, taskAdapter.getItem(i));
            }
        });
    }

    private void initListViewSubjId(long keyId) {
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        MyTaskQurey taskQuery = db.getMyTaskQuery();
        List<MyTask> allTasks = taskQuery.getTasksBySubId(keyId);
        ArrayAdapter<MyTask> taskAdapter = new ArrayAdapter<MyTask>(this, android.R.layout.simple_list_item_1);
        taskAdapter.addAll(allTasks);
        listt.setAdapter(taskAdapter);

    }

    private void initSubjectSpnr() {
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        mySubjectQurey subjectQuery = db.getMySubjectQuery();
        List<MySubject> allSubjects = subjectQuery.getAllSubjects();
        ArrayAdapter<String> subjectAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line);
        subjectAdapter.add("ALL");
        for (MySubject subject : allSubjects) { //اضافة المواضيع للوسيط
            subjectAdapter.add(subject.tName);
        }
        spnrSubject.setAdapter(subjectAdapter);

        //ليبين للمستخدم انو بعد في تقدم وبن هو يعني بعدو عم بجيب معطيات..
        spnrSubject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                //  استخرج جميع المهمات i
                String item = subjectAdapter.getItem(i);
                String item1 = item;
                if (item1.equals("ALL"))//يعني عرض جميع المهمات
                    initAllListView();
                else {
                    MySubject subject = mySubjectQurey.checkSubject(item);
                    initListViewSubjId(subject.getKeyId());
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void showYesNoDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("log out");
        builder.setMessage("are ypu sure?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "sign out", Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();
    }


}
