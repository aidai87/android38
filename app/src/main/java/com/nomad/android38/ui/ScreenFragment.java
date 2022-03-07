package com.nomad.android38.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android38.databinding.FragmentScreenBinding;
import com.nomad.android38.model.Charactersss;

public class ScreenFragment extends Fragment {
    private FragmentScreenBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentScreenBinding.inflate(LayoutInflater.from(requireContext()),
                container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
    }

    private void loadData() {
        Charactersss charactersss = ScreenFragmentArgs.fromBundle(getArguments()).getKakugodno();
        binding.tvLive3.setText(charactersss.getLive());
        binding.tvName3.setText(charactersss.getName());
        if (charactersss.getImage() != null) {
            binding.imageBig.setImageResource(charactersss.getImage());
        }
    }
}