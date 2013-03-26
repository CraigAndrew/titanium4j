/************************************************************************
 * UI.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

package com.emitrom.ti4j.desktop.client.ui;

import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class UI extends JavaScriptObject {

    public static final int CENTERED = UI.CENTERED();

    protected UI() {

    }

    public static native UserWindow createWindow() /*-{
		return Ti.UI.createWindow();
    }-*/;

    public static native UserWindow createWindow(JavaScriptObject config) /*-{
		return Ti.UI.createWindow(config);
    }-*/;

    public static native Tray addTray(String iconURL)/*-{
		return Ti.UI.addTray(iconURL);
    }-*/;

    public static Tray addTray(String iconURL, TiEventListener<?> eventListener) {
        return UI.addTray(iconURL, eventListener.getJsoPeer());
    }

    private static native Tray addTray(String iconURL, JavaScriptObject eventListener)/*-{
		return Ti.UI.addTray(iconURL, eventListener);
    }-*/;

    public static native void clearTray()/*-{
		Ti.UI.clearTray();
    }-*/;

    public static CheckMenuItem createCheckMenuItem(String iconURL, TiEventListener<?> eventListener) {
        return UI.createCheckMenuItem(iconURL, eventListener.getJsoPeer());
    }

    private static native CheckMenuItem createCheckMenuItem(String iconURL, JavaScriptObject eventListener)/*-{
		return Ti.UI.createCheckMenuItem(iconURL, eventListener);
    }-*/;

    public static native Menu createMenu()/*-{
		return Ti.UI.createMenu();
    }-*/;

    public static native MenuItem createMenuItem(String label)/*-{
		return Ti.UI.createMenuItem(label);
    }-*/;

    public static MenuItem createMenuItem(String label, TiEventListener<?> eventListener) {
        return UI.createMenuItem(label, eventListener.getJsoPeer());
    }

    public static native MenuItem createMenuItem(String label, JavaScriptObject eventListener)/*-{
		return Ti.UI.createMenuItem(label, eventListener);
    }-*/;

    public static MenuItem createMenuItem(String label, TiEventListener<?> eventListener, String iconURL) {
        return UI.createMenuItem(label, eventListener.getJsoPeer(), iconURL);
    }

    public static native MenuItem createMenuItem(String label, JavaScriptObject eventListener, String iconURL)/*-{
		return Ti.UI.createMenuItem(label, eventListener, iconURL);
    }-*/;

    public static native SeparatorMenuItem createSeparatorMenuItem()/*-{
		return Ti.UI.createSeparatorMenuItem();
    }-*/;

    public static native Menu getContextMenu()/*-{
		return Ti.UI.getContextMenu();
    }-*/;

    public static native UserWindow getCurrentWindow()/*-{
		return Ti.UI.getCurrentWindow();
    }-*/;

    public static native double getIdleTime()/*-{
		return Ti.UI.getIdleTime();
    }-*/;

    public static native UserWindow getMainWindow()/*-{
		return Ti.UI.getMainWindow();
    }-*/;

    public static native Menu getMenu()/*-{
		return Ti.UI.getMenu();
    }-*/;

    public static native JsArray<UserWindow> getOpenWindows()/*-{
		return Ti.UI.getOpenWindows();
    }-*/;

    public static native JsArray<UserWindow> getWindows()/*-{
		return Ti.UI.getWindows();
    }-*/;

    public static native String setBadge(String text)/*-{
		return Ti.UI.setBadge(text);
    }-*/;

    public static native String setBadgeImage(String imageURL)/*-{
		return Ti.UI.setBadgeImage(imageURL);
    }-*/;

    public static native void setContextMenu(Menu value)/*-{
		Ti.UI.setContextMenu(value);
    }-*/;

    public static native String setDockIcon(String icon)/*-{
		return Ti.UI.setDockIcon(icon);
    }-*/;

    public static native String setDockMenu(Menu menu)/*-{
		return Ti.UI.setDockMenu(menu);
    }-*/;

    public static native String setIcon(String iconPath)/*-{
		return Ti.UI.setIcon(iconPath);
    }-*/;

    public static native String setMenu(Menu menu)/*-{
		return Ti.UI.setMenu(menu);
    }-*/;

    public static native Dialog showDialog()/*-{
		return Ti.UI.showDialog();
    }-*/;

    private static native int CENTERED()/*-{
		return Ti.UI.CENTERED();
    }-*/;

}
