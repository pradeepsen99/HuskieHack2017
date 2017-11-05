package com.handbook.disasterhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartUpScreen extends AppCompatActivity
{
    EditText ZipCode;
    public static String chosenState = "Choose a State";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_screen);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        System.out.println(chosenState);
        Button chosenstate = findViewById(R.id.state);
        ZipCode =  findViewById(R.id.ZipCode);
        chosenstate.setText(chosenState);
        chosenstate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(StartUpScreen.this, ChoseUSAState.class);
                startActivity(intent);
            }
        });

        Button Disasters = findViewById(R.id.Disasters);
        Disasters.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                
            }
        });

        Button Filter =  findViewById(R.id.Filter);
        Filter.setOnClickListener(new View.OnClickListener()
        {
           @Override
            public void onClick(View view)
           {

           }
        });
    }

}
