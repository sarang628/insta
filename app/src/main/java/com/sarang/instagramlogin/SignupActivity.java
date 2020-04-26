package com.sarang.instagramlogin;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView textPhone = findViewById(R.id.txt_phone);
        TextView textEmail = findViewById(R.id.txt_email);
        View viewPhone = findViewById(R.id.view_phone);
        View viewEmail = findViewById(R.id.view_email);
        Button nextButton = findViewById(R.id.btn_next);





        findViewById(R.id.txt_phone).setOnClickListener(view -> {
            textPhone.setAlpha(1f);
            textEmail.setAlpha(0.3f);
            viewPhone.setAlpha(1f);
            viewEmail.setAlpha(0.3f);
        });

        findViewById(R.id.txt_email).setOnClickListener(view -> {
            textPhone.setAlpha(0.3f);
            textEmail.setAlpha(1f);
            viewPhone.setAlpha(0.3f);
            viewEmail.setAlpha(1f);
        });


        EditText editPhone = findViewById(R.id.edit_phone);
        editPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    nextButton.setAlpha(1f);
                    nextButton.setClickable(true);
                }else{
                    nextButton.setAlpha(0.4f);
                    nextButton.setClickable(false);
                }

            }

            @Override
            public void afterTextChanged(Editable arg) {
                // 입력이 끝났을 때
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 입력하기 전에

            }

        });



    }
}
