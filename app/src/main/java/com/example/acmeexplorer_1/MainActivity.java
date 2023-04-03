package com.example.acmeexplorer_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.acmeexplorer_1.adapters.EnlaceAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);
        gridView.setAdapter(new EnlaceAdapter(Enlace.generaEnlace(),this));
    }
}