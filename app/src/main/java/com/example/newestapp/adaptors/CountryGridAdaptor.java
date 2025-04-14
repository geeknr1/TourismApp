package com.example.newestapp.adaptors;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.newestapp.R;
import com.example.newestapp.activities.Destination_Detail_Activities;
import com.example.newestapp.models.Country;

import java.util.ArrayList;

public class CountryGridAdaptor extends BaseAdapter {
    private Context context;
    private ArrayList<Country> countries;

    public CountryGridAdaptor(Context c, ArrayList<Country> cs){
        this.context = c;
        this.countries = cs;
    }

    public Context getContext(){
        return this.context;
    }

    public int getCount(){
        return this.countries.size();
    }

    public Object getItem(int position){
        return countries.get(position);
    }

    public long getItemId(int id){
        return id;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.grid_item_country, parent, false);
        }

        ImageButton countryImageButton = convertView.findViewById(R.id.country_image_button);
        TextView countryText = convertView.findViewById(R.id.country_name_text);

        Country country = countries.get(position);
        countryImageButton.setImageResource(country.getImageResourceID());
        countryText.setText(country.getName());

        countryImageButton.setOnClickListener(v->{
            Intent intent = new Intent(context, Destination_Detail_Activities.class);
            intent.putExtra("name", country.getName());
            context.startActivity(intent);
        });

        return convertView;
    }
}
