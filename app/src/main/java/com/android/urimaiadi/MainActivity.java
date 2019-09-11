package com.android.urimaiadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void traffic(View view) {
        Log.d(TAG, "traffic: Traffic Rules Clicked!");
        Intent intent = new Intent(this,TrafficActivity.class);
        startActivity(intent);
    }

    public void politcal(View view) {
        Log.d(TAG, "politcal: Politics clicked");
    }

    public void railway(View view) {
    }

    public void medical(View view) {
    }

    public void education(View view) {
    }
}
