/************************************************************************
  ProcessInstance.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.process;

import com.emitrom.ti4j.desktop.client.api.environment.Environment;
import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class ProcessInstance extends JavaScriptObject {

	protected ProcessInstance() {

	}

	public final native Environment cloneEnvironment()/*-{
		return this.cloneEnvironment();
	}-*/;

	public final native JsArrayString getArguments()/*-{
		return this.getArguments();
	}-*/;

	public final native <T> T getEnvironment(String key)/*-{
		return this.getEnvironment(key);
	}-*/;

	public final native int getExitCode()/*-{
		return this.getExitCode();
	}-*/;

	public final native int getPID()/*-{
		return this.getPID();
	}-*/;

	public final native Pipe getStderr()/*-{
		return this.getStderr();
	}-*/;

	public final native Pipe getStdin()/*-{
		return this.getStdin();
	}-*/;

	public final native Pipe getStdout()/*-{
		return this.getStdout();
	}-*/;

	public final native boolean isRunning()/*-{
		return this.isRunning();
	}-*/;

	public final native String kill()/*-{
		return this.kill();
	}-*/;

	public final native String launch()/*-{
		return this.launch();
	}-*/;

	/**
	 * does nothing in Windows
	 */
	public final native String sendSignal(String signal)/*-{
		return this.sendSignal(signal);
	}-*/;

	/**
	 * does nothing in Windows
	 */
	public final native String sendSignal(double signal)/*-{
		return this.sendSignal(signal);
	}-*/;

	public final native String setEnvironment(String key, String value)/*-{
		return this.setEnvironment(key, value);
	}-*/;

	public final String setOnExit(TiEventListener<?> callback) {
		return this.setOnExit(callback.getJsoPeer());
	}

	private final native String setOnExit(JavaScriptObject callback)/*-{
		return this.setOnExit(callback);
	}-*/;

	public final String seOntRead(TiEventListener<?> callback) {
		return this.setOnRead(callback.getJsoPeer());
	}

	private final native String setOnRead(JavaScriptObject callback)/*-{
		return this.setOnRead(callback);
	}-*/;

	public final String setOnReadLine(TiEventListener<?> callback) {
		return this.setOnReadLine(callback.getJsoPeer());
	}

	private final native String setOnReadLine(JavaScriptObject callback)/*-{
		return this.setOnReadLine(callback);
	}-*/;

	/**
	 * does nothing on Windows
	 */
	public final native String terminate()/*-{
		return this.terminate();
	}-*/;

	public final native String stringValue()/*-{
		return this.toString();
	}-*/;

}
