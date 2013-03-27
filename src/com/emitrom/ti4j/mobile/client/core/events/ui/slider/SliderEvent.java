/**************************************************************************
   SliderEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events.ui.slider;

import com.emitrom.ti4j.mobile.client.core.Size;
import com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent;
import com.emitrom.ti4j.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;

public class SliderEvent extends UIEvent {

    public static final String CHANGE = "change";

    protected SliderEvent() {

    }

    protected SliderEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the new value of the slider
     */
    public final native String getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    /**
     * a dictionary with properties width and height of the size of the thumb.
     * Available with custom thumb image. (AndroidMedia)
     */
    public final native Size getThumbSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		var obj = jso.thumbSize;
		var toReturn = @com.emitrom.ti4j.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * a dictionary with properties x and y of the thumbs left-top corner in the
     * control Available with custom thumb image. (AndroidMedia)
     */
    public final native Point getThumbOffset() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()()
		var obj = jso.thumbOffset;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
