package com.squorpikkor.android.app.extarraylist.ExtArrayList;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

// Created by Vadim on 03.08.2017.

public class ExtArrayList<T> extends ArrayList {
    private SharedPreferences sharedPreferences;

    public ExtArrayList(Context context) {//Constructor to use shPref
        sharedPreferences = context.getSharedPreferences("mainPref", Context.MODE_PRIVATE);
    }

    void save() {


    }

    void load() {

    }
}
