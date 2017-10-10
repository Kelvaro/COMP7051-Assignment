package com.example.johnny.phototest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
   // TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Image2 = (ImageView) findViewById(R.id.imageView3);
        Image1 = (ImageView) findViewById(R.id.imageView2);
        Date = (EditText) findViewById(R.id.StartText);

        Date2 = (EditText) findViewById(R.id.EndText);

        Search = (Button) findViewById(R.id.SearchButton);

        Search.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                StartDate = Date.getText().toString();
                EndDate = Date2.getText().toString();
                Image1.setVisibility(View.VISIBLE);
                if(StartDate == "20160202"){

                Image1.setVisibility(View.INVISIBLE);

                }

                if(StartDate == "20140202"){

                    Image1.setVisibility(View.VISIBLE);
                    Image2.setVisibility(View.INVISIBLE);

                }


            }




        });


    }







}
