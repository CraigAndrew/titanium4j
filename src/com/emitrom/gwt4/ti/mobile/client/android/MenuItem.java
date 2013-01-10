/**************************************************************************
   MenuItem.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.android;

import com.emitrom.gwt4.ti.mobile.client.core.JsoHelper;
import com.emitrom.gwt4.ti.mobile.client.core.events.EventDispatcher;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an AndroidMedia MenuItem
 */
public class MenuItem extends EventDispatcher {

    public MenuItem() {
        jsObj = JsoHelper.createObject();
    }

    public MenuItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * retrieve the condensed title of the item
     * 
     * @return
     */
    public final native String getCondensedTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getCondensedTitle();
    }-*/;

    /**
     * retrieve the groupId for this item
     * 
     * @return
     */
    public final native int getGroupId() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getGroupId();
    }-*/;

    /**
     * retrieve the itemId for this item
     * 
     * @return
     */
    public final native int getItemId() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getItemId();
    }-*/;

    /**
     * retrieve the title of the item
     * 
     * @return
     */
    public final native String getTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getTitle();
    }-*/;

    /**
     * retrieve the enabled state of the menu
     * 
     * @return
     */
    public final native boolean isEnable() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.isEnable();
    }-*/;

    /**
     * retrieve the visible state of the menu
     * 
     * @return
     */
    public final native boolean isVisible() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.isVisible();
    }-*/;

    /**
     * set the condensed title for the item
     * 
     * @param value , new condensed title
     */
    public final native void setCondensedTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setCondensedTitle(value);
    }-*/;

    /**
     * set the enabled state of the item
     * 
     * @param value , true to enable item, false to disable
     */
    public final native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setEnabled(value);
    }-*/;

    /**
     * set the icon for the item
     * 
     * @param value , icon to use with the item
     */
    public final native void setIcon(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setIcon(value);
    }-*/;

    /**
     * set the title for the item
     * 
     * @param value , new title
     */
    public final native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.setTitle(value);
    }-*/;

    /**
     * set the visible state of the item
     * 
     * @param value , true to show the item, false to hide
     */
    public final native void setVisible(boolean value) /*-{
		this.setVisible(value);
    }-*/;

    /**
     * retrieve the sort order
     * 
     * @return
     */
    public final native int getOrder() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getOrder();
    }-*/;

    public native void addClickHandler(InteractionHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::CLICK,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
						});
    }-*/;

}
