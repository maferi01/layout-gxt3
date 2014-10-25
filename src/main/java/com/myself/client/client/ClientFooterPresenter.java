package com.myself.client.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = ClientFooterView.class)
public class ClientFooterPresenter extends BasePresenter<ClientFooterView,MainEventAppBus>{

    public void onStartClient(){
        eventBus.setFooter(view);
    }


}
