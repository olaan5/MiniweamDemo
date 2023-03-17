package com.miniweam.miniweamdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.miniweam.miniweamdemo.R;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;

    String[] app_name;
    String[] app_descriptions;
    String[] app_link;

    public ItemAdapter(Context context, String[] items, String[] descriptions, String[] prices) {
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.app_name = items;
        this.app_descriptions = descriptions;
        this.app_link = prices;
    }

    @Override
    public int getCount() {
        return app_name.length;
    }

    @Override
    public Object getItem(int position) {
        return app_name[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = layoutInflater.inflate(R.layout.list_view_details, null);
        TextView nameTv = v.findViewById(R.id.name_tv);
        TextView descriptionTv = v.findViewById(R.id.description_tv);
        TextView pricesTv = v.findViewById(R.id.prices_tv);

        String name = app_name[position];
        String description = app_descriptions[position];
        String cost = app_link[position];

        nameTv.setText(name);
        descriptionTv.setText(description);
        pricesTv.setText(cost);

        return v;
    }
}
