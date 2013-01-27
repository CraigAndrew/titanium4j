package com.emitrom.gwt4.ti.mobile.client.core.events.ui;

import com.google.gwt.core.client.JavaScriptObject;

public class TwoFingerTapEvent extends InteractionEvent {
	public static String EVENT_NAME = "twofingertap";
	
	protected TwoFingerTapEvent() {
		
	}
	
	private TwoFingerTapEvent(JavaScriptObject jso) {
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
	
	public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancelBubble;
	}-*/;
	
}
