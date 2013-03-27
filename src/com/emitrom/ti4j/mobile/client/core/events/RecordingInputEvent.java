/**************************************************************************
   RecordingInputEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.core.handlers.media.RecordingInputHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class RecordingInputEvent extends TiEvent {

    public static final String RECORDING_INPUT = "recordinginput";

	/**
	 * UiBinder implementations
	 */
	private static Type<RecordingInputHandler> TYPE = new Type<RecordingInputHandler>(RECORDING_INPUT, null);
	public static Type<RecordingInputHandler> getType() {
		return TYPE;
	}
	
	public static Type<RecordingInputHandler> getAssociatedType() {
		return TYPE;
	}
	
    protected RecordingInputEvent() {

    }

    protected RecordingInputEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * bool indicating availability of recording device
     */
    public final native boolean isAvailable() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.available;
    }-*/;
}
