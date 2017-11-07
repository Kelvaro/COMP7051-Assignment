package com.example.johnny.phototest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import static com.example.johnny.phototest.R.id.editText;

/**
 * Created by Administrator on 10/15/2017.
 */

public class PhotoStore extends Activity {
    Button Back;
    TextView search;
    ImageView imageview;
    String filterdate;
    GridView test;
    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        setContentView(R.layout.gallery);

      








        }


    public void backOnClick (View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void dateSearch (View view){

        search = (TextView) findViewById(R.id.editText);
        filterdate = search.getText().toString();
        Intent intent = new Intent(PhotoStore.this, MainActivity.class);
        intent.putExtra("datedata", filterdate);
        startActivity(intent);


    }
}


