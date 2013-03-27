/**************************************************************************
   ScrollableViewEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui.scrollview;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.emitrom.ti4j.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

public class ScrollableViewEvent extends UIEvent {

    public static final String SCROLL = "scroll";

    protected ScrollableViewEvent() {

    }

    private ScrollableViewEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the current page index
     */
    public final native int getCurrentPage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.currentPage;
    }-*/;

    /**
     * the current page view
     */
    public final native View getView() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.view;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;
    
    public final native double getCurrentPageAsFloat() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.currentPageAsFloat;
    }-*/;

}
