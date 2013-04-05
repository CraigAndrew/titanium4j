/**************************************************************************
 * UpdateEvent.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.core.events;

import com.google.gwt.core.client.JavaScriptObject;

public class UpdateEvent extends TiEvent {

    public static final String UPDATE = "update";

    protected UpdateEvent() {

    }

    protected UpdateEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * reference timestamp since the previous change. jso is not a valid
     * timestamp and should simply be used to determine the time between events
     * and not an exact timestamp.
     */
    public final native double getTimestamp() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.timestamp;
    }-*/;

    /**
     * the y axis of the device
     */
    public final native double getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.y;
    }-*/;

    /**
     * the x axis of the device
     */
    public final native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.x;
    }-*/;

    /**
     * the z axis of the device
     */
    public final native double getZ() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.z;
    }-*/;

}
