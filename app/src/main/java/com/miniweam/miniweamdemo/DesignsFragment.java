package com.miniweam.miniweamdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DesignsFragment extends Fragment {

    AppCompatButton discoverDesignsAcb;

    public DesignsFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_designs, container, false);

        discoverDesignsAcb = view.findViewById(R.id.discover_designs_acb);
        discoverDesignsAcb.setOnClickListener(view1 -> startActivity(new Intent(getActivity(),
                DiscoverDesignsActivity.class)));

        return view;
    }
}