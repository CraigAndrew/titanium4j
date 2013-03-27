/**************************************************************************
   ButtonBar.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.ios;

import java.util.ArrayList;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.ui.View;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A button bar UI element
 * <p>
 * For iPhone, the style constants are available in the constants defined in
 * com.emitrom.ti4j.mobile.client.ui.iphone.IPhone.SystemButtonStyle
 */
public class ButtonBar extends View {

    ButtonBar() {
        createPeer();
    }

    ButtonBar(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return The selected index
     */
    public native int getIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.index;
    }-*/;

    public native void setIndex(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.index = value;
    }-*/;

    /**
     * @return The array of labels for the button bar. each object should have
     *         the properties 'title', 'image', 'width' and 'enabled'.
     */
    public ArrayList<BarElement> getLabels() {
        ArrayList<BarElement> labels = new ArrayList<BarElement>();
        JsArray<JavaScriptObject> values = _getLabels();
        for (int i = 0; i < values.length(); i++) {
            labels.add(new BarElement(values.get(i)));
        }
        return labels;
    }

    private native JsArray<JavaScriptObject> _getLabels() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.labels;
    }-*/;

    public void setLabels(ArrayList<BarElement> labels) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (BarElement element : labels) {
            values.push(element.getJsObj());
        }
        _setLabels(values);
    }

    public void setLabels(BarElement... labels) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (BarElement element : labels) {
            values.push(element.getJsObj());
        }
        _setLabels(values);
    }

    private native void _setLabels(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.labels = value;
    }-*/;

    /**
     * @return The style of the button bar
     */
    public native double getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.style;
    }-*/;

    public native void setStyle(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.style = value;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = createButtonBar();
    }

    public static ButtonBar from(ProxyObject proxy) {
        return new ButtonBar(proxy.getJsObj());
    }

    private static native JavaScriptObject createButtonBar() /*-{
		return Titanium.UI.createButtonBar();
    }-*/;

}
