package com.example.newestapp.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.example.newestapp.R;
import androidx.appcompat.app.AppCompatActivity;

public class Destination_Detail_Activities extends AppCompatActivity {
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_destination_details);
        String countryName = getIntent().getStringExtra("name");
        TextView titleTextView = findViewById(R.id.country_name_text);
        titleTextView.setText("Info about " + countryName);
    }
}
