package com.example.user.wsr;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Model> newsResponses;

    public Adapter(List<Model> newsResponses) {
        this.newsResponses = newsResponses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.one_code,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.user.setText(newsResponses.get(i).results.get(i).getOwner());
        viewHolder.title.setText(newsResponses.get(i).results.get(i).getTitle());
        viewHolder.code.setText(newsResponses.get(i).results.get(i).getCode());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView user;
        TextView title;
        TextView code;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            user = itemView.findViewById(R.id.userId);
            title = itemView.findViewById(R.id.titleId);
            code = itemView.findViewById(R.id.codeId);
        }
    }
}
