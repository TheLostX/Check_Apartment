package com.lost.checkapartment.presenter;

import android.content.Intent;
import android.content.pm.PackageManager;

import com.lost.checkapartment.view.BuildingFragmentView;

public class BuildingPresenter implements BuildingPresenterInterface {

    private BuildingFragmentView view;

    public BuildingPresenter(BuildingFragmentView view) {
        this.view = view;
    }

    @Override
    public void changeFragment() {
        view.showInformation();

    }

    @Override
    public void calculateScore() {

        int luces = 0, cocina = 0, bano = 0, dormitorio = 0;

        int resultadoFinal = 0;

        if (view.isLucesChecked()) {
            luces = 10;
        }

        if (view.isDormitorioChecked()) {
            dormitorio = 20;
        }
        if (view.isCocinaChecked()) {
            cocina = 30;
        }
        if (view.isBanoChecked()) {
            bano = 40;
        }

        int suma = luces + dormitorio + cocina + bano;

        if(view.isTerminacionesNormal()){
            resultadoFinal = suma * 3;
        }
        else if(view.isTerminacionesRegular()){
            resultadoFinal = suma * 2;
        }
        else if (view.isTerminacionesMalas()){
            resultadoFinal = suma;
        }
        else{
            view.showErrorMessage();
        }

        view.showFinalScore(resultadoFinal);

        view.enableEmailButton(resultadoFinal);

    }

    @Override
    public void changeApp() {

    }
}
