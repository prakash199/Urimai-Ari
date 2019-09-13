package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import com.android.urimaiadi.RecyclerViewAdapters.recyclerAdapterRules;

public class educationalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> fines = new ArrayList<>();
        rules.add("Right to freedom of speech and expressions\n" +
                "\n" +
                "In a petition filed by a student of law, Supreme court laid down the importance of freedom of speech and expression both from the point of view of the liberty of the individual and from point of view of the democratic form of our government. Supreme court held that freedom of speech and expression of opinion is of paramount importance under a democratic constitution which envisages changes in the composition of legislatures and governments and must be preserved. Shreya Singhal vs Union of India 2015 (5) SCC 1.\n" +
                "\n" +
                "Right to information\n" +
                "\n" +
                "While permitting the examinees to inspect their answer books, Supreme Court held that the right to information is a facet of the freedom of “speech and expression” as contained in Article 19 (1) (a) of the Constitution of India and such a right is subject to reasonable restriction in the interest and security of the State and to exemptions and exceptions. CBSE and Anr vs Aditya Bandopadhyay and Ors. 2011 (8) SCC 497.\n" +
                "\n" +
                "Right to equality\n" +
                "\n" +
                "While laying down the principles to be followed by educational institutions during admissions, the Supreme Court laid down that if there is a violation of right to equality and equal treatment to the competing candidates, it would be completely just and fair to provide exceptional reliefs to the candidate under such circumstances alone – Chandigarh Administration & Anr. Vs Jasmine Kaur & Ors 2014 (10) SCC 521.\n" +
                "\n" +
                "Right to education:\n" +
                "\n" +
                "This one is a fundamental right under Article 21A of the Constitution of India reiterated in State of U.P. vs Bhupendra Nath Tripathi 2010 (13) SCC 203 (para 11).\n" +
                "\n" +
                "Right to Life under Article 21 of the constitution of India:\n" +
                "\n" +
                "A Division bench of the Delhi High Court while striking down a rule for disciplinary action under the Delhi School Education Rules, 1973 held that children should not be subjected to corporal punishment in schools and they should receive education in an environment of freedom and dignity, free from fear. Parents Forum for Meaningful Education & Anr vs Union if India & Anr. AIR 2001 Del 212: (2001) 89 DLT 705 (DB)\n" +
                "\n" +
                "Indian Contract Act: A student who has entered the age of majority i.e. 18 years can enter into a contract under Indian Contract Act, 1872. For e.g. while taking an educational loan a student has to enter a contractual agreement with a sanctioning bank or while entering a lease agreement with the owner of a residential property.\n" +
                "\n" +
                "Criminal law:\n" +
                "\n" +
                "Students below 7 years of age are exempted from criminal liability under Indian Penal Code and between 7 to 12 years liability will be dependent upon maturity of a student.\n" +
                "\n" +
                "Students under 18 years of age come under the definition of Juvenile Justice (Care and Protection of Children) Act, 2015 and are protected from being treated as adult criminals unless they are found committing a heinous crime as defined in the Act. While dealing with such Students in conflict with law, certain principles have to be followed by government authorities under Section 3 of the Act such as Principle of presumption of Innocence, Principle, of equality and non discrimination, Principle of natural justice etc");
        fines.add("Fine Upto 1000 Rupees");
        recyclerAdapterRules recyclerAdapterRules = new recyclerAdapterRules(rules,this,fines);
        RecyclerView recyclerView = findViewById(R.id.recycler_education);
        recyclerView.setAdapter(recyclerAdapterRules);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
