package com.myself.client.client;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by arturo on 13/10/14.
 */
public class ClientBodyView implements IsWidget{
    public Widget asWidget() {
        return new Label("BODY CLIENTTTTT");
    }
}
