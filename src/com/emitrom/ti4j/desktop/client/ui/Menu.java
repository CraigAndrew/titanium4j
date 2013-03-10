/************************************************************************
  Menu.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;

public class Menu extends JavaScriptObject {

	protected Menu() {

	}

	public final native MenuItem addCheckItem(String label)/*-{
		return this.addCheckItem(label);
	}-*/;

	public final MenuItem addCheckItem(String label, TiEventListener<?> eventListener) {
		return this.addCheckItem(label, eventListener.getJsoPeer());
	}

	public final native MenuItem addCheckItem(String label, JavaScriptObject eventListener)/*-{
		return this.addCheckItem(label, eventListener);
	}-*/;

	public final native MenuItem addSeparatorItem()/*-{
		return this.addSeparatorItem();
	}-*/;

	public final native String appendItem(Menu item)/*-{
		return this.appendItem(item);
	}-*/;

	public final native String clear()/*-{
		return this.clear();
	}-*/;

	public final native MenuItem getItemAt(int index)/*-{
		return this.getItemAt(index);
	}-*/;

	public final native int getLength()/*-{
		return this.getLength();
	}-*/;

	public final native String insterItemAt(MenuItem item, int index)/*-{
		return this.insterItemAt(item, index);
	}-*/;

	public final native String removeItemAt(int index)/*-{
		return this.removeItemAt(index);
	}-*/;

}
