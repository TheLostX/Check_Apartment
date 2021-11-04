package com.lost.checkapartment.recycleradapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lost.checkapartment.R;
import com.lost.checkapartment.model.ApartmentData;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {



    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(ApartmentData.apartmentList().get(position));
    }

    @Override
    public int getItemCount() {
        return ApartmentData.apartmentList().size();
    }
}
