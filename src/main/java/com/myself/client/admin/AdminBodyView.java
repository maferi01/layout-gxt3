package com.myself.client.admin;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by arturo on 13/10/14.
 */
public class AdminBodyView implements IsWidget{


    private final Label label;

    public AdminBodyView() {
        label=new Label("BODY AdMINNNNNNNNN");
    }

    public Widget asWidget() {
        return label;
    }

    public Label getLabel() {
        return label;
    }
}
