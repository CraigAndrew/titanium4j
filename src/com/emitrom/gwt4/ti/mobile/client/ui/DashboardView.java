/**************************************************************************
   DashboardView.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui;

import java.util.ArrayList;

import com.emitrom.gwt4.ti.mobile.client.core.ProxyObject;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DashboardItemHandler;
import com.emitrom.gwt4.ti.mobile.client.ui.interfaces.Editable;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The dashboard view provides a view that supports the ability to have
 * springboard-like view of icons which can be reordered by dragging and can
 * contain multiple pages of icons in a scrollable view.
 * <p>
 * 
 * Available only on iOS
 */
public class DashboardView extends View implements Editable {

    public DashboardView() {
        createPeer();
    }

    DashboardView(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return An array of
     *         {@link com.emitrom.gwt4.ti.mobile.client.ui.DashboardItem}
     *         objects to display in the view
     */
    public ArrayList<DashboardItem> getData() {
        ArrayList<DashboardItem> items = new ArrayList<DashboardItem>();
        JsArray<JavaScriptObject> values = _getData();
        for (int i = 0; i < values.length(); i++) {
            items.add(new DashboardItem(values.get(i)));
        }
        return items;
    }

    private native JsArray<JavaScriptObject> _getData() /*-{
		var jso = jso.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.data;
    }-*/;

    public void setData(ArrayList<DashboardItem> data) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DashboardItem item : data) {
            values.push(item.getJsObj());
        }
        _setData(values);
    }

    public void setData(DashboardItem... data) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (DashboardItem item : data) {
            values.push(item.getJsObj());
        }
        _setData(values);
    }

    private native void _setData(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.data = value;
    }-*/;

    /**
     * @return True (default) to wobble during edit, false to disable wobble
     *         effect
     */
    public native boolean wobble() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.wobble;
    }-*/;

    public native void setWobble(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.wobble = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.gwt4.ti.mobile.client.ui.Editable#startEditing()
     */
    @Override
    public native void startEditing() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.startEditing();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.gwt4.ti.mobile.client.ui.Editable#stopEditing()
     */
    @Override
    public native void stopEditing() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.stopEditing();
    }-*/;

    public native void addDeleteHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.ui.dashboard.DashboardEvent::DELETE,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    public native void addMoveHandler(DashboardItemHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.ui.dashboard.DashboardEvent::MOVE,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.dashboard.DashboardEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DashboardItemHandler::onEvent(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/dashboard/DashboardEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createDashboardView();
    }

    public static DashboardView from(ProxyObject proxy) {
        return new DashboardView(proxy.getJsObj());
    }
}
