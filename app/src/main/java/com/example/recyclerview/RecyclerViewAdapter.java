package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;
    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView_1;
        public TextView textView_2;


        //View itemView - отдельный элемент RecyclerView
        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView_1 = itemView.findViewById(R.id.textView_1);
            textView_2 = itemView.findViewById(R.id.textView_2);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
               parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = arrayList.get(position);

        holder.imageView.setImageResource(recyclerViewItem.getImageResource());
        holder.textView_1.setText(recyclerViewItem.getText1());
        holder.textView_2.setText(recyclerViewItem.getText2());
        
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }



}
