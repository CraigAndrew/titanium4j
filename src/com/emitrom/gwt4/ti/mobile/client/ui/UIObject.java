/**************************************************************************
   UIObject.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui;

import com.emitrom.gwt4.ti.mobile.client.core.events.EventDispatcher;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.EventHandler;

/**
 * Base class of all ui objects. Any subclass if this class muss implement the
 * way of creating the underlying titanium ui object by overriding the
 * <code>createPeer()</code> method.
 */
public abstract class UIObject extends EventDispatcher {
    public abstract void createPeer();

    /**
     * fired when a layout cycle completes
     * 
     * @param handler
     */
    public native void addPostLayoutHandler(EventHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.TiEvent::POST_LAYOUT,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.TiEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.EventHandler::onEvent(Lcom/emitrom/gwt4/ti/mobile/client/core/events/TiEvent;)(eventObject);
						});
    }-*/;
}