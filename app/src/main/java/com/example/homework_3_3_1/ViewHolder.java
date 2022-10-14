package com.example.homework_3_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView tvColors;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvColors = itemView.findViewById(R.id.tv_colors);
    }

    public void bind(String colors) {
        tvColors.setText(colors);
    }

}
