package com.myself.client.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = ClientDetailsView.class)
public class ClientDetailsPresenter extends BasePresenter<ClientDetailsView,MainEventAppBus>{

    public void onStartClient(){
        eventBus.setRight(view);
    }

}
