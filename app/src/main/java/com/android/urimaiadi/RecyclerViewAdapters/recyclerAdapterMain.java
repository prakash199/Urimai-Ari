package com.android.urimaiadi.RecyclerViewAdapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.urimaiadi.R;
import com.android.urimaiadi.TrafficActivity;
import com.android.urimaiadi.educationalActivity;
import com.android.urimaiadi.medicalActivity;
import com.android.urimaiadi.politicsActivity;
import com.android.urimaiadi.railwayActivity;
import java.util.ArrayList;


public class recyclerAdapterMain extends RecyclerView.Adapter<recyclerAdapterMain.recyclerHolder>{
    final static String TAG = "Recycler Main Adapter";
    Context _context;
    ArrayList<Integer> _icons;
    ArrayList<String> _iconLables;
    public recyclerAdapterMain(ArrayList<Integer> icons,ArrayList<String> icon_names, Context context) {
        this._context = context;
        this._iconLables = icon_names;
        this._icons = icons;
    }

    @NonNull
    @Override
    public recyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_main_items,parent,false);
        return new recyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called for Position "+position);
        holder.icon.setImageResource(_icons.get(position));
        holder.iconText.setText(_iconLables.get(position));
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (_iconLables.get(position)){
                    case "Traffic Rules":
                        intent = new Intent(_context, TrafficActivity.class);
                        _context.startActivity(intent);
                        break;
                    case "Educational Rules":
                        intent = new Intent(_context, educationalActivity.class);
                        _context.startActivity(intent);
                        break;
                    case "Medicinal Rules":
                        intent = new Intent(_context, medicalActivity.class);
                        _context.startActivity(intent);
                        break;
                    case "Politics Rules":
                        intent = new Intent(_context, politicsActivity.class);
                        _context.startActivity(intent);
                        break;
                    case "Railway Rules":
                        intent = new Intent(_context, railwayActivity.class);
                        _context.startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return _iconLables.size();
    }

    public class recyclerHolder extends RecyclerView.ViewHolder{
        ImageView icon;
        TextView iconText;
        public recyclerHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.icon_image);
            iconText = itemView.findViewById(R.id.icon_text);
        }
    }
}
