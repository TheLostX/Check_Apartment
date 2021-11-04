package com.lost.checkapartment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.lost.checkapartment.databinding.FragmentBuildingBinding;
import com.lost.checkapartment.model.ApartmentData;
import com.lost.checkapartment.presenter.BuildingPresenter;


public class BuildingFragment extends Fragment implements BuildingFragmentView {

    FragmentBuildingBinding binding;
    BuildingPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBuildingBinding.inflate(inflater, container, false);
        presenter = new BuildingPresenter(this);
        presenter.changeImage();

        return binding.getRoot();
    }

    @Override
    public void showImage() {

        int pos = getArguments().getInt("position");
        String data = ApartmentData.apartmentList().get(pos).getUrlImageBuilding();
        Glide.with(this).load(data).into(binding.imgBuilding);

    }
}