package com.lost.checkapartment.presenter;

import android.util.Patterns;

import com.lost.checkapartment.view.LoginView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPresenter implements LoginPresenterInterface{

    private LoginView view;
    private int contador = 0;

    public LoginPresenter(LoginView view){
        this.view = view;
    }


    @Override
    public void validateUser(String password, String email) {

        Pattern p = Patterns.EMAIL_ADDRESS;
        Matcher matcher = p.matcher(email);

        if(password.equals("123Pass") && matcher.find()){
            view.changeActivity();
        }
        else{
            view.showErrorMessage();
            view.cleanFields();
            contador++;
        }
        if(contador==3){
            view.disableButton();
        }
    }
}
