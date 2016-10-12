package com.example.junchaowang.hydrationdetect;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HydrationStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hydration_status);
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
*/            }
    public void onClick(View view){
        if (view.getId()==R.id.dailybutton){
            Intent i = new Intent(this, daily_record.class);
            startActivity(i);}
        else if(view.getId()==R.id.weeklybutton){
            Intent a = new Intent(this, weekly_record.class);
            startActivity(a);
        }
        else if(view.getId()==R.id.monthlybutton){
            Intent b = new Intent(this, monthly_record.class);
            startActivity(b);
        }
    }
        };

