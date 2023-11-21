package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.firstapp.UsersTable.MyUser;
import com.example.firstapp.UsersTable.myUserQurey;
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
    private void checkEmailPASS() {
        boolean isAllOk = true;
        String email = et_Email.getText().toString();
        String password = et_password.getText().toString();
        String name = et_name.getText().toString();
        String phone = et_phone.getText().toString();
        String passw = et_password.getText().toString();
        if (email.length() < 6 || email.contains("@") == false) {
            isAllOk = false;
            et_Email.setError("wrong email");
        }
        if (password.length() < 8 || password.contains(" ") == true) {
            isAllOk = false;
            et_password.setError("wrong password");
        }
        if (isAllOk) {
            Toast.makeText(this, "All Ok", Toast.LENGTH_SHORT).show();
        }
        if (isAllOk){
            AppDatabase db = AppDatabase.getDB(getApplicationContext());
            myUserQurey userQurey = db.getMyUserQuery();

            if(userQurey.checkEmail(email)!=null)
            {
                et_Email.setError("found email");
            }
            else{
                MyUser myUser=new MyUser();
                myUser.email=email;
                myUser.fullName=name;
                myUser.phone= phone;
                myUser.passw=password;
                userQurey.insert(myUser);
                finish();

            }
        }
    }


}