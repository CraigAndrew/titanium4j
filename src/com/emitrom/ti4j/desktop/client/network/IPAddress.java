/************************************************************************
  IPAddress.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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

public class IPAddress extends JavaScriptObject {

	protected IPAddress() {

	}

	public final native boolean isBroadCast()/*-{
		return this.isBroadCast();
	}-*/;

	public final native boolean isGlobalMC()/*-{
		return this.isGlobalMC();
	}-*/;

	public final native boolean isIPV4()/*-{
		return this.isIPV4();
	}-*/;

	public final native boolean isIPV6()/*-{
		return this.isIPV6();
	}-*/;

	public final native boolean isInvalid()/*-{
		return this.isInvalid();
	}-*/;

	public final native boolean isLinkLocal()/*-{
		return this.isLinkLocal();
	}-*/;

	public final native boolean isLocalMC()/*-{
		return this.isLocalMC();
	}-*/;

	public final native boolean isLoopback()/*-{
		return this.isLoopback();
	}-*/;

	public final native boolean isMulticast()/*-{
		return this.isMulticast();
	}-*/;

	public final native boolean isNodeLocalMC()/*-{
		return this.isNodeLocalMC();
	}-*/;

	public final native boolean isOrgLocalMC()/*-{
		return this.isOrgLocalMC();
	}-*/;

	public final native boolean isSiteLocal()/*-{
		return this.isSiteLocal();
	}-*/;

	public final native boolean isSileLocalMC()/*-{
		return this.isSileLocalMC();
	}-*/;

	public final native boolean isUniCast()/*-{
		return this.isUniCast();
	}-*/;

	public final native boolean isWellKnownMC()/*-{
		return this.isWellKnownMC();
	}-*/;

	public final native boolean isWildcard()/*-{
		return this.isWildcard();
	}-*/;

	public final native String stringValue()/*-{
		return this.toString();
	}-*/;

}
