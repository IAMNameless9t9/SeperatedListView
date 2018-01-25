package com.example.mannnl.seperatedlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class SeparatedListViewActivity extends AppCompatActivity {

    //TODO: If you want to mess with the project, just uncomment all the EXAMPLES.
    //TODO: If you want to apply the project to your own app, just delete all the EXAMPLES.

    ListView listView1;
    ListView listView2;
    ListView listView3;
    ArrayList<Object> objectArray1 = new ArrayList<>();
    ArrayList<Object> objectArray2 = new ArrayList<>();
    ArrayList<Object> objectArray3 = new ArrayList<>();
    LinearLayout listViewLayout1;
    LinearLayout listViewLayout2;
    LinearLayout listViewLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_separated_listview);

        //Wire-ups
        /* EXAMPLES
        listView1 = (ListView) findViewById(R.id.listView1);
        listView2 = (ListView) findViewById(R.id.listView2);
        listView3 = (ListView) findViewById(R.id.listView3);

        listViewLayout1 = (LinearLayout) findViewById(R.id.listViewLayout1);
        listViewLayout2 = (LinearLayout) findViewById(R.id.listViewLayout2);
        listViewLayout3 = (LinearLayout) findViewById(R.id.listViewLayout3);
        */

        //Inputs the items in objectArray into the ListView using the custom adapter (this is where you can wire-up different adapters for different objects).
        /*EXAMPLES:
        ObjectListViewAdapter objectAdapter1 = new ObjectListViewAdapter(this, R.layout.object_in_list_layout, objectArray1);
        listView1.setAdapter(objectAdapter1);

        ObjectListViewAdapter objectAdapter2 = new ObjectListViewAdapter(this, R.layout.object_in_list_layout, objectArray2);
        listView2.setAdapter(objectAdapter2);

        ObjectListViewAdapter objectAdapter3 = new ObjectListViewAdapter(this, R.layout.object_in_list_layout, objectArray3);
        listView3.setAdapter(objectAdapter3);
        */

        //EXAMPLE Objects
        /*
        objectArray1.add(new Object("I","like","pie"));
        objectArray1.add(new Object("I","like","pie"));
        objectArray1.add(new Object("I","like","pie"));
        objectArray1.add(new Object("I","like","pie"));
        objectArray1.add(new Object("I","like","pie"));
        objectArray1.add(new Object("I","like","pie"));

        objectArray2.add(new Object("I","like","pie"));
        objectArray2.add(new Object("I","like","pie"));
        objectArray2.add(new Object("I","like","pie"));
        objectArray2.add(new Object("I","like","pie"));

        objectArray3.add(new Object("I","like","pie"));
        objectArray3.add(new Object("I","like","pie"));
        objectArray3.add(new Object("I","like","pie"));
         */

        //Gets the width of the device
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Integer width = metrics.widthPixels;

        //TODO: Change this variable to match whatever the desired height of an item in your ListView is. (This does not set the height, you'll have to tweak it until it's just right).
        Integer itemHeight = 58;

        //Dynamically sets the height of the LinearLayout that contains the ListView to be exactly as long as the list.
        Integer height = (itemHeight * objectArray1.size());
        LinearLayout.LayoutParams mParam = new LinearLayout.LayoutParams(width,height);
        listViewLayout1.setLayoutParams(mParam);

        height = (itemHeight * objectArray2.size());
        mParam = new LinearLayout.LayoutParams(width,height);
        listViewLayout2.setLayoutParams(mParam);

        height = (itemHeight * objectArray3.size());
        mParam = new LinearLayout.LayoutParams(width,height);
        listViewLayout3.setLayoutParams(mParam);

    }
}
