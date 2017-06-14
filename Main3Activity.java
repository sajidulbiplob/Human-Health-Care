package com.example.sabittahsin.humanhealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a=(Button)findViewById(R.id.button7);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main3Activity.this, Main8Activity.class);
                startActivity(i);
            }
        });

        b=(Button)findViewById(R.id.button11);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j=new Intent(Main3Activity.this,Main9Activity.class);
                startActivity(j);
            }
        });

    }

}
