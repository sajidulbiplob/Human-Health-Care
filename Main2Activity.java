package com.example.sabittahsin.humanhealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button a,b,c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a=(Button)findViewById(R.id.button21);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main2Activity.this, Main11Activity.class);
                startActivity(i);
            }
        });

        b=(Button)findViewById(R.id.button22);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent(Main2Activity.this,Main12Activity.class);
                startActivity(j);
            }
        });

        c=(Button)findViewById(R.id.button23);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(Main2Activity.this, Main13Activity.class);
                startActivity(k);
            }
        });

        d=(Button)findViewById(R.id.button24);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(Main2Activity.this, Main81Activity.class);
                startActivity(k);
            }
        });

        e=(Button)findViewById(R.id.button25);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(Main2Activity.this, Main82Activity.class);
                startActivity(k);
            }
        });

    }

}
