/************************************************************************
  API.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.desktop.client.api;

import com.emitrom.ti4j.core.client.LogLevel;
import com.emitrom.ti4j.desktop.client.api.application.Application;
import com.emitrom.ti4j.desktop.client.api.dependency.Dependency;
import com.emitrom.ti4j.desktop.client.api.environment.Environment;
import com.emitrom.ti4j.desktop.client.bytes.Bytes;
import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * A module for holding core Ti functionality.
 * 
 */
public class API extends JavaScriptObject {

  public static final int APP_UPDATE = APP_UPDATE();
  public static final int CRITICAL = CRITICAL();
  public static final int DEBUG = DEBUG();
  public static final int EQ = EQ();
  public static final int ERROR = ERROR();
  public static final int FATAL = FATAL();
  public static final int GT = GT();
  public static final int GTE = GTE();
  public static final int INFO = INFO();
  public static final int LT = LT();
  public static final int LTE = LTE();
  public static final int MOBILESDK = MOBILESDK();
  public static final int MODULE = MODULE();
  public static final int NOTICE = NOTICE();
  public static final int RUNTIME = RUNTIME();
  public static final int SDK = SDK();
  public static final int TRACE = TRACE();
  public static final int UNKNOWN = UNKNOWN();
  public static final int WARN = WARN();

  protected API() {

  }

  /**
   * Print to stdout without a trailing newline
   * 
   * @param obj, The data to print.
   */
  public static native void print(Object obj) /*-{
		Ti.API.print(obj);
  }-*/;

  private static native void addEventListener(String type, JavaScriptObject listener) /*-{
		Ti.API.addEventListener(type, listener);
  }-*/;

  /**
   * Register a root event listener. Event listeners registered using this
   * function will receive all events from Ti.
   * 
   * @param type
   * @param listener
   */
  public static void addEventListener(String type, TiEventListener<?> listener) {
    addEventListener(type, listener.getJsoPeer());
  }

  /**
   * Create a Kroll Bytes object given a String. A Bytes object is a generic way
   * of holding a String of bytes.
   * 
   * @return
   */
  public static native Bytes createBytes()/*-{
		return Ti.API.createBytes();
  }-*/;

  /**
   * Create a Kroll Bytes object given a String. A Bytes object is a generic way
   * of holding a String of bytes.
   * 
   * @param value, (optional) The contents of the new Bytes. The String will be
   *          converted to a UTF-8 String before populating the Bytes object. If
   *          no String is given the object will be empty.
   * @return
   */
  public static native Bytes createBytes(String value)/*-{
		return Ti.API.createBytes(value);
  }-*/;

  /**
   * A constructor for API.Dependency objects.
   * 
   * @param type, The type of this dependency. This is usually one of the
   *          component type constants (e.g. API.MODULE).
   * @param name, The name of this dependency.
   * @param version, The version requirement for this dependency.
   * 
   * @param requirement, (optional) The requirement for this dependency. This is
   *          one of the requirement specification constants from the API module
   *          such as API.LT (less-than)]
   * 
   * @return
   */
  public static native Dependency createDependency(double type, String name, String version,
      double requirement)/*-{
		return Ti.API.createDependency(type, name, version, requirement);
  }-*/;

  /**
   * A constructor for API.Dependency objects.
   * 
   * @param type, The type of this dependency. This is usually one of the
   *          component type constants (e.g. API.MODULE).
   * @param name, The name of this dependency.
   * @param version, The version requirement for this dependency.
   * @return
   */
  public static native Dependency createDependency(double type, String name, String version)/*-{
		return Ti.API.createDependency(type, name, version);
  }-*/;

  /**
   * Log a statement with CRITICAL severity.
   * 
   * @param description, The String to send to the logger.
   */
  public static native void critical(String description)/*-{
		Ti.API.critical(description);
  }-*/;

  /**
   * Log a statement with ERROR severity.
   * 
   * @param statement, The String to send to the logger.
   */
  public static native void error(String statement)/*-{
		Ti.API.error(statement);
  }-*/;

  /**
   * Log a statement with FATAL severity.
   * 
   * @param statement, The String to send to the logger.
   */
  public static native void fatal(String statement)/*-{
		Ti.API.fatal(statement);
  }-*/;

  /**
   * Log a statement with DEBUG severity.
   * 
   * @param statement, The String to send to the logger.
   */
  public static native void debug(String statement)/*-{
		Ti.API.debug(statement);
  }-*/;

