/**************************************************************************
   AndroidCalendar.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.android.calendar;

import java.util.ArrayList;

import com.emitrom.gwt4.ti.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsDate;

/**
 * An object which represents a single calendar in android
 */
public class AndroidCalendar extends EventDispatcher {

    public AndroidCalendar() {

    }

    public AndroidCalendar(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Whether the calendar is hidden.
     */
    public final native boolean isHidden() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return this.hidden;
    }-*/;

    public final native void setHidden(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.hidden = value;
    }-*/;

    /**
     * @return The id of the calendar.
     */

    public final native String getId() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.id;
    }-*/;

    public final native void setId(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		this.jso = value;
    }-*/;

    /**
     * @return The display name of the calendar.
     */
    public final native String getName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.name;
    }-*/;

    public final native void setName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.name = value;
    }-*/;

    /**
     * @return Whether the calendar is selected.
     */
    public final native boolean isSelected() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.selected;
    }-*/;

    public final native void setSelected(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.selected = value;
    }-*/;

    /**
     * Add an event to the calendar. returns the created
     * {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event}.
     * 
     * @param properties An object defining the properties of the event. These
     *            correspond to properties of
     *            {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event}
     *            .
     */
    public final native Event createEvent(Object option) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.createEvent(option);
    }-*/;

    /**
     * Returns the *
     * {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event} object
     * for the event with the given integer id.
     * 
     * @param id The integer id of the event to return.
     */
    public final native Event getEventById(int id) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getEventById(id);
    }-*/;

    /**
     * Returns an array of *
     * {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event} objects
     * with all events in the given date range.
     * 
     * @param date1 The start date.
     * @param date2 The end date.
     */
    public ArrayList<Event> getEventsBetweenDates(JsDate date1, JsDate date2) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsBetweenDates(date1, date2);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsBetweenDates(JsDate date1, JsDate date2) /*-{
		return this.getEventsBetweenDates(date1, date2);
    }-*/;

    /**
     * Returns an array of
     * {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event} objects
     * with all events on the given date.
     * 
     * @param year The year of the desired date.
     * @param month The month of the desired date. The month is zero-based,
     *            therefore January is 0 and December is 11.
     * @param day The day for which events should be returned.
     */
    public ArrayList<Event> getEventsInDate(int year, int month, int day) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsInDate(year, month, day);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsInDate(int year, int month, int day) /*-{
		return this.getEventsInDate(year, month, day);
    }-*/;

    /**
     * Returns an array of
     * {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event} objects
     * with all events in the given month.
     * 
     * @param year The year of the desired month.
     * @param month The month for which events should be returned. The month is
     *            zero-based, therefore January is 0 and December is 11.
     */
    public ArrayList<Event> getEventsInMonth(int year, int month) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsInMonth(year, month);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsInMonth(int year, int month) /*-{
		return this.getEventsInMonth(year, month);
    }-*/;

    /**
     * Returns an array of
     * {@link com.emitrom.gwt4.ti.mobile.client.android.calendar.Event} objects
     * with all events in the given year.
     * 
     * @param year The year for which all events should be returned.
     */

    public ArrayList<Event> getEventsInYear(int year) {
        ArrayList<Event> events = new ArrayList<Event>();
        JsArray<JavaScriptObject> array = _getEventsInYear(year);
        for (int i = 0; i < array.length(); i++) {
            events.add(new Event(array.get(i)));
        }
        return events;
    }

    private final native JsArray<JavaScriptObject> _getEventsInYear(int year) /*-{
		return this.getEventsInYear(year);
    }-*/;

}