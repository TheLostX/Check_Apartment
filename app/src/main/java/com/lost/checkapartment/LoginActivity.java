package com.lost.checkapartment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.lost.checkapartment.databinding.ActivityLoginBinding;
import com.lost.checkapartment.presenter.LoginPresenter;
import com.lost.checkapartment.view.LoginView;

import java.util.function.Predicate;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private ActivityLoginBinding binding;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setOnClickListener();

        presenter = new LoginPresenter(this);

        setContentView(binding.getRoot());
    }


    private void setOnClickListener(){

        binding.btnIr.setOnClickListener(v ->{
            presenter.validatePassword(binding.etPassword.getText().toString());
        });
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "Password Incorrecto", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void changeActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void disableButton() {
        binding.btnIr.setEnabled(false);
    }

}