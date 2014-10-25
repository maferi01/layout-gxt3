package com.myself.client.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = ClientHeaderView.class)
public class ClientHeaderPresenter extends BasePresenter<ClientHeaderView,MainEventAppBus>{

    public void onStartClient(){
        eventBus.setHeader(view);
    }


}
