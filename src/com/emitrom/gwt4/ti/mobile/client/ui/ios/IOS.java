/**************************************************************************
   IOS.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui.ios;

import com.emitrom.gwt4.ti.mobile.client.core.TiFactory;
import com.emitrom.gwt4.ti.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The apple ios specific ui capabilities. all properties, methods and events in
 * this namespace will only work on the apple ios related devices.
 */
public class IOS extends TiModule {

    public static final int ANIMATION_CURVE_EASE_IN = ANIMATION_CURVE_EASE_IN();
    public static final int ANIMATION_CURVE_EASE_IN_OUT = ANIMATION_CURVE_EASE_IN_OUT();
    public static final int ANIMATION_CURVE_EASE_OUT = ANIMATION_CURVE_EASE_OUT();
    public static final int ANIMATION_CURVE_LINEAR = ANIMATION_CURVE_LINEAR();
    public static final int AUTODETECT_ADDRESS = AUTODETECT_ADDRESS();
    public static final int AUTODETECT_ALL = AUTODETECT_ALL();
    public static final int AUTODETECT_CALENDAR = AUTODETECT_CALENDAR();
    public static final int AUTODETECT_NONE = AUTODETECT_NONE();
    public static final int AUTODETECT_LINK = AUTODETECT_LINK();
    public static final int BLEND_MODE_CLEAR = BLEND_MODE_CLEAR();
    public static final int AUTODETECT_PHONE = AUTODETECT_PHONE();
    public static final int BLEND_MODE_COLOR = BLEND_MODE_COLOR();
    public static final int BLEND_MODE_COLOR_DODGE = BLEND_MODE_COLOR_DODGE();
    public static final int BLEND_MODE_COLOR_BURN = BLEND_MODE_COLOR_BURN();
    public static final int BLEND_MODE_COPY = BLEND_MODE_COPY();
    public static final int BLEND_MODE_DARKEN = BLEND_MODE_DARKEN();
    public static final int BLEND_MODE_DESTINATION_ATOP = BLEND_MODE_DESTINATION_ATOP();
    public static final int BLEND_MODE_DESTINATION_OUT = BLEND_MODE_DESTINATION_OUT();
    public static final int BLEND_MODE_DESTINATION_OVER = BLEND_MODE_DESTINATION_OVER();
    public static final int BLEND_MODE_EXCLUSION = BLEND_MODE_EXCLUSION();
    public static final int BLEND_MODE_DIFFERENCE = BLEND_MODE_DIFFERENCE();
    public static final int BLEND_MODE_DESTINATION_IN = BLEND_MODE_DESTINATION_IN();
    public static final int BLEND_MODE_HARD_LIGHT = BLEND_MODE_HARD_LIGHT();
    public static final int BLEND_MODE_HUE = BLEND_MODE_HUE();
    public static final int BLEND_MODE_LIGHTEN = BLEND_MODE_LIGHTEN();
    public static final int BLEND_MODE_MULTIPLY = BLEND_MODE_MULTIPLY();
    public static final int BLEND_MODE_NORMAL = BLEND_MODE_NORMAL();
    public static final int BLEND_MODE_OVERLAY = BLEND_MODE_OVERLAY();
    public static final int BLEND_MODE_PLUS_DARKER = BLEND_MODE_PLUS_DARKER();
    public static final int BLEND_MODE_PLUS_LIGHTER = BLEND_MODE_PLUS_LIGHTER();
    public static final int BLEND_MODE_SATURATION = BLEND_MODE_SATURATION();
    public static final int BLEND_MODE_SCREEN = BLEND_MODE_SCREEN();
    public static final int BLEND_MODE_SOFT_LIGHT = BLEND_MODE_SOFT_LIGHT();
    public static final int BLEND_MODE_LUMINOSITY = BLEND_MODE_LUMINOSITY();
    public static final int BLEND_MODE_SOURCE_ATOP = BLEND_MODE_SOURCE_ATOP();
    public static final int BLEND_MODE_SOURCE_IN = BLEND_MODE_SOURCE_IN();
    public static final int BLEND_MODE_SOURCE_OUT = BLEND_MODE_SOURCE_OUT();
    public static final int BLEND_MODE_XOR = BLEND_MODE_XOR();

    private static IOS instance = null;

    public static IOS get() {
        if (instance == null) {
            instance = new IOS();
        }
        return instance;
    }

    private IOS() {
        createPeer();
    }

