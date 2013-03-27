/**************************************************************************
   TextField.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import java.util.ArrayList;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.Unit;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TextHandler;
import com.emitrom.ti4j.mobile.client.ui.style.Font;
import com.emitrom.ti4j.mobile.client.ui.style.Position;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.ui.HasText;

/**
 * * A TextField is created by the method
 * {@link com.emitrom.ti4j.mobile.client.ui.UI.createTextField}. the
 * TextField is a single line field.
 * <p>
 * On iPhone, the borderStyle can be set with a constant from
 * com.emitrom.ti4j.mobile.client.ui.UI.
 * 
 * Both Text Areas and Text Fields can control the buttons displayed in a button
 * bar above the keyboard when it's visible.
 */
public class TextField extends View implements HasText {

    public TextField() {
        createPeer();
        this.setPaddingLeft(0);
    }

    TextField(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return One of
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_NONE}
     *         ,
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_WORDS}
     *         ,
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_SENTENCES}
     *         , or
     *         {@link com.emitrom.ti4j.mobile.client.ui.UI.TEXT_AUTOCAPITALIZATION_ALL}
     *         to indicate how the field should be capitalized during typing.
     *         (only android)
     * 
     */
    public native int getAutocapitalization() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.autocapitalization;
    }-*/;

    public native void setAutocapitalization(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.autocapitalization = value;
    }-*/;

    /**
     * @return The border style constant for the field
     */
    public native int getBorderStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.borderStyle;
    }-*/;

    public native void setBorderStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.borderStyle = value;
    }-*/;

    /**
     * @return The mode constant for how to handle displaying the clear button
     */
    public native int getClearButtonMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.clearButtonMode;
    }-*/;

    public native void setClearButtonMode(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.clearButtonMode = value;
    }-*/;

    /**
     * @return Boolean that indicates if the value of the field is cleared upon
     *         editing
     */
    public native boolean clearOnEdit() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.clearOnEdit;
    }-*/;

    public native void setClearOnEdit(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.clearOnEdit = value;
    }-*/;

    /**
     * @return Boolean indicating if the field is editable
     */
    public native boolean isEditable() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.editable;
    }-*/;

    public native void setEditable(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.editable = value;
    }-*/;

    /**
     * @return Boolean indicating the enabled state of the field
     */
    public native boolean isEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    /**
     * @return The hint text to display when the field is unfocused
     */
    public native String getHintText() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hintText;
    }-*/;

    public native void setHintText(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hintText = value;
    }-*/;

    /**
     * @return Array of toolbar button objects to be used when the keyboard is
     *         displayed
     */
    public ArrayList<Button> getKeyboardToolbar() {
        ArrayList<Button> buttons = new ArrayList<Button>();
        JsArray<JavaScriptObject> values = _getKeyboardToolbar();
        for (int i = 0; i < values.length(); i++) {
            buttons.add(new Button(values.get(i)));
        }
        return buttons;
    }

    private native JsArray<JavaScriptObject> _getKeyboardToolbar() /*-{
		var jso = jso.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.keyboardToolbar;
    }-*/;

    public void setKeyboardToolbar(ArrayList<Button> buttons) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Button button : buttons) {
            values.push(button.getJsObj());
        }
        _setKeyboardToolbar(values);
    }

    public void setKeyboardToolbar(Button... buttons) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (Button button : buttons) {
            values.push(button.getJsObj());
        }
        _setKeyboardToolbar(values);
    }

    private native void _setKeyboardToolbar(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.keyboardToolbar = value;
    }-*/;

    /**
     * @return The color of the keyboard toolbar
     */
    public native String getKeyboardToolbarColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.keyboardToolbarColor;
    }-*/;

    public native void setKeyboardToolbarColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.keyboardToolbarColor = value;
    }-*/;

    /**
     * @return The height of the keyboard toolbar
     */
    public native double getKeyboardToolbarHeight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.keyboardToolbarHeight;
    }-*/;

    public native void setKeyboardToolbarHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.keyboardToolbarHeight = value;
    }-*/;

    /**
     * @return The left button view
     */
    public native Button getLeftButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.leftButton;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setLeftButton(Button value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.leftButton = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The mode of the left button view
     */
    public native int getLeftButtonMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.leftButtonMode;
    }-*/;

    public native void setLeftButtonMode(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.leftButtonMode = value;
    }-*/;

    /**
     * @return The left padding of the space between the button and the edge of
     *         the field
     */
    public native double getLeftButtonPadding() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.leftButtonPadding;
    }-*/;

    public native void setLeftButtonPadding(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.leftButtonPadding = value;
    }-*/;

    /**
     * @return The minimum size of the font when the font is sized based on the
     *         contents. enables font scaling to fit
     */
    public native int getMinimumFontSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.minimumFontSize;
    }-*/;

    public native void setMinimumFontSize(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.minimumFontSize = value;
    }-*/;

    /**
     * @return The left padding of the text field
     */
    public native <T> T getPaddingLeft() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.paddingLeft;
    }-*/;

    /**
     * Sets the left padding
     * 
     * @param value
     *            , the value of the left padding
     */
    public void setPaddingLeft(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "paddingLeft", value);
    }

    /**
     * Sets the left padding
     * 
     * @param value
     *            , the value of the left padding
     */
    public void setPaddingLeft(String value) {
        UI.get().setSizePropertyAsString(jsObj, "paddingLeft", value);
    }

    /**
     * Sets the left padding with the given unit system
     * 
     * @param value
     *            , the value of the left padding
     * @param unit
     *            , the unit system to use
     */
    public void setPaddingLeft(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "paddingLeft", value, unit);
    }

    /**
     * @return The right padding of the text field
     */
    public native <T> T getPaddingRight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.paddingRight;
    }-*/;

    /**
     * Sets the right padding.
     * 
     * @param value
     *            , the value of the left padding
     */
    public void setPaddingRight(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "paddingRight", value);
    }

    /**
     * Sets the right padding.
     * 
     * @param value
     *            , the value of the left padding
     */
    public void setPaddingRight(String value) {
        UI.get().setSizePropertyAsString(jsObj, "paddingRight", value);
    }

    /**
     * Sets the right padding with the given unit system
     * 
     * @param value
     *            , the value of the left padding
     * @param unit
     *            , the unit system to be used
     */
    public void setPaddingRight(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "paddingRight", value, unit);
    }

    /**
     * Sets the padding value. The left and right padding will be set
     * 
     * @param value
     *            , the value of the padding
     */
    public void setPadding(double value) {
        setPaddingLeft(value);
        setPaddingRight(value);
    }

    /**
     * Sets the padding value. The left and right padding will be set
     * 
     * @param value
     *            , the value of the padding
     */
    public void setPadding(String value) {
        setPaddingLeft(value);
        setPaddingRight(value);
    }

    /**
     * Sets the padding value. The left and right padding will be set using the
     * given unit
     * 
     * @param value
     *            , the value of the padding
     */
    public void setPadding(String value, Unit unit) {
        setPaddingLeft(value, unit);
        setPaddingRight(value, unit);
    }

    /**
     * Sets the left and right padding
     * 
     * @param leftPadding
     *            , the left padding
     * @param rightPadding
     *            , the right padding
     */
    public void setPadding(double leftPadding, double rightPadding) {
        setPaddingLeft(leftPadding);
        setPaddingRight(rightPadding);
    }

    /**
     * Sets the left and right padding
     * 
     * @param leftPadding
     *            , the left padding
     * @param rightPadding
     *            , the right padding
     */
    public void setPadding(String leftPadding, String rightPadding) {
        setPaddingLeft(leftPadding);
        setPaddingRight(rightPadding);
    }

    /**
     * Sets the left and right padding using the given unitsystem
     * 
     * @param leftPadding
     *            , the left padding
     * @param rightPadding
     *            , the right padding
     * @param unit
     *            , the unit system to be used
     */
    public void setPadding(String leftPadding, String rightPadding, Unit unit) {
        setPaddingLeft(leftPadding, unit);
        setPaddingRight(rightPadding, unit);
    }

    /**
     * @return The right button view
     */
    public native Button getRightButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.rightButton;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Button::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setRightButton(Button value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rightButton = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setSoftKeyboardOnFocus(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.softKeyboardOnFocus = value;
    }-*/;

    public native void setTextAlign(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.textAlign = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public void setTextAlign(Position position) {
        setTextAlign(position.getValue());
    }

    public native void setFont(Font value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.font = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The mode of the right button view
     */
    public native int getRightButtonMode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rightButtonMode;
    }-*/;

    public native void setRightButtonMode(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rightButtonMode = value;
    }-*/;

    /**
     * @return The right padding of the space between the button and the edge of
     *         the field
     */
    public native double getRightButtonPadding() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rightButtonPadding;
    }-*/;

    public native void setRightButtonPadding(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rightButtonPadding = value;
    }-*/;

    /**
     * @return Boolean to indicate if the return key should be suppressed during
     *         entry
     */
    public native boolean suppressReturn() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.suppressReturn;
    }-*/;

    public native void setSuppressReturn(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.suppressReturn = value;
    }-*/;

    /**
     * @return Value of the field
     */
    public native String getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    /**
     * set the keyborad type
     * 
     * @param value
     *            , value of the keyboard type
     */
    public native void setKeyboardType(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.keyboardType = value;
    }-*/;

    /**
     * 
     * @return the value of the keyboard type
     */
    public native int getKeyboardType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.keyboardType;
    }-*/;

    /**
     * set the returnKey type
     * 
     * @param value
     *            , value of the returnkey type
     */
    public native void setReturnKeyType(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.returnKeyType = value;
    }-*/;

    /**
     * 
     * @return the value of the appearance
     */
    public native int getAppearance() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.appearance;
    }-*/;

    /**
     * set the appearance value
     * 
     * @param value
     *            , value of the returnkey type
     */
    public native void setAppearance(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.appearance = value;
    }-*/;

    /**
     * sets wheter of not this TextField enables thr return key
     * 
     * @param value
     */
    public native void setEnableReturnKey(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enableReturnKey = value;
    }-*/;

    /**
     * wheter of not this TextField enables thr return key
     * 
     * @param value
     */
    public native boolean enableReturnKey() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enableReturnKey;
    }-*/;

    /**
     * 
     * @return the value of the returnkey type
     */
    public native int getReturnKeyType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.returnKeyType;
    }-*/;

    /**
     * Sets the value of the vertical alignment
     * 
     * @param value
     */
    public void setVerticalAlign(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "verticalAlign", value);
    }

    /**
     * Sets the value of the vertical alignment
     * 
     * @param value
     */
    public void setVerticalAlign(String value) {
        UI.get().setSizePropertyAsString(jsObj, "verticalAlign", value);
    }

    /**
     * Sets the value of the vertical alignment using the given unit system
     * 
     * @param value
     * @param unit
     *            , the unit systme to use
     */
    public void setVerticalAlign(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "verticalAlign", value, unit);
    }

    /**
     * @return The constant or string value for the fields vertical alignment.
     */
    public native <T> T getVerticalAlign() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.verticalAlign;
    }-*/;

    /**
     * Force the field to lose focus
     */
    public native void blur() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.blur();
    }-*/;

    /**
     * Force the field to gain focus
     */
    public native void focus() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.focus();
    }-*/;

    /**
     * Return boolean (true) if the field has text
     */
    public native void hasText() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.hasText();
    }-*/;

    public native void addBlurHandler(TextHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::BLUR,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TextHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/text/TextEvent;)(eventObject);
						});
    }-*/;

    public native void addChangeHandler(TextHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::CHANGE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TextHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/text/TextEvent;)(eventObject);
						});
    }-*/;

    public native void addFocusHandler(TextHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::FOCUS,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TextHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/text/TextEvent;)(eventObject);
						});
    }-*/;

    public native void addReturnHandler(TextHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::RETURN,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.text.TextEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TextHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/text/TextEvent;)(eventObject);
						});
    }-*/;

    /**
     * Set whether the input field's text should be masked
     * @param masked		True if the text should be masked
     */
    public native void setPasswordMask(boolean masked) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.passwordMask = masked;
    }-*/;
    
    /**
     * Get whether the input field's text should be masked
     * @return				True if the text is masked.
     */
    public native boolean getPasswordMask() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return (jso.passwordMask ? jso.passwordMask : false);
    }-*/;
    
    @Override
    public void createPeer() {
        jsObj = UI.createTextField();
    }

    public static TextField from(ProxyObject obj) {
        return new TextField(obj.getJsObj());
    }

	@Override
	public String getText() {
		return getValue();
	}

	@Override
	public void setText(String text) {
		setValue(text);
	}

}
