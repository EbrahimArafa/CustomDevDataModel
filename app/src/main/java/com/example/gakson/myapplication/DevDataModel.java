package com.example.gakson.myapplication;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gakson on 11/19/2015.
 */
public class DevDataModel extends ArrayList {


    int person_Photo;
    String Person_Name;
    String Person_Desc;


    public int getPerson_Photo() {
        return person_Photo;
    }

    public void setPerson_Photo(int person_Photo) {
        this.person_Photo = person_Photo;
    }

    public String getPerson_Name() {
        return Person_Name;
    }

    public void setPerson_Name(String person_Name) {
        Person_Name = person_Name;
    }

    public String getPerson_Desc() {
        return Person_Desc;
    }

    public void setPerson_Desc(String person_Desc) {
        Person_Desc = person_Desc;
    }
}
