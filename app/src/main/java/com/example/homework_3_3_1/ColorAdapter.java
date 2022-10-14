package com.example.homework_3_3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorAdapter extends RecyclerView.Adapter<ViewHolder> {

private ArrayList<String>colorsList;

    public ColorAdapter(ArrayList<String> colorsList) {
        this.colorsList = colorsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_colors, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(colorsList.get(position));

    }

    @Override
    public int getItemCount() {
        return colorsList.size();
    }
}