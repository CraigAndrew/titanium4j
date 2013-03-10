/************************************************************************
  HTTPCookie.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
 * An object representing an HTTP cookie.
 * 
 * @author Ekambi
 * 
 */
public class HTTPCookie extends JavaScriptObject {

  protected HTTPCookie() {

  }

  /**
   * Get the cookie comment text
   * 
   * @return
   */
  public final native String getComment()/*-{
		return this.getComment();
  }-*/;

  /**
   * Get the domain for which the cookie is valid
   * 
   * @return
   */
  public final native String getDomain()/*-{
		return this.getDomain();
  }-*/;

  /**
   * Get the lifetime of the cookie, in seconds.
   * 
   * @return
   */
  public final native int getMaxAge()/*-{
		return this.getMaxAge();
  }-*/;

  /**
   * Get the cookie name
   * 
   * @return
   */
  public final native String getName()/*-{
		return this.getName();
  }-*/;

  /**
   * Get the subset of URLs to which this cookie applies
   * 
   * @return
   */
  public final native String getPath()/*-{
		return this.getPath();
  }-*/;

  /**
   * Get the cookie value
   * 
   * @return
   */
  public final native String getValue()/*-{
		return this.getValue();
  }-*/;

  /**
   * Identifies to which version of the state management specification the
   * cookie conforms. 0 = netscape 1 = RFC2109
   * 
   * @return
   */
  public final native int getVersion()/*-{
		return this.getVersion();
  }-*/;

  /**
   * Check if the http only flag is set on the cookie
   * 
   * @return
   */
  public final native boolean isHTTPOnly()/*-{
		return this.isHTTPOnly();
  }-*/;

  /**
   * Check if the secure flag is set on the cookie
   * 
   * @return
   */
  public final native boolean isSecure()/*-{
		return this.isSecure();
  }-*/;

  /**
   * Set the cookie comment text
   * 
   * @param value, text to set as comment
   * @return
   */
  public final native String setComment(String value)/*-{
		return this.setComment(value);
  }-*/;

  /**
   * Set the domain for which the cookie is valid
   * 
   * @param value, the domain to set
   * @return
   */
  public final native String setDomain(String value)/*-{
		return this.setDomain(value);
  }-*/;

  /**
   * Set the http only flag on the cookie
   * 
   * @param value, if True sets the http only flag
   * @return
   */
  public final native String setHTTPOnly(boolean value)/*-{
		return this.setHTTPOnly(value);
  }-*/;

  /**
   * Set the lifetime of the cookie, in seconds.
   * 
   * @param value, the lifetime in seconds. 0 = discard
   * @return
   */
  public final native String setMaxAge(int value)/*-{
		return this.setMaxAge(value);
  }-*/;

  /**
   * Set the cookie name
   * 
   * @param value, name of the cookie
   * @return
   */
  public final native String setName(String value)/*-{
		return this.setName(value);
  }-*/;

  /**
   * Set the subset of URLs to which this cookie applies
   * 
   * @param value, the path to set
   * @return
   */
  public final native String setPath(String value)/*-{
		return this.setPath(value);
  }-*/;

  /**
   * Set the secure flag on the cookie
   * 
   * @param value, if True makes the cookie secure
   * @return
   */
  public final native String setSecure(boolean value)/*-{
		return this.setSecure(value);
  }-*/;

  /**
   * Set the cookie value
   * 
   * @param newValue, value to set cookie
   * @return
   */
  public final native String setValue(String newValue)/*-{
		return this.setValue(newValue);
  }-*/;

  /**
   * Set the state management specifiction version the cookie conforms.
   * (Default: 0)
   * 
   * @param value, cookie version (0 or 1)
   * @return
   */
  public final native String setVersion(int value)/*-{
		return this.setVersion(value);
  }-*/;

  /**
   * return a string representation of the cookie
   * 
   * @return
   */
  public final native String stringValue()/*-{
		return this.toString();
  }-*/;

}
