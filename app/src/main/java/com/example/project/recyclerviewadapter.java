package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.MyViewHolder> {
    Context context;
    ArrayList <owl> owls;
    public recyclerviewadapter(Context context, ArrayList<owl>owls){
        this.context =context;
        this.owls=owls;
    }
    @NonNull
    @Override
    public recyclerviewadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.recyclerview, parent, false);

        return new recyclerviewadapter.MyViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewadapter.MyViewHolder holder, int position) {
        holder.nameView.setText(owls.get(position).getName());
        holder.categoryView.setText(owls.get(position).getSize());
        holder.categoryView.setText(owls.get(position).getCost());
        holder.locationView.setText(owls.get(position).getLocation());
        holder.categoryView.setText(owls.get(position).getCategory());
    }

    @Override
    public int getItemCount() {
        return owls.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nameView;
        TextView sizeView;
        TextView costView;
        TextView locationView;
        TextView categoryView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameView = itemView.findViewById(R.id.name);
            sizeView = itemView.findViewById(R.id.size);
            costView= itemView.findViewById(R.id.cost);
            locationView = itemView.findViewById(R.id.location);
            categoryView = itemView.findViewById(R.id.category);


        }
    }
}
