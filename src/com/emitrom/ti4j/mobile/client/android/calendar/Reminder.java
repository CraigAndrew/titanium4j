/**************************************************************************
   Reminder.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.android.calendar;

import com.emitrom.ti4j.mobile.client.core.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class Reminder extends EventDispatcher {

    public Reminder() {
        jsObj = JsoHelper.createObject();
    }

    public Reminder(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The id of the reminder.
     */
    public native String getId() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.id;
    }-*/;

    public native void setId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		this.jso = value;
    }-*/;

    /**
     * @return The reminder method. possible values are the method constants in
     *         {@linkcom.ekambi.gwt.appcelerator.mobile.client.android.calendar.Calendar}
     * 
     */
    public native int getMethod() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.method;
    }-*/;

    public native void setMethod(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.method = value;
    }-*/;

    /**
     * @return The minutes before the event when the reminder should occur.
     */
    public native int getMinutes() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.minutes;
    }-*/;

    public native void setMinutes(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.minutes = value;
    }-*/;

}
