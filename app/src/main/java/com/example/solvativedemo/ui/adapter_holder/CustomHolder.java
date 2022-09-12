package com.example.solvativedemo.ui.adapter_holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solvativedemo.R;
import com.example.solvativedemo.model.Data;

public class CustomHolder extends RecyclerView.ViewHolder {
    private TextView api_model;
    private TextView api_link;

    public CustomHolder(@NonNull View itemView) {
        super(itemView);
        api_model = (itemView).findViewById(R.id.api_model);
        api_link = (itemView).findViewById(R.id.api_link);
    }

    public void setData(Data model) {
        api_model.setText("" + model.getArtistId());
        api_link.setText(model.getArtistDisplay());
    }
}
