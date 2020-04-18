package com.sarang.instagramlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //처음 진입 시 로그인 화면 띄워주기
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.cl_root, new LoginFragment())
                .commit();


    }
}
