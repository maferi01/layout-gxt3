package com.myself.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {
	void greetServer(String name, AsyncCallback<String> callback);
    void sumServer (int x , int y,AsyncCallback<String> callback);
}
