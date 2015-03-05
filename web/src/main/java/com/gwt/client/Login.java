package com.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Created by 30 on 2015/2/10.
 */
public class Login implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Button button = new Button("send");
        RootPanel.get("sendButtonContainer").add(button);
    }
}
