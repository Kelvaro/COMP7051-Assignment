package com.example.johnny.phototest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

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


/*
    public Integer[] images = {
            R.drawable.flower1, R.drawable.flower2,
            R.drawable.flower3, R.drawable.flower4,
            R.drawable.flower5, R.drawable.flower6,
    };
    */

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
        if (convertView == null)
            vi = inflater.inflate(R.layout.gridview_item, null);
        // Locate the TextView in gridview_item.xml
        TextView text = (TextView) vi.findViewById(R.id.text);
        // Locate the ImageView in gridview_item.xml
        ImageView image = (ImageView) vi.findViewById(R.id.image);

        // Set file name to the TextView followed by the position
        text.setText(filename[position]);

        // Decode the filepath with BitmapFactory followed by the position
        Bitmap bmp = BitmapFactory.decodeFile(filepath[position]);

        // Set the decoded bitmap into ImageView
        image.setImageBitmap(bmp);
        return vi;
    }
}
