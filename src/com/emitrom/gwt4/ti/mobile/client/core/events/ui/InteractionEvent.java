/**************************************************************************
   InteractionEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.gwt4.ti.mobile.client.core.events.ui;

import com.emitrom.gwt4.ti.mobile.client.core.events.TiEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class InteractionEvent extends TiEvent {

    public static String CLICK = "click";
    public static String LONG_CLICK = "longclick";
    public static String DOUBLE_CLICK = "dblclick";
    public static final String DOUBLE_TAP = "doubletap";
    public static final String SINGLE_TAP = "singletap";
    public static final String TWO_FINGER_TAP = "twofingertap";
    public static final String LONG_PRESS = "longpress";
    public static final String SWIPE = "swipe";
    public static final String TOUCH_CANCEL = "touchcancel";
    public static final String TOUCH_END = "touchend";
    public static final String TOUCH_MOVE = "touchmove";
    public static final String TOUCH_START = "touchstart";

    protected InteractionEvent() {

    }

    private InteractionEvent(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    /**
     * boolean to indicate if the cancel button was pressed
     */
    public final native boolean isCancel() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancel;
    }-*/;

    /**
     * the button index that was pressed
     */
    public final native int getIndex() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.index;
    }-*/;

}
