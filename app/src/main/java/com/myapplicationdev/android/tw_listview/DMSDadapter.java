package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017523 on 25/4/2017.
 */

public class DMSDadapter extends ArrayAdapter<DMSD> {
    private ArrayList<DMSD> dmsd;
    private Context context;
    private TextView tvYear;

    public DMSDadapter(Context context, int resource, ArrayList<DMSD> objects) {
        super(context, resource, objects);
        dmsd = objects;
        this.context = context;
    }

    public View getView(int position, View convertview, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvYear = (TextView) rowView.findViewById(R.id.tvYear);
        return rowView;
    }
}
