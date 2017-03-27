package com.example.akshay_20.listview;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class MainActivity extends Activity {
    // Array of strings...
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(MainActivity.this, google.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity2 = new Intent(MainActivity.this, google.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(MainActivity.this, google.class);
                        startActivity(newActivity3);
                        break;
                    case 3:  Intent newActivity4 = new Intent(MainActivity.this, google.class);
                        startActivity(newActivity4);
                        break;
                    case 4:  Intent newActivity5 = new Intent(MainActivity.this, google.class);
                        startActivity(newActivity5);
                        break;
                }

            }
        });
    }
}
