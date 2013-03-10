/************************************************************************
  HTTPServerRequest.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
import com.google.gwt.core.client.JsArrayString;

/**
 * An object representing a single HTTP server request.
 * 
 * @author Ekambi
 * 
 */
public class HTTPServerRequest extends JavaScriptObject {

  protected HTTPServerRequest() {

  }

  /**
   * the content length of this request
   * 
   * @return
   */
  public final native double getContentLength()/*-{
		return this.getContentLength();
  }-*/;

  /**
   * get the content type of this request
   * 
   * @return
   */
  public final native String getContentType()/*-{
		return this.getContentType();
  }-*/;

  /**
   * get an HTTP header value from this request
   * 
   * @param header, the header of the request
   * @return
   */
  public final native String getHeader(String header)/*-{
		return this.getHeader();
  }-*/;

  /**
   * get an HTTP header value from this request
   * 
   * @return
   */
  public final native JsArrayString getHeaders()/*-{
		return this.getHeaders();
  }-*/;

  /**
   * get the HTTP method of this request
   * 
   * @return
   */
  public final native String getMethod()/*-{
		return this.getMethod();
  }-*/;

  /**
   * get the URI of this request
   * 
   * @return
   */
  public final native String getURI()/*-{
		return this.getURI();
  }-*/;

  /**
   * get the HTTP version of this request
   * 
   * @return
   */
  public final native String getVersion()/*-{
		return this.getVersion();
  }-*/;

  /**
   * check to see if this request has an HTTP header
   * 
   * @param header, the header of the request to check
   * 
   * @return
   */
  public final native boolean hasHeader(String header)/*-{
		return this.hasHeader(header);
  }-*/;

  /**
   * read content from this request
   * 
   * @return
   */
  public final native String read()/*-{
		return this.read();
  }-*/;

  /**
   * read content from this request
   * 
   * @param length, the number of bytes to read (default 8096)
   * @return
   */
  public final native String read(int length)/*-{
		return this.read(length);
  }-*/;

}
