/**************************************************************************
   App.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.app;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.handlers.EventHandler;

/**
 * The top level App module. The App module is mainly used for accessing
 * information about the application at runtime.
 * 
 * The App module exposes a number of properties set in the tiapp.xml file.
 * Three of these properties, the application name, ID, and URL, must be
 * specified when the application is created.
 * 
 */
public class App extends TiModule {

    private static final App INSTANCE = new App();

    public static App get() {
        return INSTANCE;
    }

    private App() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createApp();
    }

    /**
     * Indicates whether Analytics is enabled, determined by tiapp.xml.
     */
    public native boolean isAnalyticsEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.analytics;
    }-*/;

    /**
     * Application copyright statement, determined by tiapp.xml.
     */
    public native String getCopyright() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.copyright;
    }-*/;

    /**
     * Build type that reflects how the application was packaged; either test,
     * development or production.
     */
    public native String getDeployType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.deployType;
    }-*/;

    /**
     * Application description, determined by tiapp.xml.
     */
    public native String getDescription() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.description;
    }-*/;

    /**
     * Application globally-unique ID, determined by tiapp.xml.
     */
    public native String getGuId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.guid;
    }-*/;

    /**
     * Application ID, from tiapp.xml.
     */
    public native String getId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.id;
    }-*/;

    /**
     * @iosOnly Determines whether the screen is locked when the device is idle.
     */
    public native boolean isIdelTimerDisabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.idleTimerDisabled;
    }-*/;

    /**
     * @iosOnly Determines whether the screen is locked when the device is idle.
     */
    public native void setIdelTimerDisabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.idleTimerDisabled = value;
    }-*/;

    /**
     * @iosOnly The install ID for this application.
     */
    public native String getInstallId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.installId;
    }-*/;

    /**
     * Application name, determined by tiapp.xml.
     */
    public native String getName() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.name;
    }-*/;

    /**
     * @iosOnly Determines whether proximity detection is enabled.
     */
    public native boolean isProxymityDectionEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.proximityDetection;
    }-*/;

    /**
     * @iosOnly Determines whether the screen is locked when the device is idle.
     *          Set to true to receive proximity events.
     */
    public native void setProximityDetection(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.proximityDetection = true;
    }-*/;

    /**
     * @iosOnly Indicates the state of the device's proximity sensor, according
     *          to the proximity event.
     * 
     *          This property is true when the proximity sensor is close to the
     *          user. When proximityDetection is disabled, the value of this
     *          property is undefined.
     */
    public native boolean hasProximityState() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.proximityState;
    }-*/;

    /**
     * Application publisher, from tiapp.xml.
     */
    public native String getPublisher() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.publisher;
    }-*/;

    /**
     * Unique session identifier for the current continuous run of the
     * application.
     */
    public native String getSessionId() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.sessionId;
    }-*/;

    /**
     * Application URL, from tiapp.xml.
     */
    public native String getUrl() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.url;
    }-*/;

    /**
     * Application version, from tiapp.xml.
     */
    public native String getVersion() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.version;
    }-*/;

    /**
     * @isOnly
     * @param handler
     */
    public void addKeyBoardFrameChangedHandler(EventHandler handler) {
        addEventHandler("keyboardFrameChanged", handler);
    }

    public void addPauseHandler(EventHandler handler) {
        addEventHandler("pause", handler);
    }

    public void addPausedHandler(EventHandler handler) {
        addEventHandler("paused", handler);
    }

    public void addProximityHandler(EventHandler handler) {
        addEventHandler("proximity", handler);
    }

    public void addResumeHandler(EventHandler handler) {
        addEventHandler("resume", handler);
    }

    public void addResumedHandler(EventHandler handler) {
        addEventHandler("resumer", handler);
    }

}
