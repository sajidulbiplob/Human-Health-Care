package com.example.sabittahsin.humanhealthcare;

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

public class MainActivity extends AppCompatActivity {
    Button a,b,c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(Button)findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });
        b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(j);
            }
        });
        c=(Button)findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(k);
            }
        });

        d=(Button)findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(MainActivity.this, Main152Activity.class);
                startActivity(l);
            }
        });
        e=(Button)findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(m);
            }
        });


    }
}
