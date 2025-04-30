package com.example.newestapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newestapp.R;
import androidx.appcompat.app.AppCompatActivity;

public class Destination_Detail_Activities extends AppCompatActivity {
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_destination_details);

        String countryName = getIntent().getStringExtra("name");
        String history = getIntent().getStringExtra("history");
        String geography = getIntent().getStringExtra("geography");
        int mainImg = getIntent().getIntExtra("img4", 0);
        int secondaryImg = getIntent().getIntExtra("img1", 0);
        int secondaryImg2 = getIntent().getIntExtra("img2", 0);
        int secondaryImg3 = getIntent().getIntExtra("img3", 0);

        TextView historyTextView = findViewById(R.id.history);
        TextView geographyTextView = findViewById(R.id.geography);
        TextView titleTextView = findViewById(R.id.country_name_text);

        ImageView secondaryImgView = findViewById(R.id.location_img);
        ImageView secondaryImg2View = findViewById(R.id.location2_img);
        ImageView secondaryImg3View = findViewById(R.id.location3_img);

        titleTextView.setText("Info about " + countryName);
        historyTextView.setText("About " + countryName + "'s history" + history);
        geographyTextView.setText("About" + countryName + "'s geography" + geography);

        secondaryImgView.setImageResource(secondaryImg);
        secondaryImg2View.setImageResource(secondaryImg2);
        secondaryImg3View.setImageResource(secondaryImg3);

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
