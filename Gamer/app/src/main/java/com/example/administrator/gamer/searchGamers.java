package com.example.administrator.gamer;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 12/2/2017.
 */

public class searchGamers extends AppCompatActivity{
    ListView list1;
    String playerList[] = {"Kelvaro", "Faker", "Aerodetph", "Tasteless"};
    int icons [] = {R.drawable.profile1,R.drawable.profile2,R.drawable.profile3,R.drawable.profile4 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchpeople);
        list1 = (ListView) findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), playerList, icons);
        list1.setAdapter(customAdapter);
        list1.setAdapter(customAdapter);
    }

    public void menu (View v){
        Intent intent = new Intent(searchGamers.this, MainActivity.class);
        startActivity(intent);


    }



}
