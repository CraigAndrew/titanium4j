/************************************************************************
  Tray.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.ui;

import com.google.gwt.core.client.JavaScriptObject;

public class Tray extends JavaScriptObject {

	protected Tray() {

	}

	public final native String getHint()/*-{
		return this.getHint();
	}-*/;

	public final native String getIcon()/*-{
		return this.getIcon();
	}-*/;

	public final native Menu getMenu()/*-{
		return this.getMenu();
	}-*/;

	public final native String remove()/*-{
		return this.remove();
	}-*/;

	public final native String setHint()/*-{
		return this.setHint();
	}-*/;

	public final native String setHint(String hint)/*-{
		return this.setHint(hint);
	}-*/;

	public final native String setIcon()/*-{
		return this.setIcon();
	}-*/;

	public final native String setIcon(String icon)/*-{
		return this.setIcon(icon);
	}-*/;

	public final native String setMenu(Menu menu)/*-{
		return this.setMenu(menu);
	}-*/;

}
