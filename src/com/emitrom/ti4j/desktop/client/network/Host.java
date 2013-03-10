/************************************************************************
  Host.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
 * An object representing a host on the network.
 * 
 * @author Ekambi
 * 
 */
public class Host extends JavaScriptObject {

  protected Host() {

  }

  /**
   * Returns the list of address for a Host object
   * 
   * @return
   */
  public final native JsArrayString getAddresses()/*-{
		return this.getAddresses();
  }-*/;

  /**
   * Returns the list of aliases for a Host object
   * 
   * @return
   */
  public final native JsArrayString getAliases()/*-{
		return this.getAliases();
  }-*/;

  /**
   * Return the hostname of a Host object
   * 
   * @return
   */
  public final native String getName()/*-{
		return this.getName();
  }-*/;

  /**
   * Checks whether the Host object is invalid
   * 
   * @return
   */
  public final native boolean isInvalid()/*-{
		return this.isInvalid();
  }-*/;

  /**
   * Returns a string representation of a Host object
   * 
   * @return
   */
  public final native String getStringRepresentation()/*-{
		return this.toString();
  }-*/;

}
