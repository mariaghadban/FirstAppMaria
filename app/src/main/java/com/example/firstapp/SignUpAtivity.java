package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpAtivity extends AppCompatActivity {
    private Button btnSave;
    private Button btnCancel;
    private TextInputEditText et_Email;
    private TextInputEditText et_password;
    private TextInputEditText et_repassword;
    private TextInputEditText et_name;
    private TextInputEditText et_phone;





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_ativity);

        btnSave=findViewById(R.id.btnSave);
        btnCancel=findViewById(R.id.btnCancel);
        et_Email=findViewById(R.id.etEmail);
        et_password=findViewById(R.id.et_password);
        et_repassword=findViewById(R.id.et_repassword);
        et_name=findViewById(R.id.et_name);
        et_phone=findViewById(R.id.et_phone);



    }

    public void onClickSignIn(View v){
        Intent i= new Intent(SignUpAtivity.this, signinactivity.class);
        startActivity(i);
        finish();

    }
    public void onClickCancel(View v){
        Intent i= new Intent(SignUpAtivity.this, splashScreenActivity.class);
        startActivity(i);
        finish();

    }


}