package com.handbook.disasterhandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import java.util.List;

public class ChoseUSAState extends AppCompatActivity
{
    StartUpScreen mainCode = new StartUpScreen();
    ListView listView;
    String[] States = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Lousiana","Maien","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
    public String currentPickedState;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_usastate);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,States);
        listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        registerClickCallBack();
    }

    private void registerClickCallBack()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> paret, View viewClicked, int position, long id)
            {
                TextView textView= (TextView) viewClicked;
                String message = "You clicked #" + position + ", which is : " + textView.getText().toString();
                Toast.makeText(ChoseUSAState.this, message, Toast.LENGTH_LONG).show();
                mainCode.chosenState=States[position];
               Intent main = new Intent(ChoseUSAState.this,StartUpScreen.class);
               startActivity(main);
               currentPickedState=States[position];

            }
        });
    }

}
