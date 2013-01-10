/**************************************************************************
   Network.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.network;

import com.emitrom.gwt4.ti.mobile.client.core.TiFactory;
import com.emitrom.gwt4.ti.mobile.client.core.TiModule;
import com.emitrom.gwt4.ti.mobile.client.core.events.NetworkChangeEvent;
import com.emitrom.gwt4.ti.mobile.client.core.events.TiEventListener;
import com.emitrom.gwt4.ti.mobile.client.network.socket.Socket;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * The top level network module. the network module is used accessing networking
 * related functionality.
 */
public class Network extends TiModule {

    public static final String INADDR_ANY = INADDR_ANY();
    public static final int NETWORK_LAN = NETWORK_LAN();
    public static final int NETWORK_MOBILE = NETWORK_MOBILE();
    public static final int NETWORK_NONE = NETWORK_NONE();
    public static final int NETWORK_UNKNOWN = NETWORK_UNKNOWN();
    public static final int NETWORK_WIFI = NETWORK_WIFI();
    public static final int NOTIFICATION_TYPE_ALERT = NOTIFICATION_TYPE_ALERT();
    public static final int NOTIFICATION_TYPE_BADGE = NOTIFICATION_TYPE_BADGE();
    public static final int NOTIFICATION_TYPE_SOUND = NOTIFICATION_TYPE_SOUND();
    public static final int READ_MODE = READ_MODE();
    public static final int READ_WRITE_MODE = READ_WRITE_MODE();
    public static final int SOCKET_CLOSED = SOCKET_CLOSED();
    public static final int SOCKET_CONNECTED = SOCKET_CONNECTED();
    public static final int SOCKET_ERROR = SOCKET_ERROR();
    public static final int SOCKET_INITIALIZED = SOCKET_INITIALIZED();
    public static final int SOCKET_LISTENING = SOCKET_LISTENING();
    public static final int WRITE_MODE = WRITE_MODE();

    private static Network instance = null;

    public static Network get() {
        if (instance == null) {
            instance = new Network();
        }
        return instance;
    }

    private Network() {
        createPeer();
    }

