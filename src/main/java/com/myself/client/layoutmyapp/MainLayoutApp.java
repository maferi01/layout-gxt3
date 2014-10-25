package com.myself.client.layoutmyapp;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.myself.client.layout.MainLayout;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;

/**
 * Created by arturo on 13/10/14.
 */
public class MainLayoutApp extends MainLayout {


    private final SimpleContainer header;
    private final SimpleContainer body;
    private final SimpleContainer footer;
    private final VerticalLayoutContainer vertContainer;
    private final HorizontalLayoutContainer horContainer;
    private final SimpleContainer left;


    public MainLayoutApp() {

   vertContainer = new VerticalLayoutContainer();
   horContainer = new HorizontalLayoutContainer();

        horContainer.setWidth(600);
        horContainer.setHeight(500);


        header = new SimpleContainer();
        body  = new SimpleContainer();
        footer  = new SimpleContainer();
        left  = new SimpleContainer();

        horContainer.add(left, new HorizontalLayoutContainer.HorizontalLayoutData(0.30,1));
        horContainer.add(vertContainer,new HorizontalLayoutContainer.HorizontalLayoutData(0.70,1));


        header.setBorders(true);
        footer.setBorders(true);
        body.setBorders(true);

        vertContainer.add(header, new VerticalLayoutContainer.VerticalLayoutData(1,0.20));
        vertContainer.add(body,new VerticalLayoutContainer.VerticalLayoutData(1,0.80));
        vertContainer.add(footer, new VerticalLayoutContainer.VerticalLayoutData(1,0.20));

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

    }

    public void showLeft(boolean bVisible) {

    }

    public void showRight(boolean bVisible) {

    }

    public Widget asWidget() {
        return horContainer;
    }
}
