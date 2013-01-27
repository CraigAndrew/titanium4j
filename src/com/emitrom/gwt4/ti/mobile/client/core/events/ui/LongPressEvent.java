package com.emitrom.gwt4.ti.mobile.client.core.events.ui;

import com.google.gwt.core.client.JavaScriptObject;

public class LongPressEvent extends InteractionEvent {
	public static String EVENT_NAME = "longclick";
	protected LongPressEvent() {
		
	}
	
	private LongPressEvent(JavaScriptObject jso) {
		this.jsObj = jso;
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
