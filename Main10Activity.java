package com.example.sabittahsin.humanhealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main10Activity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        b1=(Button)findViewById(R.id.button75);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main10Activity.this, Main53Activity.class);
                startActivity(i);
            }
        });

        b2=(Button)findViewById(R.id.button76);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main54Activity.class);
                startActivity(i);
            }
        });

        b3=(Button)findViewById(R.id.button77);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main55Activity.class);
                startActivity(i);
            }
        });

        b4=(Button)findViewById(R.id.button78);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main56Activity.class);
                startActivity(i);
            }
        });

        b5=(Button)findViewById(R.id.button79);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main57Activity.class);
                startActivity(i);
            }
        });

        b6=(Button)findViewById(R.id.button80);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main58Activity.class);
                startActivity(i);
            }
        });

        b7=(Button)findViewById(R.id.button81);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main59Activity.class);
                startActivity(i);
            }
        });

        b8=(Button)findViewById(R.id.button82);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main60Activity.class);
                startActivity(i);
            }
        });

        b9=(Button)findViewById(R.id.button83);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main61Activity.class);
                startActivity(i);
            }
        });

        b10=(Button)findViewById(R.id.button84);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main62Activity.class);
                startActivity(i);
            }
        });

        b11=(Button)findViewById(R.id.button85);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main63Activity.class);
                startActivity(i);
            }
        });

        b12=(Button)findViewById(R.id.button86);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main64Activity.class);
                startActivity(i);
            }
        });

        b13=(Button)findViewById(R.id.button87);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main88Activity.class);
                startActivity(i);
            }
        });

        b14=(Button)findViewById(R.id.button88);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main89Activity.class);
                startActivity(i);
            }
        });

        b15=(Button)findViewById(R.id.button92);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main10Activity.this,Main90Activity.class);
                startActivity(i);
            }
        });

    }

}
