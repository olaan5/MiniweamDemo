package com.miniweam.miniweamdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MiniweamFragment extends Fragment {

    FloatingActionButton messageFab;

    public MiniweamFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_miniweam, container, false);

        messageFab = view.findViewById(R.id.fab_message);
        messageFab.setOnClickListener(v -> startActivity(new Intent(getActivity(),
                MessageActivity.class)));
        return view;
    }
}