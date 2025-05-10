package com.example.newestapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class AgeActivity extends AppCompatActivity {
    private TextView age;
    private Button backButton;
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_age);

        age = findViewById(R.id.ageText);
        backButton = findViewById(R.id.ageButton);

        String country = getIntent().getStringExtra("Country");
        String ageCategory = getIntent().getStringExtra("Age Category");

        age.setText(country + " " + ageCategory);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgeActivity.this, MainActivity.class));
            }
        });
    }
}
