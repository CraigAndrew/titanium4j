/**************************************************************************
   GraphPathRequestArguments.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.facebook;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class GraphPathRequestArguments extends ProxyObject {

    public GraphPathRequestArguments() {
        jsObj = JsoHelper.createObject();
    }

    public GraphPathRequestArguments(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native boolean isSuccess() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.success;
    }-*/;

    public native String getError() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.error;
    }-*/;

    /**
     * @return The graph call path you specified
     */
    public native String getPath() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.path;
    }-*/;

    /**
     * @return The data returned by facebook
     */
    public native String getResult() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.result;
    }-*/;

}
