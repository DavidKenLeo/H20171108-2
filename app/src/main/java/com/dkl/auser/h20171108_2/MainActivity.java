package com.dkl.auser.h20171108_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Map<String,Object>> mylist;
    private ListView lv;
    private SimpleAdapter simpleAdapter;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        img = (ImageView)findViewById(R.id.img);
        mylist = new ArrayList<>();
        HashMap<String,Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img",R.drawable.q1);
        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img",R.drawable.q2);
        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "06");
        m3.put("img",R.drawable.q3);
        mylist.add(m1);
        mylist.add(m2);
        mylist.add(m3);
        simpleAdapter = new SimpleAdapter(this, mylist, R.layout.myitem,
                new String[] {"city", "code", "img"}, new int[] {R.id.textView, R.id.textView2,R.id.img});
        lv.setAdapter(simpleAdapter);

    }
}
