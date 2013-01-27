package com.emitrom.gwt4.ti.mobile.client.core.events.ui;

import com.emitrom.gwt4.ti.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;

public class ClickEvent extends InteractionEvent {
	public static String EVENT_NAME = "click";
	
	protected ClickEvent() {
		
	}
	
	private ClickEvent(JavaScriptObject jso) {
		this.jsObj = jso;
	}

	public native double getX() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.x;
	}-*/; 
	
	public native double getY() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.y;
	}-*/;
	
	private native double _getGlobalX() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.globalPoint.x;
	}-*/;
	
	private native double _getGlobalY() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.globalPoint.y;
	}-*/;
	
	public Point getGlobalPoint() {
		return new Point(_getGlobalX(), _getGlobalY());
	}
	
	public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancelBubble;
	}-*/;
}
