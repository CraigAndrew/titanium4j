/**************************************************************************
   TabEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui.tab;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.emitrom.ti4j.mobile.client.ui.Tab;
import com.google.gwt.core.client.JavaScriptObject;

public class TabEvent extends UIEvent {

    public static String FOCUS = "focus";

    protected TabEvent() {

    }

    TabEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the tab index
     */
    public native int getIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.index;
    }-*/;

    /**
     * the previous tab index
     */
    public native int getPreviousIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.previousIndex;
    }-*/;

    /**
     * the tab object
     */
    public native Tab getTab() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.tab;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Tab::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * the previous tab object
     */
    public native Tab getPreviousTab() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.previousTab;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Tab::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
