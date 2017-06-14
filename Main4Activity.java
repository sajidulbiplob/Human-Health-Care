package com.example.sabittahsin.humanhealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
Button a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        a=(Button)findViewById(R.id.button8);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main4Activity.this, Main7Activity.class);
                startActivity(i);
            }
        });

        b=(Button)findViewById(R.id.button21);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent(Main4Activity.this,Main10Activity.class);
                startActivity(j);
            }
        });

        c=(Button)findViewById(R.id.button6);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent(Main4Activity.this,Main121Activity.class);
                startActivity(j);
            }
        });


        d=(Button)findViewById(R.id.button10);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent(Main4Activity.this,Main126Activity.class);
                startActivity(j);
            }
        });

    }

}
