package com.imooc.tao.imtao.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.imooc.tao.imtao.LoginActivity;
import com.imooc.tao.imtao.R;

import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//我的界面视图
public class MeFragment extends Fragment {

    protected Button mBtnLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnLogin = Objects.requireNonNull(getView()).findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(v -> {
            //登录
            Intent login = new Intent(getActivity(), LoginActivity.class);
            startActivity(login);
        });
    }
}