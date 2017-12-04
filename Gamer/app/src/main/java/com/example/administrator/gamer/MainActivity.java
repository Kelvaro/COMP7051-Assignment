package com.example.administrator.gamer;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean beaconStatus;
 ImageView indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        if(bundle !=null) {
            beaconStatus = bundle.getBoolean("beaconStatus1");


        }
        if(beaconStatus == false) {

            indicator = (ImageView) findViewById(R.id.indicator);
            indicator.setVisibility(View.INVISIBLE);
        }
        else if (beaconStatus==true){

            indicator = (ImageView) findViewById(R.id.indicator);
            indicator.setVisibility(View.VISIBLE);


        }





    }




    public void beacon (View v) {

        Intent intent = new Intent(MainActivity.this, Beacon.class);
        startActivity(intent);

    }

    public void searchGamers (View v){
        Intent searchIntent = new Intent (MainActivity.this, searchGamers.class);
        startActivity(searchIntent);

    }

    public void contacts (View v){
        Intent contactIntent = new Intent (MainActivity.this, Contacts.class);
        startActivity(contactIntent);
    }
}
