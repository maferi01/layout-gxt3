package com.myself.client.layout;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.client.presenter.PresenterInterface;

/**
 * Created by arturo on 13/10/14.
 */
public class MainPresenter<V extends MainLayout,B extends MainEventBus> extends BasePresenter<V, B>
   implements LayoutPresenter
{


    public void onStart(){

    }

    public void onSetHeader(IsWidget isWidget){
       view.setHeader(isWidget);
    }

    public void onSetFooter(IsWidget isWidget){
        view.setFooter(isWidget);
    }

    public void onSetBody(IsWidget isWidget){
        view.setBody(isWidget);
    }

    public void onSetLeft(IsWidget isWidget){
        view.setLeft(isWidget);
    }
    public void onSetRight(IsWidget isWidget){
        view.setRight(isWidget);
    }


    public void onShowLeft(boolean visible){
        view.showLeft(visible);
    }

    public void onShowRight(boolean visible){
        view.showRight(visible);
    }




}
