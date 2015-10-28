package com.raven.coolweather.util;

/**
 * Created by cyend on 2015/10/27.
 *
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);

}