  /**
   * Fire an event to the top-level event listener.
   * 
   * @param event
   */
  public static native void fireEvent(JavaScriptObject event)/*-{
		Ti.API.fireEvent(event);
  }-*/;

  /**
   * Fire an event to the top-level event listener.
   * 
   * @param event
   */
  public static native void fireEvent(String event)/*-{
		Ti.API.fireEvent(event);
  }-*/;

  /**
   * Get an attribute in the global object
   * 
   * @param <T>
   * @param id
   * @return
   */
  public static native <T> T get(String id)/*-{
		return Ti.API.get(id);
  }-*/;

  /**
   * Get the currently running application. This application will should have
   * all of its dependencies resolved.
   * 
   * @return
   */
  public static native Application getApplication()/*-{
		return Ti.API.getApplication();
  }-*/;

  /**
   * Get a list of the paths on which Ti searches for installed
   * components. This does not include paths of bundled components.
   * 
   * @return
   */
  public static native JsArrayString getComponentSearchPaths()/*-{
		return Ti.API.getComponentSearchPaths();
  }-*/;

  /**
   * Get the system environment object, which can be queried and updated just by
   * accessing or setting its properties.
   * 
   * @return
   */
  public static native Environment getEnvironment()/*-{
		return Ti.API.getEnvironment();
  }-*/;

  /**
   * Get a list of the currently installed Ti components. An installed
   * component is one that has been found on the list of paths returned by
   * API.getComponentSearchPaths. This list does not include bundled components.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getInstalledComponents()/*-{
		return Ti.API.getInstalledComponents();
  }-*/;

  /**
   * Get a list of the currently installed Ti Mobile SDK components. An
   * installed component is one that has been found on the list of paths
   * returned by API.getComponentSearchPaths. This list does not include bundled
   * components.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getInstalledMobileSDKs()/*-{
		return Ti.API.getInstalledMobileSDKs();
  }-*/;

  /**
   * Get a list of the currently installed Ti module components. An
   * installed component is one that has been found on the list of paths
   * returned by API.getComponentSearchPaths. This list does not include bundled
   * components.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getInstalledModules()/*-{
		return Ti.API.getInstalledModules();
  }-*/;

  /**
   * Get a list of the currently installed Ti runtime components. An
   * installed component is one that has been found on the list of paths
   * returned by API.getComponentSearchPaths. This list does not include bundled
   * components.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getInstalledRuntimes()/*-{
		return Ti.API.getInstalledRuntimes();
  }-*/;

  /**
   * Get a list of the currently installed Ti SDK components. An installed
   * component is one that has been found on the list of paths returned by
   * API.getComponentSearchPaths. This list does not include bundled components.
   * 
   * @return
   */
  public static native JsArray<JavaScriptObject> getInstalledSDKs()/*-{
		return Ti.API.getInstalledSDKs();
  }-*/;

  /**
   * Get the log level threshold of the Ti logger. The logger will log
   * statements with this severity or one that is more severe
   * 
   * @return
   */
  public static LogLevel getLogLevel() {
    return LogLevel.fromValue(_getLogLevel());
  }

  private static native int _getLogLevel()/*-{
		return Ti.API.getLogLevel();
  }-*/;

  /**
   * Log a statement with INFO severity.
   * 
   * @param statement
   */
  public static native void info(String statement)/*-{
		Ti.API.info(statement);
  }-*/;

  // TO implement installdependencies

  /**
   * Log a statement with a given severity level.
   */
  public static void log(LogLevel severity, String statement) {
    log(severity.getLevel(), statement);
  }

  private static native void log(int severity, String statement)/*-{
		Ti.API.log(severity, statement);
  }-*/;

  /**
   * Log a statement with NOTICE severity.
   * 
   * @param statement
   */
  public static native void notice(String statement)/*-{
		Ti.API.info(statement);
  }-*/;

  /**
   * Read an application manifest at a given path and return an
   * Ti.API.Application object representing the application.
   * 
   * @param manifestPath, The path to the manifest to read.
   * @return
   */
  public static native Application readApplicationManifest(String manifestPath)/*-{
		return Ti.API.readApplicationManifest(manifestPath);
  }-*/;

