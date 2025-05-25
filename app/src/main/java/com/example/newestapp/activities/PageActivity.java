package com.example.newestapp.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

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
    private TextView nameHikingLocation;
    private TextView infoHikingLocation;
    private TextView nameRockClimbingLocation;
    private TextView infoRockClimbingLocation;
    private TextView funFactsSkiiLocation;
    private TextView funFactsHikingLocation;
    private TextView funFactsRockClimbingLocation;

    private VideoView hikingVid;
    //private String videoURL = "res/raw/charmonixhiking.mp4";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vacation);
        VacationSpotType vacation = VacationSpotType.detachFrom(getIntent());
        bindText(vacation);
        bindImg(vacation);
        bindVid(vacation);

        nameLocation = findViewById(R.id.locationName);
        Typeface titleFont = Typeface.createFromAsset(getAssets(), "fonts/Stormfaze.otf");
        nameLocation.setTypeface(titleFont);

        infoLocation = findViewById(R.id.locationInfo);
        Typeface infoFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        infoLocation.setTypeface(infoFont);

        nameSkiiLocation = findViewById(R.id.skiiLocationName);
        Typeface titleSkiiFont = Typeface.createFromAsset(getAssets(), "fonts/Stormfaze.otf");
        nameSkiiLocation.setTypeface(titleSkiiFont);

        infoSkiiLocation = findViewById(R.id.skiiLocationInfo);
        Typeface infoSkiiFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        infoSkiiLocation.setTypeface(infoSkiiFont);

        nameHikingLocation = findViewById(R.id.hikingLocationName);
        Typeface titleHikingFont = Typeface.createFromAsset(getAssets(), "fonts/Stormfaze.otf");
        nameHikingLocation.setTypeface(titleHikingFont);

        infoHikingLocation = findViewById(R.id.hikingLocationInfo);
        Typeface infoHikingFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        infoHikingLocation.setTypeface(infoHikingFont);

        nameRockClimbingLocation = findViewById(R.id.rockClimbingLocationName);
        Typeface titleRockClimbingFont = Typeface.createFromAsset(getAssets(), "fonts/Stormfaze.otf");
        nameRockClimbingLocation.setTypeface(titleRockClimbingFont);

        infoRockClimbingLocation = findViewById(R.id.rockClimbingLocationInfo);
        Typeface infoRockClimbingFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        infoRockClimbingLocation.setTypeface(infoRockClimbingFont);

        funFactsSkiiLocation = findViewById(R.id.skiiLocationFunFacts);
        Typeface infoFunFactsSkiiFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        funFactsSkiiLocation.setTypeface(infoFunFactsSkiiFont);

        funFactsHikingLocation = findViewById(R.id.hikingLocationFunFacts);
        Typeface titleFunFactsHikingFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        funFactsHikingLocation.setTypeface(titleFunFactsHikingFont);

        funFactsRockClimbingLocation = findViewById(R.id.rockClimbingLocationFunFacts);
        Typeface titleFunFactsRockClimbingFont = Typeface.createFromAsset(getAssets(), "fonts/whitestorm.otf");
        funFactsRockClimbingLocation.setTypeface(titleFunFactsRockClimbingFont);

        hikingVid = findViewById(R.id.hikingVideoID);

        nameSkiiLocation.setVisibility(View.GONE);
        infoSkiiLocation.setVisibility(View.GONE);
        nameHikingLocation.setVisibility(View.GONE);
        infoHikingLocation.setVisibility(View.GONE);
        nameRockClimbingLocation.setVisibility(View.GONE);
        infoRockClimbingLocation.setVisibility(View.GONE);
        funFactsSkiiLocation.setVisibility(View.GONE);
        funFactsHikingLocation.setVisibility(View.GONE);
        funFactsRockClimbingLocation.setVisibility(View.GONE);

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

        String backupone = nameLocation.getText().toString();
        String backuptwo = infoLocation.getText().toString();

        MediaController mediaController = new MediaController(this);

        ageGroups.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(children.isChecked()){
                    String tempone = nameSkiiLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = infoSkiiLocation.getText().toString();
                    infoLocation.setText(temptwo);

                    funFactsRockClimbingLocation.setVisibility(View.GONE);
                    hikingVid.setVisibility(View.GONE);
                }
                if(youngOnes.isChecked()){
                    String tempone = nameHikingLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = infoHikingLocation.getText().toString();
                    infoLocation.setText(temptwo);

                    mediaController.setAnchorView(hikingVid);
                    mediaController.setMediaPlayer(hikingVid);
                    Uri hikingUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.charmonixhiking);
                    hikingVid.setVideoURI(hikingUri);
                    hikingVid.setVisibility(View.VISIBLE);
                    hikingVid.setMediaController(mediaController);
                    hikingVid.start();

                    funFactsRockClimbingLocation.setVisibility(View.GONE);
                }
                if(adults.isChecked()){
                    String tempone = nameRockClimbingLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = infoRockClimbingLocation.getText().toString();
                    infoHikingLocation.setText(temptwo);

                    funFactsRockClimbingLocation.setVisibility(View.GONE);
                    hikingVid.setVisibility(View.GONE);
                }
                if(seniors.isChecked()){
                    String tempone = funFactsSkiiLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = funFactsHikingLocation.getText().toString();
                    infoLocation.setText(temptwo);

                    funFactsRockClimbingLocation.setVisibility(View.VISIBLE);
                    hikingVid.setVisibility(View.GONE);
                }
                if(backToNormal.isChecked()){
                    String tempone = backupone;
                    nameLocation.setText(tempone);

                    String temptwo = backuptwo;
                    infoLocation.setText(temptwo);

                    nameSkiiLocation.setVisibility(View.GONE);
                    infoSkiiLocation.setVisibility(View.GONE);
                    nameHikingLocation.setVisibility(View.GONE);
                    infoHikingLocation.setVisibility(View.GONE);
                    nameRockClimbingLocation.setVisibility(View.GONE);
                    infoRockClimbingLocation.setVisibility(View.GONE);
                    funFactsSkiiLocation.setVisibility(View.GONE);
                    funFactsHikingLocation.setVisibility(View.GONE);
                    funFactsRockClimbingLocation.setVisibility(View.GONE);
                    hikingVid.setVisibility(View.GONE);
                    back.setVisibility(View.VISIBLE);
                }
            }
        });

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

    public void setVideo(int viewID, int res){
        VideoView video = findViewById(viewID);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + res);
        video.setVideoURI(videoUri);
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

    public void bindVid(VacationSpotType spotType){
        setVideo(R.id.hikingVideoID, spotType.hikingVideo);
    }
}

// functie de binding, enumuri pentru country, ageID si dupa aceea bind pentru tot (textviewuri, imagini, videouri)