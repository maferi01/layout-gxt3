package com.myself.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.Mvp4gModule;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ui implements EntryPoint {

 	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
 	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

        Mvp4gModule module = (Mvp4gModule)GWT.create( Mvp4gModule.class );
        module.createAndStartModule();
        RootPanel.get().add( (IsWidget)module.getStartView() );
		// Use RootPanel.get() to get the entire body element


	}




}
