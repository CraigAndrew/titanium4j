/**************************************************************************
   SplitWindow.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.ipad;

import com.emitrom.ti4j.mobile.client.ui.View;
import com.emitrom.ti4j.mobile.client.ui.Window;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasWidgets;

/**
 * A splitwindow is a window that manages the presentation of two side-by-side
 * view controllers. you use this class to implement a master-detail interface,
 * in which the left-side view presents a list of items and the right-side
 * presents details of the selected item. the splitview is for use exclusively
 * on ipad devices. the splitwindow is created by the method
 * {@link com.emitrom.ti4j.mobile.client.ui.ipad.Ipad.createSplitWindow}
 * .(http://img.skitch.com/20100406-1f85bm9cx8t768xgsjqax1ng6y.png)
 * <p>
 * The SplitWindow inherits its methods and properties from
 * <Titanium.UI.Window>.
 * 
 * The 'masterView' and 'detailView' properties are required in the constructor
 * of the SplitWindow and cannot be changed once set.
 * 
 * The SplitWindow is a top-level window and cannot be contained within another
 * window or view.
 */
public class SplitWindow extends Window {

    public SplitWindow(View detail, View master) {
        createPeer(detail, master);
    }

    /**
     * @return View for the detail view section of the splitwindow
     */
    public native View getDetailView() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.detailView;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setDetailView(HasWidgets value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.detailView = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return View for the master view section of the splitwindow
     */
    public native View getMasterView() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.masterView;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setMasterView(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.masterView = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return Whether or not to show the master view in portrait. default is
     *         'false'.
     * 
     */
    public native boolean showMasterInPortrait() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.showMasterInPortrait;
    }-*/;

    public native void setShowMasterInPortrait(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.showMasterInPortrait = value;
    }-*/;

    // public void addLoadHandler(TiEventListener<VisibleEvent> handler) {
    // this.addEventListener(VisibleEvent.VISIBLE, handler);
    // }

    private void createPeer(View detail, View master) {
        jsObj = IPad.createSplitWindow(detail, master);
    }

}
