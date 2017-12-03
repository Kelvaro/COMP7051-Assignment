package com.example.administrator.gamer;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Administrator on 12/2/2017.
 */

public class searchGamers extends AppCompatActivity{
    ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchpeople);
        list1 = (ListView) findViewById(R.id.list);


    }

    public void menu (View v){
        Intent intent = new Intent(searchGamers.this, MainActivity.class);
        startActivity(intent);


    }



}
