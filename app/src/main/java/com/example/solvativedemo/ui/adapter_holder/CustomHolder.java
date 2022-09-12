package com.example.solvativedemo.ui.adapter_holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solvativedemo.R;
import com.example.solvativedemo.model.Data;

public class CustomHolder extends RecyclerView.ViewHolder {
    private TextView artistId;
    private TextView artistDisplay;

    public CustomHolder(@NonNull View itemView) {
        super(itemView);
        artistId = (itemView).findViewById(R.id.artist_id);
        artistDisplay = (itemView).findViewById(R.id.artist_display);
    }

    public void setData(Data model) {
        artistId.setText("" + model.getArtistId());
        artistDisplay.setText(model.getArtistDisplay());
    }
}
