package com.example.gakson.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Home extends Activity {
    String[] DevOps_TEAM;
    String[] DevDescription;
    int[] img;


    List<DevDataModel> person_Array = new ArrayList<>();

    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final TextView TxtV = (TextView) findViewById(R.id.hello_home);
        final Intent intent = getIntent();
        String intentID = intent.getStringExtra("intentID");
        TxtV.setText("Hello, " + intentID);
        final ListView DevListView = (ListView) findViewById(R.id.list);
        activity = this;

        Toast.makeText(Home.this, "Hi Ahmed Maher", Toast.LENGTH_SHORT).show();
        DevDataModel Person_1 = new DevDataModel();
        Person_1.setPerson_Name("Ahmed");
        Person_1.setPerson_Photo(R.mipmap.ahmed);
        Person_1.setPerson_Desc("Android 1");
        person_Array.add(Person_1);



        DevDataModel person_2 =  new DevDataModel();
        person_2.setPerson_Name("Abdalla");
        person_2.setPerson_Photo(R.mipmap.abdalla);
        person_2.setPerson_Desc("android 2 ");
        person_Array.add(person_2);

        DevDataModel person_3 = new DevDataModel();
        person_3.setPerson_Name("Nezar");
        person_3.setPerson_Photo(R.mipmap.nezar);
        person_3.setPerson_Desc("Android 3");
        person_Array.add(person_3);


        DevDataModel person_4 = new DevDataModel();
        person_4.setPerson_Name("Ebrahim");
        person_4.setPerson_Photo(R.mipmap.ebrahim);
        person_4.setPerson_Desc("Android 4");
        person_Array.add(person_4);

        DevDataModel person_5 =new DevDataModel();
        person_5.setPerson_Name("Mohamed");
        person_5.setPerson_Photo(R.mipmap.mohamed);
        person_5.setPerson_Desc("Android 5");
        person_Array.add(person_5);




           DevAdapter  MyAdapter  =  new DevAdapter(activity,person_Array);
          DevListView.setAdapter(MyAdapter);
        DevListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent1 = new Intent(Home.this, Information.class);
                intent1.putExtra("name", person_Array.get(position).getPerson_Name());
                intent1.putExtra("img", person_Array.get(position).getPerson_Photo());
                intent1.putExtra("description", person_Array.get(position).getPerson_Desc());
                intent1.putExtra("position", position);
                startActivity(intent1);


            }
        });






//
//        DevOps_TEAM = new String[]{"Ahmed Maher", "Abdalla Tarek", "Nezar Saleh", "Ebrahim Arafa", "Mohamed Arafa"};
//        img = new int[]{R.mipmap.ahmed, R.mipmap.abdalla, R.mipmap.nezar, R.mipmap.ebrahim, R.mipmap.mohamed};
//        DevDescription = new String[]{"Android Trainee", "Android Trainee", "Android Experienced Programmer", "Android Trainee", "Android Experienced Programmer"};
//        final ListAdapter DevAdapter = new Custom_List(this, DevOps_TEAM);
//        DevListView.setAdapter(DevAdapter);
//

//        DevListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent1 = new Intent(Home.this, Information.class);
//                intent1.putExtra("name", DevOps_TEAM);
//                intent1.putExtra("img", img);
//                intent1.putExtra("description", DevDescription);
//                intent1.putExtra("position", position);
//                startActivity(intent1);
//
//            }
//
//
//        });
//

    }
}










