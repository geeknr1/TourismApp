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
        switch (vacation) {
            case CHARMONIX_MONT_BLANC:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case MERIBEL:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case COURCHEVEL:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case VAL_DLSERVE:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case ZERMATT:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case STMORITZ:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case VERBIER:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case GRINDELWALD:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case CORTINA_DAMPEZZO:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case MADONNA_DI_VAL_GARDENA:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case COURMAYEUR:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case KITZBUHEL:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case ST_ANTON_AM_ARLBERG:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case ISCHGL:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            case SOLDEN:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
            default:
                bindTextVacation("a","b","c","d","e","f","g","h", "i");
                break;
        }
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