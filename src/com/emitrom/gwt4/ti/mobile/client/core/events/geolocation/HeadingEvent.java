/**************************************************************************
   HeadingEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.core.events.geolocation;

import com.emitrom.gwt4.ti.mobile.client.core.events.TiEvent;
import com.emitrom.gwt4.ti.mobile.client.geolocation.HeadingInfo;

public class HeadingEvent extends TiEvent {

    public static final String HEADING = "heading";

    protected HeadingEvent() {

    }

    /**
     * if success is false, the error code if available (iOS only)
     */
    public final native double getCode() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()()
		return jso.code;
    }-*/;

    /**
     * boolean to indicate if the heading event was successfully received or an
     * error occurred
     */
    public final native boolean isSuccess() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()()
		return jso.success;
    }-*/;

    /**
     * if success is false, returns a string of the error description
     */
    public final native String getError() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()()
		return jso.error;
    }-*/;

    /**
     * heading results dictionary.
     */
    public final native HeadingInfo getHeading() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()()
		var obj = jso.headinInfo;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.geolocation.HeadingInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
