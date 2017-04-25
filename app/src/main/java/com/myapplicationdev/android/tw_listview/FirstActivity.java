package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView listview;
    ArrayAdapter arrayAdapter;
    ArrayList<DMSD> dmsds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView)findViewById(R.id.lvYear);
        dmsds = new ArrayList<DMSD>();
        dmsds.add(new DMSD("Year 1"));
        dmsds.add(new DMSD("Year 2"));
        dmsds.add(new DMSD("Year 3"));

        arrayAdapter = new DMSDadapter(FirstActivity.this, R.layout.row, dmsds);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DMSD selectedDMSD = dmsds.get(i);
                String name = selectedDMSD.getYear();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("year", name);
                startActivity(intent);
            }
        });
    }
}
