package com.handbook.disasterhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartUpScreen extends AppCompatActivity
{

    EditText ZipCode;
    Button chosenstate = (Button)findViewById(R.id.state);
    public void setState(String word)
    {
        chosenstate.setText(word);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ZipCode = (EditText) findViewById(R.id.ZipCode);


        chosenstate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(StartUpScreen.this,ChoseUSAState.class);
                startActivity(intent);

            }
        });

    }


}
