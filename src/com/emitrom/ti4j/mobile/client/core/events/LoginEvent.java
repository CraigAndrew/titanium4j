/**************************************************************************
   LoginEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

public class LoginEvent extends TiEvent {

    public static final String LOGIN = "login";

    protected LoginEvent() {

    }

    /**
     * the user id returned by Facebook if the login was successful.
     */
    public final native int getUid() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.uid;
    }-*/;

    /**
     * true if the login was successful
     */
    public final native boolean isSuccess() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.success;
    }-*/;

    /**
     * data returned by Facebook when we query for the uid (using graph path
     * "me") after successful login. Data is in JSON format. Includes
     * information such as user name, locale and gender.
     */
    public final native <T> T getData() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.data;
    }-*/;

    /**
     * error message if success was false
     */
    public final native String getError() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.error;
    }-*/;

    /**
     * true if the user cancelled the request by closing the dialog
     */
    public final native boolean isCancelled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancelled;
    }-*/;
}
