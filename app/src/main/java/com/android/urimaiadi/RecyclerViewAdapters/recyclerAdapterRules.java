package com.android.urimaiadi.RecyclerViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.urimaiadi.R;

import java.util.ArrayList;

public class recyclerAdapterRules extends RecyclerView.Adapter<recyclerAdapterRules.rulesHolder>{
ArrayList<String> RulesTexts;
Context contextX;
ArrayList<String> toastText;
    public recyclerAdapterRules(ArrayList<String> rules,Context context,ArrayList<String> fines) {
        this.contextX = context;
        this.RulesTexts = rules;
        this.toastText = fines;
    }

    @NonNull
    @Override
    public rulesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_rules_items,parent,false);
        return new rulesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rulesHolder holder, final int position) {
        holder.rulesText.setText(RulesTexts.get(position));
        holder.rulesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contextX,toastText.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return RulesTexts.size();
    }

    class rulesHolder extends RecyclerView.ViewHolder{
        TextView rulesText;
        public rulesHolder(@NonNull View itemView) {
            super(itemView);
            rulesText = itemView.findViewById(R.id.rules_textview);
        }
    }
}
