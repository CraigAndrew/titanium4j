/**************************************************************************
   Android.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.android;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * The android specific UI capabilities. all properties, methods and events in
 * this namespace will only work on android related devices.
 */
public class Android extends TiModule {

    public static final int LINKIFY_ALL = LINKIFY_ALL();
    public static final int LINKIFY_EMAIL_ADDRESSES = LINKIFY_EMAIL_ADDRESSES();
    public static final int LINKIFY_MAP_ADDRESSES = LINKIFY_MAP_ADDRESSES();
    public static final int LINKIFY_MAP_LINKS = LINKIFY_MAP_LINKS();
    public static final int LINKIFY_PHONE_NUMBERS = LINKIFY_PHONE_NUMBERS();
    public static final int LINKIFY_WEB_URLS = LINKIFY_WEB_URLS();
    public static final int SOFT_INPUT_ADJUST_PAN = SOFT_INPUT_ADJUST_PAN();
    public static final int SOFT_INPUT_ADJUST_RESIZE = SOFT_INPUT_ADJUST_RESIZE();
    public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = SOFT_INPUT_ADJUST_UNSPECIFIED();
    public static final int SOFT_INPUT_STATE_HIDDEN = SOFT_INPUT_STATE_HIDDEN();
    public static final int SOFT_INPUT_STATE_UNSPECIFIED = SOFT_INPUT_STATE_UNSPECIFIED();
    public static final int SOFT_INPUT_STATE_VISIBLE = SOFT_INPUT_STATE_VISIBLE();
    public static final int SOFT_KEYBOARD_DEFAULT_ON_FOCUS = SOFT_KEYBOARD_DEFAULT_ON_FOCUS();
    public static final int SOFT_KEYBOARD_HIDE_ON_FOCUS = SOFT_KEYBOARD_HIDE_ON_FOCUS();
    public static final int SOFT_KEYBOARD_SHOW_ON_FOCUS = SOFT_KEYBOARD_SHOW_ON_FOCUS();
    public static final int SWITCH_STYLE_CHECKBOX = SWITCH_STYLE_CHECKBOX();
    public static final int SWITCH_STYLE_TOGGLEBUTTON = SWITCH_STYLE_TOGGLEBUTTON();

    private static Android instance = null;

    public static Android get() {
        if (instance == null) {
            return new Android();
        }
        return instance;
    }

    private Android() {
        createPeer();
    }

    /**
     * Request that the soft keyboard hide. note: it is not currently possible
     * in the native android api to detect that the keyboard is already visible.
     * note: it is not possible to globally show the keyboard at this point.
     */
    public native void hideSoftKeyboard() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.hideSoftKeyboard();
    }-*/;

    /**
     * Open android native preferences ui activity. you need to place your
     * preferences.xml file in the platform/android/res/xml/ folder of your
     * project. documentation on the file format may be found in the [android
     * documentation
     * ](http://developer.android.com/resources/samples/apidemos/res
     * /xml/preferences.html)
     */
    public native void openPreferences() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.openPreferences();
    }-*/;

    private static native final int LINKIFY_ALL() /*-{
		return Titanium.UI.Android.LINKIFY_ALL ? Titanium.UI.Android.LINKIFY_ALL
				: 0;
    }-*/;

    private static native final int LINKIFY_EMAIL_ADDRESSES() /*-{
		return Titanium.UI.Android.LINKIFY_EMAIL_ADDRESSES ? Titanium.UI.Android.LINKIFY_EMAIL_ADDRESSES
				: 0;
    }-*/;

    private static native final int LINKIFY_MAP_ADDRESSES() /*-{
		return Titanium.UI.Android.LINKIFY_MAP_ADDRESSES ? Titanium.UI.Android.LINKIFY_MAP_ADDRESSES
				: 0;
    }-*/;

    private static native final int LINKIFY_MAP_LINKS() /*-{
		return Titanium.UI.Android.LINKIFY_MAP_LINKS ? Titanium.UI.Android.LINKIFY_MAP_LINKS
				: 0;
    }-*/;

    private static native final int LINKIFY_PHONE_NUMBERS() /*-{
		return Titanium.UI.Android.LINKIFY_PHONE_NUMBERS ? Titanium.UI.Android.LINKIFY_PHONE_NUMBERS
				: 0;
    }-*/;

    private static native final int LINKIFY_WEB_URLS() /*-{
		return Titanium.UI.Android.LINKIFY_WEB_URLS ? Titanium.UI.Android.LINKIFY_WEB_URLS
				: 0;
    }-*/;

    private static native final int SOFT_INPUT_ADJUST_PAN() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN ? Titanium.UI.Android.SOFT_INPUT_ADJUST_PAN
				: 0;
    }-*/;

    private static native final int SOFT_INPUT_ADJUST_RESIZE() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE ? Titanium.UI.Android.SOFT_INPUT_ADJUST_RESIZE
				: 0;
    }-*/;

    private static native final int SOFT_INPUT_ADJUST_UNSPECIFIED() /*-{
		return Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED ? Titanium.UI.Android.SOFT_INPUT_ADJUST_UNSPECIFIED
				: 0;
    }-*/;

    private static native final int SOFT_INPUT_STATE_HIDDEN() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN ? Titanium.UI.Android.SOFT_INPUT_STATE_HIDDEN
				: 0;
    }-*/;

    private static native final int SOFT_INPUT_STATE_UNSPECIFIED() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED ? Titanium.UI.Android.SOFT_INPUT_STATE_UNSPECIFIED
				: 0;
    }-*/;

    private static native final int SOFT_INPUT_STATE_VISIBLE() /*-{
		return Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE ? Titanium.UI.Android.SOFT_INPUT_STATE_VISIBLE
				: 0;
    }-*/;

    private static native final int SOFT_KEYBOARD_DEFAULT_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS ? Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS
				: 0;
    }-*/;

    private static native final int SOFT_KEYBOARD_HIDE_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS ? Titanium.UI.Android.SOFT_KEYBOARD_HIDE_ON_FOCUS
				: 0;
    }-*/;

    private static native final int SOFT_KEYBOARD_SHOW_ON_FOCUS() /*-{
		return Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS ? Titanium.UI.Android.SOFT_KEYBOARD_SHOW_ON_FOCUS
				: 0;
    }-*/;

    private static native final int SWITCH_STYLE_CHECKBOX() /*-{
		return Titanium.UI.Android.SWITCH_STYLE_CHECKBOX ? Titanium.UI.Android.SWITCH_STYLE_CHECKBOX
				: 0;
    }-*/;

    private static native final int SWITCH_STYLE_TOGGLEBUTTON() /*-{
		return Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON ? Titanium.UI.Android.SWITCH_STYLE_TOGGLEBUTTON
				: 0;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeAndroidUIModule();
    }

}
