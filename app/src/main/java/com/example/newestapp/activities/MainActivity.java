package com.example.newestapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.newestapp.R;
//import com.example.newestapp.adaptors.CountryGridAdaptor;
import com.example.newestapp.data.DataProvider;
import com.example.newestapp.models.Country;

public class MainActivity extends Activity {
    private Button egypt;
    private Button france;
    private Button uk;
    private Button japan;

    private Spinner spinEgypt;
    private Spinner spinFrance;
    private Spinner spinUK;
    private Spinner spinJapan;
    private ArrayList<Country> countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egypt = findViewById(R.id.egypt);
        france = findViewById(R.id.france);
        uk = findViewById(R.id.uk);
        japan = findViewById(R.id.japan);

        spinEgypt = findViewById(R.id.spinnerEgypt);
        spinFrance = findViewById(R.id.spinnerFrance);
        spinUK = findViewById(R.id.spinnerUK);
        spinJapan = findViewById(R.id.spinnerJapan);

        ArrayAdapter<CharSequence> egyptAdapter;

//        countries = DataProvider.getCountries();
//        CountryGridAdaptor adaptor = new CountryGridAdaptor(this, countries);
//        gridView.setAdapter(adaptor);

//        Button showUsersButton = findViewById(R.id.dbButton);
//
//        DbHelper dbHelper = new DbHelper(this);
//
//        showUsersButton.setOnClickListener(v -> {
//            List<String> users = dbHelper.getAllUsers();
//            if (users.isEmpty()) {
//                Toast.makeText(this, "No users in the database.", Toast.LENGTH_SHORT).show();
//            } else {
//                StringBuilder builder = new StringBuilder();
//                for (String user : users) {
//                    builder.append(user).append("\n");
//                }
//                Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
//            }
//        });

    }
}
