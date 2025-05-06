package com.example.newestapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class SplashActivity extends AppCompatActivity {
    private ImageView foreground;
    private ImageView background;

    private ImageView imgOne;
    private ImageView imgTwo;
    private ImageView imgThree;
    private Animation slideUp;
    private Animation slideDown;
    private Animation slideRight;
    private Animation slideOnDiagonal;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        foreground = findViewById(R.id.foreground);
        background = findViewById(R.id.background);
        imgOne = findViewById(R.id.background2);
        imgTwo = findViewById(R.id.background3);
        imgThree = findViewById(R.id.background4);

        slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        slideUp.setStartOffset(2000);
        slideUp.setRepeatCount(Animation.INFINITE);

        slideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        slideDown.setStartOffset(2000);
        slideDown.setRepeatCount(Animation.INFINITE);

        slideRight = AnimationUtils.loadAnimation(this, R.anim.slide_right);
        slideRight.setStartOffset(2000);
        slideRight.setRepeatCount(Animation.INFINITE);

        slideOnDiagonal = AnimationUtils.loadAnimation(this, R.anim.slide_diagonally);
        slideOnDiagonal.setStartOffset(2000);
        slideOnDiagonal.setRepeatCount(Animation.INFINITE);

        background.startAnimation(slideUp);
        background.setVisibility(View.VISIBLE);
        foreground.startAnimation(slideUp);
        foreground.setVisibility(View.VISIBLE);
        imgOne.startAnimation(slideDown);
        imgOne.setVisibility(View.VISIBLE);
        imgTwo.startAnimation(slideRight);
        imgTwo.setVisibility(View.VISIBLE);
        imgThree.setAnimation(slideOnDiagonal);
        imgThree.setVisibility(View.VISIBLE);

        background.postDelayed(()->{
            startActivity(new Intent(this, LogIn.class));
            finish();
        },3000);

    }
}
