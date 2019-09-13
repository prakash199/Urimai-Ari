package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.urimaiadi.RecyclerViewAdapters.recyclerAdapterRules;

import java.util.ArrayList;

public class railwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railway);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> fines = new ArrayList<>();
        rules.add("1. Short title and Commencement – (1) This Act may be called the Railway \n" +
                "Act, 1989. \n" +
                "(2) Shall come into force on such date as the Central Government \n" +
                "may, by notification in the Official Gazette, appoint : \n" +
                "Provided that different dates may be appointed for different provisions \n" +
                "of this Act, and any reference in any such provision to the commencement \n" +
                "on this Act shall be constructed as a reference to the coming into force of \n" +
                "that provision. \n" +
                "Note : - The act came into force w.e.f. July 1, 1990 vide Noti. No. S.O. \n" +
                "475(E) dated 12th June 1990.\n" +
                "(26-A) “Officer Authorised” means an officer authorised by the Central \n" +
                "Government under sub-section(2) of Section 179.\n" +
                "Sanction of the Central Government to the opening of railway\n" +
                "– No railway shall be opened for the public carriage of passengers until \n" +
                "the government has, by order, sanctioned the opening thereof for the \n" +
                "purpose.");
        fines.add("Fine about 5000 rupees");
        RecyclerView recyclerView = findViewById(R.id.recycle_railway);
        recyclerAdapterRules recyclerAdapterRules = new recyclerAdapterRules(rules,this,fines);
        recyclerView.setAdapter(recyclerAdapterRules);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
