package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class signinactivity extends AppCompatActivity {
    private TextInputEditText etEmail;
    private TextInputEditText etPassword;
    private Button btn_signin;
    private Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signinactivity);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btn_signin = findViewById(R.id.btn_signin);
        btn_signup = findViewById(R.id.btn_signup);


    }
    public void onClickSignUp(View v){
        Intent i= new Intent(signinactivity.this, SignUpAtivity.class);
        startActivity(i);
        finish();


    }


    private void checkEmailPASS() {
        boolean isAllOk = true;
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        if (email.length() < 6 || email.contains("@") == false) {
            isAllOk = false;
            etEmail.setError("wrong email");
        }
        if (password.length() < 8 || password.contains(" ") == true) {
            isAllOk = false;
            etPassword.setError("wrong password");
        }
        if (isAllOk) {
            Toast.makeText(this, "All Ok", Toast.LENGTH_SHORT).show();
        }
    }
}