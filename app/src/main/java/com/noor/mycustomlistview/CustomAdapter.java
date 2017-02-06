package com.noor.mycustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Noor Mohammed on 2/2/2017.
 */

public class CustomAdapter extends BaseAdapter {

    String countryList[];
    int flags[];
    LayoutInflater inflater;


    public  CustomAdapter(Context context,String[] countryList,int[]flags )
    {
        this.countryList=countryList;
        this.flags=flags;
        inflater=(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view=inflater.inflate(R.layout.list_items,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        textView.setText(countryList[position]);
        imageView.setImageResource(flags[position]);
        return view;
    }
}
