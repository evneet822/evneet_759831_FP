package com.example.evneet_759831_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner type_spinner = findViewById(R.id.spinner);
        final TableRow bugRow = findViewById(R.id.bug);
        final TableRow projectRow = findViewById(R.id.project);
        final TableRow clientsRow = findViewById(R.id.client);
        RadioGroup vehicleGroup = findViewById(R.id.radio_group);
        final TableRow carTypeRow = findViewById(R.id.cartyperow);
        final TableRow sideCarRow = findViewById(R.id.sideCarRow);




        type_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        bugRow.setVisibility(View.GONE);
                        projectRow.setVisibility(View.GONE);
                        clientsRow.setVisibility(View.GONE);
                        break;
                    case 1:
                        clientsRow.setVisibility(View.VISIBLE);
                        bugRow.setVisibility(View.GONE);
                        projectRow.setVisibility(View.GONE);
                        break;
                    case 2:
                        bugRow.setVisibility(View.VISIBLE);
                        projectRow.setVisibility(View.GONE);
                        clientsRow.setVisibility(View.GONE);
                        break;
                    case 3:
                        projectRow.setVisibility(View.VISIBLE);
                        clientsRow.setVisibility(View.GONE);
                        bugRow.setVisibility(View.GONE);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        vehicleGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.r1:
                        carTypeRow.setVisibility(View.VISIBLE);
                        sideCarRow.setVisibility(View.GONE);
                        break;
                    case R.id.r2:
                        carTypeRow.setVisibility(View.GONE);
                        sideCarRow.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}
