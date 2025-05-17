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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinnerSetup(R.id.spinnerSwitzerland, "Switzerland");
        spinnerSetup(R.id.spinnerFrance, "France");
        spinnerSetup(R.id.spinnerItaly, "Italy");
        spinnerSetup(R.id.spinnerAustria, "Austria");

    }

    public void spinnerSetup(int spinnerID, String country){
        Spinner spinner = findViewById(spinnerID);
        int arrayReferenceCountries;
        switch (country){
            case "France":
                arrayReferenceCountries = R.array.france;
                break;
            case "Switzerland":
                arrayReferenceCountries = R.array.switzerland;
                break;
            case "Austria":
                arrayReferenceCountries = R.array.austria;
                break;
            case "Italy":
                arrayReferenceCountries = R.array.italy;
                break;
            default:
                arrayReferenceCountries = R.array.france;
                break;
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, arrayReferenceCountries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0, false);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                if(position == 0)
                    return;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}