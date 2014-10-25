package com.myself.client.menu;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.client.ClientBodyView;
import com.myself.client.layout.MainPresenter;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = MenuView.class)
public class MenuPresenter extends BasePresenter<MenuView,MainEventAppBus> {

    @Override
    public void bind() {
        super.bind();

        view.getAdmin().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                eventBus.startAdmin();
            }
        });

        view.getClient().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                eventBus.startClient();
            }
        });

    }

    public void onStart(){

        eventBus.setLeft(view);
    }





}
