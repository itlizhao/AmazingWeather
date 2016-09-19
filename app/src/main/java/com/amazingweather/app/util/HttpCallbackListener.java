package com.amazingweather.app.util;

/**
 * Created by lee on 16/9/19.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
