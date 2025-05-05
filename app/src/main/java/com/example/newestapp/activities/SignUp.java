package com.example.newestapp.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    private DbHelper dbHelp;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

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

//            if(!(strPassword.equals(rePassword))){
//                Toast.makeText(this, "Password mismatch", Toast.LENGTH_SHORT).show();
//                return;
//
            dbHelp = new DbHelper(this);
            boolean ok = dbHelp.addUser(strName, strSurname, strAge, strEmail, strPhoneNumber, strPassword);

            if (ok == true){
                Toast.makeText(this, "User added in database", Toast.LENGTH_SHORT).show();
                finish(); // opreste activitatea curenta si ma duce la cea de dinainte
            }
            else{
                Toast.makeText(this, "User already taken", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
