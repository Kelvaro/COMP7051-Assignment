package com.example.johnny.phototest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by John on 10/14/2017.
 */

public class Gallery extends BaseAdapter {


    private Activity activity;
    private String[] filepath;
    private String[] filename;
    private Context context;


    private static LayoutInflater inflater = null;

    public Gallery (Activity a, String[] fpath, String[] fname) {
        activity = a;
        filepath = fpath;
        filename = fname;
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    public Integer[] images = {
            R.drawable.flower1, R.drawable.flower2,
            R.drawable.flower3, R.drawable.flower4,
            R.drawable.flower5, R.drawable.flower6,
    };


/*    public Gallery (Context c) {
        context = c;

    } */

    @Override
    public int getCount() {

        return filepath.length;
    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if(convertView == null){
            vi = inflater.inflate(R.layout.gallery, null);
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return null;
    }
}
