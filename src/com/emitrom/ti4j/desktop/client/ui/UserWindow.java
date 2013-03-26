/************************************************************************
 * UserWindow.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

public class UserWindow extends JavaScriptObject {

    protected UserWindow() {

    }

    public final native String close()/*-{
		return this.close();
    }-*/;

    public final native UserWindow createWindow()/*-{
		return this.createWindow();
    }-*/;

    public final native UserWindow createWindow(JavaScriptObject configObject)/*-{
		return this.createWindow(configObject);
    }-*/;

    public final native String focus()/*-{
		return this.focus();
    }-*/;

    public final native WindowBound getBounds()/*-{
		return this.getBounds();
    }-*/;

    public final native JsArray<UserWindow> getChildren()/*-{
		return this.getChildren();
    }-*/;

    public final native Menu getContextMenu()/*-{
		return this.getContextMenu();
    }-*/;

    public final native <T extends JavaScriptObject> T getDOMWindow()/*-{
		return this.getDOMWindow();
    }-*/;

    public final native double getHeight()/*-{
		return this.getHeight();
    }-*/;

    public final native String getID()/*-{
		return this.getID();
    }-*/;

    public final native String getIcon()/*-{
		return this.getIcon();
    }-*/;

    public final native double getMaxHeight()/*-{
		return this.getMaxHeight();
    }-*/;

    public final native double getMinWidth()/*-{
		return this.getMinWidth();
    }-*/;

    public final native UserWindow getParent()/*-{
		return this.getParent();
    }-*/;

    public final native String getTitle()/*-{
		return this.getTitle();
    }-*/;

    public final native double getTransparency()/*-{
		return this.getTransparency();
    }-*/;

    public final native String getURL()/*-{
		return this.getURL();
    }-*/;

    public final native double getWidth()/*-{
		return this.getWidth();
    }-*/;

    public final native double getX()/*-{
		return this.getX();
    }-*/;

    public final native double getY()/*-{
		return this.getY();
    }-*/;

    public final native boolean hasTransparentBackground()/*-{
		return this.hasTransparentBackground();
    }-*/;

    public final native String hide()/*-{
		return this.hide();
    }-*/;

    public final native boolean isActive()/*-{
		return this.isActive();
    }-*/;

    public final native boolean isClosable()/*-{
		return this.isClosable();
    }-*/;

    public final native boolean isDocumenzEdited()/*-{
		return this.isDocumenzEdited();
    }-*/;

    public final native boolean isFullScreen()/*-{
		return this.isFullScreen();
    }-*/;

    public final native boolean isMaximizable()/*-{
		return this.isMaximizable();
    }-*/;

    public final native boolean isMaximized()/*-{
		return this.isMaximized();
    }-*/;

    public final native boolean isMimimizable()/*-{
		return this.isMimimizable();
    }-*/;

    public final native boolean isMinimized()/*-{
		return this.isMinimized();
    }-*/;

    public final native boolean isResizable()/*-{
		return this.isResizable();
    }-*/;

    public final native boolean isTopMost()/*-{
		return this.isTopMost();
    }-*/;

    public final native boolean isUsingChrome()/*-{
		return this.isUsingChrome();
    }-*/;

    public final native boolean isVisible()/*-{
		return this.isVisible();
    }-*/;

    public final native String maximize()/*-{
		return this.maximize();
    }-*/;

    public final native String minimize()/*-{
		return this.minimize();
    }-*/;

    public final native String open()/*-{
		return this.open();
    }-*/;

    public final String openFileChooserDialog(TiEventListener<?> callback) {
        return this.openFileChooserDialog(callback.getJsoPeer());
    }

    public final native String openFileChooserDialog(JavaScriptObject callback)/*-{
		return this.openFileChooserDialog(callback);
    }-*/;

    public final String openFileChooserDialog(TiEventListener<?> callback, JavaScriptObject options) {
        return this.openFileChooserDialog(callback.getJsoPeer(), options);
    }

    public final native String openFileChooserDialog(JavaScriptObject callback, JavaScriptObject options)/*-{
		return this.openFileChooserDialog(callback, options);
    }-*/;

    public final String openSaveAsDialog(TiEventListener<?> callback) {
        return this.openSaveAsDialog(callback.getJsoPeer());
    }

    public final native String openSaveAsDialog(JavaScriptObject callback)/*-{
		return this.openSaveAsDialog(callback);
    }-*/;

    public final native String setBounds(JavaScriptObject bounds)/*-{
		return this.setBounds(bounds);
    }-*/;

    public final String setBounds(WindowBound bounds) {
        return this.setBounds(bounds);
    }

    public final String openSaveAsDialog(TiEventListener<?> callback, JavaScriptObject options) {
        return this.openSaveAsDialog(callback.getJsoPeer(), options);
    }

    public final native String openSaveAsDialog(JavaScriptObject callback, JavaScriptObject options)/*-{
		return this.openSaveAsDialog(callback, options);
    }-*/;

    public final native String setCloseable(boolean value)/*-{
		return this.setCloseable(value);
    }-*/;

    public final native String setContents(String value)/*-{
		return this.setContents(value);
    }-*/;

    public final native String setContents(String value, String baseURL)/*-{
		return this.setContents(value, baseURL);
    }-*/;

    public final native String setContextMenu(Menu menu)/*-{
		return this.setContextMenu(menu);
    }-*/;

    public final native void setDocumentEdited(boolean value)/*-{
		this.setDocumentEdited(value);
    }-*/;

    public final native String setFullscreen(boolean value)/*-{
		return this.setFullscreen(value);
    }-*/;

    public final native String setHeight(double value)/*-{
		return this.setHeight(value);
    }-*/;

    public final native String setIcon(String icon)/*-{
		return this.setIcon(icon);
    }-*/;

    public final native String setMaxHeight(double value)/*-{
		return this.setMaxHeight(value);
    }-*/;

    public final native String setMaxWidth(double value)/*-{
		return this.setMaxWidth(value);
    }-*/;

    public final native String setMaximizable(boolean value)/*-{
		return this.setMaximizable(value);
    }-*/;

    public final native <T> T setPluginsEnabled(boolean value)/*-{
		return this.setPluginsEnabled(value);
    }-*/;

    public final native String setResizable(boolean value)/*-{
		return this.setResizable(value);
    }-*/;

    public final native String setTitle(String value)/*-{
		return this.setTitle(value);
    }-*/;

    public final native String setTopMost(boolean value)/*-{
		return this.setTopMost(value);
    }-*/;

    public final native String setTransparency(double value)/*-{
		return this.setTransparency(value);
    }-*/;

    public final native String setURL(String value)/*-{
		return this.setURL(value);
    }-*/;

    public final native String setUsingChrome(boolean value)/*-{
		return this.setUsingChrome(value);
    }-*/;

    public final native String setVisible(boolean value)/*-{
		return this.setVisible(value);
    }-*/;

    public final native String setMenu(Menu menu)/*-{
		return this.setMenu(menu);
    }-*/;

    public final native String setMinWidth(double value)/*-{
		return this.setMinWidth(value);
    }-*/;

    public final native String setMinimizable(boolean value)/*-{
		return this.setMinimizable(value);
    }-*/;

    public final native String setWidth(double value)/*-{
		return this.setWidth(value);
    }-*/;

    public final native String setX(double x) /*-{
		return this.setX(x);
    }-*/;

    public final native String setY(int y) /*-{
		return this.setY(y);
    }-*/;

    public final native String show() /*-{
		return this.show();
    }-*/;

    public final native String showInspector()/*-{
		return this.showInspector();
    }-*/;

    public final native String showInspector(boolean console)/*-{
		return this.showInspector(console);
    }-*/;

    public final native String unfocus()/*-{
		return this.unfocus();
    }-*/;

    public final native String unmaximize()/*-{
		return this.unmaximize();
    }-*/;

    public final native String unminimize()/*-{
		return this.unminimize();
    }-*/;

    public final native boolean isDialog()/*-{
		return this.isDialog;
    }-*/;

}
