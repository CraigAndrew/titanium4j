/**************************************************************************
   Button.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ClickHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasColor;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasFont;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasImage;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasLabel;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasStyle;
import com.emitrom.ti4j.mobile.client.ui.style.Font;
import com.emitrom.ti4j.mobile.client.ui.style.Position;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasText;

/**
 * A Button Component
 */
public class Button extends View implements HasColor, HasFont, HasLabel, HasStyle, HasImage, HasText {

    public Button() {
        createPeer();
    }

    public Button(String label) {
        this();
        setTitle(label);
    }

    Button(JavaScriptObject obj) {
        jsObj = obj;
    }

    public Button(String label, ClickHandler clickHandler) {
        this(label);
        addClickHandler(clickHandler);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasColor#getColor()
     */
    @Override
    public native String getColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.color;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasColor#setColor(java.lang.String)
     */
    @Override
    public native void setColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.color = value;
    }-*/;

    /**
     * @return Boolean that indicates if the button is enabled or not
     */
    public native boolean isEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasFont#getFont()
     */
    @Override
    public native Font getFont() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.font;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.style.Font::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasFont#setFont(com.emitrom.gwt4
     * .ti.mobile.client.ui.style.Font)
     */
    @Override
    public native void setFont(Font value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.font = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasImage#getImage()
     */
    @Override
    public native String getImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.image;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasImage#setImage(java.lang.String)
     */
    @Override
    public native void setImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.image = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasColor#getSelectedColor()
     */
    @Override
    public native String getSelectedColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selectedColor;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasColor#setSelectedColor(java.lang
     * .String)
     */
    @Override
    public native void setSelectedColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectedColor = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasStyle#getStyle()
     */
    @Override
    public native int getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.style;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasStyle#setStyle(int)
     */
    @Override
    public native void setStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.style = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasLabel#getTitle()
     */
    @Override
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasLabel#setTitle(java.lang.String)
     */
    @Override
    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @iOS only
     * @return
     */
    public native int getSystemButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.systemButton;
    }-*/;

    public native void setSystemButton(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.systemButton = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasLabel#getTitleId()
     */
    @Override
    public native String getTitleId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titleid;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasLabel#setTitleId(java.lang.String
     * )
     */
    @Override
    public native void setTitleId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleid = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasLabel#setTextAlign(com.emitrom
     * .gwt4.ti.mobile.client.ui.style.Position)
     */
    @Override
    public void setTextAlign(Position align) {
        setTextAlign(align.getValue());
    }

    public native void setTextAlign(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.textAlign = value;
    }-*/;

    public native void setTextAlign(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.textAlign = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasLabel#getTextAlign()
     */
    @Override
    public Position getTextAlign() {
        return Position.fromValue(_getTextAlign());
    }

    public void setVerticalAlign(Position align) {
        setVerticalAlign(align.getValue());
    }

    public native void setVerticalAlign(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.verticalAlign = value;
    }-*/;

    public native void setVerticalAlign(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.verticalAlign = value;
    }-*/;

    private native String _getTextAlign() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.textAlign;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createButton();
    }

    public static Button from(ProxyObject proxy) {
        return new Button(proxy.getJsObj());
    }

	@Override
	public String getText() {
		return getTitle();
	}

	@Override
	public void setText(String text) {
		setTitle(text);
	}

}
