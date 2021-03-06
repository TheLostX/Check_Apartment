package com.lost.checkapartment.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lost.checkapartment.R;
import com.lost.checkapartment.presenter.ListPresenter;
import com.lost.checkapartment.recycleradapter.CustomAdapter;
import com.lost.checkapartment.databinding.FragmentListBinding;


public class ListFragment extends Fragment implements ListFragmentView {

    FragmentListBinding binding;
    private ListPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentListBinding.inflate(inflater, container, false);
        setAdapter();

        presenter = new ListPresenter();

        return binding.getRoot();
    }

    private void setAdapter(){

        binding.rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvLista.setAdapter(new CustomAdapter(this));
    }


    @Override
    public void changeFragment(int position) {

        Navigation.findNavController(binding.getRoot())
                .navigate(R.id.action_listFragment_to_buildingFragment,
                presenter.getInformation(position));

    }
}