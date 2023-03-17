package com.miniweam.miniweamdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.miniweam.miniweamdemo.Information;
import com.miniweam.miniweamdemo.R;

import java.util.ArrayList;

public class MyGraphicsCustomAdapter extends RecyclerView.Adapter<MyGraphicsCustomAdapter.MyGViewHolder> {

    Context context;
    ArrayList<Information> data;

    LayoutInflater inflater;

    public MyGraphicsCustomAdapter(Context context, ArrayList<Information> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyGraphicsCustomAdapter.MyGViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_row, parent, false);

        MyGViewHolder holder = new MyGViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyGraphicsCustomAdapter.MyGViewHolder holder, int position) {
        holder.textView.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).imageId);

        holder.imageView.setOnClickListener(v -> Toast.makeText(context, "OnClick called on position ..." ,
                Toast.LENGTH_SHORT).show());

        holder.imageView.setOnLongClickListener(v -> {
            Toast.makeText(context, "OnLongClick called on position ..." ,
                    Toast.LENGTH_SHORT).show();
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyGViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public MyGViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.txv_row);
            imageView = itemView.findViewById(R.id.img_row);
        }
    }
}
