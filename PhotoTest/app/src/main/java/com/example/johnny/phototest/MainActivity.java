package com.example.johnny.phototest;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import android.Manifest;
import android.support.v4.content.ContextCompat;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText Date;
    EditText Date2;

    Button Search;



        private int READ_STORAGE_PERMISSION_CODE = 23;
        private int WRITE_STORAGE_PERMISSION_CODE = 24;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
//testing
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
                Log.d("Files", "Permission Exists");
            else
                ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, READ_STORAGE_PERMISSION_CODE);

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
                Log.d("Files", "Permission Exists");
            else
                ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, WRITE_STORAGE_PERMISSION_CODE);


            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString() + "/camera";

            Log.d("Files", "Path: " + path);
            //Create a file
            File newFile = new File(path + "/tempfile.txt");
            try {
                newFile.createNewFile();
            } catch(Exception e) {
                Log.d("Files", "Failed to create file 'tempfile.txt'");
            }
            //List Directory and note tempfile.txt
            File directory = new File(path);
            File[] files = directory.listFiles();
            Log.d("Files", "Size: "+ files.length);
            for (int i = 0; i < files.length; i++)
            {
                Log.d("Files", "FileName:" + files[i].getName());
            }



            Date = (EditText) findViewById(R.id.StartText);

            Date2 = (EditText) findViewById(R.id.EndText);

            Search = (Button) findViewById(R.id.SearchButton);
            Search.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    setContentView(R.layout.gallery);


                }




            });



        }
        @Override
        public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
            if(requestCode == READ_STORAGE_PERMISSION_CODE){
                if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Permission granted now you can read the storage",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"Oops you just denied the permission",Toast.LENGTH_LONG).show();
                }
            }
            if(requestCode == WRITE_STORAGE_PERMISSION_CODE){
                if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Permission granted now you can write the storage",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"Oops you just denied the permission",Toast.LENGTH_LONG).show();
                }
            }
        }
}