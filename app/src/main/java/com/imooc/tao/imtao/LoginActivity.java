package com.imooc.tao.imtao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    protected ImageView view;
    protected Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        view = this.findViewById(R.id.btn_login_exit);
        register = this.findViewById(R.id.btn_register);
        view.setOnClickListener(v -> finish());
        register.setOnClickListener(v -> {
            Intent register = new Intent(this, RegisterActivity.class);
            startActivity(register);
        });
    }
}