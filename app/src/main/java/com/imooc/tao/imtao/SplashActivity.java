package com.imooc.tao.imtao;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

//闪屏页
public class SplashActivity extends AppCompatActivity {

    protected Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mHandler.postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
        }, 2000);
    }
}