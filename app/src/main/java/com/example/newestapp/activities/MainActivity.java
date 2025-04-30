package com.example.newestapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import com.example.newestapp.R;
import com.example.newestapp.adaptors.CountryGridAdaptor;
import com.example.newestapp.data.DataProvider;
import com.example.newestapp.models.Country;

public class MainActivity extends Activity {
    private GridView gridView;
    private ArrayList<Country> countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.country_grid_view);
        countries = DataProvider.getCountries();
        CountryGridAdaptor adaptor = new CountryGridAdaptor(this, countries);
        gridView.setAdapter(adaptor);

        Button showUsersButton = findViewById(R.id.dbButton);

        DataBaseHelper dbHelper = new DataBaseHelper(this);

        showUsersButton.setOnClickListener(v -> {
            List<String> users = dbHelper.getAllUsers();
            if (users.isEmpty()) {
                Toast.makeText(this, "No users in the database.", Toast.LENGTH_SHORT).show();
            } else {
                StringBuilder builder = new StringBuilder();
                for (String user : users) {
                    builder.append(user).append("\n");
                }
                Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
