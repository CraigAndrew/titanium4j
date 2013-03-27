/**************************************************************************
   LineChangeEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.core.handlers.media.LineChangeHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class LineChangeEvent extends TiEvent {

    public static final String LINE_CHANGE = "linechange";

	/**
	 * UiBinder implementations
	 */
	private static Type<LineChangeHandler> TYPE = new Type<LineChangeHandler>(LINE_CHANGE, null);
	public static Type<LineChangeHandler> getType() {
		return TYPE;
	}
	
	public static Type<LineChangeHandler> getAssociatedType() {
		return TYPE;
	}
	
    protected LineChangeEvent() {

    }

    LineChangeEvent(JavaScriptObject obj) {
        jsObj = obj;
    }
}
