package com.myself.client.binder;

/**
 * Created by arturo on 24/05/14.
 */

/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */


        import com.google.gwt.cell.client.Cell;
        import com.google.gwt.core.client.EntryPoint;
        import com.google.gwt.core.client.GWT;
        import com.google.gwt.resources.client.ImageResource;
        import com.google.gwt.safehtml.shared.SafeHtml;
        import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
        import com.google.gwt.text.shared.SimpleSafeHtmlRenderer;
        import com.google.gwt.uibinder.client.UiBinder;
        import com.google.gwt.uibinder.client.UiFactory;
        import com.google.gwt.uibinder.client.UiField;
        import com.google.gwt.uibinder.client.UiHandler;
        import com.google.gwt.user.client.ui.IsWidget;
        import com.google.gwt.user.client.ui.RootPanel;
        import com.google.gwt.user.client.ui.Widget;
        import com.sencha.gxt.cell.core.client.SimpleSafeHtmlCell;
        import com.sencha.gxt.core.client.ValueProvider;
        import com.sencha.gxt.data.shared.IconProvider;
        import com.sencha.gxt.data.shared.ModelKeyProvider;
        import com.sencha.gxt.data.shared.TreeStore;
        import com.sencha.gxt.examples.resources.client.TestData;
        import com.sencha.gxt.examples.resources.client.images.ExampleImages;
        import com.sencha.gxt.examples.resources.client.model.BaseDto;
        import com.sencha.gxt.examples.resources.client.model.FolderDto;
      //  import com.sencha.gxt.explorer.client.model.Example.Detail;
        import com.sencha.gxt.widget.core.client.event.SelectEvent;
        import com.sencha.gxt.widget.core.client.tree.Tree;

public class TreeT implements IsWidget, EntryPoint {

    class KeyProvider implements ModelKeyProvider<BaseDto> {
        @Override
        public String getKey(BaseDto item) {
            return (item instanceof FolderDto ? "f-" : "m-") + item.getId().toString();
        }
    }

    interface MyUiBinder extends UiBinder<Widget, TreeT> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField(provided = true)
    TreeStore<BaseDto> store = new TreeStore<BaseDto>(new KeyProvider());

    @UiField
    Tree<BaseDto, String> tree;

    private Widget widget;

    public Widget asWidget() {
        if (widget == null) {
            widget = constructUi();
        }

        return widget;
    }

    public void onModuleLoad() {
        RootPanel.get().add(asWidget());
    }

    @UiFactory
    public ValueProvider<BaseDto, String> createValueProvider() {
        return new ValueProvider<BaseDto, String>() {

            @Override
            public String getValue(BaseDto object) {
                return object.getName();
            }

            @Override
            public void setValue(BaseDto object, String value) {
            }

            @Override
            public String getPath() {
                return "name";
            }
        };
    }

    @UiHandler("expandAll")
    public void expandAll(SelectEvent event) {
        tree.expandAll();
    }

    @UiHandler("collapseAll")
    public void collapseAll(SelectEvent event) {
        tree.collapseAll();
    }

    private Widget constructUi() {
        FolderDto root = TestData.getMusicRootFolder();
        for (BaseDto base : root.getChildren()) {
            store.add(base);
            if (base instanceof FolderDto) {
                processFolder(store, (FolderDto) base);
            }
        }

        Widget widget = uiBinder.createAndBindUi(this);
        widget.addStyleName("margin-10");
        tree.getStyle().setLeafIcon(ExampleImages.INSTANCE.music());


        tree.setIconProvider(new IconProvider<BaseDto>() {
            @Override
            public ImageResource getIcon(BaseDto p_model) {
                if(p_model instanceof FolderDto )
                    return ExampleImages.INSTANCE.accordion();
                if (p_model.getName().equals("Violin Concerto"))
                   return  ExampleImages.INSTANCE.user();
                else
                    return ExampleImages.INSTANCE.music();
            }
        });



        return widget;
    }

    private void processFolder(TreeStore<BaseDto> store, FolderDto folder) {
        for (BaseDto child : folder.getChildren()) {
            store.add(folder, child);
            if (child instanceof FolderDto) {
                processFolder(store, (FolderDto) child);
            }
        }
    }
}

