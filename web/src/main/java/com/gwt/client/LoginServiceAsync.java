package com.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Created by 30 on 2015/3/5.
 */
public interface LoginServiceAsync {
    void loginValidate(AsyncCallback<Void> asyncCallback);
}
