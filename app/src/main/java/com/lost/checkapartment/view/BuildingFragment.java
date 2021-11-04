package com.lost.checkapartment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.lost.checkapartment.databinding.FragmentBuildingBinding;
import com.lost.checkapartment.model.ApartmentData;
import com.lost.checkapartment.presenter.BuildingPresenter;


public class BuildingFragment extends Fragment implements BuildingFragmentView {

    FragmentBuildingBinding binding;
    BuildingPresenter presenter;
    private int bano, cocina, dormitorio, luces;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBuildingBinding.inflate(inflater, container, false);

        presenter = new BuildingPresenter(this);
        presenter.changeFragment();

        binding.btnCalcular.setOnClickListener( v -> {
            presenter.calculateScore();
        });

        return binding.getRoot();
    }

    @Override
    public void showInformation(){
        int pos = getArguments().getInt("position");

        String data = ApartmentData.apartmentList().get(pos).getUrlImageBuilding();
        Glide.with(this).load(data).into(binding.imgBuilding);
        binding.tvNombreDepto2.setText(ApartmentData.apartmentList().get(pos).getBuildingName());
        binding.tvNumeroDepto2.setText(ApartmentData.apartmentList().get(pos).getAddress());
    }

    @Override
    public boolean isCocinaChecked() {
        return binding.cbCocina.isChecked();
    }

    @Override
    public boolean isLucesChecked() {

        return binding.cbLuces.isChecked();
    }

    @Override
    public boolean isBanoChecked() {

        return binding.cbBano.isChecked();
    }

    @Override
    public boolean isDormitorioChecked() {

        return binding.cbDormitorio.isChecked();
    }

    @Override
    public boolean isTerminacionesNormal() {
        return binding.rbNormal.isChecked();
    }

    @Override
    public boolean isTerminacionesRegular() {
        return binding.rbRegular.isChecked();
    }

    @Override
    public boolean isTerminacionesMalas() {
        return binding.rbMala.isChecked();
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(getContext(), "Debe seleccionar un estado", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFinalScore(int finalScore) {
        binding.tvResultado.setText("El resultado final es: " + finalScore);
    }


}