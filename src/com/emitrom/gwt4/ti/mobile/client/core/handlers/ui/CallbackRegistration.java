package com.emitrom.gwt4.ti.mobile.client.core.handlers.ui;

import com.emitrom.gwt4.ti.mobile.client.ui.UIObject;
import com.google.gwt.core.client.JavaScriptObject;

public class CallbackRegistration {
	
	private final UIObject uiObject;
	private final String actionString;
	private final JavaScriptObject functionJso;
	
	public CallbackRegistration(UIObject uiObject, String actionString, JavaScriptObject jso) {
		this.uiObject = uiObject;
		this.actionString = actionString;
		this.functionJso = jso;
	}
	
	public UIObject getUiObject() {
		return uiObject;
	}
	
	public String getActionString() {
		return actionString;
	}
	
	public JavaScriptObject getJso() {
		return functionJso;
	}
	
	public native void unregister() /*-{
		var obj = this.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::getUiObject()();
		var objjso = obj.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var action = this.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::getActionString()();
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::getJso()();
		objjso.removeEventListener(action, jso);
	}-*/;
}
