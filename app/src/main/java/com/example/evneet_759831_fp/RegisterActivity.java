package com.example.evneet_759831_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
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

        final Spinner type_spinner = findViewById(R.id.spinner);
        final TableRow bugRow = findViewById(R.id.bug);
        final TableRow projectRow = findViewById(R.id.project);
        final TableRow clientsRow = findViewById(R.id.client);
        final RadioGroup vehicleGroup = findViewById(R.id.radio_group);
        final TableRow carTypeRow = findViewById(R.id.cartyperow);
        final TableRow sideCarRow = findViewById(R.id.sideCarRow);
        final EditText fistName = findViewById(R.id.first_name);
        final EditText lastName = findViewById(R.id.last_name);
        final EditText birthYear = findViewById(R.id.birth_year);
        final EditText monthlySalary = findViewById(R.id.salary);
        final EditText rate = findViewById(R.id.rate);
        final EditText id = findViewById(R.id.id);
        final EditText bugs = findViewById(R.id.bugs);
        final EditText projects = findViewById(R.id.projects);
        final EditText clients = findViewById(R.id.clients);
        final EditText carType = findViewById(R.id.car_type);
        final EditText vehicleModel = findViewById(R.id.model);
        final EditText plateNumber = findViewById(R.id.number);
        Button register = findViewById(R.id.register);
        final RadioGroup sideCarGroup = findViewById(R.id.radio_group2);
        final Spinner colorSpinner = findViewById(R.id.color);






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

        register.setOnClickListener(new View.OnClickListener() {

            Vehicle v1 = new Vehicle(vehicleModel.getText().toString(),plateNumber.getText().toString(),colorSpinner.getSelectedItem().toString());
            Employee e;
            @Override
            public void onClick(View v) {

                switch (vehicleGroup.getCheckedRadioButtonId()){
                    case R.id.r1:
                        v1 = new Car(vehicleModel.getText().toString(),plateNumber.getText().toString(),colorSpinner.getSelectedItem().toString(),carType.getText().toString());
                        break;
                    case R.id.r2:

                        boolean isSidecar = false;
                        switch (sideCarGroup.getCheckedRadioButtonId()){
                            case R.id.r3:
                                isSidecar = true;
                                break;
                            case R.id.r4:
                                isSidecar = false;
                                break;
                                default:
                                    break;
                        }
                        v1 = new Motorcycle(vehicleModel.getText().toString(),plateNumber.getText().toString(),colorSpinner.getSelectedItem().toString(),isSidecar);
                        break;
                        default:
                            break;


                }

                switch (type_spinner.getSelectedItem().toString()){
                    case "Manager":
                        if (!rate.getText().toString().isEmpty()){
                            e = new Manager(fistName.getText().toString(),lastName.getText().toString(),Integer.parseInt(birthYear.getText().toString()),Double.parseDouble(monthlySalary.getText().toString()),Double.parseDouble(rate.getText().toString()),Integer.parseInt(id.getText().toString()),v1,Integer.parseInt(clients.getText().toString()));
                        }else {
                            e = new Manager(fistName.getText().toString(),lastName.getText().toString(),Integer.parseInt(birthYear.getText().toString()),Double.parseDouble(monthlySalary.getText().toString()),Integer.parseInt(id.getText().toString()),v1,Integer.parseInt(clients.getText().toString()));
                        }
                        break;
                    case "Tester":
                        if (!rate.getText().toString().isEmpty()){
                            e = new Tester(fistName.getText().toString(),lastName.getText().toString(),Integer.parseInt(birthYear.getText().toString()),Double.parseDouble(monthlySalary.getText().toString()),Double.parseDouble(rate.getText().toString()),Integer.parseInt(id.getText().toString()),v1,Integer.parseInt(bugs.getText().toString()));
                        }else {
                            e = new Tester(fistName.getText().toString(),lastName.getText().toString(),Integer.parseInt(birthYear.getText().toString()),Double.parseDouble(monthlySalary.getText().toString()),Integer.parseInt(id.getText().toString()),v1,Integer.parseInt(bugs.getText().toString()));
                        }
                        break;
                    case "Programmer":
                        if (!rate.getText().toString().isEmpty()){
                            e = new Programmer(fistName.getText().toString(),lastName.getText().toString(),Integer.parseInt(birthYear.getText().toString()),Double.parseDouble(monthlySalary.getText().toString()),Double.parseDouble(rate.getText().toString()),Integer.parseInt(id.getText().toString()),v1,Integer.parseInt(projects.getText().toString()));
                        }else {
                            e = new Programmer(fistName.getText().toString(),lastName.getText().toString(),Integer.parseInt(birthYear.getText().toString()),Double.parseDouble(monthlySalary.getText().toString()),Integer.parseInt(id.getText().toString()),v1,Integer.parseInt(projects.getText().toString()));
                        }
                        break;
                }


                Employee.employeeDetails.add(e);
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
