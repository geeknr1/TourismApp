package com.example.newestapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
import com.example.newestapp.R;
import com.example.newestapp.adaptors.CountryGridAdaptor;
import com.example.newestapp.models.Country;

public class MainActivity extends Activity {
    private GridView gridView;
    private ArrayList<Country> countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.country_grid_view);
        countries = new ArrayList<Country>();

        countries.add(new Country("Egypt",R.drawable.egypt));
        countries.add(new Country("France", R.drawable.france));
        countries.add(new Country("United Kingdom", R.drawable.uk));
        countries.add(new Country("Japan", R.drawable.japan));

        CountryGridAdaptor adaptor = new CountryGridAdaptor(this, countries);
        gridView.setAdapter(adaptor);

    }
}
