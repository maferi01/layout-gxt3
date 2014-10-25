package com.myself.client.client;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.myself.client.layoutmyapp.MainEventAppBus;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = ClientBodyView.class)
public class ClientBodyPresenter extends BasePresenter<ClientBodyView,MainEventAppBus>{

    public void onStartClient(){
        eventBus.setBody(view);
    }


}
