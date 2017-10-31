package com.example.johnny.phototest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
/**
 * Created by Administrator on 10/15/2017.
 */

public class PhotoStore extends Activity {
    Button Back;
    TextView text;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        // Get the view from view_image.xml
        setContentView(R.layout.gallery);

      

        Back = (Button) findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);


            }




        });






        }
}


