package com.example.administrator.gamer;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


 ImageView indicator;
    public boolean beaconOn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(beaconOn == false) {
            indicator = (ImageView) findViewById(R.id.indicator);
            indicator.setVisibility(View.INVISIBLE);
        }
        else if (beaconOn == true ){
            indicator = (ImageView) findViewById(R.id.indicator);
            indicator.setVisibility(View.VISIBLE);
        }



    }
    public void beacon (View v) {

        Intent intent = new Intent(MainActivity.this, Beacon.class);
        startActivity(intent);

    }
}
