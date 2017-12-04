package com.example.administrator.gamer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 12/3/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String playerList[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] player, int[] playerIcon) {
        this.context = context;
        this.playerList = player;
        this.flags = playerIcon;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return playerList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView player = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        player.setText(playerList[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
