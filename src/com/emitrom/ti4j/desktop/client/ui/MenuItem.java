/************************************************************************
 * MenuItem.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
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

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;

public class MenuItem extends ProxyObject {

    protected MenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    public MenuItem(String label) {
        jsObj = createItem(label);
    }

    public MenuItem(String label, Function callback) {
        jsObj = createItem(label, callback);
    }

    public MenuItem(String label, Function callback, String icon) {
        jsObj = createItem(label, callback, icon);
    }

    public final native MenuItem addCheckItem(String label)/*-{
		return this.addCheckItem(label);
    }-*/;

    public final MenuItem addCheckItem(String label, TiEventListener<?> eventListener) {
        return this.addCheckItem(label, eventListener.getJsoPeer());
    }

    public final native MenuItem addCheckItem(String label, JavaScriptObject eventListener)/*-{
		return this.addCheckItem(label, eventListener);
    }-*/;

    public final native MenuItem addItem(String label)/*-{
		return this.addItem(label);
    }-*/;

    public final MenuItem addItem(String label, TiEventListener<?> eventListener) {
        return this.addItem(label, eventListener.getJsoPeer());
    }

    public final native MenuItem addItem(String label, JavaScriptObject eventListener)/*-{
		return this.addItem(label, eventListener);
    }-*/;

    public final MenuItem addItem(String label, TiEventListener<?> eventListener, String iconURL) {
        return this.addItem(label, eventListener.getJsoPeer(), iconURL);
    }

    public final native MenuItem addItem(String label, JavaScriptObject eventListener, String iconURL)/*-{
		return this.addItem(label, eventListener, iconURL);
    }-*/;

    public final native void addSeparatorMenuItem()/*-{
		this.addSeparatorMenuItem();
    }-*/;

    public final native String disable()/*-{
		return this.disable();
    }-*/;

    public final native String enable()/*-{
		return this.enable();
    }-*/;

    public final native String getAutoCheck(boolean autoCheck)/*-{
		return this.getAutoCheck(autoCheck);
    }-*/;

    public final native String getIcon()/*-{
		return this.getIcon();
    }-*/;

    public final native String getLabel()/*-{
		return this.getLabel();
    }-*/;

    public final native boolean getState()/*-{
		return this.getState();
    }-*/;

    public final native Menu getSubMenu()/*-{
		return this.getSubMenu();
    }-*/;

    public final native boolean isCheck()/*-{
		return this.isCheck();
    }-*/;

    public final native boolean isEnabled()/*-{
		return this.isEnabled();
    }-*/;

    public final native boolean isSeparator()/*-{
		return this.isSeparator();
    }-*/;

    public final native String setAutoCheck(boolean value)/*-{
		return this.setAutoCheck(value);
    }-*/;

    public final native String setIcon(String iconURL)/*-{
		return this.setIcon(iconURL);
    }-*/;

    public final native String setLabel(String label)/*-{
		return this.setLabel(label);
    }-*/;

    public final native String setState(boolean state)/*-{
		return this.setState(state);
    }-*/;

    public final native String setSubMenu(Menu menu)/*-{
		return this.setSubMenu(menu);
    }-*/;

    private native JavaScriptObject createItem(String label)/*-{
		return Ti, UI.createMenuItem(label);
    }-*/;

    private native JavaScriptObject createItem(String label, Function eventHanler)/*-{
		return Ti, UI.createMenuItem(label, function(e) {
			eventHandler.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    private native JavaScriptObject createItem(String label, Function eventHanler, String iconUrl)/*-{
		return Ti, UI.createMenuItem(label, function(e) {
			eventHandler.@com.emitrom.ti4j.core.client.Function::execute()();
		}, iconUrl);
    }-*/;

}
