/**************************************************************************
   MaskedImage.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A control that displays an image composited with a background image or color.
 * 
 * @iOS only
 * 
 */
public class MaskedImage extends View {

    public MaskedImage() {
        createPeer();
    }

    MaskedImage(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return the value of the image property.
     */
    public native String getImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.image;
    }-*/;

    /**
     * Sets the value of the image property
     * 
     * @param value
     */
    public native void setImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.image = value;
    }-*/;

    /**
     * @return the value of the mask property.
     */
    public native String getMask() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mask;
    }-*/;

    /**
     * Sets the value of the mask property
     * 
     * @param value
     */
    public native void setMask(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mask = value;
    }-*/;

    /**
     * @return the value of the tint property.
     */
    public native String getTint() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.tint;
    }-*/;

    /**
     * Sets the value of the tint property
     * 
     * @param value
     */
    public native void setTint(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.tint = value;
    }-*/;

    /**
     * @return the value of the mode property.
     */
    public native double getMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.mode;
    }-*/;

    /**
     * Sets the value of the mode property
     * 
     * @param value
     */
    public native void setMode(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.mode = value;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createMaskedImage();
    }

    public static MaskedImage from(ProxyObject proxy) {
        return new MaskedImage(proxy.getJsObj());
    }
}
