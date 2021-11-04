package com.lost.checkapartment.view;

public interface BuildingFragmentView {

    void showInformation();

    boolean isCocinaChecked();
    boolean isLucesChecked();
    boolean isBanoChecked();
    boolean isDormitorioChecked();

    boolean isTerminacionesNormal();
    boolean isTerminacionesRegular();
    boolean isTerminacionesMalas();

    void showErrorMessage();
    void showFinalScore(int finalScore);
}
