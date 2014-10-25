package com.myself.client.admin;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.client.ClientBodyView;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = AdminBodyView.class)
public class AdminBodyPresenter extends BasePresenter<AdminBodyView,MainEventAppBus> implements AdminDisplay{

    public void onStartAdmin(){
        eventBus.setBody(view);
    }

    public void onShareAdmin(String text){

          view.getLabel().setText(text);
    }

}
