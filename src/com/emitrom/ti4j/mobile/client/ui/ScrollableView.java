/**************************************************************************
   ScrollableView.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ScrollableViewScrollHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The scrollable view provides a view that supports horizontal scrolling on one
 * or more views in a gesture motion. the scrollable view also optionally
 * supports a visual paging control to indicate the page that the view is
 * visible.
 */
public class ScrollableView extends View {

    public ScrollableView() {
        createPeer();
    }

    ScrollableView(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return The number of views to cache (prerender). views are rendered in
     *         the range (currentpage +/- (cachesize - 1)/2), rounded down for
     *         even values (i.e. cachesize=4 renders 3 views into the cache).
     *         keep in mind that improved performance (larger cache) will lead
     *         to faster performance, but more memory usage. ios only.
     */
    public native int getCacheSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cacheSize;
    }-*/;

    public native void setCacheSize(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.cacheSize = value;
    }-*/;

    /**
     * @return The current page visible in the view
     */
    public native int getCurrentPage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.currentPage;
    }-*/;

    public native void setCurrentPage(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.currentPage = value;
    }-*/;

    /**
     * @return Disable view bouncing. ios only. Available on iOs only
     */
    public native boolean disableBounce() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.disableBounce;
    }-*/;

    public native void setDisableBounce(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.disableBounce = value;
    }-*/;

    /**
     * @return The maximum zoom scale for the view Available on iOs only
     */
    public native double getMaxZoomScale() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.maxZoomScale;
    }-*/;

    public native void setMaxZoomScale(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.maxZoomScale = value;
    }-*/;

    /**
     * @return The minimum zoom scale for the view Available on iOs only
     */
    public native double getMinZoomScale() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.minZoomScale;
    }-*/;

    public native void setMinZoomScale(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.minZoomScale = value;
    }-*/;

    /**
     * @return The color of the paging control. defaults to black.
     */
    public native String getPagingControlColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.pagingControlColor;
    }-*/;

    public native void setPagingControlColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.pagingControlColor = value;
    }-*/;

    /**
     * @return The height in pixels of the paging control, if visible. defaults
     *         to 20
     */
    public native double getPagingControlHeight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.pagingControlHeight;
    }-*/;

    public native void setPagingControlHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.pagingControlHeight = value;
    }-*/;

    /**
     * @return Boolean to indicate whether the paging control ui is visible
     */
    public native boolean showPagingControl() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.showPagingControl;
    }-*/;

    public native void setShowPagingControl(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.showPagingControl = value;
    }-*/;

    /**
     * @return Array of view objects to place in the view
     */
    public List<View> getViews() {
        List<View> views = new ArrayList<View>();
        JsArray<JavaScriptObject> values = _getViews();
        for (int i = 0; i < values.length(); i++) {
            views.add(new View(values.get(i)));
        }
        return views;
    }

    private native JsArray<JavaScriptObject> _getViews() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.views;
    }-*/;

    public void setViews(List<View> views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View v : views) {
            values.push(v.getJsObj());
        }
        _setViews(values);
    }

    public void setView(View... views) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (View v : views) {
            values.push(v.getJsObj());
        }
        _setViews(values);
    }

    private native void _setViews(JavaScriptObject value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.views = value;
    }-*/;

    /**
     * Add a new view to the scrollable view
     * 
     * @param view
     *            the view to add
     */
    public native void addView(View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addView(view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Remove an existing view from the scrollable view
     * 
     * @param view
     *            the view to remove
     */
    public native void removeView(View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.removeView(view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Scroll to a specific view
     * 
     * @param view
     *            either an integer index or the view object to bring into view
     *            as the currentPage
     */
    public native void scrollToView(View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.scrollToView(view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native void addScrollHandler(ScrollableViewScrollHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.scrollview.ScrollableViewEvent::SCROLL,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.scrollview.ScrollableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.ScrollableViewScrollHandler::onScroll(Lcom/emitrom/ti4j/mobile/client/core/events/ui/scrollview/ScrollableViewEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createScrollableView();
    }

    public static ScrollableView from(ProxyObject proxy) {
        return new ScrollableView(proxy.getJsObj());
    }

}
