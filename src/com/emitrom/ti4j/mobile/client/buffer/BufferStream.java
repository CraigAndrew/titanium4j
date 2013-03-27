/**************************************************************************
   BufferStream.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.buffer;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wrapper around Titanium.Buffer that implements the Titanium.IOstream
 * interface
 * 
 */
public class BufferStream extends Buffer {

    public BufferStream() {
        jsObj = JsoHelper.createObject();
    }

    public BufferStream(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native void close() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.close();
    }-*/;

    public native boolean isReadable() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isReadable();
    }-*/;

    public native boolean isWritable() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isWritable();
    }-*/;

    public native double read(Buffer buffer) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.read(buffer.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native double read(Buffer buffer, double offset) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.read(
						buffer.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						offset);
    }-*/;

    public native double read(Buffer buffer, double offset, double length) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.read(
						buffer.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						offset, length);
    }-*/;

    public native double write(Buffer buffer) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.write(buffer.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    public native double write(Buffer buffer, double offset) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.write(
						buffer.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						offset);
    }-*/;

    public native double write(Buffer buffer, double offset, double length) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.write(
						buffer.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						offset, length);
    }-*/;
}
