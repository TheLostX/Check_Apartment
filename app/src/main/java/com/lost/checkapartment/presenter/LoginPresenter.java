package com.lost.checkapartment.presenter;

import com.lost.checkapartment.view.LoginView;

public class LoginPresenter implements LoginPresenterInterface{

    private LoginView view;
    private int contador = 0;

    public LoginPresenter(LoginView view){
        this.view = view;
    }


    @Override
    public void validatePassword(String password) {

        if(password.equals("123Pass")){
            view.changeActivity();
        }
        else{
            view.showErrorMessage();
            contador++;
        }
        if(contador==3){
            view.disableButton();
        }
    }
}
