package com.sarang.instagramlogin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.cl_phone).setSelected(true);
        view.findViewById(R.id.cl_input_phone).setVisibility(View.VISIBLE);
        view.findViewById(R.id.tv_sign_up_comment).setVisibility(View.VISIBLE);
        view.findViewById(R.id.et_email).setVisibility(View.GONE);

        view.findViewById(R.id.cl_email).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.findViewById(R.id.cl_email).setSelected(true);
                view.findViewById(R.id.cl_phone).setSelected(false);
                view.findViewById(R.id.cl_input_phone).setVisibility(View.GONE);
                view.findViewById(R.id.tv_sign_up_comment).setVisibility(View.GONE);
                view.findViewById(R.id.et_email).setVisibility(View.VISIBLE);
            }
        });

        view.findViewById(R.id.cl_phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.findViewById(R.id.cl_email).setSelected(false);
                view.findViewById(R.id.cl_phone).setSelected(true);
                view.findViewById(R.id.cl_input_phone).setVisibility(View.VISIBLE);
                view.findViewById(R.id.tv_sign_up_comment).setVisibility(View.VISIBLE);
                view.findViewById(R.id.et_email).setVisibility(View.GONE);
            }
        });

        view.findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "show", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
