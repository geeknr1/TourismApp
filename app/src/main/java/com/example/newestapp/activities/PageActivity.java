package com.example.newestapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.models.Country;
import com.example.newestapp.R;

import java.util.*;


public class PageActivity extends AppCompatActivity {
    private Country country;
    private ArrayList<String> vacationSpots;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vacation);
        country = (Country) getIntent().getSerializableExtra("COUNTRY");

        VacationSpotType vacation = VacationSpotType.detachFrom(getIntent());

        bindText(vacation);
    }

    public void setText(int viewID, int res){
        TextView text = findViewById(viewID);
        text.setText(res);
    }

    public void bindText(VacationSpotType spotType){
        setText(R.id.skiiLocationName,spotType.skiiLocationName);
        setText(R.id.skiiLocationInfo,spotType.skiiLocationInfo);
        setText(R.id.skiiLocationFunFacts,spotType.skiiLocationFunFacts);
        setText(R.id.hikingLocationName,spotType.hikingLocationName);
        setText(R.id.hikingLocationInfo,spotType.hikingLocationInfo);
        setText(R.id.hikingLocationFunFacts,spotType.hikingLocationFunFacts);
        setText(R.id.rockClimbingLocationName,spotType.rockClimbingLocationName);
        setText(R.id.rockClimbingLocationInfo,spotType.rockClimbingLocationInfo);
        setText(R.id.rockClimbingLocationFunFacts,spotType.rockClimbingLocationFunFacts);
    }
    public void bindTextVacation(String skiiLocationName, String skiiLocationInfo, String factsAboutSkiiLocation, String hikingTrailLocationName, String hikingTrailLocationInfo, String factsAboutHikingTrail, String rockClimbingLocationName, String rockClimbingLocationInfo, String factsAboutRockClimbingLocation){
        TextView funSkiiLocationName, funSkiiLocationInfo, funSkiiLocationFacts;
        funSkiiLocationName = findViewById(R.id.skiiLocationName);
        funSkiiLocationInfo = findViewById(R.id.skiiLocationInfo);
        funSkiiLocationFacts = findViewById(R.id.skiiLocationFunFacts);

        TextView funHikingLocationName, funHikingLocationInfo, funHikingLocationFacts;
        funHikingLocationName = findViewById(R.id.hikingLocationName);
        funHikingLocationInfo = findViewById(R.id.hikingLocationInfo);
        funHikingLocationFacts = findViewById(R.id.hikingLocationFunFacts);

        TextView funRockClimbingLocationName, funRockClimbingLocationInfo, funRockClimbingLocationFacts;
        funRockClimbingLocationName = findViewById(R.id.rockClimbingLocationName);
        funRockClimbingLocationInfo = findViewById(R.id.rockClimbingLocationInfo);
        funRockClimbingLocationFacts = findViewById(R.id.rockClimbingLocationFunFacts);

        funSkiiLocationName.setText(skiiLocationName);
        funSkiiLocationInfo.setText(skiiLocationInfo);
        funSkiiLocationFacts.setText(factsAboutSkiiLocation);

        funSkiiLocationName.setText(hikingTrailLocationName);
        funSkiiLocationInfo.setText(hikingTrailLocationInfo);
        funSkiiLocationFacts.setText(factsAboutHikingTrail);

        funSkiiLocationName.setText(rockClimbingLocationName);
        funSkiiLocationInfo.setText(rockClimbingLocationInfo);
        funSkiiLocationFacts.setText(factsAboutRockClimbingLocation);
    }
}

// functie de binding, enumuri pentru country, ageID si dupa aceea bind pentru tot (textviewuri, imagini, videouri)