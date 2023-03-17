package com.miniweam.miniweamdemo;

import java.util.ArrayList;

public class GraphicsData {

    public static ArrayList<Information> getGraphicsData() {
        ArrayList<Information> data = new ArrayList<>();

        int[] images = {
                R.drawable.exc_fler,
                R.drawable.miniweam_logo,
                R.drawable.miniweam_technologies,
                R.drawable.on_learn,
                R.drawable.ww
        };

        String[] Categories = {"Exchange Design Flyer", "Logo", "Logo", "Flyer", "Home Feature Design"};

        for (int i = 0; i < images.length; i++) {
            Information current = new Information();
            current.title = Categories[i];
            current.imageId = images[i];

            data.add(current);
        }

        return data;
    }
}
