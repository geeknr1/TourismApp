package com.example.newestapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class LogIn extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button buttonLogIn;
    private Button buttonSignUp;
    DataBaseHelper dbHelp;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        username = findViewById(R.id.loginUser);
        password = findViewById(R.id.passwordUser);
        buttonLogIn = findViewById(R.id.loginButton);
        buttonSignUp = findViewById(R.id.signupButton);

        dbHelp = new DataBaseHelper(this);

        buttonLogIn.setOnClickListener(v->{
            String user = username.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if(user.isEmpty() || pass.isEmpty()){
                Toast.makeText(this, "Enter both fields", Toast.LENGTH_SHORT).show(); // toast se ocupa de popup-ul unui text anume
                return; // opreste activitatea
            }
            if(dbHelp.checkUser(user, pass)){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LogIn.this, MainActivity.class));
            }
            else{
                Toast.makeText(this, "Username / Password incorrect", Toast.LENGTH_SHORT).show();
            }

        });

        buttonSignUp.setOnClickListener(v->{
            startActivity(new Intent(LogIn.this, SignUp.class));
        });
    }
}
