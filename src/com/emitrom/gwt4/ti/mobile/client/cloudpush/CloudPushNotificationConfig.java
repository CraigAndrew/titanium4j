/**************************************************************************
   CloudPushNotificationConfig.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.cloudpush;

import com.emitrom.gwt4.ti.mobile.client.core.JsoHelper;
import com.emitrom.gwt4.ti.mobile.client.core.ProxyObject;

/**
 * Simple object for specifying token retrieval options to
 * <code>CloudPush.retrieveDeviceToken()</code>.
 */
public class CloudPushNotificationConfig extends ProxyObject {

    public CloudPushNotificationConfig() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Callback function called when an error occurs during registration.
     * 
     * @param errorHandler
     */
    public native void setErrorHandler(CloudPushNotificationErrorHandler errorHandler)/*-{
		var peer = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		peer.error = function(e) {
			var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.cloudpush.CloudPushNotificationErrorEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			errorHandler.@com.emitrom.gwt4.ti.mobile.client.cloudpush.CloudPushNotificationErrorHandler::onError(Lcom/emitrom/gwt4/ti/mobile/client/core/events/cloudpush/CloudPushNotificationErrorEvent;)(eventObject);
		};
    }-*/;

    /**
     * Callback function called when an error occurs during registration.
     * 
     * @param errorHandler
     */
    public native void setSuccessHandler(CloudPushNotificationSuccessHandler successHandler)/*-{
		var peer = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		peer.error = function(e) {
			var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.cloudpush.CloudPushNotificationSuccessEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			successHandler.@com.emitrom.gwt4.ti.mobile.client.cloudpush.CloudPushNotificationSuccessHandler::onSuccess(Lcom/emitrom/gwt4/ti/mobile/client/core/events/cloudpush/CloudPushNotificationSuccessEvent;)(eventObject);
		};
    }-*/;

}
