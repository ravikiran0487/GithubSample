package com.android.githubsample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by ravikiran_0487 on 11-06-2016.
 */
public class JsonDeserializer {

    public static <T> T convertJsonData(String json, Class<T> c) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.fromJson(json, c);
    }
}
