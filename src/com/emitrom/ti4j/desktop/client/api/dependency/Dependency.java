/************************************************************************
  Dependency.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.api.dependency;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a Ti application dependency.
 * 
 * 
 */
public class Dependency extends JavaScriptObject {

  protected Dependency() {

  }

  /**
   * Get the name of this dependency.
   * 
   * @return
   */
  public final native String getName()/*-{
		return this.getName();
  }-*/;

  /**
   * Get the requirement for this dependency. Dependency requirement types are
   * defined as constants on the API module. Currently the installer only
   * support API.EQ dependency types.
   * 
   * @return
   */
  public final native String getRequirement()/*-{
		return this.getRequirement();
  }-*/;

  /**
   * Get the type of this dependency. Dependency types are defined as constants
   * on the API module (e.g. API.SDK).
   * 
   * @return
   */
  public final native int getType()/*-{
		return this.getType();
  }-*/;

  /**
   * Get the version part of this dependency.
   * 
   * @return
   */
  public final native String getVersion()/*-{
		return this.getVersion();
  }-*/;

}
