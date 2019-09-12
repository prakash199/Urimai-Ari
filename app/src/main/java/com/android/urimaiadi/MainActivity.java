package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.urimaiadi.RecyclerViewAdapters.recyclerAdapterMain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static final String TAG = "MainActivity";
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> iconText = new ArrayList<>();
        ArrayList<Integer> icons = new ArrayList<>();
        initalize(iconText,icons);
    }

    private void initalize(ArrayList<String> iconText,ArrayList<Integer> icons) {
        iconText.add("Traffic Rules");
        icons.add(R.drawable.traffic_icon);
        iconText.add("Educational Rules");
        icons.add(R.drawable.education_icon);
        iconText.add("Medicinal Rules");
        icons.add(R.drawable.medical_icon);
        iconText.add("Politics Rules");
        icons.add(R.drawable.politics_icon);
        iconText.add("Railway Rules");
        icons.add(R.drawable.railway_icon);
        setRecycler(icons,iconText);
    }

    private void setRecycler(ArrayList<Integer> icons, ArrayList<String> iconText) {
        recyclerAdapterMain adapterMain = new recyclerAdapterMain(icons,iconText,this);
        RecyclerView recyclerViewMain = findViewById(R.id.recycler_menu_main);
        recyclerViewMain.setAdapter(adapterMain);
        recyclerViewMain.setLayoutManager(new GridLayoutManager(this,2));
    }
}
