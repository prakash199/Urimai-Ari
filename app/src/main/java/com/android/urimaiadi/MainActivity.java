package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void traffic(View view) {
        Toast.makeText(this,"Traffic button pressed",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,TrafficActivity.class);
        startActivity(intent);
    }
}
