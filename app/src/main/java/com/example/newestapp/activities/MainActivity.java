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

import com.example.newestapp.data.DataProvider;
import com.example.newestapp.models.Country;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinnerSetup(R.id.spinnerSwitzerland, R.array.switzerland);
        spinnerSetup(R.id.spinnerFrance, R.array.france);
        spinnerSetup(R.id.spinnerItaly, R.array.italy);
        spinnerSetup(R.id.spinnerAustria, R.array.austria);
        spinnerSetup(R.id.spinnerUK, R.array.united_kingdom);
        spinnerSetup(R.id.spinnerIreland, R.array.ireland);
        spinnerSetup(R.id.spinnerNorway, R.array.norway);
        spinnerSetup(R.id.spinnerSweden, R.array.sweden);
        spinnerSetup(R.id.spinnerFinland, R.array.finland);
        spinnerSetup(R.id.spinnerIceland, R.array.iceland);
        spinnerSetup(R.id.spinnerSpain, R.array.spain);
        spinnerSetup(R.id.spinnerAndorra, R.array.andorra);
        spinnerSetup(R.id.spinnerRomania, R.array.romania);
        spinnerSetup(R.id.spinnerBulgaria, R.array.bulgaria);
        spinnerSetup(R.id.spinnerNorthMacedonia, R.array.north_macedonia);
        spinnerSetup(R.id.spinnerGreece, R.array.greece);

    }

    private final AdapterView.OnItemSelectedListener listener =
            new AdapterView.OnItemSelectedListener(){
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                    if(position == 0)
                        return;
                    String label = (String) parent.getItemAtPosition(position);

                    try {
                        VacationSpotType spotType = VacationSpotType.valueOf(label);
                        Intent intent = new Intent(MainActivity.this, PageActivity.class);
                        spotType.attachTo(intent);
                        startActivity(intent);
                    }catch(Exception e){
                        Toast.makeText(MainActivity.this, "Invalid vacation spot", Toast.LENGTH_SHORT).show();
                    }
                    parent.setSelection(0);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            };


    public void spinnerSetup(int spinnerID, int arrayID){
        Spinner spinner = findViewById(spinnerID);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, arrayID, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(listener);


    }


}