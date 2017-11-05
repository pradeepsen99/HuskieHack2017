package com.handbook.disasterhandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DisastersMenu extends AppCompatActivity {
    String[] disasterNames = {"Coastal Storm", "Drought", "Earthquake", "Fire", "Flood", "Freezing", "Hurricane", "Severe Ice Storm", "Snow", "Severe Storm", "Tornado", "Tsunami", "Typhoon", "Volcano", "Wilfire"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disasters_menu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, disasterNames);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        registerClickCallBack();
    }

    private void registerClickCallBack() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paret, View viewClicked, int position, long id) {
                TextView textView = (TextView) viewClicked;
                String message = "You clicked #" + position + ", which is : " + textView.getText().toString();
                Toast.makeText(DisastersMenu.this, message, Toast.LENGTH_LONG).show();

            }
        });

    }
}
