package com.example.newestapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

public class LogIn extends AppCompatActivity {
    private String username;
    private String password;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
    }

    public boolean checkUsername(String otherUser){
        return otherUser.equals(this.username);
    }

    public boolean checkPassword(String otherPassword){
        return otherPassword.equals(this.password);
    }


}
