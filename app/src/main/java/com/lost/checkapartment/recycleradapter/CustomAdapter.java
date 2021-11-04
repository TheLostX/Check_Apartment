package com.lost.checkapartment.recycleradapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.lost.checkapartment.R;
import com.lost.checkapartment.model.ApartmentData;
import com.lost.checkapartment.view.ListFragment;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    ListFragment listFragment;

    public CustomAdapter(ListFragment listFragment) {
        this.listFragment = listFragment;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.bindData(ApartmentData.apartmentList().get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                listFragment.changeFragment(holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return ApartmentData.apartmentList().size();
    }
}
