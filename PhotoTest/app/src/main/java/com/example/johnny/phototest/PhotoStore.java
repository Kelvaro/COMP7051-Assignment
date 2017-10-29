package com.example.johnny.phototest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Administrator on 10/15/2017.
 */

public class PhotoStore extends AppCompatActivity {
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        GridView gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new Gallery(this));


        Back = (Button) findViewById(R.id.SearchButton);
        Back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);


            }




        });




    }




}
