package com.android.githubsample;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by ravikiran_0487 on 11-06-2016.
 */
public class MainPresenter {

    protected final EventBus eventBus;
    protected ExecuteRequest executeRequest;

    public MainPresenter(EventBus eventBus, ExecuteRequest executeRequest) {
        this.eventBus = eventBus;
        this.executeRequest = executeRequest;
    }

    protected <T> void sendRequest(T request) {
        executeRequest.execute(request);
    }


}
