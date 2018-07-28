package com.example.hridoy.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    String[] dummyData = {"Toyota","Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Yamaha","Toyota",
            "Toyota","Yamaha",
            "Toyota","Yamaha",
            "Toyota","Yamaha",
            "Toyota","Yamaha",
            "Toyota","Yamaha"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = findViewById(R.id.my_list_view);

        ArrayAdapter myAdapter = new ArrayAdapter
                (MainActivity.this,R.layout.my_list_design ,dummyData);

        myListView.setAdapter(myAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int position = i;

                String value;

                value = (String) myListView.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, "Value is :"+value, Toast.LENGTH_SHORT).show();



            }
        });










    }
}
