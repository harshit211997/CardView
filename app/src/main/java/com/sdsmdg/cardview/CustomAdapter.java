package com.sdsmdg.cardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    Context context;
    List<String> demo;

    public CustomAdapter(Context context, List<String> demo) {
        this.context = context;
        this.demo = demo;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        Context context;

        public ViewHolder(View itemView, Context context) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.textView);
            this.context = context;
        }
    }

    @Override
    public int getItemCount() {
        return demo.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view, context);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textView.setText(demo.get(position));

    }
}
