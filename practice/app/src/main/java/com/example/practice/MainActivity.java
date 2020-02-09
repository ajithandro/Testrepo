package com.example.practice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practice.monitor.Monitor;
import com.example.practice.monitor.Move_To;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Monitor(this, Monitor.VISITOR);
        if (Monitor.VISITOR.equals(Monitor.getprefer())) {
            new Move_To(this,Main2Activity.class);
            Move_To.ShowToast(Monitor.getprefer());
        }

    }
}
