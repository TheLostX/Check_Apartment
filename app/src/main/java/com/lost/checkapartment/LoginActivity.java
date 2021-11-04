package com.lost.checkapartment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;

import com.lost.checkapartment.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setOnClickListener();

        setContentView(binding.getRoot());
    }


    private void setOnClickListener(){
        binding.btnIr.setOnClickListener(v ->{

            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

        });
    }
}