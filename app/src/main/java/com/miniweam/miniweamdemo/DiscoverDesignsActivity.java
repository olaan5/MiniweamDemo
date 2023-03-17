package com.miniweam.miniweamdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.miniweam.miniweamdemo.Adapter.MyCustomAdapter;
import com.miniweam.miniweamdemo.Adapter.MyGraphicsCustomAdapter;

public class DiscoverDesignsActivity extends AppCompatActivity {

    RecyclerView gdRv, adRv;
    MyCustomAdapter adapter;
    MyGraphicsCustomAdapter graphicsCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_designs);

        gdRv = findViewById(R.id.gd_rv);

        graphicsCustomAdapter = new MyGraphicsCustomAdapter(this, GraphicsData.getGraphicsData());
        gdRv.setAdapter(graphicsCustomAdapter);

        LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(this);
        mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.HORIZONTAL);
        gdRv.setLayoutManager(mLinearLayoutManagerHorizontal);



        adRv = findViewById(R.id.ad_rv);
        adapter = new MyCustomAdapter(this, Data.getData());
        adRv.setAdapter(adapter);
        adRv.setLayoutManager(new GridLayoutManager(this, 2));
    }
}



