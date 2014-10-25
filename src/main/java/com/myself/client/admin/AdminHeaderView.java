package com.myself.client.admin;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;

/**
 * Created by arturo on 13/10/14.
 */
public class AdminHeaderView extends SimpleContainer{


    private final Button share;

    public AdminHeaderView() {

        share=new Button("Share Admin");
        add(share);
    }

    public Button getShare() {
        return share;
    }
}
