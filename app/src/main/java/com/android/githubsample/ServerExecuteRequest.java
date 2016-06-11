package com.android.githubsample;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by ravikiran_0487 on 11-06-2016.
 */
public class ServerExecuteRequest implements ExecuteRequest {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public void execute(String result) {
        //executeRequest();
    }

    public void executeRequest(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        MyApplication.getInstance().getOkHttpClient().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });

    }
}
