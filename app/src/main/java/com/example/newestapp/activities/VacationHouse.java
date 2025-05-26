package com.example.newestapp.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.newestapp.R;

public class VacationHouse extends Fragment {
    private static final String countryArgument = "arg_country";
    private static final String photoResArgument = "arg_photo";
    private static final String vacationHouseDescriptionArgument = "arg_description";

    public static VacationHouse newInstance(VacationHouseModel m){
        Bundle args = new Bundle();
        args.putString(countryArgument, m.countryName);
        args.putInt(photoResArgument, m.photoRes);
        args.putString(vacationHouseDescriptionArgument, m.vacationHouseDescription);

        VacationHouse f = new VacationHouse();
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.vacation_house, container, false);

        Bundle args = getArguments();
        if (args != null) {
            String country = args.getString(countryArgument);
            int photoResId = args.getInt(photoResArgument);
            String description = args.getString(vacationHouseDescriptionArgument);

            TextView countryTextView = view.findViewById(R.id.charmonixVacationHouseName);
            ImageView houseImageView = view.findViewById(R.id.charmonixHouseID);
            TextView descriptionTextView = view.findViewById(R.id.charmonixVacationHouseDescription);

            countryTextView.setText(country);
            houseImageView.setImageResource(photoResId);
            descriptionTextView.setText(description);
        }

        return view;
    }
}
