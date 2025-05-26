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


import com.example.newestapp.R;

import java.util.*;


public class PageActivity extends AppCompatActivity {

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
    private ImageView generalImgOne;
    private ImageView generalImgTwo;
    private ImageView generalImgThree;
    private ImageView generalImgFour;
    private ImageView skiImgOne;
    private ImageView skiImgTwo;
    private ImageView skiImgThree;
    private ImageView skiImgFour;
    private ImageView hikingImgOne;
    private ImageView hikingImgTwo;
    private ImageView hikingImgThree;
    private ImageView hikingImgFour;
    private ImageView rockClimbingImgOne;
    private ImageView rockClimbingImgTwo;
    private ImageView rockClimbingImgThree;
    private ImageView rockClimbingImgFour;

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

        generalImgOne = findViewById(R.id.generalFirstImg);
        generalImgTwo = findViewById(R.id.generalSecondImg);
        generalImgThree = findViewById(R.id.generalThirdImg);
        generalImgFour = findViewById(R.id.generalFourthImg);

        skiImgOne = findViewById(R.id.generalSkiFirstImg);
        skiImgTwo = findViewById(R.id.generalSkiSecondImg);
        skiImgThree = findViewById(R.id.generalSkiThirdImg);
        skiImgFour = findViewById(R.id.generalSkiFourthImg);

        hikingImgOne = findViewById(R.id.generalHikingFirstImg);
        hikingImgTwo = findViewById(R.id.generalHikingSecondImg);
        hikingImgThree = findViewById(R.id.generalHikingThirdImg);
        hikingImgFour = findViewById(R.id.generalHikingFourthImg);

        rockClimbingImgOne = findViewById(R.id.generalRockClimbingFirstImg);
        rockClimbingImgTwo = findViewById(R.id.generalRockClimbingSecondImg);
        rockClimbingImgThree = findViewById(R.id.generalRockClimbingThirdImg);
        rockClimbingImgFour = findViewById(R.id.generalRockClimbingFourthImg);

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

        generalImgOne.setVisibility(View.VISIBLE);
        generalImgTwo.setVisibility(View.VISIBLE);
        generalImgThree.setVisibility(View.VISIBLE);
        generalImgFour.setVisibility(View.VISIBLE);
        skiImgOne.setVisibility(View.GONE);
        skiImgTwo.setVisibility(View.GONE);
        skiImgThree.setVisibility(View.GONE);
        skiImgFour.setVisibility(View.GONE);
        hikingImgOne.setVisibility(View.GONE);
        hikingImgTwo.setVisibility(View.GONE);
        hikingImgThree.setVisibility(View.GONE);
        hikingImgFour.setVisibility(View.GONE);
        rockClimbingImgOne.setVisibility(View.GONE);
        rockClimbingImgTwo.setVisibility(View.GONE);
        rockClimbingImgThree.setVisibility(View.GONE);
        rockClimbingImgFour.setVisibility(View.GONE);

        String backupone = nameLocation.getText().toString();
        String backuptwo = infoLocation.getText().toString();
        funFactsRockClimbingLocation.setVisibility(View.GONE);

        MediaController mediaController = new MediaController(this);
        hikingVid.setMediaController(mediaController);

        hikingVid.setVisibility(View.GONE);
        ageGroups.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(children.isChecked()){
                    String tempone = nameSkiiLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = infoSkiiLocation.getText().toString();
                    infoLocation.setText(temptwo);

                    funFactsRockClimbingLocation.setVisibility(View.GONE);

                    generalImgOne.setVisibility(View.GONE);
                    generalImgTwo.setVisibility(View.GONE);
                    generalImgThree.setVisibility(View.GONE);
                    generalImgFour.setVisibility(View.GONE);
                    skiImgOne.setVisibility(View.VISIBLE);
                    skiImgTwo.setVisibility(View.VISIBLE);
                    skiImgThree.setVisibility(View.VISIBLE);
                    skiImgFour.setVisibility(View.VISIBLE);
                    hikingImgOne.setVisibility(View.GONE);
                    hikingImgTwo.setVisibility(View.GONE);
                    hikingImgThree.setVisibility(View.GONE);
                    hikingImgFour.setVisibility(View.GONE);
                    rockClimbingImgOne.setVisibility(View.GONE);
                    rockClimbingImgTwo.setVisibility(View.GONE);
                    rockClimbingImgThree.setVisibility(View.GONE);
                    rockClimbingImgFour.setVisibility(View.GONE);

                    hikingVid.setVisibility(View.GONE);
                }
                if(youngOnes.isChecked()){
                    String tempone = nameHikingLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = infoHikingLocation.getText().toString();
                    infoLocation.setText(temptwo);

                    Uri hikingUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.charmonixhiking);
                    hikingVid.setVideoURI(hikingUri);
                    hikingVid.setOnPreparedListener(mp->
                    {mp.setLooping(true);
                    hikingVid.requestFocus();
                    hikingVid.start();});

                    funFactsRockClimbingLocation.setVisibility(View.GONE);

                    generalImgOne.setVisibility(View.GONE);
                    generalImgTwo.setVisibility(View.GONE);
                    generalImgThree.setVisibility(View.GONE);
                    generalImgFour.setVisibility(View.GONE);
                    skiImgOne.setVisibility(View.GONE);
                    skiImgTwo.setVisibility(View.GONE);
                    skiImgThree.setVisibility(View.GONE);
                    skiImgFour.setVisibility(View.GONE);
                    hikingImgOne.setVisibility(View.VISIBLE);
                    hikingImgTwo.setVisibility(View.VISIBLE);
                    hikingImgThree.setVisibility(View.VISIBLE);
                    hikingImgFour.setVisibility(View.VISIBLE);
                    rockClimbingImgOne.setVisibility(View.GONE);
                    rockClimbingImgTwo.setVisibility(View.GONE);
                    rockClimbingImgThree.setVisibility(View.GONE);
                    rockClimbingImgFour.setVisibility(View.GONE);

