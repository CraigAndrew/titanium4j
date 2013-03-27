/**************************************************************************
   LoginButton.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The login button created by
 * {@link com.emitrom.ti4j.mobile.client.facebook.Facebook.createloginbutton}
 * . this is a facebook-themed button that does not require a click event
 * handler or any listeners. it "just works" and changes its label to reflect
 * the current state of the facebook session. for example, if the user is
 * already logged in, this button will show "logout".
 */
public class LoginButton extends View {

    private LoginButton(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return Set to "wide" to show a wider version of the button that displays
     *         "connect with facebook" instead of just "connect".
     */
    public final native String getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.style;
    }-*/;

    public final native void setStyle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.style = value;
    }-*/;

}
