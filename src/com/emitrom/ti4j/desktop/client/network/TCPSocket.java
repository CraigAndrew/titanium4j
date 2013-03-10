/************************************************************************
  TCPSocket.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.network;

import com.emitrom.ti4j.core.client.Function;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a TCP client socket connection.
 * 
 * @author Ekambi
 * 
 */
public class TCPSocket extends JavaScriptObject {

  protected TCPSocket() {

  }

  /**
   * Close this Network.TCPSocket connection. If there is no open connection
   * then do nothing. Return true if the connection was closed and false
   * otherwise.
   * 
   * @return
   */
  public final native boolean close()/*-{
		return this.close();
  }-*/;

  /**
   * Connect the Socket object to the host specified during creation. The
   * connection will be made asynchronously. Use onError to detect failures.
   * 
   * @return
   */
  public final native String connect()/*-{
		return this.connect();
  }-*/;

  /**
   * Check whether the Socket is closed.
   * 
   * @return
   */
  public final native boolean isClosed()/*-{
		return this.isClosed();
  }-*/;

  /**
   * Set the callback that will be fired when the Socket encounters an error.
   * 
   * @param callback, Function to be called when an error happens.
   * @return
   */
  public final native String onError(Function callback)/*-{
		return this
				.onError(function() {
					callback.@com.emitrom.ti4j.core.client.Function::execute()();
				});
  }-*/;

  /**
   * Set the callback that will be fired when the Socket encounters an error.
   * 
   * @param callback, Function to be called when an error happens.
   * @return
   */
  public final native String onRead(ReadCallback callback)/*-{
		return this
				.onRead(function(data) {
					callback.@com.emitrom.ti4j.desktop.client.network.ReadCallback::onRead(Ljava/lang/Object;)(data);
				});
  }-*/;

  /**
   * Set the callback function that will be fired when a read finishes. A read
   * is considered finished if some bytes have been read and a subsequent call
   * to read returns zero bytes.
   * 
   * @param callback, Function be called when a read completes.
   * @return
   */
  public final native String onReadComplete(ReadCallback callback)/*-{
		return this
				.onReadComplete(function(data) {
					callback.@com.emitrom.ti4j.desktop.client.network.ReadCallback::onRead(Ljava/lang/Object;)(data);
				});
  }-*/;

  /**
   * Set the callback that will be fired when an operation times out on the
   * Socket.
   * 
   * @param callback, Function to be called when an operation times out.
   * @return
   */
  public final native String onTimeout(Function callback)/*-{
		return this
				.onTimeout(function() {
					callback.@com.emitrom.ti4j.core.client.Function::execute()();
				});
  }-*/;

  /**
   * Set a callback that will be fired when data is written on the Socket.
   * 
   * @param callback,Function to be called when data is written.
   * @return
   */
  public final native String onWrite(WriteCallback callback)/*-{
		return this
				.onWrite(function(data) {
					callback.@com.emitrom.ti4j.desktop.client.network.WriteCallback::onWrite(Ljava/lang/Object;)(data);
				});
  }-*/;

  /**
   * Write data to the Socket's connection, if open.
   * 
   * @param data, The data to write to the connection.
   * @return
   */
  public final native boolean write(String data)/*-{
		return this.write(data);
  }-*/;

}
