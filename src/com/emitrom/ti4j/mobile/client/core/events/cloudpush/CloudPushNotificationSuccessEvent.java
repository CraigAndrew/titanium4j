/**************************************************************************
   CloudPushNotificationSuccessEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.core.events.cloudpush;

import com.emitrom.ti4j.mobile.client.cloudpush.CloudPushNotificationSuccessHandler;
import com.emitrom.ti4j.mobile.client.core.events.TiEvent;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * An event object passed to the retrieveDeviceToken success callback.
 */
public class CloudPushNotificationSuccessEvent extends TiEvent {

	/**
	 * UiBinder implementations
	 */
	private static Type<CloudPushNotificationSuccessHandler> TYPE = new Type<CloudPushNotificationSuccessHandler>("cloudpushnotificationsuccess", null);
	public static Type<CloudPushNotificationSuccessHandler> getType() {
		return TYPE;
	}
	
	public static Type<CloudPushNotificationSuccessHandler> getAssociatedType() {
		return TYPE;
	}
	
    public CloudPushNotificationSuccessEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * The device token which this device was registered for.
     * 
     * @return
     */
    public native String getDeviceToken()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.deviceToken;
    }-*/;

}
