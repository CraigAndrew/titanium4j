/**************************************************************************
   Event.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;

import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * /** An object which represents a single event in an android calendar.
 * <p>
 * Notes: The API supports retrieving information about existing events and
 * creating new events. However, modifying or deleting existing events is not
 * yet supported. Additionally, recurring events are not yet supported. See
 * <Titanium.Android.Calendar> for examples of retrieving event information and
 * creating events.
 */
public class Event extends EventDispatcher {

    public Event() {

    }

    public Event(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return An array of
     *         {@link com.emitrom.ti4j.mobile.client.android.calendar.Alert}
     *         objects which are the alerts - if any - for this event.
     */
    public ArrayList<Alert> getAlerts() {
        ArrayList<Alert> alerts = new ArrayList<Alert>();
        JsArray<JavaScriptObject> array = _getAlerts();
        for (int i = 0; i < array.length(); i++) {
            Alert alert = new Alert(array.get(i));
            alerts.add(alert);
        }
        return alerts;
    }

    private final native JsArray<JavaScriptObject> _getAlerts() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.alerts;
    }-*/;

    public void setAlerts(ArrayList<Alert> alerts) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (Alert alert : alerts) {
            array.push(alert.getJsObj());
        }
        _setAlerts(array);
    }

    private final native void _setAlerts(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.alerts = value;
    }-*/;

    /**
     * @return Whether the event is all day.
     */
    public final native boolean isAllDay() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.allDay;
    }-*/;

    public final native void setAllDay(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.allDay = value;
    }-*/;

    /**
     * @return The date/time at which the event begins.
     */
    public final native JsDate getBegin() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.begin;
    }-*/;

    public final native void setBegin(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.begin = value;
    }-*/;

    /**
     * @return The event description.
     */
    public final native String getDescription() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.description;
    }-*/;

    public final native void setDescription(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.description = value;
    }-*/;

    /**
     * @return The date/time at which the event ends.
     */
    public final native JsDate getEnd() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.end;
    }-*/;

    public final native void setEnd(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.end = value;
    }-*/;

    /**
     * @return An object containing extended properties of the event.
     */
    public final native <T> T getExtendedProperties() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.extendedProperties;
    }-*/;

    public final native void setExtendedProperties(Object value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.extendedProperties = value;
    }-*/;

    /**
     * @return Whether an alarm is scheduled for the event.
     */
    public final native boolean hasAlarm() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.hasAlarm;
    }-*/;

    public final native void setHasAlarm(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.hasAlarm = value;
    }-*/;

    /**
     * @return wether or not this event has extended properties
     */
    public final native boolean hasExtendedProperties() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.hasExtendedProperties;
    }-*/;

    public final native void setHasExtendedProperties(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.hasExtendedProperties = value;
    }-*/;

    /**
     * @return The id of the event.
     */
    public final native String getId() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.id;
    }-*/;

    public final native void setId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.id = value;
    }-*/;

    /**
     * @return The event location.
     */
    public final native String getLocation() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.location;
    }-*/;

    public final native void setLocation(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.location = value;
    }-*/;

    /**
     * @return An array of
     *         {@link org.urish.gwtit.titanium.android.calendar.reminder}
     *         objects which are the reminders - if any - for this event.
     */
    public ArrayList<Reminder> getReminders() {
        ArrayList<Reminder> reminders = new ArrayList<Reminder>();
        JsArray<JavaScriptObject> array = _getReminders();
        for (int i = 0; i < array.length(); i++) {
            reminders.add(new Reminder(array.get(i)));
        }
        return reminders;
    }

    private final native JsArray<JavaScriptObject> _getReminders() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.reminders;
    }-*/;

    public void setReminder(ArrayList<Reminder> reminders) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (Reminder remider : reminders) {
            array.push(remider.getJsObj());
        }
        _setReminders(array);
    }

    public void setReminder(Reminder... reminders) {
        JsArray<JavaScriptObject> array = JsArray.createArray().cast();
        for (Reminder remider : reminders) {
            array.push(remider.getJsObj());
        }
        _setReminders(array);
    }

    private final native void _setReminders(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.reminders = value;
    }-*/;

    /**
     * @return The status of the event. possible values are the status constants
     *         in
     *         {@link com.emitrom.ti4j.mobile.client.android.calendar.Calendar}
     *         .
     */
    public final native int getStatus() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.status;
    }-*/;

    public final native void setStatus(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.status = value;
    }-*/;

    /**
     * @return The title string for the event.
     */
    public final native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public final native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return The event's visibility. possible values are the visibility
     *         constants in
     *         {@link com.emitrom.ti4j.mobile.client.android.calendar}.
     */
    public final native int getVisibility() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.visibility;
    }-*/;

    public final native void setVisibility(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.visibility = value;
    }-*/;

    /**
     * Create an alert for this event. pass a dictionary object containing
     * attributes corresponding to properties of
     * {@link org.urish.gwtit.titanium.android.calendar.alert}. returns the
     * created alert.
     * 
     * @param data Properties for the new alert, corresponding to properties of
     *            {@link com.emitrom.ti4j.mobile.client.android.calendar.Alert}
     * 
     */
    public Alert createAlert(Object data) {
        return new Alert(_createAlert(data));
    }

    private native JavaScriptObject _createAlert(Object data) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return this.createAlert(data);
    }-*/;

    /**
     * Create a reminder for this event. pass a dictionary object containing
     * attributes corresponding to properties of
     * {@link org.urish.gwtit.titanium.android.calendar.reminder}. returns the
     * created reminder.
     * 
     * @param data Properties for the new reminder, corresponding to properties
     *            of
     *            {@link com.emitrom.ti4j.mobile.client.android.calendar.Reminder}
     *            .
     */
    public final native Reminder createReminder(Object data) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return this.createReminder(data);
    }-*/;

    /**
     * Returns the value of the given extended property key string.
     * 
     * @param name The name of the extended property whose value should be
     *            returned.
     */
    public final native String getExtendedProperty(String name) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getExtendedProperty(name);
    }-*/;

    /**
     * Set the value of the named extended property.
     * 
     * @param name The name of the extended property whose value should be set.
     * @param value The value to which to set the named extended property.
     */
    public final native void setExtendedProperty(String name, String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.setExtendedProperty(name, value);
    }-*/;

}