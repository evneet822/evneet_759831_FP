package com.example.evneet_759831_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final ListView listView = findViewById(R.id.list_view);
        SearchView searchView = findViewById(R.id.search_view);
        final ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i< Employee.employeeDetails.size();i++){
            list.add(Employee.employeeDetails.get(i).Description());
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String string = (String) listView.getItemAtPosition(position);

                String [] splited = string.split("ID:   ");

                int id1 = Integer.parseInt(splited[1]);

                int pos = 0;

                for (int i = 0; i < Employee.employeeDetails.size();i++){

                    if (Employee.employeeDetails.get(i).getEmpID() == id1){
                        pos = i;
                        break;
                    }
                }



                Intent intent = new Intent(MainActivity.this,DescriptionActivity.class);
                intent.putExtra("selected id",pos);
                startActivity(intent);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
