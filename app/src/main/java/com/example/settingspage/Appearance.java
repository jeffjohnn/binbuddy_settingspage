package com.example.settingspage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Appearance extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appearance);

        Spinner spinner = findViewById(R.id.xml_spinner);

        // Create an ArrayAdapter using a string array and a default spinner layout
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.string_levels, // Replace with the actual name of your string array in res/values/strings.xml
                android.R.layout.simple_spinner_item
        );

        // Specify the layout to use when the list of choices appears
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(arrayAdapter);

        // Set the listener for spinner selections
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Handle the selected item
        String selectedItem = parent.getItemAtPosition(position).toString();
        // Do something with the selected item
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle the case when no item is selected
    }
}