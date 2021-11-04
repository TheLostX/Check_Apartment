package com.lost.checkapartment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lost.checkapartment.recycleradapter.CustomAdapter;
import com.lost.checkapartment.databinding.FragmentListBinding;


public class ListFragment extends Fragment {

    FragmentListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentListBinding.inflate(inflater, container, false);
        setAdapter();

        return binding.getRoot();
    }

    private void setAdapter(){

        binding.rvLista.setLayoutManager(new LinearLayoutManager(this.getContext()));
        binding.rvLista.setAdapter(new CustomAdapter());
    }
}