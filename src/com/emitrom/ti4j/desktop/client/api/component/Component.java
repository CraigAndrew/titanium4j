/************************************************************************
  Component.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.api.component;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a Ti component, which may be either a module,
 * runtime, SDK, Mobile SDK or application update.
 */
public class Component extends JavaScriptObject {

  protected Component() {

  }

  /**
   * Get the name of this component.
   * 
   * @return
   */
  public final native String getName()/*-{
		return this.getName();
  }-*/;

  /**
   * Get the path to this component.
   * 
   * @return
   */
  public final native String getPath()/*-{
		return this.getPath();
  }-*/;

  /**
   * Get the type of this component. Component types are defined as constants on
   * the API module.
   * 
   * @return
   */
  public final native String getType()/*-{
		return this.getType();
  }-*/;

  /**
   * Get the version of this component. Note that bundled components do not
   * currently have a version.
   * 
   * @return
   */
  public final native String getVersion()/*-{
		return this.getVersion();
  }-*/;

  /**
   * Whether or not this component is bundled with an application.
   * 
   * @return
   */
  public final native boolean isBundled()/*-{
		return this.isBundled();
  }-*/;

  /**
   * Whether or not this component is currently loaded.
   * 
   * @return
   */
  public final native boolean isLoaded()/*-{
		return this.isLoaded();
  }-*/;

}
