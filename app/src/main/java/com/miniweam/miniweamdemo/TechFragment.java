package com.miniweam.miniweamdemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class TechFragment extends Fragment {

    ImageView javaIv, xmlIv, gitIv, githubIv, firebaseIv, notionIv, superIv;
    TextView javaTv, xmlTv, gitTv, githubTv, firebaseTv, notionTv;
    AppCompatButton discoverProjectsAcb;

    public TechFragment() {
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
        View view = inflater.inflate(R.layout.fragment_tech, container, false);

        javaIv = view.findViewById(R.id.java_iv);
        javaIv.setOnClickListener(View ->
                Snackbar.make(view, "Java ImageView Clicked", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show());

        javaTv = view.findViewById(R.id.java_tv);
        javaTv.setOnClickListener(View ->
                Toast.makeText(getActivity(), "Java TextView Clicked", Toast.LENGTH_SHORT).show());

        xmlIv = view.findViewById(R.id.xml_iv);
        xmlIv.setOnClickListener(View -> Snackbar.make(view, "XML ImageView Clicked", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

        xmlTv = view.findViewById(R.id.xml_tv);
        xmlTv.setOnClickListener(View ->
                Toast.makeText(getActivity(), "XML TextView Clicked", Toast.LENGTH_SHORT).show());

        gitIv = view.findViewById(R.id.git_iv);
        gitIv.setOnClickListener(View -> Snackbar.make(view, "Git ImageView Clicked", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

        gitTv = view.findViewById(R.id.git_tv);
        gitTv.setOnClickListener(View ->
                Toast.makeText(getActivity(), "Git TextView Clicked", Toast.LENGTH_SHORT).show());

        githubIv = view.findViewById(R.id.github_iv);
        githubIv.setOnClickListener(View -> Snackbar.make(view, "Github ImageView Clicked",
                Snackbar.LENGTH_LONG).setAction("Action", null).show());

        githubTv = view.findViewById(R.id.github_tv);
        githubTv.setOnClickListener(View ->
                Toast.makeText(getActivity(), "Github TextView Clicked", Toast.LENGTH_SHORT)
                        .show());

        firebaseIv = view.findViewById(R.id.firebase_iv);
        firebaseIv.setOnClickListener(View -> Snackbar.make(view, "Firebase ImageView Clicked",
                        Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

        firebaseTv = view.findViewById(R.id.firebase_tv);
        firebaseTv.setOnClickListener(View ->
                Toast.makeText(getActivity(), "Firebase TextView Clicked", Toast.LENGTH_SHORT)
                        .show());

        notionIv = view.findViewById(R.id.notion_iv);
        notionIv.setOnLongClickListener(view1 -> {
            Snackbar.make(view1, "Notion ImageView Clicked",
                            Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return false;
        });
        notionTv = view.findViewById(R.id.notion_tv);
        notionTv.setOnLongClickListener(view12 -> {
            Toast.makeText(getActivity(), "Notion TextView Clicked", Toast.LENGTH_SHORT)
                    .show();
            return false;
        });

        superIv = view.findViewById(R.id.super_iv);
        superIv.setOnLongClickListener(view1 -> {
            Snackbar.make(view1, "Super ImageView Clicked",
                            Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return false;
        });

        discoverProjectsAcb = view.findViewById(R.id.discover_projects_acb);
        discoverProjectsAcb.setOnClickListener(v -> startActivity(new Intent(getActivity(),
                ProjectsActivity.class)));

        return view;
    }
}