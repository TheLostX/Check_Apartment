package com.lost.checkapartment.recycleradapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lost.checkapartment.databinding.ItemListBinding;
import com.lost.checkapartment.model.Apartment;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    ItemListBinding binding;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        binding = ItemListBinding.bind(itemView);
    }

    public void bindData(Apartment apartment){

        binding.tvNombreDepto.setText(apartment.getBuildingName());
        binding.tvNumeroDepto.setText(apartment.getUnitId());
        binding.tvDireccionDepto.setText(apartment.getAddress());
    }


}
