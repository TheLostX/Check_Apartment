package com.lost.checkapartment.presenter;

import com.lost.checkapartment.view.BuildingFragmentView;

public class BuildingPresenter implements BuildingPresenterInterface{


    private BuildingFragmentView view;

    public BuildingPresenter(BuildingFragmentView view){
        this.view = view;
    }

    @Override
    public void changeImage() {
        view.showImage();
    }
}
