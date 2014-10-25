package com.myself.client.admin;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by arturo on 13/10/14.
 */
public class AdminFooterView implements IsWidget{
    private Label label;


    public AdminFooterView() {
        this.label= new Label("ADMINNN FOOTER");
    }

    public Widget asWidget() {
        return label;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
