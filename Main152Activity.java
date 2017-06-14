package com.example.sabittahsin.humanhealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main152Activity extends AppCompatActivity {
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main152);

        a1=(Button)findViewById(R.id.button154);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main153Activity.class);
                startActivity(i);
            }
        });

        a2=(Button)findViewById(R.id.button155);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main154Activity.class);
                startActivity(i);
            }
        });

        a3=(Button)findViewById(R.id.button156);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main155Activity.class);
                startActivity(i);
            }
        });

        a4=(Button)findViewById(R.id.button157);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main156Activity.class);
                startActivity(i);
            }
        });

        a5=(Button)findViewById(R.id.button158);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main157Activity.class);
                startActivity(i);
            }
        });

        a6=(Button)findViewById(R.id.button159);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main158Activity.class);
                startActivity(i);
            }
        });

        a7=(Button)findViewById(R.id.button160);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main159Activity.class);
                startActivity(i);
            }
        });

        a8=(Button)findViewById(R.id.button161);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main160Activity.class);
                startActivity(i);
            }
        });

        a9=(Button)findViewById(R.id.button162);
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main161Activity.class);
                startActivity(i);
            }
        });

        a10=(Button)findViewById(R.id.button163);
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main162Activity.class);
                startActivity(i);
            }
        });

        a11=(Button)findViewById(R.id.button164);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main163Activity.class);
                startActivity(i);
            }
        });

        a12=(Button)findViewById(R.id.button165);
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main164Activity.class);
                startActivity(i);
            }
        });

        a13=(Button)findViewById(R.id.button166);
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main165Activity.class);
                startActivity(i);
            }
        });

        a14=(Button)findViewById(R.id.button167);
        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main152Activity.this, Main166Activity.class);
                startActivity(i);
            }
        });

    }

}