  /**
   * Read an application manifest at a given path and return an
   * Ti.API.Application object representing the application.
   * 
   * @param manifestPath, The path to the manifest to read.
   * @param applicationPath, (optional) An optional application path override
   * @return
   */
  public static native Application readApplicationManifest(String manifestPath,
      String applicationPath)/*-{
		return Ti.API.readApplicationManifest(manifestPath,
				applicationPath);
  }-*/;

  /**
   * Remove a root event listener. If no listener is registered for this object,
   * the call will do nothing.
   * 
   * @param listener
   */
  public static void removeEventListener(TiEventListener<?> listener) {
    API.removeEventListener(listener.getJsoPeer());
  }

  private static native void removeEventListener(JavaScriptObject listener)/*-{
		Ti.API.removeEventListener(listener);
  }-*/;

  /**
   * Execute the method asynchronously on the main thread. This should be used
   * when attempting to run JavaScript methods from non-JavaScript threads. This
   * method does not wait for the method to complete and returns immediately.
   * 
   * @param function
   */
  public static void runOnMainThread(TiEventListener<?> function) {
    API.runOnMainThread(function.getJsoPeer());
  }

  private static native void runOnMainThread(JavaScriptObject value)/*-{
		Ti.API.runOnMainThread(value);
  }-*/;

  /**
   * Execute the method asynchronously on the main thread. This should be used
   * when attempting to run JavaScript methods from non-JavaScript threads. This
   * method does not wait for the method to complete and returns immediately.
   * 
   * @param function
   */
  public static void runOnMainThreadAsync(TiEventListener<?> function) {
    API.runOnMainThreadAsync(function.getJsoPeer());
  }

  private static native void runOnMainThreadAsync(JavaScriptObject value)/*-{
		Ti.API.runOnMainThread(value);
  }-*/;

  /**
   * Set an attribute in the global object
   * 
   * @param key,Key of the attribute to set
   * @param value,New value of the attribute
   */
  public static native void set(String key, String value)/*-{
		Ti.API.set(key, value);
  }-*/;

  /**
   * Set the log level threshold of the Ti logger. The logger will log
   * statements with this severity or one that is more severe
   * 
   * @param level, The threshold of severity to log.
   */
  public static void setLogLevel(LogLevel level) {
    setLogLevel(level.getLevel());
  }

  private static native void setLogLevel(int level)/*-{
		Ti.API.setLogLevel(level);
  }-*/;

  /**
   * Log a statement with TRACE severity.
   * 
   * @param statement
   */
  public static native void trace(String statement)/*-{
		Ti.API.trace(statement);
  }-*/;

  /**
   * Log a statement with WARN severity.
   * 
   * @param statement
   */
  public static native void warn(String statement)/*-{
		Ti.API.warn(statement);
  }-*/;

  private static native int APP_UPDATE()/*-{
		return Ti.API.APP_UPDATE;
  }-*/;

  private static native int CRITICAL()/*-{
		return Ti.API.CRITICAL;
  }-*/;

  private static native int DEBUG()/*-{
		return Ti.API.DEBUG;
  }-*/;

  private static native int EQ()/*-{
		return Ti.API.EQ;
  }-*/;

  private static native int ERROR()/*-{
		return Ti.API.ERROR;
  }-*/;

  public static native int FATAL()/*-{
		return Ti.API.FATAL;
  }-*/;

  private static native int GT()/*-{
		return Ti.API.GT;
  }-*/;

  private static native int GTE()/*-{
		return Ti.API.GTE;
  }-*/;

  private static native int INFO()/*-{
		return Ti.API.INFO;
  }-*/;

  private static native int LT()/*-{
		return Ti.API.LT;
  }-*/;

  private static native int LTE()/*-{
		return Ti.API.LTE;
  }-*/;

  private static native int MOBILESDK()/*-{
		return Ti.API.MOBILESDK;
  }-*/;

  private static native int MODULE()/*-{
		return Ti.API.MODULE;
  }-*/;

  private static native int NOTICE()/*-{
		return Ti.API.NOTICE;
  }-*/;

  private static native int RUNTIME()/*-{
		return Ti.API.RUNTIME;
  }-*/;

  private static native int SDK()/*-{
		return Ti.API.SDK;
  }-*/;

  private static native int TRACE()/*-{
		return Ti.API.TRACE;
  }-*/;

  private static native int UNKNOWN()/*-{
		return Ti.API.UNKNOWN;
  }-*/;

  private static native int WARN()/*-{
		return Ti.API.WARN;
  }-*/;

}
