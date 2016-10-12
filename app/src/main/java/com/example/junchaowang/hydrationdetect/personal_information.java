package com.example.junchaowang.hydrationdetect;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class personal_information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_inforamtion);
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
*/

/*        Button submit_button = (Button)findViewById(R.id.submit);
        submit_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent i = new Intent(this, HydrationStatus.class);
                        startActivity(i);
                    }
                }
        );
*/


    };




    public void onClick(View view){
        if (view.getId()==R.id.cancel){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);}
        else {
            Intent a = new Intent(this, HydrationStatus.class);
            startActivity(a);
        }
    }

}