                    hikingVid.setVisibility(View.VISIBLE);
                }
                if(adults.isChecked()){
                    String tempone = nameRockClimbingLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = infoRockClimbingLocation.getText().toString();
                    infoHikingLocation.setText(temptwo);

                    funFactsRockClimbingLocation.setVisibility(View.GONE);

                    generalImgOne.setVisibility(View.GONE);
                    generalImgTwo.setVisibility(View.GONE);
                    generalImgThree.setVisibility(View.GONE);
                    generalImgFour.setVisibility(View.GONE);
                    skiImgOne.setVisibility(View.GONE);
                    skiImgTwo.setVisibility(View.GONE);
                    skiImgThree.setVisibility(View.GONE);
                    skiImgFour.setVisibility(View.GONE);
                    hikingImgOne.setVisibility(View.GONE);
                    hikingImgTwo.setVisibility(View.GONE);
                    hikingImgThree.setVisibility(View.GONE);
                    hikingImgFour.setVisibility(View.GONE);
                    rockClimbingImgOne.setVisibility(View.VISIBLE);
                    rockClimbingImgTwo.setVisibility(View.VISIBLE);
                    rockClimbingImgThree.setVisibility(View.VISIBLE);
                    rockClimbingImgFour.setVisibility(View.VISIBLE);

                    hikingVid.setVisibility(View.GONE);
                }
                if(seniors.isChecked()){
                    String tempone = funFactsSkiiLocation.getText().toString();
                    nameLocation.setText(tempone);

                    String temptwo = funFactsHikingLocation.getText().toString();
                    infoLocation.setText(temptwo);

                    funFactsRockClimbingLocation.setVisibility(View.VISIBLE);

                    generalImgOne.setVisibility(View.GONE);
                    generalImgTwo.setVisibility(View.GONE);
                    generalImgThree.setVisibility(View.GONE);
                    generalImgFour.setVisibility(View.GONE);
                    skiImgOne.setVisibility(View.VISIBLE);
                    skiImgTwo.setVisibility(View.VISIBLE);
                    skiImgThree.setVisibility(View.GONE);
                    skiImgFour.setVisibility(View.GONE);
                    hikingImgOne.setVisibility(View.GONE);
                    hikingImgTwo.setVisibility(View.GONE);
                    hikingImgThree.setVisibility(View.GONE);
                    hikingImgFour.setVisibility(View.GONE);
                    rockClimbingImgOne.setVisibility(View.GONE);
                    rockClimbingImgTwo.setVisibility(View.GONE);
                    rockClimbingImgThree.setVisibility(View.VISIBLE);
                    rockClimbingImgFour.setVisibility(View.VISIBLE);

                    hikingVid.setVisibility(View.GONE);
                }
                if(backToNormal.isChecked()){
                    String tempone = backupone;
                    nameLocation.setText(tempone);

                    String temptwo = backuptwo;
                    infoLocation.setText(temptwo);

                    generalImgOne.setVisibility(View.VISIBLE);
                    generalImgTwo.setVisibility(View.VISIBLE);
                    generalImgThree.setVisibility(View.VISIBLE);
                    generalImgFour.setVisibility(View.VISIBLE);
                    skiImgOne.setVisibility(View.GONE);
                    skiImgTwo.setVisibility(View.GONE);
                    skiImgThree.setVisibility(View.GONE);
                    skiImgFour.setVisibility(View.GONE);
                    hikingImgOne.setVisibility(View.GONE);
                    hikingImgTwo.setVisibility(View.GONE);
                    hikingImgThree.setVisibility(View.GONE);
                    hikingImgFour.setVisibility(View.GONE);
                    rockClimbingImgOne.setVisibility(View.GONE);
                    rockClimbingImgTwo.setVisibility(View.GONE);
                    rockClimbingImgThree.setVisibility(View.GONE);
                    rockClimbingImgFour.setVisibility(View.GONE);

                    funFactsRockClimbingLocation.setVisibility(View.GONE);
                    hikingVid.setVisibility(View.GONE);
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
        setImage(R.id.generalSkiFirstImg, spotType.skiImgOne);
        setImage(R.id.generalSkiSecondImg, spotType.skiImgTwo);
        setImage(R.id.generalSkiThirdImg, spotType.skiImgThree);
        setImage(R.id.generalSkiFourthImg, spotType.skiImgFour);
        setImage(R.id.generalHikingFirstImg, spotType.hikingImgOne);
        setImage(R.id.generalHikingSecondImg, spotType.hikingImgTwo);
        setImage(R.id.generalHikingThirdImg, spotType.hikingImgThree);
        setImage(R.id.generalHikingFourthImg, spotType.hikingImgFour);
        setImage(R.id.generalRockClimbingFirstImg, spotType.rockClimbingImgOne);
        setImage(R.id.generalRockClimbingSecondImg, spotType.rockClimbingImgTwo);
        setImage(R.id.generalRockClimbingThirdImg, spotType.rockClimbingImgThree);
        setImage(R.id.generalRockClimbingFourthImg, spotType.rockClimbingImgFour);
    }

    public void bindVid(VacationSpotType spotType){
        setVideo(R.id.hikingVideoID, spotType.hikingVideo);
    }
}

// functie de binding, enumuri pentru country, ageID si dupa aceea bind pentru tot (textviewuri, imagini, videouri)