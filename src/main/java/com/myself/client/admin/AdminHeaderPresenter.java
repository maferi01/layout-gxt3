package com.myself.client.admin;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.client.ClientHeaderView;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = AdminHeaderView.class)
public class AdminHeaderPresenter extends BasePresenter<AdminHeaderView,MainEventAppBus>  implements AdminDisplay{

    public void onStartAdmin(){
        eventBus.setHeader(view);
    }

    @Override
    public void bind() {
        super.bind();

        view.getShare().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                eventBus.shareAdmin("sahre from header");
            }
        });
    }
}
