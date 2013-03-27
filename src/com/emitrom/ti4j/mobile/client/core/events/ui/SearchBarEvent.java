/**************************************************************************
   SearchBarEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui;

import com.emitrom.ti4j.mobile.client.core.handlers.ui.SearchBarHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class SearchBarEvent extends UIEvent {
	//TODO verify this field...
    public static final String SCALE = "scale";

	/**
	 * UiBinder implementations
	 */
	private static Type<SearchBarHandler> TYPE = new Type<SearchBarHandler>(SCALE, null);
	public static Type<SearchBarHandler> getType() {
		return TYPE;
	}
	
	public static Type<SearchBarHandler> getAssociatedType() {
		return TYPE;
	}
	
    protected SearchBarEvent() {

    }

    private SearchBarEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the value of the field upon change
     */
    public final native String getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

}
