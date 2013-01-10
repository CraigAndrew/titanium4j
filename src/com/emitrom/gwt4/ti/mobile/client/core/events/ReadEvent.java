/**************************************************************************
   ReadEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.core.events;

import com.emitrom.gwt4.ti.mobile.client.blob.Blob;
import com.emitrom.gwt4.ti.mobile.client.network.TCPSocket;

public class ReadEvent extends TiEvent {

    public static final String READ = "read";

    protected ReadEvent() {

    }

    /**
     * the reference for the socket that data was retrieved from
     */
    public final native TCPSocket getFrom() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.from;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.TCPSocket::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * a blob representing the data read, can be interpreted via toString
     */
    public final native Blob getData() /*-{
		var obj = this.data;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;
}
