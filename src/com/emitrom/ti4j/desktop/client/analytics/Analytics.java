/************************************************************************
 * Analytics.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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
package com.emitrom.ti4j.desktop.client.analytics;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

public class Analytics extends JavaScriptObject {

    protected Analytics() {

    }

    /**
     * Send an analytics event associated with application feature
     * functionality.
     * 
     * @param name
     *            , Feature name.
     * @param data
     *            , Extra event data to pass along. This will be converted to
     *            JSON.
     */
    public static native void featureEvent(String name, JavaScriptObject data)/*-{
		Ti.Analytics.featureEvent(name, data);
    }-*/;

    public static native void navEvent(String from, String to)/*-{
		Ti.Analytics.navEvent(from, to);
    }-*/;

    public static native void navEvent(String from, String to, String name)/*-{
		Ti.Analytics.navEvent(from, to, name);
    }-*/;

    // public static void navEvent(String from, String to, String name,
    // ComplexCollectionItem data) {
    // Analytics.navEvent(from, to, name, data.eval());
    // }

    public static native void navEvent(String from, String to, String name, JavaScriptObject data)/*-{
		Ti.Analytics.navEvent(from, to, name, data);
    }-*/;

    // public static String settingsEvent(String name, ComplexCollectionItem
    // data) {
    // return Analytics.settingsEvent(name, data.eval());
    // }

    public static native String settingsEvent(String name, JavaScriptObject data)/*-{
		return Ti.Analytics.settingsEvent(name, data);
    }-*/;

    // public static String timedEvent(String event, JsDate start, JsDate stop,
    // double duration,
    // ComplexCollectionItem data) {
    // return Analytics.timedEvent(event, start, stop, duration, data.eval());
    // }

    public static native String timedEvent(String event, JsDate start, JsDate stop, double duration,
                    JavaScriptObject data)/*-{
		return Ti.Analytics
				.timedEvent(event, start, stop, duration, data);
    }-*/;

    // public static String userEvent(String name, ComplexCollectionItem data) {
    // return Analytics.userEvent(name, data.eval());
    // }

    public static native String userEvent(String name, JavaScriptObject data)/*-{
		return Ti.Analytics.userEvent(name, data);
    }-*/;

}
