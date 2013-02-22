/**************************************************************************
   TiEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events;

import com.emitrom.ti4j.mobile.client.core.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class TiEvent extends ProxyObject {

    public static final String POST_LAYOUT = "postlayout";

    public TiEvent() {
        jsObj = JsoHelper.createObject();
    }

    private TiEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native ProxyObject getSource() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.source;
		var toReturn = @com.emitrom.ti4j.mobile.client.core.ProxyObject::create(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void preventDefault() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.preventDefault();
    }-*/;

    public native void stopPropagation() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.stopPropagation();
    }-*/;

    public native String getType() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.type;
    }-*/;

    public native void setEventData(EventData data) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var attribute = @com.emitrom.ti4j.mobile.client.core.events.EventData::DATA_ATTRIBUTE;
		jso[attribute] = data.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    public native EventData getEventData() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var attribute = @com.emitrom.ti4j.mobile.client.core.events.EventData::DATA_ATTRIBUTE;
		var toReturn = jso[attribute];
		return @com.emitrom.ti4j.mobile.client.core.events.EventData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
    }-*/;

}
