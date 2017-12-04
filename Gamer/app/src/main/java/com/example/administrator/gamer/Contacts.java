package com.example.administrator.gamer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Administrator on 12/3/2017.
 */

public class Contacts extends AppCompatActivity {
    ListView list1;
    String playerList[] = {"Battalion of Gamers", "Team Cunning Stunts", "Team Liquid", "Cake Heads"};
    int icons [] = {R.drawable.guild1,R.drawable.guild2,R.drawable.guild3,R.drawable.guild4 };
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
        Intent intent = new Intent(Contacts.this, MainActivity.class);
        startActivity(intent);


    }

}
