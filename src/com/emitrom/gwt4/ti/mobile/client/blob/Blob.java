/**************************************************************************
   Blob.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.blob;

import com.emitrom.gwt4.ti.mobile.client.core.JsoHelper;
import com.emitrom.gwt4.ti.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The blob is an abstract data type that represents binary information, often
 * obtained through HTTPClient or via files. It often is used to store text or
 * the actual data of an image.
 */
public class Blob extends EventDispatcher {

    public Blob() {
        jsObj = JsoHelper.createObject();
    }

    public Blob(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Generate a thumbnail version of an image, optionally with a border and
     * rounded corners (currently iPhone/iPad only)
     * 
     * @param <T>
     * @param size , the size of the thumbnail, in either width or height
     * @return
     */
    public native <T extends JavaScriptObject> T imageAsThumbnail(int size) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.imageAsThumbnail(size);
    }-*/;

    /**
     * Generate a thumbnail version of an image, optionally with a border and
     * rounded corners (currently iPhone/iPad only)
     * 
     * @param <T>
     * @param size , the size of the thumbnail, in either width or height
     * @param borderSize , the optional width of the thumbnail's border. The
     *            default is 1.
     * @return
     */
    public native <T extends JavaScriptObject> T imageAsThumbnail(int size, int borderSize) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.imageAsThumbnail(size, borderSize, cornerRadius);
    }-*/;

    /**
     * Generate a thumbnail version of an image, optionally with a border and
     * rounded corners (currently iPhone/iPad only)
     * 
     * @param <T>
     * @param size , the size of the thumbnail, in either width or height
     * @param borderSize , the optional width of the thumbnail's border. The
     *            default is 1.
     * @param cornerRadius , the radius of the thumbnail's corners. The default
     *            is 0.
     * @return
     */
    public native <T extends JavaScriptObject> T imageAsThumbnail(int size, int borderSize, int cornerRadius) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.imageAsThumbnail(size, borderSize, cornerRadius);
    }-*/;

    /**
     * Converts this blob to a string
     * 
     * @return, String representation of the blob
     */
    public native String toStringValue() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.toString();
    }-*/;

}
