/**************************************************************************
   IPhone.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.iphone;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The iphone/ipad specific ui capabilities. all properties, methods and events
 * in this namespace will only work on the apple iphone or ipad related devices.
 */
public class IPhone extends TiModule {

    public static final int MODAL_PRESENTATION_CURRENT_CONTEXT = MODAL_PRESENTATION_CURRENT_CONTEXT();
    public static final int MODAL_PRESENTATION_FORMSHEET = MODAL_PRESENTATION_FORMSHEET();
    public static final int MODAL_PRESENTATION_FULLSCREEN = MODAL_PRESENTATION_FULLSCREEN();
    public static final int MODAL_PRESENTATION_PAGESHEET = MODAL_PRESENTATION_PAGESHEET();
    public static final int MODAL_TRANSITION_STYLE_COVER_VERTICAL = MODAL_TRANSITION_STYLE_COVER_VERTICAL();
    public static final int MODAL_TRANSITION_STYLE_CROSS_DISSOLVE = MODAL_TRANSITION_STYLE_CROSS_DISSOLVE();
    public static final int MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL = MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL();
    public static final int MODAL_TRANSITION_STYLE_PARTIAL_CURL = MODAL_TRANSITION_STYLE_PARTIAL_CURL();

    private static IPhone instance;

    public static IPhone get() {
        if (instance == null) {
            instance = new IPhone();
        }
        return instance;
    }

    private IPhone() {
        createPeer();
    }

    /**
     * @return Set the application badge for the application's icon in the
     *         springboard
     */
    public native String getAppBadge() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.appBadge;
    }-*/;

    public static native void setAppBadge(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.appBadge = value;
    }-*/;

    /**
     * @return Control whether the shake to edit system wide capability is
     *         enabled
     */
    public native boolean appSupportsShakeToEdit() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.appSupportsShakeToEdit;
    }-*/;

    public native void setAppSupportsShakeToEdit(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.appSupportsShakeToEdit = value;
    }-*/;

    /**
     * @return Control the status bar visibility
     */
    public static native boolean isStatusBarHidden() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.statusBarHidden;
    }-*/;

    public native void setStatusBarHidden(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.statusBarHidden = value;
    }-*/;

    /**
     * @return Constant that controls the status bar color style
     */
    public native int getStatusBarStyle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.statusBarStyle;
    }-*/;

    public native void setStatusBarStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.statusBarStyle = value;
    }-*/;

    public native JavaScriptObject createNavigationGroup() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.createNavigationGroup();
    }-*/;

    /**
     * Convenience method to hide the status bar
     * 
     * @param animated boolean to indicate if the action should be animated
     * @param animationStyle the animation style
     */
    public native void hideStatusBar(boolean animated, int animationStyle) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hideStatusBar(animated, animationStyle);
    }-*/;

    /**
     * Convenience method to show the status bar
     * 
     * @param animated boolean to indicate if the action should be animated
     * @param animationStyle the animation style
     */
    public native void showStatusBar(boolean animated, int animationStyle) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.showStatusBar(animated, animationStyle);
    }-*/;

    private static native final int MODAL_PRESENTATION_CURRENT_CONTEXT() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_CURRENT_CONTEXT;
    }-*/;

    private static native final int MODAL_PRESENTATION_FORMSHEET() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_FORMSHEET;
    }-*/;

    private static native final int MODAL_PRESENTATION_FULLSCREEN() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_FULLSCREEN;
    }-*/;

    private static native final int MODAL_PRESENTATION_PAGESHEET() /*-{
		return Titanium.UI.iPhone.MODAL_PRESENTATION_PAGESHEET;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_COVER_VERTICAL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_COVER_VERTICAL;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_CROSS_DISSOLVE() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_CROSS_DISSOLVE;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL;
    }-*/;

    private static native final int MODAL_TRANSITION_STYLE_PARTIAL_CURL() /*-{
		return Titanium.UI.iPhone.MODAL_TRANSITION_STYLE_PARTIAL_CURL;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeIPhoneUiModule();
    }

}
