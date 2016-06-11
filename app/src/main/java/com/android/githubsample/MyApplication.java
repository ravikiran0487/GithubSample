package com.android.githubsample;

import android.app.Application;

import okhttp3.OkHttpClient;

/**
 * Created by ravikiran_0487 on 11-06-2016.
 */
public class MyApplication extends Application {
    MyApplication instance = null;
    private OkHttpClient okHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public OkHttpClient getOkHttpClient() {
        if (okHttpClient != null) {
            okHttpClient = new OkHttpClient();
        }
        return okHttpClient;
    }
}
