package com.myself.client.layoutmyapp;

import com.mvp4g.client.annotation.EventHandler;
import com.mvp4g.client.event.BaseEventHandler;
import com.myself.client.admin.AdminDisplay;

/**
 * Created by arturo on 14/10/14.
 */
@EventHandler
public class EventHandlerApp extends BaseEventHandler<MainEventAppBus>  implements AdminDisplay {


    public void onStartClient(){
        eventBus.showRight(true);
    }

    public void onStartAdmin(){
        eventBus.showRight(false);
    }
}
