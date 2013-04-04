/**************************************************************************
 * Titanium.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client;

import com.emitrom.ti4j.core.client.Function;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.buffer.Buffer;
import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ClickHandler;
import com.emitrom.ti4j.mobile.client.platform.Platform;
import com.emitrom.ti4j.mobile.client.ui.AlertDialog;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level Titanium module
 */
public class Titanium {

    /**
     * The user-agent string used by Titanium
     */
    public static final String USER_AGENT = getUserAgent();

    /**
     * The version of Titanium that is executing
     */
    public static final String VERSION = getVersion();

    private Titanium() {

    }

    /**
     * Adds an event listener for the instance to receive view triggered events
     * 
     * @param event
     *            , name of the event
     * @param listener
     *            , callback function to invoke when the event is fired
     */
    public static void addEventListener(String event, TiEventListener<?> listener) {
        addEventListener(event, listener.getJsoPeer());
    }

    private static native void addEventListener(String event, JavaScriptObject listener) /*-{
		Titanium.addEventListener(event, listener);
    }-*/;

    public static native void addEventListener(String event, Function listener) /*-{
		Titanium.addEventListener(event, function() {
			listener.@com.emitrom.ti4j.core.client.Function::execute()();
		});
    }-*/;

    /**
     * Creates a new buffer based on the params
     * 
     * @param params
     *            , Key value pairs. You can include: value, an optional initial
     *            value which will be encoded and placed in the buffer. If value
     *            is a Number, type must also be set. This is simply a
     *            convenient way of calling Titanium.Codec.encodeString or
     *            <code>Titanium.Codec.encodeNumber</code> and placing the
     *            encoded value in the returned buffer. length: the length of
     *            the buffer, with a default of 0 unless value is specified, in
     *            which case the length of the encoded value. type, the type of
     *            data encoding to use with value, with
     *            Titanium.Codec.CHARSET_UTF8 being the default if value is a
     *            String, else this argument is required in the case of value
     *            being a number. byteOrder, the byte order of this buffer, with
     *            the default being the OS native byte order is used by default
     *            (see <code>Titanium.Codec.getNativeByteOrder</code>).
     * 
     * @return Titanium.Buffer
     */
    public static native Buffer createBuffer(Object params) /*-{
		var obj = Titanium.createBuffer(params);
		var toReturn = @com.emitrom.ti4j.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates a new buffer based on the params
     * 
     * @param params
     *            , Key value pairs. You can include: value, an optional initial
     *            value which will be encoded and placed in the buffer. If value
     *            is a Number, type must also be set. This is simply a
     *            convenient way of calling Titanium.Codec.encodeString or
     *            <code>Titanium.Codec.encodeNumber</code> and placing the
     *            encoded value in the returned buffer. length: the length of
     *            the buffer, with a default of 0 unless value is specified, in
     *            which case the length of the encoded value. type, the type of
     *            data encoding to use with value, with
     *            Titanium.Codec.CHARSET_UTF8 being the default if value is a
     *            String, else this argument is required in the case of value
     *            being a number. byteOrder, the byte order of this buffer, with
     *            the default being the OS native byte order is used by default
     *            (see <code>Titanium.Codec.getNativeByteOrder</code>).
     * 
     * @return Titanium.Buffer
     */
    public static native Buffer createBuffer(JavaScriptObject params) /*-{
		var obj = Titanium.createBuffer(params);
		var toReturn = @com.emitrom.ti4j.mobile.client.buffer.Buffer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Creates a new buffer with the specified size.
     * 
     * @param bufferSize
     *            the size of the buffer
     * @return Buffer
     * @since 1.1.0
     */
    public static Buffer createBuffer(int bufferSize) {
        JavaScriptObject jso = JavaScriptObject.createObject();
        JsoHelper.setAttribute(jso, "length", bufferSize);
        return Titanium.createBuffer(jso);
    }

    /**
     * Creates a new buffer with the specified data in it.
     * 
     * @param data
     *            the data to reside in the buffer
     * @return Buffer
     * @since 1.1.0
     */
    public static Buffer createBuffer(String value) {
        JavaScriptObject jso = JavaScriptObject.createObject();
        JsoHelper.setAttribute(jso, "value", value);
        return Titanium.createBuffer(jso);
    }

    /**
     * Creates a new buffer with the default size of 1024 bytes.
     * 
     * @return Buffer
     * @since 1.1.0
     */
    public static Buffer createBuffer() {
        return createBuffer(Buffer.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Fires a synthesized event to the views listener
     * 
     * @param name
     *            , name of event
     * @param eventObject
     *            , event object
     */
    public static native void fireEvent(String name, TiEvent eventObject) /*-{
		Titanium
				.fireEvent(
						name,
						eventObject.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Remove a previously added event listener
     * 
     * @param event
     *            , name of the event
     * @param listener
     *            , EventListner passed in addEventListener
     */
    public static void removeEventListner(String event, TiEventListener<?> listener) {
        removeEventListener(event, listener.getJsoPeer());
    }

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param message
     *            , the message to display
     */
    public static void alert(String message) {
        AlertDialog alert = new AlertDialog();
        if (Platform.get().isAndroid()) {
            alert = new AlertDialog("OK");
        }
        alert.setMessage(message);
        alert.show();
    };

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param message
     *            , the message to display
     */
    public static void alert(String message, ClickHandler clickHandler) {
        AlertDialog alert = new AlertDialog();
        if (Platform.get().isAndroid()) {
            alert = new AlertDialog("OK");
        }
        alert.setMessage(message);
        alert.addClickHandler(clickHandler);
        alert.show();
    };

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param title
     *            , the title of the message
     * @param message
     *            , the message to display
     */
    public static void alert(String title, String message) {
        AlertDialog alert = new AlertDialog();
        if (Platform.get().isAndroid()) {
            alert = new AlertDialog("OK");
        }
        alert.setTitle(title);
        alert.setMessage(message);
        alert.show();
    }

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param title
     *            , the title of the message
     * @param message
     *            , the message to display
     */
    public static void alert(String title, String message, ClickHandler handler) {
        AlertDialog alert = new AlertDialog();
        if (Platform.get().isAndroid()) {
            alert = new AlertDialog("OK");
        }
        alert.setTitle(title);
        alert.setMessage(message);
        alert.addClickHandler(handler);
        alert.show();
    }

    private static native void removeEventListener(String event, JavaScriptObject listener) /*-{
		Titanium.removeEventListener(event, listener);
    }-*/;

    /**
     * User-agent string used by Titanium.
     * 
     * @return
     */
    public static native String getUserAgent() /*-{
		return Titanium.userAgent;
    }-*/;

    /**
     * Version of Titanium that is executing.
     * 
     * @return
     */
    public static native String getVersion() /*-{
		return Titanium.version;
    }-*/;

    /**
     * Date of the Titanium build.
     */
    public static native String getBuildDate() /*-{
		return Titanium.buildDate;
    }-*/;

    /**
     * Git hash of the Titanium build.
     */
    public static native String getBuilHash() /*-{
		return Titanium.buildHash;
    }-*/;

    /**
     * Convenient method to detect if TiMobile is running in DevMode
     * 
     * @return true if we are running under GWT development mode
     */
    public static boolean isDevMode() {
        return !GWT.isScript() && GWT.isClient();
    }

}
