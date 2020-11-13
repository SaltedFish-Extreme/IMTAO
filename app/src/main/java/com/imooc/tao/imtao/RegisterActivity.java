package com.imooc.tao.imtao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    protected TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        login = this.findViewById(R.id.login);
        login.setOnClickListener(v -> {
            Intent login = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(login);
        });
    }
}