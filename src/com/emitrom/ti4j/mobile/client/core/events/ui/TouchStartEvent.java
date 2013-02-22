package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.google.gwt.core.client.JavaScriptObject;

public class TouchStartEvent extends InteractionEvent {
	public static String EVENT_NAME = "touchstart";
	
	protected TouchStartEvent() {
		
	}
	
	private TouchStartEvent(JavaScriptObject jso) {
		this.jsObj = jso;
	}

	public native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.x;
	}-*/; 
	
	public native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.y;
	}-*/;
	
	public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancelBubble;
	}-*/;
}
