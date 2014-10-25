package com.myself.client.layoutmyapp;

import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;
import com.myself.client.admin.AdminBodyPresenter;
import com.myself.client.admin.AdminDisplay;
import com.myself.client.admin.AdminFooterPresenter;
import com.myself.client.admin.AdminHeaderPresenter;
import com.myself.client.client.ClientBodyPresenter;
import com.myself.client.client.ClientDetailsPresenter;
import com.myself.client.client.ClientFooterPresenter;
import com.myself.client.client.ClientHeaderPresenter;
import com.myself.client.layout.MainEventBus;
import com.myself.client.menu.MenuPresenter;

@Events(startPresenter = MainPresenterApp.class)
public interface MainEventAppBus extends MainEventBus {

    @Start
	@Event(handlers={MainPresenterApp.class, MenuPresenter.class})
	void start();

   @Event(handlers= {ClientBodyPresenter.class, ClientFooterPresenter.class, ClientHeaderPresenter.class,
           ClientDetailsPresenter.class,EventHandlerApp.class})
    void startClient();

    @Event(broadcastTo = AdminDisplay.class)
    void startAdmin();

    @Event(handlers= {AdminBodyPresenter.class, AdminFooterPresenter.class})
    void shareAdmin(String text);
}
