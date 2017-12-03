package com.example.administrator.gamer;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrator on 11/27/2017.
 */

public class Beacon extends AppCompatActivity{

    EditText game;
    EditText location;


    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        setContentView(R.layout.beaconsettings);

        Button activate = (Button) findViewById(R.id.activateButton);
        activate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                game = (EditText)findViewById(R.id.editGame);
                location = (EditText)findViewById(R.id.editLocation);
                final String displayLocation = location.getText().toString();
                final String displayGame = game.getText().toString();
                final AlertDialog.Builder builder = new AlertDialog.Builder(Beacon.this);
                builder.setTitle("Beacon Confirmation");
                builder.setMessage("Activate Beacon for " + displayGame + " in " + displayLocation+ "?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        boolean beaconStatus = true;
                        Intent beaconStatusIntent = new Intent(Beacon.this, MainActivity.class);
                        beaconStatusIntent.putExtra("beaconStatus1", beaconStatus);
                        startActivity(beaconStatusIntent);

                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });


                builder.show();
            }
        });
    }




    public void Cancel (View v) {

        Intent intent = new Intent(Beacon.this, MainActivity.class);
        startActivity(intent);

    }

}
