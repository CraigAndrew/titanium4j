/**************************************************************************
   Facebook.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.facebook;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.events.LoginEvent;
import com.emitrom.ti4j.mobile.client.core.events.LogoutEvent;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

/**
 * * The top level facebook module. The facebook module is used for connecting
 * your application with facebook through the facebook graph
 * api(http://developers.facebook.com/docs/reference/api/) (see
 * `requestwithgraphpath`) or the deprecated facebook rest
 * api(http://developers.facebook.com/docs/reference/rest/) (see 'request'). Due
 * to how the facebook login process works on ios, your app will need to have
 * the following in your tiapp.xml if you target those platforms:
 * 
 * your_app_id_here
 * 
 * you must still set ti.facebook.appid within your app itself to use the
 * facebook module. this property is used only for configuring your app to
 * interface with the facebook login process.
 * 
 * <p>
 * Titanium Mobile SDK 1.6.0 marked a significant change for this module. Older
 * versions of the module were not compatible with the new Graph API.
 * Applications written for the pre-1.6.0 version of this module will **not**
 * work with the 1.6.0 and higher versions. Nor is the code shown in the
 * examples here backwards-compatible with pre-1.6.0 Titanium Mobile SDK.
 */
public class Facebook extends TiModule {

    private static Facebook instance = null;

    public Facebook get() {
        if (instance == null) {
            instance = new Facebook();
        }
        return instance;
    }

    private Facebook() {
        createPeer();
    }

    /**
     * @return Oauth token set after a successful 'authorize'.
     */
    public native String getAccessToken() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.accessToken;
    }-*/;

    public static native void setAccessToken(String value) /*-{
		jso.accessToken = value;
    }-*/;

    /**
     * Clear the oauth 'accesstoken' and logout the user.
     */
    public native void logout() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.logout();
    }-*/;

    /**
     * @return Your facebook application id. you need to set this for anything
     *         to work.
     */
    public native String getAppid() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.appid;
    }-*/;

    public native void setAppid(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.appid = value;
    }-*/;

    /**
     * @return Time at which the 'accesstoken' expires.
     */
    public native JsDate getExpirationDate() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.expirationDate;
    }-*/;

    public native void setExpirationDate(JsDate value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.expirationDate = value;
    }-*/;

    /**
     * @return Set to false to enable "single-sign-on" in cases where the
     *         official facebook app is on the device. default is true, meaning
     *         the traditional, dialog-based authentication is used rather than
     *         single-sign-on. see [facebook mobile
     *         guide](http://developers.facebook.com/docs/guides/mobile) for
     *         details of their single-sign-on schem.
     */
    public native boolean isForceDialogAuth() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.forceDialogAuth;
    }-*/;

    public native void setForceDialogAuth(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.forceDialogAuth = value;
    }-*/;

    /**
     * @return Returns true if the user has logged in
     */
    public native boolean isLoggedIn() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.loggedIn;
    }-*/;

    public native void setLoggedIn(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.loggedIn = value;
    }-*/;

    /**
     * @return Set/return an array of permissions to request for your app. be
     *         sure the permissions you want are set before calling 'authorize'.
     */
    public native <T> T getPermissions() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.permissions;
    }-*/;

    public native void setPermissions(Object value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.permissions = value;
    }-*/;

    /**
     * @return The unique user id returned from facebook.
     */
    public native String getUid() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.uid;
    }-*/;

    public native void setUid(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.uid = value;
    }-*/;

    public native LoginButton createLoginButton() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createLoginButton();
		var toReturn = @com.emitrom.ti4j.mobile.client.facebook.LoginButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public void addLoginHandler(TiEventListener<LoginEvent> handler) {
        addEventListener(LoginEvent.LOGIN, handler);
    }

    public void addLogoutHandler(TiEventListener<LogoutEvent> handler) {
        addEventListener(LogoutEvent.LOGOUT, handler);
    }

    /**
     * Make a request to the deprecated facebook rest
     * api(http://developers.facebook.com/docs/reference/rest/).
     * 
     * @param method The REST API method to call.
     * @param params A dictionary object for setting parameters required by the
     *            call, if any. See examples.
     * 
     * @param callback , A callback for when call is completed.
     */
    public native void request(String method, JavaScriptObject data, RequestCallback callback) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.request(
						method,
						data,
						function(e) {
							var object = @com.emitrom.ti4j.mobile.client.facebook.RequestArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.emitrom.ti4j.mobile.client.facebook.RequestCallback::onResponse(Lcom/emitrom/ti4j/mobile/client/facebook/RequestArguments;)(object);
						});
    }-*/;

    /**
     * Make a facebook graph
     * api(http://developers.facebook.com/docs/reference/api/) request. if the
     * request requires user authorization, be sure user is already logged-in
     * and your app is authorized. (you can check `loggedin` for that.)
     * 
     * @param path The graph API path to request. For example, "me" requests
     *            information about the logged-in
     *            user(http://developers.facebook
     *            .com/docs/reference/api/user/).
     * @param params A dictionary object for setting parameters required by the
     *            call, if any. See examples.
     * @param httpMethod The http method (GET/POST/DELETE) to use for the call.
     * 
     * @param callback , A callback for when call is completed.
     */
    public static native void requestWithGraphPath(String path, JavaScriptObject params, String httpMethod,
                    GraphPathRequestCallback callback) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.requestWithGraphPath(
						path,
						params,
						httpMethod,
						function(e) {
							var object = @com.emitrom.ti4j.mobile.client.facebook.GraphPathRequestArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.emitrom.ti4j.mobile.client.facebook.GraphPathRequestCallback::onResponse(Lcom/emitrom/ti4j/mobile/client/facebook/GraphPathRequestArguments;)(object);
						});
    }-*/;

    /**
     * Open a supported facebook
     * [dialog](http://developers.facebook.com/docs/reference/dialogs/). "feed"
     * is just about the only useful one.
     * 
     * @param action Specifies which dialog to show, such as "feed".
     * @param params A dictionary object for pre-filling some of the dialog's
     *            fields. See example.
     * 
     * @param callback , A callback for when call is completed.
     */
    public static native void dialog(String action, JavaScriptObject params, DialogCallback callback) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.dialog(
						method,
						params,
						function(e) {
							var object = @com.emitrom.ti4j.mobile.client.facebook.DialogArguments::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.emitrom.ti4j.mobile.client.facebook.DialogCallback::onResponse(Lcom/emitrom/ti4j/mobile/client/facebook/DialogArguments;)(object);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createFacebookModule();
    }

}
