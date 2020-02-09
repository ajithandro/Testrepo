package com.example.practice.monitor;

import android.content.Context;
import android.content.SharedPreferences;

public class Monitor {


    public  Context context;
    public static String VISITOR="visitor";

    public static SharedPreferences sharedPreferences ;
    public static SharedPreferences.Editor editor;

    public Monitor(Context context,String monitor) {
        this.context= context;
        sharedPreferences= context.getSharedPreferences("USER_DETAILS", Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor.putString("log",monitor).apply();
    }


    public static String getprefer() {
        return sharedPreferences.getString("log",null);
    }
}
