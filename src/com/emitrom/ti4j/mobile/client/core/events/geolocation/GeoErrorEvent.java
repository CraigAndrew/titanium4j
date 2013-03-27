/**************************************************************************
   GeoErrorEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.core.events.geolocation;

import com.emitrom.ti4j.mobile.client.core.events.ErrorEvent;
import com.emitrom.ti4j.mobile.client.core.handlers.geolocation.GeoErrorHandler;
import com.emitrom.ti4j.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class GeoErrorEvent extends ErrorEvent {

    protected GeoErrorEvent() {

    }

	/**
	 * UiBinder implementations
	 */
	private static Type<GeoErrorHandler> TYPE = new Type<GeoErrorHandler>("geoerror", null);
	public static Type<GeoErrorHandler> getType() {
		return TYPE;
	}
	
	public static Type<GeoErrorHandler> getAssociatedType() {
		return TYPE;
	}
	

    private GeoErrorEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the y point of the event, in receiving view coordinates
     */
    public native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.y;
    }-*/;

    /**
     * a dictionary with properties x and y describing the point of the event in
     * screen coordinates
     */
    public native Point getGlobalPoint() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		var obj = jso.globalPoint;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * the x point of the event in receiving view coordiantes
     */
    public native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		return jso.x;
    }-*/;

}
