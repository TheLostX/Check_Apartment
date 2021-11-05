package com.lost.checkapartment.presenter;

import android.os.Bundle;

public class ListPresenter implements ListPresenterInterface{


    @Override
    public Bundle getInformation(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);

        return bundle;
    }
}
