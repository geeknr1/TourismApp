package com.example.newestapp.activities;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class SignUp extends AppCompatActivity {
    EditText name;
    EditText surname;

    EditText age;
    EditText email;
    EditText phoneNumber;
    EditText password;
    EditText rePassword;
    Button signUp;
    VideoView videoBackgroundSignUp;
    private DbHelper dbHelp;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        videoBackgroundSignUp = findViewById(R.id.backgroundSignUp);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.signup);
        videoBackgroundSignUp.setVideoURI(uri);
        videoBackgroundSignUp.start();

        videoBackgroundSignUp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });


        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);
        email = findViewById(R.id.email);
        phoneNumber = findViewById(R.id.phoneNumber);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.passwordRe);
        signUp = findViewById(R.id.signupButton);

        signUp.setOnClickListener(v->{
            String strName = name.getText().toString().trim();
            String strSurname = surname.getText().toString().trim();
            String strAge = age.getText().toString().trim();
            String strEmail = email.getText().toString().trim();
            String strPhoneNumber = phoneNumber.getText().toString().trim(); // trim este folosit pentru curatarea automata a spatiilor suplimentare
            String strPassword = password.getText().toString().trim();
            String strRePassword = rePassword.getText().toString().trim();

            if(strName.isEmpty() || strSurname.isEmpty() || strAge.isEmpty() ||  strEmail.isEmpty() || strPhoneNumber.isEmpty() || strPassword.isEmpty() || strRePassword.isEmpty()){
                Toast.makeText(this, "Missing fields", Toast.LENGTH_SHORT).show();
                return;
            }

            dbHelp = new DbHelper(this);
            boolean ok = dbHelp.addUser(strName, strSurname, strAge, strEmail, strPhoneNumber, strPassword);

            if (ok){
                Toast.makeText(this, "User added in database", Toast.LENGTH_SHORT).show();
                finish(); // opreste activitatea curenta si ma duce la cea de dinainte
            }
            else{
                Toast.makeText(this, "User already taken", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onPostResume(){
        videoBackgroundSignUp.resume();
        super.onPostResume();
    }

    @Override
    protected void onRestart(){
        videoBackgroundSignUp.start();
        super.onRestart();
    }

    @Override
    protected void onPause(){
        videoBackgroundSignUp.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        videoBackgroundSignUp.stopPlayback();
        super.onDestroy();
    }
}
