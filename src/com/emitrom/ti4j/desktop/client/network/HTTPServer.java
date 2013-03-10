/************************************************************************
  HTTPServer.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An implementation of an HTTPServer.
 * 
 * @author Ekambi
 * 
 */
public class HTTPServer extends JavaScriptObject {

  protected HTTPServer() {

  }

  /**
   * bind this server to a port on a specific interface
   * 
   * @param port, port to bind on
   * @param callback, callback for server logic (in seperate thread)
   * @return
   */

  public final native String bind(int port, BindCallback callback)/*-{
		return this
				.bind(
						port,
						function(request, response) {
							callback.@com.emitrom.ti4j.desktop.client.network.BindCallback::onBind(Lcom/emitrom/ti4j/desktop/client/network/HTTPServerRequest;Lcom/emitrom/ti4j/desktop/client/network/HTTPServerResponse;)(request, response);
						});
  }-*/;

  /**
   * bind this server to a port on a specific interface
   * 
   * @param port, port to bind on
   * @param address, address to bind to
   * @param callback, callback for server logic (in seperate thread)
   * @return
   */
  public final native String bind(int port, String address, BindCallback callback)/*-{
		return this
				.bind(
						port,
						address,
						function(request, response) {
							callback.@com.emitrom.ti4j.desktop.client.network.BindCallback::onBind(Lcom/emitrom/ti4j/desktop/client/network/HTTPServerRequest;Lcom/emitrom/ti4j/desktop/client/network/HTTPServerResponse;)(request, response);
						});
  }-*/;

  /**
   * close this server
   * 
   * @return
   */
  public final native String close()/*-{
		return this.close();
  }-*/;

  /**
   * check to see if this server socket is closed
   * 
   * @return
   */
  public final native boolean isClosed()/*-{
		return this.isClosed();
  }-*/;

}