    /**
     * @return The network type value as a constant.
     */
    public native int getNetworkType() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.networkType;
    }-*/;

    public native void setNetworkType(int value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.networkType = value;
    }-*/;

    /**
     * @return The network type name constant. returns one of `none`, `wifi`,
     *         `lan` or `mobile`.
     */
    public native String getNetworkTypeName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.networkTypeName;
    }-*/;

    public native void setNetworkTypeName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.networkTypeName = value;
    }-*/;

    /**
     * @return Readonly boolean value that indicates if the network is reachable
     *         to the internet either via wifi or carrier network
     */
    public native boolean isOnline() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.online;
    }-*/;

    /**
     * @return The remote device uuid if the device was registered with the
     *         apple push notification service or null if not set. only
     *         available on iphone.
     * 
     */
    public native String getRemoteDeviceUUID() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.remoteDeviceUUID;
    }-*/;

    public native void setRemoteDeviceUUID(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.remoteDeviceUUID = value;
    }-*/;

    /**
     * @return Returns an array of network type constants enabled for the
     *         application. only available on iphone.
     */
    public native <T> T getRemoteNotificationTypes() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.remoteNotificationTypes;
    }-*/;

    public native void setRemoteNotificationTypes(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.remoteNotificationTypes = value;
    }-*/;

    /**
     * @return Returns true if remote notifications have been enabled. only
     *         available on iphone. Available on iOs only
     */
    public native boolean isRemoteNotificationsEnabled() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.remoteNotificationsEnabled;
    }-*/;

    public native void setRemoteNotificationsEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.remoteNotificationsEnabled = value;
    }-*/;

    public native HTTPClient createHTTPClient() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createHTTPClient({
			// function called when an error occurs, including a timeout
			onerror : function(e) {
				Ti.API.debug(e.error);
				alert('error');
			}
		});
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.HTTPClient::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Socket createSocket() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createSocket();
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.socket.Socket::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link org.urish.gwtit.titanium.network.bonjourbrowser}
     * 
     * Available on iOs only
     * 
     * 
     * @param serviceType
     *            service to search for, must include the protocol type suffix
     *            (._tcp)
     */
    public native BonjourBrowser createBonjourBrowser(String serviceType) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createBonjourBrowser(serviceType);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.BonjourBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourBrowser}
     * 
     * Available on iOs only
     * 
     * @param serviceType
     *            service to search for, must include the protocol type suffix
     *            (._tcp)
     * @param domain
     *            the Bonjour service domain to conduct the search in. Default
     *            value is 'local.'
     */
    public native BonjourBrowser createBonjourBrowser(String serviceType, String domain) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createBonjourBrowser(serviceType, domain);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.BonjourBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourBrowser}
     * 
     * Available on iOs only
     * 
     * @param serviceType
     *            service to search for, must include the protocol type suffix
     *            (._tcp)
     * @param domain
     *            the Bonjour service domain to conduct the search in. Default
     *            value is 'local.'
     * @param parameters
     *            A dictionary object of properties defined in
     *            {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourBrowser}
     */
    public native BonjourBrowser createBonjourBrowser(String serviceType, String domain, Object parameters) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createBonjourBrowser(serviceType, domain, parameters);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.BonjourBrowser::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourService}
     * 
     * Available on iOs only
     * 
     * @param name
     *            the name of the service. Must be a unique identifier for this
     *            service type and domain.
     * @param type
     *            the type of service. Must include the protocol identifier
     *            (._tcp)
     */
    public native BonjourService createBonjourService(String name, String type) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createBonjourService(name, type);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.BonjourService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourService}
     * 
     * Available on iOs only
     * 
     * @param name
     *            the name of the service. Must be a unique identifier for this
     *            service type and domain.
     * @param type
     *            the type of service. Must include the protocol identifier
     *            (._tcp)
     * @param domain
     *            the domain to publish the service in. Default value is
     *            'local.'
     */
    public native BonjourService createBonjourService(String name, String type, String domain) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createBonjourService(name, type, domain);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.BonjourService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourService}
     * 
     * Available on iOs only
     * 
     * @param name
     *            the name of the service. Must be a unique identifier for this
     *            service type and domain.
     * @param type
     *            the type of service. Must include the protocol identifier
     *            (._tcp)
     * @param domain
     *            the domain to publish the service in. Default value is
     *            'local.'
     * @param parameters
     *            A dictionary object with properties defined in
     *            {@link com.emitrom.gwt4.ti.mobile.client.network.BonjourService}
     */
    public native BonjourService createBonjourService(String name, String type, String domain, Object parameters) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createBonjourService(name, type, domain, parameters);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.BonjourService::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * {@link com.emitrom.gwt4.ti.mobile.client.network.TCPSocket}
     * 
     * @param hostName
     *            the host name to connect to/listen on
     * @param port
     *            the port for the socket
     * @param mode
     *            the socket's mode
     */
    public native TCPSocket createTCPSocket(String hostName, int port, int mode, Object parameters) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.createTCPSocket(hostName, port, mode, parameters);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.network.TCPSocket::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Decode a uri component part using uri encoding
     * 
     * @param value
     *            input value to be decoded
     */
    public native String decodeURIComponent(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.decodeURIComponent(value);
    }-*/;

    /**
     * Encode a uri component part using uri encoding
     * 
     * @param value
     *            input value to be encoded
     */
    public native String encodeURIComponent(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.encodeURIComponent(value);
    }-*/;

    /**
     * Register for push notifications with the apple push notification service.
     * only available on iphone.
     * 
     * @param config
     *            dictionary of the following: `types` is an array of type
     *            constants that the application would like to receive,
     *            `success` is a callback function that is called when the push
     *            registration is successfully completed, `error` is a callback
     *            function that is called when an error is received during
     *            registration and `callback` is a callback function that is
     *            invoked upon receiving a new push notification. This method
     *            should be called at application startup.
     */
    public native void registerForPushNotifications(Object config) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.registerForPushNotifications(config);
    }-*/;

    public void addChangeHandler(TiEventListener<NetworkChangeEvent> handler) {
        addEventListener(NetworkChangeEvent.CHANGE, handler);
    }

    /**
     * sets the Entrypoint of the given RPC service
     * 
     * @param service
     * @param moduleUrl
     * @param relativeServiceUrl
     */
    public void setServiceEntryPoint(ServiceDefTarget service, final String moduleUrl, String relativeServiceUrl) {
        service.setServiceEntryPoint(moduleUrl + relativeServiceUrl);
    }

    private static native final String INADDR_ANY() /*-{
		return Titanium.Network.INADDR_ANY;
    }-*/;

    private static native final int NETWORK_LAN() /*-{
		return Titanium.Network.NETWORK_LAN;
    }-*/;

    private static native final int NETWORK_MOBILE() /*-{
		return Titanium.Network.NETWORK_MOBILE;
    }-*/;

    private static native final int NETWORK_NONE() /*-{
		return Titanium.Network.NETWORK_NONE;
    }-*/;

    private static native final int NETWORK_UNKNOWN() /*-{
		return Titanium.Network.NETWORK_UNKNOWN;
    }-*/;

    private static native final int NETWORK_WIFI() /*-{
		return Titanium.Network.NETWORK_WIFI;
    }-*/;

    private static native final int NOTIFICATION_TYPE_ALERT() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_ALERT;
    }-*/;

    private static native final int NOTIFICATION_TYPE_BADGE() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_BADGE;
    }-*/;

    private static native final int NOTIFICATION_TYPE_SOUND() /*-{
		return Titanium.Network.NOTIFICATION_TYPE_SOUND;
    }-*/;

    private static native final int READ_MODE() /*-{
		return Titanium.Network.READ_MODE;
    }-*/;

    private static native final int READ_WRITE_MODE() /*-{
		return Titanium.Network.READ_WRITE_MODE;
    }-*/;

    private static native final int SOCKET_CLOSED() /*-{
		return Titanium.Network.SOCKET_CLOSED;
    }-*/;

    private static native final int SOCKET_CONNECTED() /*-{
		return Titanium.Network.SOCKET_CONNECTED;
    }-*/;

    private static native final int SOCKET_ERROR() /*-{
		return Titanium.Network.SOCKET_ERROR;
    }-*/;

    private static native final int SOCKET_INITIALIZED() /*-{
		return Titanium.Network.SOCKET_INITIALIZED;
    }-*/;

    private static native final int SOCKET_LISTENING() /*-{
		return Titanium.Network.SOCKET_LISTENING;
    }-*/;

    private static native final int WRITE_MODE() /*-{
		return Titanium.Network.WRITE_MODE;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeNetworkModule();
    }

}
