package com.myself.client.binder;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.Style.LayoutRegion;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.Component;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

// import com.sencha.gxt.explorer.client.model.Example.Detail;

public class Layout implements IsWidget {

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    interface MyUiBinder extends UiBinder<Component, Layout> {
    }

    @UiField(provided = true)
    MarginData outerData = new MarginData(10);
    @UiField(provided = true)
    BorderLayoutData northData = new BorderLayoutData(100);
    @UiField(provided = true)
    BorderLayoutData westData = new BorderLayoutData(250);
    @UiField(provided = true)
    MarginData centerData = new MarginData();
    @UiField(provided = true)
    BorderLayoutData eastData = new BorderLayoutData(150);
    @UiField(provided = true)
    BorderLayoutData southData = new BorderLayoutData(100);
    @UiField
    BorderLayoutContainer con;
    @UiField
    FlexTable table;
    @UiField(provided = true)
    ThemeStyles.Styles themeStyles = ThemeStyles.get().style();

    @UiField
    ContentPanel footer;
    @UiField
    SimpleContainer east;

    private Widget widget;

    public Widget asWidget() {
        if (widget == null) {
            northData.setMargins(new Margins(5));
            westData.setMargins(new Margins(0, 5, 0, 5));
            westData.setCollapsible(true);
            westData.setSplit(true);
            eastData.setMargins(new Margins(0, 5, 0, 5));
            southData.setMargins(new Margins(5));

            widget = uiBinder.createAndBindUi(this);


            footer.add(new Label("Este es el footer"));
            east.add(new LayoutChild());

            for (int i = 0; i < LayoutRegion.values().length; i++) {
                final LayoutRegion r = LayoutRegion.values()[i];
                if (r == LayoutRegion.CENTER) {
                    continue;
                }

                SelectHandler handler = new SelectHandler() {

                    public void onSelect(SelectEvent event) {
                        TextButton btn = (TextButton) event.getSource();
                        String txt = btn.getText();
                        if (txt.equals("Expand")) {
                            con.expand(r);
                        } else if (txt.equals("Collapse")) {
                            con.collapse(r);
                        } else if (txt.equals("Show")) {
                            con.show(r);
                        } else {
                            con.hide(r);
                        }
                    }
                };

                table.setHTML(i, 0, "<div style='font-size: 12px; width: 100px'>" + r.name() + ":</span>");
                table.setWidget(i, 1, new TextButton("Expand", handler));
                table.setWidget(i, 2, new TextButton("Collapse", handler));
                table.setWidget(i, 3, new TextButton("Show", handler));
                table.setWidget(i, 4, new TextButton("Hide", handler));
                table.setWidget(i, 5, new Label("other"));

            }
        }

        return widget;
    }

//    public void onModuleLoad() {
//        RootPanel.get().add(asWidget());
//    }

}

