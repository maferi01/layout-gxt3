package com.myself.client.layout;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * Created by arturo on 13/10/14.
 */
public interface MainLayoutDisplay extends IsWidget{

    void setHeader(IsWidget isWidget);
    void setFooter(IsWidget isWidget);
    void setBody(IsWidget isWidget);
    void setLeft(IsWidget isWidget);
    void setRight(IsWidget isWidget);
    void showLeft(boolean bVisible);
    void showRight(boolean bVisible);


}
