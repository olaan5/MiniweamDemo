package com.miniweam.miniweamdemo;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Information> getData() {
        ArrayList<Information> data = new ArrayList<>();

        int[] images = {
                R.drawable.m1_a,
                R.drawable.m1_b,
                R.drawable.m1_c,
                R.drawable.m1_d,
                R.drawable.m1_e,
                R.drawable.mdwe,
                R.drawable.mend,
                R.drawable.mmr,
                R.drawable.ispired_d,
                R.drawable.wea,
                R.drawable.weap,
                R.drawable.weat
        };

        String[] Categories = {"2D Home", "2D Home", "2D Home", "2D Home", "2D Home", "3D Home", "3D Home",
                "3D Home", "3D Hom             e", "2D Home", "2D Home", "3D Home"};

        for (int i = 0; i < images.length; i++) {
            Information current = new Information();
            current.title = Categories[i];
            current.imageId = images[i];

            data.add(current);
        }

        return data;
    }
}
