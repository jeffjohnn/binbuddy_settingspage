package com.example.settingspage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Button by its ID
        Button accountButton = findViewById(R.id.btn_Account);

        // Set an onClick listener for the button
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the Account activity
                Intent intent = new Intent(MainActivity.this, Account.class);
                startActivity(intent);
            }
        });
    }
}