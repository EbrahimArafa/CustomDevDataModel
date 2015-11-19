package com.example.gakson.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by Gakson on 11/19/2015.
 */
public class DevAdapter extends BaseAdapter {



    public List<DevDataModel> DevArray;
    public Activity activity;
    private  LayoutInflater layoutInflater;


    public DevAdapter(Activity activity, List<DevDataModel> objects ){
        this.activity = activity;
        this.DevArray=objects;

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (layoutInflater ==  null) {
            layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView ==  null)
            convertView = layoutInflater.inflate(R.layout.custom_photo,null);


        ImageView Person_Image = (ImageView) convertView.findViewById(R.id.DevImg);
        TextView person_Title = (TextView) convertView.findViewById(R.id.DevTxt);
        TextView person_Desc = (TextView) convertView.findViewById(R.id.Dev_Desc);




        final  DevDataModel  m =  DevArray.get(position);

        Person_Image.setImageResource(m.getPerson_Photo());
        person_Title.setText(m.getPerson_Name());
        person_Desc.setText(m.getPerson_Desc());












        return  convertView;

    }






    @Override
    public int getCount() {
        return DevArray.size();
    }

    @Override
    public Object getItem(int position) {
        return DevArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


}
