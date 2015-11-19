package com.example.gakson.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ID = (EditText) findViewById(R.id.ID);
        final EditText Pass = (EditText) findViewById(R.id.Password);
        final Button Fbtn = (Button) findViewById(R.id.Fbtn);
        Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sID = ID.getText().toString();
                String sPass = Pass.getText().toString();
                //Toast.makeText(MainActivity.this, " Username=" + user1 + "Password=" + pass1, Toast.LENGTH_SHORT).show();
                if (sID.equals("Devops") && sPass.equals("Devops")) {
                    Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    intent.putExtra("intentID", sID);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong ID,Password .. Try Again", Toast.LENGTH_SHORT).show();
                    counter--;
                    if (counter == 0) {
                        Fbtn.setEnabled(false);
                        Toast.makeText(getApplicationContext(), "You have enterd wrong ID or Password 3 times", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        Toast.makeText(MainActivity.this, "On Create", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "On Start", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "On Resume", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "On Pause", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "On Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "On Restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "On Destroy", Toast.LENGTH_LONG).show();
    }
}


