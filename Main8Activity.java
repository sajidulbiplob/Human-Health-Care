package com.example.sabittahsin.humanhealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {
    Button a,b,c,d,e,f,g,h,i,j,k,l,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        a=(Button)findViewById(R.id.button12);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii = new Intent(Main8Activity.this, Main14Activity.class);
                startActivity(ii);
            }
        });

        b=(Button)findViewById(R.id.button13);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent jj=new Intent(Main8Activity.this,Main15Activity.class);
                startActivity(jj);
            }
        });

        c=(Button)findViewById(R.id.button14);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kk = new Intent(Main8Activity.this, Main16Activity.class);
                startActivity(kk);
            }
        });

        d=(Button)findViewById(R.id.button15);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ll = new Intent(Main8Activity.this, Main17Activity.class);
                startActivity(ll);
            }
        });

        e=(Button)findViewById(R.id.button16);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mm = new Intent(Main8Activity.this, Main18Activity.class);
                startActivity(mm);
            }
        });

        f=(Button)findViewById(R.id.button17);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nn = new Intent(Main8Activity.this, Main19Activity.class);
                startActivity(nn);
            }
        });

        g=(Button)findViewById(R.id.button18);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent oo = new Intent(Main8Activity.this, Main20Activity.class);
                startActivity(oo);
            }
        });

        h=(Button)findViewById(R.id.button19);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pp = new Intent(Main8Activity.this, Main21Activity.class);
                startActivity(pp);
            }
        });

        i=(Button)findViewById(R.id.button20);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent qq = new Intent(Main8Activity.this, Main22Activity.class);
                startActivity(qq);
            }
        });

        j=(Button)findViewById(R.id.button43);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent rr = new Intent(Main8Activity.this, Main23Activity.class);
                startActivity(rr);
            }
        });

        k=(Button)findViewById(R.id.button89);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ss = new Intent(Main8Activity.this, Main24Activity.class);
                startActivity(ss);
            }
        });

        l=(Button)findViewById(R.id.button90);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tt = new Intent(Main8Activity.this, Main25Activity.class);
                startActivity(tt);
            }
        });

        m=(Button)findViewById(R.id.button91);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tt = new Intent(Main8Activity.this, Main83Activity.class);
                startActivity(tt);
            }
        });



    }

}
