/**************************************************************************
   DashboardItem.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.core.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DashboardItemHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasImage;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An item that represents a visual icon in the
 * {@link com.emitrom.ti4j.mobile.client.ui.DashboardView}. the dashboard
 * item is created by the method
 * {@link com.emitrom.ti4j.mobile.client.ui.UI.createDashboardItem}
 * 
 * Available only on iOS.
 */
public class DashboardItem extends EventDispatcher implements HasImage {

    public DashboardItem() {
    }

    public DashboardItem(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The badge value or 0 to remove the badge
     */
    public native int getBadge() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.badge;
    }-*/;

    public native void setBadge(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.badge = value;
    }-*/;

    /**
     * @return A boolean to indicate if jso item can be deleted when it edit
     *         mode
     */
    public native boolean canDelete() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.canDelete;
    }-*/;

    public native void setCanDelete(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.canDelete = value;
    }-*/;

    /**
     * @return The url to the image
     */
    public native String getImage() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.image;
    }-*/;

    public native void setImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.image = value;
    }-*/;

    /**
     * @return The url to the image to display when the item is depressed
     *         (clicked)
     */
    public native String getSelectedImage() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.selectedImage;
    }-*/;

    public native void setSelectedImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.selectedImage = value;
    }-*/;

    public native void addClickHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardEvent::CLICK,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addDeleteHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardEvent::DELETE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addMoveHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardEvent::MOVE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    private void createPeer() {
        jsObj = UI.createDashboardItem();
    }

    public static DashboardItem from(ProxyObject proxy) {
        return new DashboardItem(proxy.getJsObj());
    }

}
