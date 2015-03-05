package com.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Created by 30 on 2015/2/10.
 */
@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
    void loginValidate();
}
