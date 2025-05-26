package com.example.newestapp.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.newestapp.R;

public class PriceAndContact extends Fragment {
    private static final String contactArgument = "arg_country";
    private static final String priceArgument = "arg_photo";

    public static PriceAndContact newInstance(PriceAndContactModel m){
        Bundle args = new Bundle();
        args.putString(contactArgument, m.contacts);
        args.putString(priceArgument, m.prices);

        PriceAndContact f = new PriceAndContact();
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.vacation_house, container, false);

        Bundle args = getArguments();
        if (args != null) {
            String contacts = args.getString(contactArgument);
            String prices = args.getString(priceArgument);

            TextView countryTextView = view.findViewById(R.id.charmonixVacationHouseContacts);
            TextView descriptionTextView = view.findViewById(R.id.charmonixVacationHousePricesPerNight);

            countryTextView.setText(contacts);
            descriptionTextView.setText(prices);
        }

        return view;
    }
}
