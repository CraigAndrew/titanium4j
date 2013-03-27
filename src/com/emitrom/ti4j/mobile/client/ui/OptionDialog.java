/**************************************************************************
   OptionDialog.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DialogClickHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * The option dialog is created and allows you to show a modal dialog of one or
 * more options to the user.
 */
public class OptionDialog extends EventDispatcher {

    public OptionDialog() {
        createPeer();
    }

    OptionDialog(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return A titanium.ui.view. allows for arbitrary contents inside a native
     *         dialog. works for any dialog. (android)
     * @platforms android
     */
    public native View getAndroidView() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.androidView;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setAndroidView(View value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.androidView = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return An index to indicate which button should be the cancel button. if
     *         no button should be the cancel button, use -1. if there is a
     *         cancel button, it must be the last button for use on ipad.
     */
    public native int getCancel() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.cancel;
    }-*/;

    public native void setCancel(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.cancel = value;
    }-*/;

    /**
     * @return The destructive button (indicated by a visual clue in the ui)
     */
    public native int getDestructive() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.destructive;
    }-*/;

    public native void setDestructive(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.destructive = value;
    }-*/;

    /**
     * @return Array of button names as strings
     */
    public native JsArrayString getOptions() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.options;
    }-*/;

    public void setOptions(String... values) {
        JsArrayString strings = JsArrayString.createArray().cast();
        for (String s : values) {
            strings.push(s);
        }
        setOptions(strings);
    }

    public native void setOptions(JsArrayString value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.options = value;
    }-*/;

    /**
     * @return Set an initially selected option. only valid when options has
     *         been specified. (android only)
     * @platforms android
     */
    public native int getSelectedIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selectedIndex;
    }-*/;

    public native void setSelectedIndex(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectedIndex = value;
    }-*/;

    /**
     * @return The title of the dialog
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    /**
     * @return The key in the locale file to use for the title property
     */
    public native String getTitleId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.titleid;
    }-*/;

    public native void setTitleId(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.titleid = value;
    }-*/;

    /**
     * Cause the dialog to become visible
     */
    public native void show() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.show();
    }-*/;

    public native CallbackRegistration addClickHandler(DialogClickHandler handler) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.dialog.DialogClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DialogClickHandler::onClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/dialog/DialogClickEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;
    

    private void createPeer() {
        jsObj = UI.createOptionDialog();
    }

    public static OptionDialog from(ProxyObject proxy) {
        return new OptionDialog(proxy.getJsObj());
    }

}
