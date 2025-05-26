package com.example.newestapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class Choose extends AppCompatActivity {
    private Button blueButton;
    private Button redButton;
    protected void onCreate(Bundle savedIntentState){
        super.onCreate(savedIntentState);
        setContentView(R.layout.choose);

        blueButton = findViewById(R.id.blueButton);
        redButton = findViewById(R.id.redButton);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Choose.this, MainActivity.class));
            }
        });
    }
}
