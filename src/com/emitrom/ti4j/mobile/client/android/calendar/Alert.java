/**************************************************************************
 * Alert.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.mobile.client.android.calendar;

import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

/**
 * An object which represents a single alert for an event in an Android
 * calendar.
 */
public class Alert extends EventDispatcher {

    public Alert() {

    }

    public Alert(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    public native JsDate getAlarmTime() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.alarmTime;
    }-*/;

    /**
     * The date/time at which the alert's alarm is triggered.
     * 
     * @param value
     */
    public native void setAlarmTime(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.alarmTime = value;
    }-*/;

    public native JsDate getBegin() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.begin;
    }-*/;

    /**
     * The date/time at which the corresponding event begins.
     * 
     * @param value
     */
    public native void setBeginn(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.beginn = value;
    }-*/;

    public native JsDate getEnd() /*-{
		return this.end;
    }-*/;

    /**
     * The date/time at which the corresponding event ends.
     * 
     * @param value
     */
    public native void setEnd(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.end = value;
    }-*/;

    public native int getEventId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.eventId;
    }-*/;

    /**
     * The id of the alert.
     * 
     * @param id
     */
    public native void setEventId(int id) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.eventId = id;
    }-*/;

    public native int getId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * The id of the alert.
     * 
     * @param id
     */
    public native void setId(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.id = value;
    }-*/;

    public native int getMinutes() /*-{
		return this.minutes;
    }-*/;

    /**
     * The minutes before the event when the alert should trigger.
     * 
     * @param value
     */
    public native void setMinutes(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.minutes = value;
    }-*/;

    public native int getStates() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.states;
    }-*/;

    /**
     * The current state of the alert. Possible values are the STATE_ constants
     * in <code>com.emitrom.ti4j.mobile.client.android.calendar.Calendar</code>
     * .
     * 
     * @param value
     */
    public native void setState(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.state = value;
    }-*/;

}
