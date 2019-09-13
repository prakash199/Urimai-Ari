package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.urimaiadi.RecyclerViewAdapters.recyclerAdapterRules;

import java.util.ArrayList;

public class TrafficActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
        ArrayList<String> rules = new ArrayList<>();
        ArrayList<String> fines = new ArrayList<>();
        rules.add("TRAFFIC OFFENCES AND PENAL SECTION\n" +
                "1. Red Light Jumping 119/177 MVA Rs. 100\n" +
                "2. Driving Left Hand Drive \n" +
                "without Indicator 120/177 MVA Rs. 100\n" +
                "3. Improper and Obstructive \n" +
                "Parking 122/177 MVA Rs. 100\n" +
                "4. Travelling on Running Board \n" +
                "(Driver) 123(1)/177 MVA Rs. 100\n" +
                "5. Travelling on Running Board \n" +
                "(Passenger) 123(2)/177 MVA Rs. 100\n" +
                "6. Triple Riding 128/177 MVA Rs. 100\n" +
                "7. Driving without Helmet 129/177 MVA Rs. 100\n" +
                "8. Not Displaying Number Plate 50/177 MVA Rs. 100\n" +
                "9. Misbehavior by TSR/Taxi \n" +
                "Driver 11.3/177 MVA Rs. 100\n" +
                "10. Over Charging by TSR/Taxi 11.8/177 MVA Rs. 100\n" +
                "11. Refusal by TSR/Taxi Driver 11.9/177 MVA Rs. 100\n" +
                "12. Driving without Light (After \n" +
                "Sunset) 105/177 MVA Rs. 100\n" +
                "13. Driving without Horn 119(1)/177 MVA Rs. 100\n" +
                "14. Driving without Silencer 120/190(2) CMVR Rs. 100\n" +
                "15. Driving with a Defective \n" +
                "Number Plate 50/177 MVA Rs. 100\n" +
                "16. Violation of Stop Line 113(1)/177 MVA Rs. 100\n" +
                "17. Section 177 IInd or \n" +
                "subsequent Offence \n" +
                "18. Disobeying Lawful Directions 132/179 MVA Rs. 1000\n" +
                "19. Allowing unauthorized person \n" +
                "to drive 5/180 MVA Rs. 1000\n" +
                "20. Driving without License 3/181 MVA Rs. 500\n" +
                "21. Driving by Minors 4/181 MVA Rs. 500");
        fines.add(" Fine : 100 to 1000 rupees");
        rules.add("22. Over Speeding (1st Offence) 112/183(1) MVA Rs. 400\n" +
                "23. Over Speeding (Subsequent \n" +
                "Offence) 112/183(1) MVA Rs. 300\n" +
                "24. Abetment of Over Speeding 112/183(2) MVA Rs. 300\n" +
                "25. Section 183(2) (2nd or \n" +
                "Subsequent Offence) 112/183(2) MVA \n" +
                "26. Driving Dangerously (1st \n" +
                "Offence) 184 MVA Rs. 1000\n" +
                "27. Driving Dangerously (2nd \n" +
                "Offence) 184 (2) MVA \n" +
                "28. Using `Unregistered Vehicles' \n" +
                "or Displaying \"Applied for\" 39/192 MVA Rs. 2000\n" +
                "29. Section 192(1) (2nd or \n" +
                "subsequent offence) \n" +
                "30. Violation of Yellow Line 18(II)R.R.R./119/117 \n" +
                "MVA \n" +
                "31. \n" +
                "Violation of Restriction of Time \n" +
                "on HTV\'s/Care on Various \n" +
                "Roads \n" +
                "115/194 MVA Rs. 2000\n" +
                "32. Section 194(1) (2nd or \n" +
                "Subsequent Offence) \n" +
                "33. Violation of mandatory signs \n" +
                "(One Way No Right Turn, No \n" +
                "Left Turn, No Horn) \n" +
                "119/177 MVA Rs. 100\n" +
                "34. Excess Smoke 99(1)(a)/177 MVA Rs. 100\n" +
                "35. Blowing of Pressure Horn 96(1)/177 MVA Rs. 100\n" +
                "36. Conductor without Uniform 23(1)/177 MVA Rs. 100\n" +
                "37. Driver without Uniform 7/177 MVA Rs. 100\n" +
                "38. Conductor without Badge 22(1)/177 MVA Rs. 100\n" +
                "39. Carrying Passengers on \n" +
                "Goods Vehicles 84(2)/177 MVA Rs. 100\n" +
                "40. Carrying Goods on \n" +
                "Passengers Vehicle 84(3)/177 MVA Rs. 100");
        fines.add("fines about 100 to 1000");
        RecyclerView recyclerView = findViewById(R.id.recycle_traffic);
        recyclerAdapterRules recyclerAdapterRules = new recyclerAdapterRules(rules,this,fines);
        recyclerView.setAdapter(recyclerAdapterRules);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
