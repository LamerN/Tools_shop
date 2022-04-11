package com.example.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class drillsCategoryActivity extends AppCompatActivity {

    private ActionBar actionBar;
    private ArrayList<Drill> drills;
    private ListView drillCategoryListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_category);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        drills.add(new Drill(getString(R.string.drill_name_interskol), getString(R.string.drill_interskol_info), R.drawable.interskol));
        drills.add(new Drill(getString(R.string.drill_name_makita), getString(R.string.drill_makita_info), R.drawable.makita));
        drills.add(new Drill(getString(R.string.drill_name_dewalt), getString(R.string.drill_dewalt_info), R.drawable.dewalt));
        drillCategoryListView = findViewById(R.id.drillCategoryListView);
        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, drills);
        drillCategoryListView.setAdapter(adapter);
        drillCategoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Drill drill = drills.get(i);
                Intent intent = new Intent(getApplicationContext(), DrillDetailActivity.class);
                intent.putExtra("title", drill.getTitle());
                intent.putExtra("info", drill.getInfo());
                intent.putExtra("image_id", drill.getId());
                startActivity(intent);
            }
        });
    }


}