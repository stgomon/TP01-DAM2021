package com.example.tp01_dam2021;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] opciones = {"INDUMENTARIA","ELECTRÓNICA","ENTRETENIMIENTO","JARDÍN","VEHÍCULOS","JUGUETES"}
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //spinner.setAdapter(adapter);
    }
}