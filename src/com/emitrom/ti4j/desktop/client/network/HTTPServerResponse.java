/************************************************************************
  HTTPServerResponse.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
 * An object representing a single HTTP server response.
 * 
 * @author Ekambi
 * 
 */
public class HTTPServerResponse extends JavaScriptObject {

  protected HTTPServerResponse() {

  }

  /**
   * add a cookie to this response
   * 
   * @param name, the cookie name
   * @param value, the cookie value
   * @return
   */
  public final native String addCookie(String name, String value)/*-{
		return this.addCookie(name, value);
  }-*/;

  /**
   * 
   * add a cookie to this response
   * 
   * @param name, the cookie name
   * @param value, the cookie value
   * @param maxAge,the cookie's maximum age
   * @return
   */
  public final native String addCookie(String name, String value, int maxAge)/*-{
		return this.addCookie(name, value, maxAge);
  }-*/;

  /**
   * 
   * add a cookie to this response
   * 
   * @param name, the cookie name
   * @param value, the cookie value
   * @param maxAge,the cookie's maximum age
   * @param domain, the cookie's domain
   * @return
   */
  public final native String addCookie(String name, String value, int maxAge, String domain)/*-{
		return this.addCookie(name, value, maxAge, domain);
  }-*/;

  /**
   * 
   * add a cookie to this response
   * 
   * @param name, the cookie name
   * @param value, the cookie value
   * @param maxAge,the cookie's maximum age
   * @param domain, the cookie's domain
   * @param path, the cookie's path
   * @return
   */
  public final native String addCookie(String name, String value, int maxAge, String domain,
      String path)/*-{
		return this.addCookie(name, value, maxAge, domain, path);
  }-*/;

  /**
   * set the content length of this response
   * 
   * @param length, the content length
   * @return
   */
  public final native String setContentLength(int length)/*-{
		return this.setContentLength(length);
  }-*/;

  /**
   * set the content type of this response
   * 
   * @param type, the content type, i.e "text/plain"
   * @return
   */
  public final native String setContentType(String type)/*-{
		return this.setContentType(type);
  }-*/;

  /**
   * set an HTTP header of this response
   * 
   * @param name,the header name
   * @param value,the header value
   * @return
   */
  public final native String setHeader(String name, String value)/*-{
		return this.setHeader(name, value);
  }-*/;

  /**
   * set the reason of this response
   * 
   * @param reason, the reason, i.e "OK"
   * @return
   */
  public final native String setReason(String reason)/*-{
		return this.setReason(reason);
  }-*/;

  /**
   * set the status of this response
   * 
   * @param value, the status, i.e "200"
   * @return
   */
  public final native String setStatus(String value)/*-{
		return this.setStatus(value);
  }-*/;

  /**
   * set the status and reason of this response
   * 
   * @param status, the status, i.e "200"
   * @param reason, the reason, i.e "OK"
   * @return
   */
  public final native String setStatusAndReason(String status, String reason)/*-{
		return this.setStatusAndReason(status, reason);
  }-*/;

  /**
   * 
   * write content into this response
   * 
   * @param data, content to write (can be string or bytes content)
   * @return
   */
  public final native String write(String data)/*-{
		return this.write(data);
  }-*/;

}
