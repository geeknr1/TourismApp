package com.example.newestapp.activities;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newestapp.R;

import java.util.List;
public class DataBase extends AppCompatActivity {
    private DataBaseHelper dbHelper;
    private EditText nameInput;
    private TextView userListText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_base);

        dbHelper = new DataBaseHelper(this);
        nameInput = findViewById(R.id.nameInput);
        Button addButton = findViewById(R.id.addButton);
        userListText = findViewById(R.id.userList);

        updateUserList();

        addButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString().trim();
            if (!name.isEmpty()) {
                dbHelper.addUser(name);
                nameInput.setText("");
                updateUserList();
            }
        });
    }

    private void updateUserList() {
        List<String> users = dbHelper.getAllUsers();
        StringBuilder builder = new StringBuilder();
        int userCounter=0;
        for (String user : users) {
            builder.append(userCounter++).append(") ").append(user).append("\n");
        }
        userListText.setText(builder.toString());
    }
}
