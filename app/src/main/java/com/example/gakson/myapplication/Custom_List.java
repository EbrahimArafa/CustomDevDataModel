package com.example.gakson.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Gakson on 11/14/2015.
 */

class Custom_List extends ArrayAdapter<String> {
    int img[] = {R.mipmap.ahmed, R.mipmap.abdalla, R.mipmap.nezar, R.mipmap.ebrahim, R.mipmap.mohamed};


    Custom_List(Context context, String[] DevOps) {
        super(context, R.layout.custom_photo, DevOps);
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater Devinflater = LayoutInflater.from(getContext());
        View Devview = Devinflater.inflate(R.layout.custom_photo, parent, false);

        String DevItem = getItem(position);
        TextView DevTxt = (TextView) Devview.findViewById(R.id.DevTxt);
        ImageView DevImg = (ImageView) Devview.findViewById(R.id.DevImg);
        DevTxt.setText(DevItem);
        DevImg.setImageResource(img[position]);
        return Devview;


    }

}


