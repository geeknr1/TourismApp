package com.example.newestapp.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class LogIn extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button buttonLogIn;
    private Button buttonSignUp;
    DbHelper dbHelp;
    VideoView backgroundLogIn;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        backgroundLogIn = findViewById(R.id.backgroundLogIn);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.login);
        backgroundLogIn.setVideoURI(uri);
        backgroundLogIn.start();

        backgroundLogIn.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        username = findViewById(R.id.loginUser);
        password = findViewById(R.id.passwordUser);
        buttonLogIn = findViewById(R.id.loginButton);
        buttonSignUp = findViewById(R.id.signupButton);

        dbHelp = new DbHelper(this);

        buttonLogIn.setOnClickListener(v->{
            String user = username.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if(user.isEmpty() || pass.isEmpty()){
                Toast.makeText(this, "Enter both fields", Toast.LENGTH_SHORT).show(); // toast se ocupa de popup-ul unui text anume
                return; // opreste activitatea
            }
            if(dbHelp.checkUser(user, pass)){ // the 'checkUser' method is of type 'boolean' since it's written in an 'if' statement
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LogIn.this, Choose.class));
            }
            else{
                Toast.makeText(this, "Username / Password incorrect", Toast.LENGTH_SHORT).show();
            }

        });

        buttonSignUp.setOnClickListener(v->{
            startActivity(new Intent(LogIn.this, SignUp.class));
        });
    }

    @Override
    protected void onPostResume(){
        backgroundLogIn.resume();
        super.onPostResume();
    }

    @Override
    protected void onRestart(){
        backgroundLogIn.start();
        super.onRestart();
    }

    @Override
    protected void onPause(){
        backgroundLogIn.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        backgroundLogIn.stopPlayback();
        super.onDestroy();
    }
}
