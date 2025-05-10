package com.example.newestapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.newestapp.R;
//import com.example.newestapp.adaptors.CountryGridAdaptor;
import com.example.newestapp.data.DataProvider;
import com.example.newestapp.models.Country;

public class MainActivity extends Activity {
    private TextView egypt;
    private TextView france;
    private TextView uk;
    private TextView japan;

    private boolean egyptInit;
    private boolean franceInit;
    private boolean ukInit;
    private boolean japanInit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egypt = findViewById(R.id.egypt);
        france = findViewById(R.id.france);
        uk = findViewById(R.id.uk);
        japan = findViewById(R.id.japan);

        spinnerSetup(R.id.spinnerEgypt, "Egypt");
        spinnerSetup(R.id.spinnerFrance, "France");
        spinnerSetup(R.id.spinnerUK, "United Kingdom of Great Britain");
        spinnerSetup(R.id.spinnerJapan, "Japan");

    }

    public void spinnerSetup(int spinnerID, String country){
        Spinner spinner = findViewById(spinnerID);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.france_age_groups, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                boolean isFirstTime = (spinnerID == R.id.spinnerEgypt && !(egyptInit)) ||
                                      (spinnerID == R.id.spinnerUK && !(ukInit)) ||
                                      (spinnerID == R.id.spinnerFrance && !(franceInit)) ||
                                      (spinnerID == R.id.spinnerJapan && !(japanInit));

                if(isFirstTime){
                    if(spinnerID == R.id.spinnerEgypt)
                        egyptInit = true;
                    if(spinnerID == R.id.spinnerUK)
                        ukInit = true;
                    if(spinnerID == R.id.spinnerJapan)
                        japanInit = true;
                    if(spinnerID == R.id.spinnerFrance)
                        franceInit = true;
                    return;
                }
                String ageCategory = parent.getItemAtPosition(position).toString();
                openAgeActivity(country, ageCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void openAgeActivity(String country, String ageCategory){
        Intent intent = new Intent(this, AgeActivity.class); // da start la o noua activitate
        intent.putExtra("country", country); // adds new info to the intent
        intent.putExtra("ageCategory", ageCategory);
        startActivity(intent);
    }
}

// for avoiding crash situations we initiated  boolean values
// using isFirstTime we initialized each value one by one, without we would initialize null values
