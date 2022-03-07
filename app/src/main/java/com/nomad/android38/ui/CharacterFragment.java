package com.nomad.android38.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android38.OnClick;
import com.nomad.android38.R;
import com.nomad.android38.adapter.CharacterAdapter;
import com.nomad.android38.databinding.FragmentCharacterBinding;
import com.nomad.android38.model.Charactersss;

import java.util.ArrayList;

public class CharacterFragment extends Fragment implements OnClick {
    private FragmentCharacterBinding binding;
    private CharacterAdapter adapter;
    private ArrayList<Charactersss> characters;
    public final static String key = "dfgdgf";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCharacterBinding.inflate(LayoutInflater.from(requireContext()),
                container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new CharacterAdapter(characters,this);
        binding.recycleCharacter.setAdapter(adapter);
    }

    private void loadData() {
    characters = new ArrayList<>();
    characters.add(new Charactersss("Rick Sanchez","Alive",R.drawable.rick));
    characters.add(new Charactersss("Morty Smith","Alive",R.drawable.morty));
    characters.add(new Charactersss("Albert Einstein","Dead",R.drawable.albert));
    characters.add(new Charactersss("Jerry Smith","Alive",R.drawable.jerry));
    characters.add(new Charactersss("Sashka Zver","Alive",R.drawable.sashka));

    }

    @Override
    public void onClick(Charactersss character) {
        NavHostFragment.findNavController(CharacterFragment.this).navigate(CharacterFragmentDirections
                .actionCharacterFragmentToScreenFragment(character));
    }
}