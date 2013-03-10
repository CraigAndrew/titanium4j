/************************************************************************
  Pipe.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.desktop.client.bytes.Bytes;
import com.google.gwt.core.client.JavaScriptObject;

public class Pipe extends JavaScriptObject {

	protected Pipe() {

	}

	public final native String attach()/*-{
		return this.attach();
	}-*/;

	public final native String close()/*-{
		return this.close();
	}-*/;

	public final native String detach()/*-{
		return this.detach();
	}-*/;

	public final native boolean isAttached()/*-{
		return this.isAttached();
	}-*/;

	public final native int write(String data)/*-{
		return this.write(data);
	}-*/;

	public final native int write(Bytes data)/*-{
		return this.write(data);
	}-*/;

}
