package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActionBar actionBar;
    private ListView categoriesListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        categoriesListView = findViewById(R.id.categoriesListView);
        categoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), "Позиция " + i, Toast.LENGTH_SHORT).show();
                switch (i) {
                    case 0: {
                        Intent intent = new Intent(getApplicationContext(), drillsCategoryActivity.class);
                        startActivity(intent);
                        break;
                    }
                }

            }
        });
    }
}