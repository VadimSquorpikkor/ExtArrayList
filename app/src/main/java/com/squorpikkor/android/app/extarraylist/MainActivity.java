package com.squorpikkor.android.app.extarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squorpikkor.android.app.extarraylist.ExtArrayList.ExtArrayList;

public class MainActivity extends AppCompatActivity {

    ExtArrayList<String> extArrayList = new ExtArrayList<>();

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
