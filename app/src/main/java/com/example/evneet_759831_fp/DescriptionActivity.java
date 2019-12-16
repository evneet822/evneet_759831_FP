package com.example.evneet_759831_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        TextView textView = findViewById(R.id.description);

        Intent intent = getIntent();
        int id = intent.getExtras().getInt("selected id");

        textView.setText(Employee.employeeDetails.get(id).DetailDescription());


    }
}
