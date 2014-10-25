package com.myself.client.menu;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.theme.base.client.button.ButtonTableFrameResources;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;

/**
 * Created by arturo on 13/10/14.
 */
public class MenuView extends SimpleContainer{

    private final Button client;
    private final Button admin;

    public MenuView() {

        setWidth("100%");

         client = new Button("Cient...");
        admin = new Button("Admin...");

        VerticalLayoutContainer vert = new VerticalLayoutContainer();

        vert.add(client);
        vert.add(admin);

        add(vert);

    }

    public Button getClient() {
        return client;
    }

    public Button getAdmin() {
        return admin;
    }
}
