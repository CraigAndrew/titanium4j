/**************************************************************************
   WebViewEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core.events.ui.webview;

import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class WebViewEvent extends UIEvent {

    public static final String BEFORE_LOAD = "beforeLoad";
    public static final String LOAD = "load";
    public static final String ERROR = "error";

    protected WebViewEvent() {

    }

    protected WebViewEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the url of the web document
     */
    public final native String getUrl() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.url;
    }-*/;

    /**
     * the error message
     */
    public final native String getMessage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.message;
    }-*/;
}
