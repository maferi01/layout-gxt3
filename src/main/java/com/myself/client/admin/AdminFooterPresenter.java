package com.myself.client.admin;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.client.ClientFooterView;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = AdminFooterView.class)
public class AdminFooterPresenter extends BasePresenter<AdminFooterView,MainEventAppBus>   implements AdminDisplay{

    public void onStartAdmin(){
        eventBus.setFooter(view);
    }

    public void onShareAdmin(String text){

        view.getLabel().setText(text);
    }
}
