package com.github.lzyzsd.memorybugs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_b);
    }
}