    native JavaScriptObject createAdView() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.createAdView();
    }-*/;

    native JavaScriptObject createToolbar() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.createToolbar();
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeIosUiModule();
    }

    private static final native int ANIMATION_CURVE_EASE_IN() /*-{
		return Titanium.UI.iOS.ANIMATION_CURVE_EASE_IN ? Titanium.UI.iOS.ANIMATION_CURVE_EASE_IN
				: 0;
    }-*/;

    private static native final int ANIMATION_CURVE_EASE_IN_OUT() /*-{
		return Titanium.UI.iOS.ANIMATION_CURVE_EASE_IN_OUT ? Titanium.UI.iOS.ANIMATION_CURVE_EASE_IN_OUT
				: 0;
    }-*/;

    private static native final int ANIMATION_CURVE_EASE_OUT() /*-{
		return Titanium.UI.iOS.ANIMATION_CURVE_EASE_OUT ? Titanium.UI.iOS.ANIMATION_CURVE_EASE_OUT
				: 0;
    }-*/;

    private static native final int ANIMATION_CURVE_LINEAR() /*-{
		return Titanium.UI.iOS.ANIMATION_CURVE_LINEAR ? Titanium.UI.iOS.ANIMATION_CURVE_LINEAR
				: 0;
    }-*/;

    private static native final int AUTODETECT_ADDRESS() /*-{
		return Titanium.UI.iOS.AUTODETECT_ADDRESS ? Titanium.UI.iOS.AUTODETECT_ADDRESS
				: 0;
    }-*/;

    private static native final int AUTODETECT_ALL() /*-{
		return Titanium.UI.iOS.AUTODETECT_ALL ? Titanium.UI.iOS.AUTODETECT_ALL
				: 0;
    }-*/;

    private static native final int AUTODETECT_CALENDAR() /*-{
		return Titanium.UI.iOS.AUTODETECT_CALENDAR ? Titanium.UI.iOS.AUTODETECT_CALENDAR
				: 0;
    }-*/;

    private static native final int AUTODETECT_LINK() /*-{
		return Titanium.UI.iOS.AUTODETECT_LINK ? Titanium.UI.iOS.AUTODETECT_LINK
				: 0;
    }-*/;

    private static native final int AUTODETECT_NONE() /*-{
		return Titanium.UI.iOS.AUTODETECT_NONE ? Titanium.UI.iOS.AUTODETECT_NONE
				: 0;
    }-*/;

    private static native final int AUTODETECT_PHONE() /*-{
		return Titanium.UI.iOS.AUTODETECT_PHONE ? Titanium.UI.iOS.AUTODETECT_PHONE
				: 0;
    }-*/;

    private static native final int BLEND_MODE_CLEAR() /*-{
		return Titanium.UI.iOS.BLEND_MODE_CLEAR ? Titanium.UI.iOS.BLEND_MODE_CLEAR
				: 0;
    }-*/;

    private static native final int BLEND_MODE_COLOR() /*-{
		return Titanium.UI.iOS.BLEND_MODE_COLOR ? Titanium.UI.iOS.BLEND_MODE_COLOR
				: 0;
    }-*/;

    private static native final int BLEND_MODE_COLOR_BURN() /*-{
		return Titanium.UI.iOS.BLEND_MODE_COLOR_BURN ? Titanium.UI.iOS.BLEND_MODE_COLOR_BURN
				: 0;
    }-*/;

    private static native final int BLEND_MODE_COLOR_DODGE() /*-{
		return Titanium.UI.iOS.BLEND_MODE_COLOR_DODGE ? Titanium.UI.iOS.BLEND_MODE_COLOR_DODGE
				: 0;
    }-*/;

    private static native final int BLEND_MODE_COPY() /*-{
		return Titanium.UI.iOS.BLEND_MODE_COPY ? Titanium.UI.iOS.BLEND_MODE_COPY
				: 0;
    }-*/;

    private static native final int BLEND_MODE_DARKEN() /*-{
		return Titanium.UI.iOS.BLEND_MODE_DARKEN ? Titanium.UI.iOS.BLEND_MODE_DARKEN
				: 0;
    }-*/;

    private static native final int BLEND_MODE_DESTINATION_ATOP() /*-{
		return Titanium.UI.iOS.BLEND_MODE_DESTINATION_ATOP ? Titanium.UI.iOS.BLEND_MODE_DESTINATION_ATOP
				: 0;
    }-*/;

    private static native final int BLEND_MODE_DESTINATION_IN() /*-{
		return Titanium.UI.iOS.BLEND_MODE_DESTINATION_IN ? Titanium.UI.iOS.BLEND_MODE_DESTINATION_IN
				: 0;
    }-*/;

    private static native final int BLEND_MODE_DESTINATION_OUT() /*-{
		return Titanium.UI.iOS.BLEND_MODE_DESTINATION_OUT ? Titanium.UI.iOS.BLEND_MODE_DESTINATION_OUT
				: 0;
    }-*/;

    private static native final int BLEND_MODE_DESTINATION_OVER() /*-{
		return Titanium.UI.iOS.BLEND_MODE_DESTINATION_OVER ? Titanium.UI.iOS.BLEND_MODE_DESTINATION_OVER
				: 0;
    }-*/;

    private static native final int BLEND_MODE_DIFFERENCE() /*-{
		return Titanium.UI.iOS.BLEND_MODE_DIFFERENCE ? Titanium.UI.iOS.BLEND_MODE_DIFFERENCE
				: 0;
    }-*/;

    private static native final int BLEND_MODE_EXCLUSION() /*-{
		return Titanium.UI.iOS.BLEND_MODE_EXCLUSION ? Titanium.UI.iOS.BLEND_MODE_EXCLUSION
				: 0;
    }-*/;

    private static native final int BLEND_MODE_HARD_LIGHT() /*-{
		return Titanium.UI.iOS.BLEND_MODE_HARD_LIGHT ? Titanium.UI.iOS.BLEND_MODE_HARD_LIGHT
				: 0;
    }-*/;

    private static native final int BLEND_MODE_HUE() /*-{
		return Titanium.UI.iOS.BLEND_MODE_HUE ? Titanium.UI.iOS.BLEND_MODE_HUE
				: 0;
    }-*/;

    private static native final int BLEND_MODE_LIGHTEN() /*-{
		return Titanium.UI.iOS.BLEND_MODE_LIGHTEN ? Titanium.UI.iOS.BLEND_MODE_LIGHTEN
				: 0;
    }-*/;

    private static native final int BLEND_MODE_LUMINOSITY() /*-{
		return Titanium.UI.iOS.BLEND_MODE_LUMINOSITY ? Titanium.UI.iOS.BLEND_MODE_LUMINOSITY
				: 0;
    }-*/;

    private static native final int BLEND_MODE_MULTIPLY() /*-{
		return Titanium.UI.iOS.BLEND_MODE_MULTIPLY ? Titanium.UI.iOS.BLEND_MODE_MULTIPLY
				: 0;
    }-*/;

    private static native final int BLEND_MODE_NORMAL() /*-{
		return Titanium.UI.iOS.BLEND_MODE_NORMAL ? Titanium.UI.iOS.BLEND_MODE_NORMAL
				: 0;
    }-*/;

    private static native final int BLEND_MODE_OVERLAY() /*-{
		return Titanium.UI.iOS.BLEND_MODE_OVERLAY ? Titanium.UI.iOS.BLEND_MODE_OVERLAY
				: 0;
    }-*/;

    private static native final int BLEND_MODE_PLUS_DARKER() /*-{
		return Titanium.UI.iOS.BLEND_MODE_PLUS_DARKER ? Titanium.UI.iOS.BLEND_MODE_PLUS_DARKER
				: 0;
    }-*/;

    private static native final int BLEND_MODE_PLUS_LIGHTER() /*-{
		return Titanium.UI.iOS.BLEND_MODE_PLUS_LIGHTER ? Titanium.UI.iOS.BLEND_MODE_PLUS_LIGHTER
				: 0;
    }-*/;

    private static native final int BLEND_MODE_SATURATION() /*-{
		return Titanium.UI.iOS.BLEND_MODE_SATURATION ? Titanium.UI.iOS.BLEND_MODE_SATURATION
				: 0;
    }-*/;

    private static native final int BLEND_MODE_SCREEN() /*-{
		return Titanium.UI.iOS.BLEND_MODE_SCREEN ? Titanium.UI.iOS.BLEND_MODE_SCREEN
				: 0;
    }-*/;

    private static native final int BLEND_MODE_SOFT_LIGHT() /*-{
		return Titanium.UI.iOS.BLEND_MODE_SOFT_LIGHT ? Titanium.UI.iOS.BLEND_MODE_SOFT_LIGHT
				: 0;
    }-*/;

    private static native final int BLEND_MODE_SOURCE_ATOP() /*-{
		return Titanium.UI.iOS.BLEND_MODE_SOURCE_ATOP ? Titanium.UI.iOS.BLEND_MODE_SOURCE_ATOP
				: 0;
    }-*/;

    private static native final int BLEND_MODE_SOURCE_IN() /*-{
		return Titanium.UI.iOS.BLEND_MODE_SOURCE_IN ? Titanium.UI.iOS.BLEND_MODE_SOURCE_IN
				: 0;
    }-*/;

    private static native final int BLEND_MODE_SOURCE_OUT() /*-{
		return Titanium.UI.iOS.BLEND_MODE_SOURCE_OUT ? Titanium.UI.iOS.BLEND_MODE_SOURCE_OUT
				: 0;
    }-*/;

    private static native final int BLEND_MODE_XOR() /*-{
		return Titanium.UI.iOS.BLEND_MODE_XOR ? Titanium.UI.iOS.BLEND_MODE_XOR
				: 0;
    }-*/;

}
