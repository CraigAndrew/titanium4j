/**************************************************************************
   VisibleEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.ui.View;

public class VisibleEvent extends UIEvent {

    public static final String VISIBLE = "visible";

    protected VisibleEvent() {

    }

    /**
     * for view view type, the button that is automatically wired to control the
     * master view popover
     */
    public final native View getButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.button;
		return @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * for either popover or detail view types, the popover instance
     */
    public final native <T> T getPopover() /*-{
		return this.popover;
    }-*/;

    /**
     * the type of view becoming visible. either master, popover or detail.
     */
    public final native <T> T getView() /*-{
		return this.view;
    }-*/;

}
