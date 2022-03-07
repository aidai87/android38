package com.nomad.android38.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nomad.android38.OnClick;
import com.nomad.android38.databinding.FragmentCharacterBinding;
import com.nomad.android38.databinding.ItemCharacterBinding;
import com.nomad.android38.model.Charactersss;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CountViewHolder> {

    private ItemCharacterBinding binding;
    private ArrayList<Charactersss> characters;
    private OnClick onClick;

    public CharacterAdapter(ArrayList<Charactersss> characters, OnClick onClick) {
        this.characters = characters;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCharacterBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(characters.get(position));
        holder.binding.getRoot().setOnClickListener(view -> {
            onClick.onClick(characters.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {
        private ItemCharacterBinding binding;

        public CountViewHolder(@NonNull ItemCharacterBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Charactersss character) {
            binding.ivImage.setImageResource(character.getImage());
            binding.tvLive.setText(character.getLive());
            binding.tvName.setText(character.getName());

        }
    }
}
