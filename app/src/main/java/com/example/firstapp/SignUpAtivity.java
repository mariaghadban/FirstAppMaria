package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpAtivity extends AppCompatActivity {
    private Button button2;
    private TextInputEditText et_Email;
    private TextInputEditText et_password;
    private TextInputEditText et_repassword;
    private TextInputEditText et_name;
    private TextInputEditText et_phone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_ativity);

        button2=findViewById(R.id.button2);
        et_Email=findViewById(R.id.et_Email);
        et_password=findViewById(R.id.et_password);
        et_repassword=findViewById(R.id.et_repassword);
        et_name=findViewById(R.id.et_name);
        et_phone=findViewById(R.id.et_phone);



    }
}