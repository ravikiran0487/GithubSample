package com.android.githubsample;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/**
 * Created by ravikiran_0487 on 11-06-2016.
 */
public class ServerExecuteRequest implements ExecuteRequest {

    private static final MediaType JSON=MediaType.parse("application/json; charset=utf-8");

    @Override
    public <T> void execute(T result) {

    }
}
