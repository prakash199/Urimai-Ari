package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.urimaiadi.RecyclerViewAdapters.recyclerAdapterRules;

import java.util.ArrayList;

public class medicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> fines = new ArrayList<>();
        rules.add("ACT No. 19 of 2018.\n" +
                "An Act to amend the Tamil Nadu Private Clinical Establishments \n" +
                "(Regulation) Act, 1997.\n" +
                " BE it enacted by the Legislative Assembly of the State of Tamil Nadu \n" +
                "in the Sixty-ninth Year\n" +
                "TAMIL NADU ORDINANCE No.4 OF 2003\n" +
                "An Ordinance further to amend the Laws relating to the \n" +
                "Municipal Corporations and Municipalities in the State of \n" +
                "Tamil Nadu.");
        fines.add("Fine about 1500 rupees");
        RecyclerView recyclerView = findViewById(R.id.recycle_medical);
        recyclerAdapterRules recyclerAdapterRules = new recyclerAdapterRules(rules,this,fines);
        recyclerView.setAdapter(recyclerAdapterRules);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
