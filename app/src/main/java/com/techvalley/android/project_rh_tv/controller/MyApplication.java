package com.techvalley.android.project_rh_tv.controller;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;

public class MyApplication extends Application {
    //-------------------
    //  ATTRIBUTES
    //-------------------
    public static Gson gson;
    private static MyApplication instance;

    //-------------------
    //  OVERRIDES
    //-------------------
    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
        gson = new Gson(); // INIT GSON
    }

    //-------------------
    //  METHODS
    //-------------------
    public static MyApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }
}
