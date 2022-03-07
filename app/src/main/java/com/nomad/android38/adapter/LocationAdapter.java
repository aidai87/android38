package com.nomad.android38.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nomad.android38.OnClick;
import com.nomad.android38.databinding.ItemLocationBinding;
import com.nomad.android38.model.Charactersss;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.CountViewHolder> {
    private ItemLocationBinding binding;
    private OnClick onClick;
    ArrayList<Charactersss> list;

    public LocationAdapter(OnClick onClick, ArrayList<Charactersss> list) {
        this.onClick = onClick;
        this.list = list;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemLocationBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(list.get(position));
        holder.binding.getRoot().setOnClickListener(view -> {
        onClick.onClick(list.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {
        ItemLocationBinding binding;

        public CountViewHolder(@NonNull ItemLocationBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Charactersss charactersss) {
        binding.tvLive.setText(charactersss.getLive());
        binding.tvName.setText(charactersss.getName());
        }
    }
}
