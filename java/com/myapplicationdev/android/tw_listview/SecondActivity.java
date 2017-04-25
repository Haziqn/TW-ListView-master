package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ModuleAdapter aa;
    ArrayList<modules> module;
    TextView tvYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent intent = getIntent();
        String Year = intent.getStringExtra("year");
        tvYear.setText(Year);

        // Create a few food objects in Food array
        module = new ArrayList<modules>();
        if(Year.equalsIgnoreCase("Year 2")) {
            module.add(new modules("C208", true));
            module.add(new modules("C200", false));
            module.add(new modules("C346", true));
        }
        else if(Year.equalsIgnoreCase("Year 1")){
            module.add(new modules("C105", true));

        }
        aa = new ModuleAdapter(this, R.layout.row2, module);
        lv.setAdapter(aa);
    }
}