/**************************************************************************
   TCPSocket.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.network;

import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Deprecated: use {@link com.emitrom.ti4j.mobile.client.network.TCP} where
 * possible. the TCPSocket instance returned from
 * {@link com.emitrom.ti4j.mobile.client.network.Network.createTCPSocket} .
 * This object represents a socket which either listens locally on the device
 * for connections, or connects to a remote machine.
 * 
 * <p>
 * Sockets are nontrivial; it is recommended that anyone using them be familiar
 * with the basics of BSD sockets. All sockets use TCP connections, and are
 * asynchronous for read operations, so your program should be ready to receive
 * 'read' events at any point. Socket references cannot be transferred to socket
 * objects, and vice-versa - socket references are an internal mechanism which
 * is used only to determine which sockets to send data to and read data from.
 * For listening sockets, it is highly recommended that you use the
 * Titanium.Network.INADDR_ANY constant as the host name. If a window containing
 * a socket is closed, the socket MUST be closed also unless you intend to
 * continue to receive data, otherwise the socket will consume resources (and
 * potentially cause conflicts with opening the window again, if a listener)
 * until the program is restarted. Be aware of the differences between the
 * listen() and connect() functions; attempting to use one when you mean the
 * other may result in errors, unpredictable behavior, or both.
 * 
 * Available only on iOs
 */
@Deprecated
public class TCPSocket extends EventDispatcher {

    private TCPSocket() {
    }

    private TCPSocket(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The host name to connect to. must be
     *         {@link com.emitrom.ti4j.mobile.client.network.Network.INADDR_ANY}
     *         or an identifier for the local device in order to listen
     */
    public native String getHostName() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hostName;
    }-*/;

    public native void setHostName(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hostName = value;
    }-*/;

    /**
     * @return Whether or not the socket is valid
     */
    public native boolean isValid() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isValid;
    }-*/;

    public native void setValid(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.isValid = value;
    }-*/;

    /**
     * @return The socket's mode
     */
    public native int getMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mode;
    }-*/;

    public native void setMode(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mode = value;
    }-*/;

    /**
     * @return The port to connect/listen on
     */
    public native int getPort() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.port;
    }-*/;

    public native void setPort(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.port = value;
    }-*/;

    /**
     * @return Strip terminating null character when sending string data;
     *         default is false
     */
    public native boolean hasStripTerminator() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.stripTerminator;
    }-*/;

    public native void setStripTerminator(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.stripTerminator = value;
    }-*/;

    /**
     * Close the socket
     */
    public native void close() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.close();
    }-*/;

    /**
     * Connect the scocket to a tcp server
     */
    public native void connect() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return this.connect();
    }-*/;

    /**
     * Set up the socket to receive connections
     */
    public native void listen() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.listen();
    }-*/;

    /**
     * Write data to the socket, if the mode is write_mode or read_write_mode
     * 
     * @param data either a string or blob object representing the data to be
     *            transferred
     * @param sendTo the socket reference to send the data to. Default is to
     *            send to all connected sockets
     */
    public native void write(Object data, int sendTo) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.write(data, sendTo);
    }-*/;

    // public void addReadHandler(TiEventListener<ReadEvent> handler) {
    // this.addEventListener(ReadEvent.READ, handler);
    // }
    //
    // public void addReadErrorHandler(TiEventListener<ReadErrorEvent> handler)
    // {
    // this.addEventListener(ReadErrorEvent.READ_ERROR, handler);
    // }
    //
    // public void addWriteErrorHandler(TiEventListener<WriteErrorEvent>
    // handler) {
    // this.addEventListener(WriteErrorEvent.WRITE_ERROR, handler);
    // }

}
