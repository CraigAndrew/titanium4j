/************************************************************************
  Application.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.api.application;

import com.emitrom.ti4j.desktop.client.api.component.Component;
import com.emitrom.ti4j.desktop.client.api.dependency.Dependency;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object representing a Ti application, either the currently running
 * application or one on disk.
 * 
 * @author Ekambi
 * 
 */
public class Application extends JavaScriptObject {

  protected Application() {

  }

  /**
   * Find the value for a given argument. You may either pass 'param' or
   * '--param' and this method will find the command-line value for '--param='
   * 
   * @return
   */
  public static native String getArgumentValue(String argument)/*-{
		return Ti.API.Application.getArgumentValue(argument);
  }-*/;

  /**
   * Retrieve a list of command-line arguments passed to this application. This
   * list will include the first argument, which is the path to the executable.
   * 
   * @return
   */
  public static native JsArrayString getArguments()/*-{
		return Ti.API.Application.getArguments();
  }-*/;

  /**
   * Return a list of all available (installed and bundled) components for this
   * application. This is simply the list returned by
   * API.getInstalledComponents() plus any components bundled with the
   * application. Note that bundled components do not have a version currently.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getAvailableComponents()/*-{
		return Ti.API.Application.getAvailableComponents();
  }-*/;

  /**
   * Return a list of all available (installed and bundled) modules for this
   * application. This is simply the list returned by API.getInstalledModules()
   * plus any components bundled with the application. Note that bundled
   * components do not have a version currently.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getAvailableModules()/*-{
		return Ti.API.Application.getAvailableModules();
  }-*/;

  /**
   * Return a list of all available (installed and bundled) runtimes for this
   * application. This is simply the list returned by API.getInstalledModules()
   * plus any components bundled with the application. Note that bundled
   * components do not have a version currently.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getAvailableRuntimes()/*-{
		return Ti.API.Application.getAvailableRuntimes();
  }-*/;

  /**
   * Return a list of all bundled components for this for this application.
   * Bundled components currently live inside the application contents
   * directory. in the following directories:
   * <ul>
   * <li>My App.app/Contents/modules</li>
   * <li>My App.app/Contents/runtime</li>
   * <li>My App.app/Contents/sdk</li>
   * <li>My App.app/Contents/mobilesdk</li>
   * </ul>
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getBundleComponents()/*-{
		return Ti.API.Application.getBundleComponents();
  }-*/;

  public static native JsArray<JavaScriptObject> getBundleModules()/*-{
		return Ti.API.Application.getBundleModules();
  }-*/;

  /**
   * Return a list of all bundled modules for this for this application. Bundled
   * modules currently live inside the application contents directory in the
   * "My App.app/Contents/modules" directory.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getBundleRuntimes()/*-{
		return Ti.API.Application.getBundleRuntimes();
  }-*/;

  /**
   * Return a list of all resolved components for this for this application.
   * Resolved components may either be installed or bundled components. Note
   * that currently bundled components returned in this list do not have a
   * version.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getComponents()/*-{
		return Ti.API.Application.getComponents();
  }-*/;

  /**
   * Get the path to the application's user data directory. This path is
   * guaranteed to be writable (as opposed to the application directory which
   * should not be written to) and is suitable for storing any application
   * files.
   * 
   * @return
   */
  public static native String getDataPath()/*-{
		return Ti.API.Application.getDataPath();
  }-*/;

  /**
   * Get a list of this application's dependencies. Dependencies are defined in
   * the application manifest file.
   * 
   * @return
   */
  public static native JsArray<Dependency> getDependencies()/*-{
		return Ti.API.Application.getDependencies();
  }-*/;

  /**
   * Get the path to this application's executable.
   * 
   * @return
   */
  public static native int getExcecutablePath()/*-{
		return Ti.API.Application.getExcecutablePath();
  }-*/;

  /**
   * Get this application globally unique identifier. This is currently defined
   * in the application manifest.
   * 
   * @return
   */
  public static native String getGUID()/*-{
		return Ti.API.Application.getGUID();
  }-*/;

  /**
   * Get this human readable id currently defined in both the application
   * manifest and the application's tiapp.xml file.
   * 
   * @return
   */
  public static native String getID()/*-{
		return Ti.API.Application.getID();
  }-*/;

  /**
   ** Get the contents of this application's manifest as an array of string pairs
   * (array of size 2). Each entry in the manifest is a simple key-value pair.
   * Comments are ignored.
   * 
   * @return
   */
  public static native JsArrayString getManifest()/*-{
		Ti.API.Application.getManifest();
  }-*/;

  /**
   * 
   * 
   * Get the path to this application's manifest
   * 
   * @return
   */
  public static native String getManifestPath()/*-{
		Ti.API.Application.getManifestPath();
  }-*/;

  /**
   * Return a list of all resolved modules for this for this application.
   * Resolved components may either be installed or bundled components. Note
   * that currently bundled components returned in this list do not have a
   * version.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getModules()/*-{
		return Ti.API.Application.getModules();
  }-*/;

  /**
   * Get this application's name.
   * 
   * @return
   */
  public static native String getName()/*-{
		return Ti.API.Application.getName();
  }-*/;

  /**
   * Retrieve the process identifier of this application. If this application is
   * not the currently running application, this method will returned undefined.
   * 
   * @return
   */
  public static native String getPID()/*-{
		return Ti.API.Application.getPID();
  }-*/;

  /**
   * Get this application's path. Note that this is the top-level path of
   * application, not the path to the application contents directory. On OS X
   * currently, the application contents directory is "[app path]/Contents"
   * 
   * @return
   */
  public static native String getPath()/*-{
		return Ti.API.Application.getPath();
  }-*/;

  /**
   * Return the path to this application's resources directory. This directory
   * is the 'Resources' subdirectory of the application contents directory.
   * 
   * @return
   */
  public static native String getResourcesPath()/*-{
		return Ti.API.Application.getResourcesPath();
  }-*/;

  /**
   * Return the resolved runtime for this for this application. Resolved
   * components may either be installed or bundled components. Note that
   * currently bundled components returned from this method do not have a
   * version.
   * 
   * @return
   */
  public static native Component getRuntime()/*-{
		return Ti.API.Application.getRuntime();
  }-*/;

  /**
   * Get this application's version.
   * 
   * @return
   */
  public static native String getVersion()/*-{
		return Ti.API.Application.getVersion();
  }-*/;

  /**
   * Determine if the given argument is in the argument list. You may either
   * pass 'param' or '--param' and this method will find the command-line
   * argument.
   * 
   * @param argument
   * @return
   */
  public static native boolean hasArgument(String argument)/*-{
		return Ti.API.Application.hasArgument(argument);
  }-*/;

  /**
   * Returns whether or not this is the currently running application.
   * 
   * @return
   */
  public static native boolean isCurrent()/*-{
		return Ti.API.Application.isCurrent();
  }-*/;

  /**
   * Attempt to resolve all the dependencies for this application. Resolved
   * components should be accessible through API.Application.getComponents
   * afterward. Note that the currently running applicaiton should already have
   * all of its dependencies resolved.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> resolveDependencies()/*-{
		return Ti.API.Application.resolveDependencies();
  }-*/;

}
