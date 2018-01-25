package com.example.mannnl.seperatedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mannnl on 1/23/2018.
 */

public class ObjectListViewAdapter extends ArrayAdapter<Object> {

    //TODO: Replace Object with whatever object you are trying to put into the list view.
    //If you want each different ListView to contain a different object, you will just need to copy this adapter and modify it for the second object, then apply that one to the second list

    private ArrayList<Object> objectList = new ArrayList<>();

    //Does the Adapter work
    ObjectListViewAdapter(Context context, int textViewResourceId, ArrayList<Object> list) {
        super(context, textViewResourceId, list);
        objectList = list;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.object_in_list_layout, null);

            //TODO: Here you will need to wire up your xml elements.

        /* EXAMPLE:
            TextView tvOne =  v.findViewById(R.id.tvVar1);
            TextView tvTwo =  v.findViewById(R.id.tvVar2);
            TextView tvThree =  v.findViewById(R.id.tvVar3);
        */

            //TODO: You will also need to set____() them with objectList.get(position).get____()

        /* EXAMPLE:
            tvOne.setText(objectList.get(position).getVar1());
            tvTwo.setText(objectList.get(position).getVar2());
            tvThree.setText(objectList.get(position).getVar3());
        */

        return v;
    }
}
