package com.example.firstapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private SearchView srchVeiw;
    private Spinner spnrSubject;
    private ListView listt;
    private FloatingActionButton floatingActionButton;

    public class MainActivity extends AppCompatActivity{
        private TextView tv_output;
        private Button btn_go;
        private EditText et_Input;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srchVeiw=findViewById(R.id.srchVeiw);
        spnrSubject=findViewById(R.id.spnrSubject);
        listt=findViewById(R.id.listt);
        floatingActionButton=findViewById(R.id.floatingActionButton);
        tv_output=findViewById(R.id.tv_output);
        btn_go=findViewById(R.id.btn_go);
        et_Input=findViewById(R.id.et_Input);


    }
    public void onClickGo(View v){

        String st= et_Input.getText().toString();

    }
}