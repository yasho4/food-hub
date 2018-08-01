package com.example.lenovo.internshp_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView=(TextView) findViewById(R.id.tvitems);
        textView1=(TextView) findViewById(R.id.tvprice);

        display();

    }

    private void display() {
        Intent i = getIntent();
        //if (i.hasExtra("extra")) {
        //editText.setText("Welcome" + i.getStringExtra("extra"));
        String items=i.getStringExtra("items");
        String price=i.getStringExtra("price");
        textView.setText("You have selcted "+items+" items and your "+price);
        textView1.setText("Total price is "+price);
        //startActivity(intent);
    }
}

