/**************************************************************************
   Popover.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui.ipad;

import java.util.ArrayList;

import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.HideHandler;
import com.emitrom.gwt4.ti.mobile.client.ui.Button;
import com.emitrom.gwt4.ti.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A popover is used to manage the presentation of content in a popover. You use
 * popovers to present information temporarily but in a way that does not take
 * over the entire screen like a modal view does. the popover content is layered
 * on top of your existing content in a special type of window. the popover
 * remains visible until the user taps outside of the popover window or you
 * explicitly dismiss it. The popover is created by the method
 * {@link com.emitrom.gwt4.ti.mobile.client.ui.ipad.IPad.createPopover}.
 * (http://img.skitch.com/20100406-pmssjk1a3a65s6ui8qnbqi59c4.png)
 */
public class Popover extends View {

    public Popover() {
        createPeer();
    }

    /**
     * @return Return the arrow direction of the popover
     */
    public native int getArrowDirection() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.arrowDirection;
    }-*/;

    public native void setArrowDirection(int value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.arrowDirection = value;
    }-*/;

    /**
     * @return The left button in the nav area of the popover
     */
    public native Button getLeftNavButton() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.leftNavButton;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLeftNavButton(Button value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.leftNavButton = value.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The title of the nav area of the popover
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * Change the height of the popover
     * 
     * @param height height of the popover
     */
    public native void setHeight(int height) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setHeight(height);
    }-*/;

    /**
     * Set the passthrough views for the popover
     * 
     * @param passthroughViews array of views which the user can interact with
     *            while the popover is open (i.e. clicking on these views will
     *            interact with these views, and not dismiss the popover).
     */
    public void setPassthroughViews(ArrayList<View> views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View v : views) {
            values.push(v.getJsObj());
        }
        _setPassthroughViews(values);
    }

    public void setPassthroughViews(View... views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View v : views) {
            values.push(v.getJsObj());
        }
        _setPassthroughViews(values);
    }

    private native void _setPassthroughViews(JsArray<JavaScriptObject> passthroughViews) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setPassthroughViews(passthroughViews);
    }-*/;

    /**
     * Change the width of the popover
     * 
     * @param width width of the popover
     */
    public native void setWidth(int width) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setWidth(width);
    }-*/;

    public native void addHideHandler(HideHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.ui.UIEvent::HIDE,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.UIEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.HideHandler::onHide(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/UIEvent;)(eventObject);
						});
    }-*/;

    public native void show(JavaScriptObject options) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.show(options);
    }-*/;

    @Override
    public void createPeer() {
        jsObj = IPad.createPopover();
    }

}
