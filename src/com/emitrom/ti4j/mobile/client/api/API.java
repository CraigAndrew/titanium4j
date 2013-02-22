/**************************************************************************
   API.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.api;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * The top level API module. The API module is mainly used for logging.
 */
public class API extends TiModule {

    private static API instance = null;

    public static API get() {
        if (instance == null) {
            instance = new API();
        }
        return instance;
    }

    private API() {
        createPeer();
    }

    /**
     * Function for info debug messages
     * 
     * @param message , the message to log
     */
    public native void info(String message) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.info(message);
    }-*/;

    /**
     * Function for logging debug messages
     * 
     * @param message , the message to log
     */
    public native void debug(String message) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.debug(message);
    }-*/;

    /**
     * Function for logging error messages
     * 
     * @param message , the message to log
     */
    public native void error(String message) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.error(message);
    }-*/;

    /**
     * Function for logging custom severity message
     * 
     * @param message , the message to log
     */
    public native void log(String level, String message) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.log(level, message);
    }-*/;

    /**
     * Function for logging warn messages
     * 
     * @param message , the message to log
     */
    public native void warn(String message) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.warn(message);
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createAPI();

    }

}
