package com.example.newestapp.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.models.Country;
import com.example.newestapp.R;

import java.util.*;


public class PageActivity extends AppCompatActivity {
    private Country country;
    private ArrayList<String> vacationSpots;
    private Button back;

    private RadioGroup ageGroups;
    private RadioButton children;
    private RadioButton youngOnes;
    private RadioButton adults;
    private RadioButton seniors;
    private RadioButton backToNormal;

    private TextView nameLocation;
    private TextView infoLocation;
    private TextView nameSkiiLocation;
    private TextView infoSkiiLocation;
    private TextView funFactsSkiiLocation;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vacation);
        VacationSpotType vacation = VacationSpotType.detachFrom(getIntent());
        bindText(vacation);
        bindImg(vacation);

        nameLocation = findViewById(R.id.locationName);
        Typeface titleFont = Typeface.createFromAsset(getAssets(), "fonts/Stormfaze.otf");
        nameLocation.setTypeface(titleFont);

        infoLocation = findViewById(R.id.locationInfo);
        Typeface infoFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        infoLocation.setTypeface(infoFont);

        ageGroups = findViewById(R.id.radioAgeGroups);
        children = findViewById(R.id.child);
        youngOnes = findViewById(R.id.youngPeople);
        adults = findViewById(R.id.adult);
        seniors = findViewById(R.id.senior);
        backToNormal = findViewById(R.id.normal);

        ageGroups.setVisibility(View.VISIBLE);
        children.setVisibility(View.VISIBLE);
        youngOnes.setVisibility(View.VISIBLE);
        adults.setVisibility(View.VISIBLE);
        seniors.setVisibility(View.VISIBLE);
        backToNormal.setVisibility(View.VISIBLE);

        back=findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PageActivity.this, MainActivity.class));
            }
        });

    }

    public void setText(int viewID, int res){
        TextView text = findViewById(viewID);
        text.setText(res);
    }

    public void setImage(int viewID, int res){
        ImageView img = findViewById(viewID);
        img.setImageResource(res);
    }

    public void bindText(VacationSpotType spotType){
        setText(R.id.locationName, spotType.locationName);
        setText(R.id.locationInfo, spotType.locationInfo);
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

    public void bindImg(VacationSpotType spotType){
        setImage(R.id.generalFirstImg, spotType.imageOne);
        setImage(R.id.generalSecondImg, spotType.imageTwo);
        setImage(R.id.generalThirdImg, spotType.imageThree);
        setImage(R.id.generalFourthImg, spotType.imageFour);
        View root = findViewById(R.id.scrollRoot);
        root.setBackgroundResource(spotType.backgroundImg);
    }
}

// functie de binding, enumuri pentru country, ageID si dupa aceea bind pentru tot (textviewuri, imagini, videouri)