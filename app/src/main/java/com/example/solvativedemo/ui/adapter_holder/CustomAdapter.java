package com.example.solvativedemo.ui.adapter_holder;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.solvativedemo.R;
import com.example.solvativedemo.model.Data;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {

    ArrayList<Data> list = null;

    public CustomAdapter(ArrayList<Data> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        if (list == null) {
            return 0;
        } else {
            return list.size();
        }
    }
}
