package com.nomad.android38.ui;

import static com.nomad.android38.ui.CharacterFragment.key;

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
import com.nomad.android38.adapter.LocationAdapter;
import com.nomad.android38.databinding.FragmentLocationBinding;
import com.nomad.android38.model.Charactersss;

import java.util.ArrayList;

public class LocationFragment extends Fragment implements OnClick {
    private FragmentLocationBinding binding;
    private LocationAdapter adapter;
    private ArrayList<Charactersss> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLocationBinding.inflate(LayoutInflater.from(requireContext()),
                container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new LocationAdapter(this,list);
        binding.recycleLocation.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Charactersss("Earth (C-137)","Planet"));
        list.add(new Charactersss("Abadango","Cluster"));
        list.add(new Charactersss("Citadel of Ricks","Space station"));
        list.add(new Charactersss("Worldender's lair","Planet"));
        list.add(new Charactersss("Anatomy Park","Microverse"));
        list.add(new Charactersss("Interdimensional Cable","TV"));
        list.add(new Charactersss("Immortality Field Resort","Resort"));
        list.add(new Charactersss("Post-Apocalyptic Earth","Planet"));
        list.add(new Charactersss("Purge Planet","Planet"));
        list.add(new Charactersss("Venzenulon 7","Planet"));
        list.add(new Charactersss("Bepis 9","Planet"));
        list.add(new Charactersss("Cronenberg Earth","Planet"));
        list.add(new Charactersss("Nuptia 4","Planet"));
        list.add(new Charactersss("Bird World","Planet"));
        list.add(new Charactersss("Earth (5-126)","Planet"));
        list.add(new Charactersss("Gromflom Prime","Planet"));
        list.add(new Charactersss("Earth (Rpl. Dimension)","Planet"));
        list.add(new Charactersss("Mr. Goldenfold's dream","Dream"));
        list.add(new Charactersss("St. Gloopy Noops Hospital","Space station"));
        list.add(new Charactersss("Giant's Town","Fantasy town"));

    }

    @Override
    public void onClick(Charactersss character) {
        NavHostFragment.findNavController(LocationFragment.this).navigate(LocationFragmentDirections
                .actionLocationFragmentToScreenFragment3(character));
    }
}