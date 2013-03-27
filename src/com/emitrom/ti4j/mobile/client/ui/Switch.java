/**************************************************************************
   Switch.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.SwitchChangeHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasTitle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A switch component
 */
public class Switch extends View implements HasTitle {

    public Switch() {
        createPeer();
    }

    Switch(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Switch(String title) {
        this();
        setTitle(title);
    }

    /**
     * @return Boolean for the state of the switch
     */
    public native boolean isEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    /**
     * @return One of com.emitrom.ti4j.mobile.client.ui.android.Androif.
     *         SWITCH_STYLE_CHECKBOX or com.emitrom.ti4j.mobile.client.ui
     *         .android.Androif.SWITCH_STYLE_TOGGLE_BUTTON (default). (android
     *         only)
     * 
     */
    public native int getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.style;
    }-*/;

    public native void setStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.style = value;
    }-*/;

    /**
     * @return Text to display with checkbox. used if style is
     *         com.emitrom.gwt.appcelerator
     *         .mobile.client.ui.android.Androif.SWITCH_STYLE_CHECKBOX (android
     *         only)
     * 
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return Text to display when value is 'false'. used if style is
     *         com.emitrom.ti4j.mobile.client.ui.android.Androif.
     *         SWITCH_STYLE_TOGGLE_BUTTON (android only)
     * 
     */
    public native String getTitleOff() /*-{
		return jso.titleOff;
    }-*/;

    public native void setTitleOff(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleOff = value;
    }-*/;

    /**
     * @return Text to display when value is 'true'. Used if style is
     *         com.emitrom.ti4j.mobile.client.ui.android.Androif.
     *         SWITCH_STYLE_TOGGLE_BUTTON (android only)
     * 
     */
    public native String getTitleOn() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titleOn;
    }-*/;

    public native void setTitleOn(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleOn = value;
    }-*/;

    /**
     * @return Boolean value of the switch where true is the switch is on and
     *         false the switch if off
     */
    public native boolean getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    public native void addChangeHandler(SwitchChangeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.SwitchEvent::CHANGE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.SwitchEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.SwitchChangeHandler::onChange(Lcom/emitrom/ti4j/mobile/client/core/events/ui/SwitchEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createSwitch();
    }

    public static Switch from(ProxyObject proxy) {
        return new Switch(proxy.getJsObj());
    }

}
