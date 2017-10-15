package com.example.johnny.phototest;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by John on 10/14/2017.
 */

public class Gallery extends BaseAdapter {

    private Context context;

    public Integer[] images = {
            R.drawable.flower1, R.drawable.flower2, R.drawable.flower3,
            R.drawable.flower4, R.drawable.flower5, R.drawable.flower6,
    };


    public Gallery (Context c) {
        context = c;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        ImageView.setImageResource(images[position]);
        ImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return null;
    }
}
