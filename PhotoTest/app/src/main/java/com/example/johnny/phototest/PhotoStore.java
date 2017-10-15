package com.example.johnny.phototest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Administrator on 10/15/2017.
 */

public class PhotoStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        GridView gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new Gallery(this));







    }




}
