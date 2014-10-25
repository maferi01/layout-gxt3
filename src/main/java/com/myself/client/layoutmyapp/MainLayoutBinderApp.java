package com.myself.client.layoutmyapp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.myself.client.layout.MainLayout;
import com.sencha.gxt.core.client.Style;
import com.sencha.gxt.widget.core.client.Component;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.*;

/**
 * Created by arturo on 13/10/14.
 */
public class MainLayoutBinderApp extends MainLayout {


    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
    private Component widget;

    interface MyUiBinder extends UiBinder<Component, MainLayoutBinderApp> {
    }
    @UiField(provided = true)
    MarginData outerData = new MarginData(10);
    @UiField(provided = true)
    BorderLayoutContainer.BorderLayoutData northData = new BorderLayoutContainer.BorderLayoutData(50);
    @UiField(provided = true)
    BorderLayoutContainer.BorderLayoutData westData = new BorderLayoutContainer.BorderLayoutData(100);

    @UiField(provided = true)
    BorderLayoutContainer.BorderLayoutData eastData = new BorderLayoutContainer.BorderLayoutData(200);
    @UiField(provided = true)
    BorderLayoutContainer.BorderLayoutData southData = new BorderLayoutContainer.BorderLayoutData(100);
    @UiField
    ContentPanel header;
    @UiField
    ContentPanel body;
    @UiField
    ContentPanel footer;

    @UiField
    ContentPanel left;
    @UiField
    ContentPanel right;
    @UiField
    BorderLayoutContainer borderLayout;

    public MainLayoutBinderApp() {


        widget = uiBinder.createAndBindUi(this);



    }

    public void setHeader(IsWidget isWidget) {
       header.setWidget(isWidget);
    }

    public void setFooter(IsWidget isWidget) {
       footer.setWidget(isWidget);
    }

    public void setBody(IsWidget isWidget) {
        body.setWidget(isWidget);
    }

    public void setLeft(IsWidget isWidget) {
        left.setWidget(isWidget);
    }

    public void setRight(IsWidget isWidget) {
        right.setWidget(isWidget);
    }

    public void showLeft(boolean bVisible) {
        borderLayout.getWestWidget().setVisible(bVisible);
    }

    public void showRight(boolean bVisible) {
      //  borderLayout.getEastWidget().setVisible(bVisible);
        if(bVisible)
          borderLayout.show(Style.LayoutRegion.EAST);
        else
            borderLayout.hide(Style.LayoutRegion.EAST);
        borderLayout.forceLayout();
    }

    public Widget asWidget() {



        return widget;
    }
}
