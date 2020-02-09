package com.example.practice.monitor;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Move_To {
    private static Context context;
    public Move_To(Context context, Class classname) {
        this.context=context;
        Intent intent=new Intent(context, classname);
        context.startActivity(intent);

    }

    public static void  ShowToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
