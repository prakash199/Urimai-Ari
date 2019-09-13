package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.urimaiadi.RecyclerViewAdapters.recyclerAdapterRules;

import java.util.ArrayList;

public class politicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> fines = new ArrayList<>();
        rules.add("Section 1 False listings by registrars, listing board members, police officers or interpreters\n" +
                "Section 2 Misconduct of registrars or assistants\n" +
                " Section 3 Neglect of duty; registrars or assistants, listing board members, or police officers\n" +
                "Section 4 Refusal or neglect to give information to registrars or other authorized persons\n" +
                "Section 5 Giving false information\n" +
                "Section 6 False affidavits and oaths\n" +
                "Section 7 Aiding or abetting false affidavits or oaths\n" +
                "Section 9 Misconduct at registration\n" +
                "Section 8 Illegal registration\n" +
                "Section 10 Defacing or removing notices or voting lists");
        fines.add("Fines are 1500 rupees");
        RecyclerView recyclerView = findViewById(R.id.recycle_politics);
        recyclerAdapterRules recyclerAdapterRules = new recyclerAdapterRules(rules,this,fines);
        recyclerView.setAdapter(recyclerAdapterRules);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
