package com.example.machinetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Login , SignUP,registerr;
    RelativeLayout rllogin,rlsignup,rlsignupp,rlllogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        rllogin = findViewById(R.id.rllogin);
        rlllogin = findViewById(R.id.rlllogin);
        rlsignup = findViewById(R.id.rlsignup);
        Login = findViewById(R.id.Login);
        SignUP = findViewById(R.id.SignUp);
        rlsignupp = findViewById(R.id.rlsignupp);
        registerr = findViewById(R.id.registerr);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rllogin.setVisibility(View.VISIBLE);
                rlsignup.setVisibility(View.GONE);
                rlsignupp.setVisibility(View.GONE);
                rlllogin.setVisibility(View.VISIBLE);
            }
        });

        SignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlsignup.setVisibility(View.VISIBLE);
                rlsignupp.setVisibility(View.VISIBLE);
                rlllogin.setVisibility(View.GONE);
                rllogin.setVisibility(View.GONE);
            }
        });

        registerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
            }
        });

    }
}
