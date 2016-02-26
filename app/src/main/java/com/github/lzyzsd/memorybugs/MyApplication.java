package com.github.lzyzsd.memorybugs;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by bruce on 2/27/16.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);
    }
}
