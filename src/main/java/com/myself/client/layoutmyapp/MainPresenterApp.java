package com.myself.client.layoutmyapp;

import com.mvp4g.client.annotation.Presenter;
import com.myself.client.layout.MainPresenter;

/**
 * Created by arturo on 13/10/14.
 */
@Presenter(view = MainLayoutBinderApp.class)
public class MainPresenterApp extends MainPresenter<MainLayoutBinderApp, MainEventAppBus> {


    public void onStart(){

       eventBus.startClient();

    }

}
