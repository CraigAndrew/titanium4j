package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;

public class SwipeEvent extends InteractionEvent {
	public static String EVENT_NAME = "swipe";
	
	public enum SWIPE_DIRECTION {
		RIGHT_TO_LEFT,
		LEFT_TO_RIGHT
	}
	
	protected SwipeEvent() {
	}
	
	private SwipeEvent(JavaScriptObject jso) {
		this.jsObj = jso;
	}
	
	public final native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.x;
	}-*/;
	
	public final native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.y;
	}-*/;
	
	public Point getPoint() {
		return new Point(getX(), getY());
	}
	
	public final native String _getDirection() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.direction;
	}-*/;
	
	public SWIPE_DIRECTION getDirection() {
		String dir = _getDirection();
		return (dir == null || dir.equals("left") ? SWIPE_DIRECTION.RIGHT_TO_LEFT : SWIPE_DIRECTION.LEFT_TO_RIGHT);
	}

	public native boolean bubbles() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.bubbles;
	}-*/;
	
	public native boolean bubbleCanceled() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancelBubble;
	}-*/;

}
