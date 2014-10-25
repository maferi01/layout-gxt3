package com.myself.client.layout;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;
import com.myself.client.layoutmyapp.MainPresenterApp;


public interface MainEventBus extends EventBus {


//    @Event(handlers= MyComponentPresenter.class)
//    void initComponent(Panel widget);
    @Event(broadcastTo = LayoutPresenter.class)
    void setHeader(IsWidget isWidget);
    @Event(broadcastTo = LayoutPresenter.class)
    void setFooter(IsWidget isWidget);
    @Event(broadcastTo = LayoutPresenter.class)
    void setBody(IsWidget isWidget);
    @Event(broadcastTo = LayoutPresenter.class)
    void setLeft(IsWidget isWidget);
    @Event(broadcastTo = LayoutPresenter.class)
    void setRight(IsWidget isWidget);
    @Event(broadcastTo = LayoutPresenter.class)
    void showLeft(boolean bVisible);
    @Event(broadcastTo = LayoutPresenter.class)
    void showRight(boolean bVisible);
}
