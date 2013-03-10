/************************************************************************
  Properties.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.app.properties;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object holding a group of properties. Properties may either be defined in
 * tiapp.xml (read-only) or in any other file on the filesystem. Ti
 * Properties offer an alternative to traditional HTML5 DOM storage.
 * 
 * @author Ekambi
 * 
 */
public class Properties extends JavaScriptObject {

  protected Properties() {

  }

  /**
   * Returns a property value as double. Throws an exception if this value can
   * not be found and no default is provided or the value stored in the
   * properties file could not be converted to the appropriate type.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   * @return
   */
  public final native double getDouble(String name, double defaultValue)/*-{
		return this.getDouble(name, defaultValue);
  }-*/;

  /**
   * Returns a property value as integer. Throws an exception if this value can
   * not be found and no default is provided or the value stored in the
   * properties file could not be converted to the appropriate type.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   * @return
   */
  public final native int getInt(String name, int defaultValue)/*-{
		return this.getInt(name, defaultValue);
  }-*/;

  /**
   * Returns a property value as an Array. Throws an exception if this value can
   * not be found and no default is provided or the value stored in the
   * properties file could not be converted to the appropriate type.
   * 
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   * @return
   */
  public final native <T> T getList(Object name, Object defaultValue)/*-{
		return this.getList(name, defaultValue);
  }-*/;

  /**
   * Returns a property value as string. Throws an exception if this value can
   * not be found and no default is provided or the value stored in the
   * properties file could not be converted to the appropriate type.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   * @return
   */
  public final native String getString(String name, String defaultValue)/*-{
		return this.string(name, defaultValue);
  }-*/;

  /**
   * Query whether or not a given property exists in this Property object.
   * 
   * @param name,The name of the property to return.
   * @return
   */
  public final native boolean hasProperty(String name)/*-{
		return this.hasProperty(name);
  }-*/;

  /**
   * Returns an Array of all property names in this App.Properties object.
   * 
   * @return
   */
  public final native JsArrayString listProperties()/*-{
		return this.listProperties();
  }-*/;

  /**
   * Save this App.Properties object to file at the given path.
   * 
   * @param path
   */
  public final native void saveTo(String path)/*-{
		this.saveTo(path);
  }-*/;

  /**
   * Set a double property value given the name and value.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   */
  public final native void setDouble(String name, double value)/*-{
		this.setDouble(name, value);
  }-*/;

  /**
   * Set a double property value given the name and value.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   */
  public final native void setInt(String name, int value)/*-{
		this.setInt(name, value);
  }-*/;

  /**
   * Set a double property value given the name and value.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   */
  public final native void setList(String name, Object value)/*-{
		this.setList(name, value);
  }-*/;

  /**
   * Set a double property value given the name and value.
   * 
   * @param name,The name of the property to return.
   * @param defaultValue, The value to return if this property is not set.
   */
  public final native void setString(String name, String value)/*-{
		this.setString(name, value);
  }-*/;

}
