/************************************************************************
  Interface.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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

public class Interface extends JavaScriptObject {

	protected Interface() {

	}

	public final native String getDisplayName()/*-{
		return this.getDisplayName();
	}-*/;

	public final native IPAddress getIPAddress()/*-{
		return this.getIPAddress();
	}-*/;

	public final native String getName()/*-{
		return this.getName();
	}-*/;

	public final native IPAddress getSubnetMask()/*-{
		return this.getSubnetMask();
	}-*/;

	public final native boolean supportsIPv4()/*-{
		return this.supportsIPv4();
	}-*/;

	public final native boolean supportsIPv6()/*-{
		return this.supportsIPv6();
	}-*/;

}
