package com.sarang.instagramlogin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
        //프레그먼트 사용시에는
        // 1. 화면을 뒤로갔을때 이전화면 설정을 할 것인가?
        // 2. 화면 뒤에가 클릭되는지 확인
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //
        //1. 사인업 위젯 가져오기
        TextView tvSignUp = view.findViewById(R.id.tv_sign_up);

        //2. 클릭 이벤트 설정하기
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3번 회원가입 화면으로 이동시키기
                getFragmentManager()
                        .beginTransaction()
                        //뒤로가기 눌렀을때 전화면이 보이고 싶다면
                        .addToBackStack(null)
                        .add(R.id.fl_root, new SignUpFragment())
                        .commit();
            }
        });
    }
}
