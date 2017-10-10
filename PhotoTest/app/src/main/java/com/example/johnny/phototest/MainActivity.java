package com.example.johnny.phototest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Search;
    EditText Date;
    EditText Date2;
    String StartDate;
    String EndDate;
    ImageView Image1;
    ImageView Image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Image2 = (ImageView) findViewById(R.id.imageView3);
        Image1 = (ImageView) findViewById(R.id.imageView2);
        Date = (EditText) findViewById(R.id.StartText);

        Date2 = (EditText) findViewById(R.id.EndText);

        Search = (Button) findViewById(R.id.SearchButton);
        Image1.setVisibility(View.VISIBLE);
        Search.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "onClick was clicked");
                StartDate = Date.getText().toString();
                EndDate = Date2.getText().toString();

                Log.e(StartDate, Date.getText().toString());
                Log.e(EndDate, Date2.getText().toString());

                if(StartDate.toString().equals("20160202") && EndDate.toString().equals("20160404")){
                    Log.d("MainActivity", "first match was true");

                    Image1.setVisibility(View.INVISIBLE);

                }

                if(StartDate == "20140202" && EndDate == "20140404"){

                    Image1.setVisibility(View.VISIBLE);
                    Image2.setVisibility(View.INVISIBLE);

                }


            }




        });


    }







}
