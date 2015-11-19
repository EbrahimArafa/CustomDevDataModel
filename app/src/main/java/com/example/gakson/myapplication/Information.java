package com.example.gakson.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("position");

        int img = intent.getIntExtra("img",0);
        String name = intent.getStringExtra("name");
        String description = intent.getStringExtra("description");

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        TextView textlarge = (TextView) findViewById(R.id.textView3);
        TextView textmid = (TextView) findViewById(R.id.textView4);

        image.setImageResource(img);
        textlarge.setText(name);
        textmid.setText(description);


    }
}
