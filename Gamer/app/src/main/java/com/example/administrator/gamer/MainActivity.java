package com.example.administrator.gamer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
    public void beacon (View v) {

        Intent intent = new Intent(MainActivity.this, Beacon.class);
        startActivity(intent);

    }
}
