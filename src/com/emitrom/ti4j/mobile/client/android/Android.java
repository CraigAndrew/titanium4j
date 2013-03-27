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
package com.emitrom.ti4j.mobile.client.android;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The top level AndroidMedia module.
 * <cod>AndroidMedia.getCurrentActivity()</code> provides each context an
 * Activity. This object cannot be created directly.
 * 
 * <br/>
 * <br/>
 * Several (almost all) of the constants you see in this class are directly
 * taken from AndroidMedia. So if we've failed to document all of them, have a
 * look online at the AndroidMedia SDK reference pages. The most important page
 * there will be the Intent reference, which will give you the meaning of those
 * ACTION, EXTRA and CATEGORY constants.
 */
public class Android extends TiModule {

    public static final String ACTION_AIRPLANE_MODE_CHANGED = ACTION_AIRPLANE_MODE_CHANGED();
    public static final String ACTION_ALL_APPS = ACTION_ALL_APPS();
    public static final String ACTION_ANSWER = ACTION_ANSWER();
    public static final String ACTION_ATTACH_DATE = ACTION_ATTACH_DATA();
    public static final String ACTION_BATTERY_CHANGED = ACTION_BATTERY_CHANGED();
    public static final String ACTION_BATTERY_LOW = ACTION_BATTERY_LOW();
    public static final String ACTION_BATTERY_OKAY = ACTION_BATTERY_OKAY();
    public static final String ACTION_BOOT_COMPLETED = ACTION_BOOT_COMPLETED();
    public static final String ACTION_BUG_REPORT = ACTION_BUG_REPORT();
    public static final String ACTION_CALL = ACTION_CALL();
    public static final String ACTION_CALL_BUTTON = ACTION_CALL_BUTTON();
    public static final String ACTION_CAMERA_BUTTON = ACTION_CAMERA_BUTTON();
    public static final String ACTION_CHOOSER = ACTION_CHOOSER();
    public static final String ACTION_CLOSE_SYSTEM_DIALOGS = ACTION_CLOSE_SYSTEM_DIALOGS();
    public static final String ACTION_CONFIGURATION_CHANGED = ACTION_CONFIGURATION_CHANGED();
    public static final String ACTION_CREATE_SHORTCUT = ACTION_CREATE_SHORTCUT();
    public static final String ACTION_DATE_CHANGED = ACTION_DATE_CHANGED();
    public static final String ACTION_DEFAULT = ACTION_DEFAULT();
    public static final String ACTION_DELETE = ACTION_DELETE();
    public static final String ACTION_DEVICE_STORAGE_LOW = ACTION_DEVICE_STORAGE_LOW();
    public static final String ACTION_DIAL = ACTION_DIAL();
    public static final String ACTION_EDIT = ACTION_EDIT();
    public static final String ACTION_GET_CONTENT = ACTION_GET_CONTENT();
    public static final String ACTION_GTALK_SERVICE_CONNECTED = ACTION_GTALK_SERVICE_CONNECTED();
    public static final String ACTION_GTALK_SERVICE_DISCONNECTED = ACTION_GTALK_SERVICE_DISCONNECTED();
    public static final String ACTION_HEADSET_PLUG = ACTION_HEADSET_PLUG();
    public static final String ACTION_INPUT_METHOD_CHANGED = ACTION_INPUT_METHOD_CHANGED();
    public static final String ACTION_INSERT = ACTION_INSERT();
    public static final String ACTION_INSERT_OR_EDIT = ACTION_INSERT_OR_EDIT();
    public static final String ACTION_MAIN = ACTION_MAIN();
    public static final String ACTION_MANAGE_PACKAGE_STORAGE = ACTION_MANAGE_PACKAGE_STORAGE();
    public static final String ACTION_MEDIA_BAD_REMOVAL = ACTION_MEDIA_BAD_REMOVAL();
    public static final String ACTION_MEDIA_BUTTON = ACTION_MEDIA_BUTTON();
    public static final String ACTION_MEDIA_CHECKING = ACTION_MEDIA_CHECKING();
    public static final String ACTION_MEDIA_EJECT = ACTION_MEDIA_EJECT();
    public static final String ACTION_MEDIA_MOUNTED = ACTION_MEDIA_MOUNTED();
    public static final String ACTION_MEDIA_NOFS = ACTION_MEDIA_NOFS();
    public static final String ACTION_MEDIA_REMOVED = ACTION_MEDIA_REMOVED();
    public static final String ACTION_MEDIA_SCANNER_FINISHED = ACTION_MEDIA_SCANNER_FINISHED();
    public static final String ACTION_MEDIA_SCANNER_SCAN_FILE = ACTION_MEDIA_SCANNER_SCAN_FILE();
    public static final String ACTION_MEDIA_SCANNER_STARTED = ACTION_MEDIA_SCANNER_STARTED();
    public static final String ACTION_MEDIA_SHARED = ACTION_MEDIA_SHARED();
    public static final String ACTION_MEDIA_UNMOUNTABLE = ACTION_MEDIA_UNMOUNTABLE();
    public static final String ACTION_NEW_OUTGOING_CALL = ACTION_NEW_OUTGOING_CALL();
    public static final String ACTION_PACKAGE_ADDED = ACTION_PACKAGE_ADDED();
    public static final String ACTION_PACKAGE_CHANGED = ACTION_PACKAGE_CHANGED();
    public static final String ACTION_PACKAGE_DATA_CLEARED = ACTION_PACKAGE_DATA_CLEARED();
    public static final String ACTION_PACKAGE_INSTALL = ACTION_PACKAGE_INSTALL();
    public static final String ACTION_PACKAGE_REMOVED = ACTION_PACKAGE_REMOVED();
    public static final String ACTION_PACKAGE_REPLACED = ACTION_PACKAGE_REPLACED();
    public static final String ACTION_PACKAGE_RESTARTED = ACTION_PACKAGE_RESTARTED();
    public static final String ACTION_PICK = ACTION_PICK();
    public static final String ACTION_PICK_ACTIVITY = ACTION_PICK_ACTIVITY();
    public static final String ACTION_POWER_CONNECTED = ACTION_POWER_CONNECTED();
    public static final String ACTION_POWER_DISCONNECTED = ACTION_POWER_DISCONNECTED();
    public static final String ACTION_POWER_USAGE_SUMMARY = ACTION_POWER_USAGE_SUMMARY();
    public static final String ACTION_PROVIDER_CHANGED = ACTION_PROVIDER_CHANGED();
    public static final String ACTION_REBOOT = ACTION_REBOOT();
    public static final String ACTION_RUN = ACTION_RUN();
    public static final String ACTION_SCREEN_OFF = ACTION_SCREEN_OFF();
    public static final String ACTION_SCREEN_ON = ACTION_SCREEN_ON();
    public static final String ACTION_SEARCH = ACTION_SEARCH();
    public static final String ACTION_SEARCH_LONG_PRESS = ACTION_SEARCH_LONG_PRESS();
    public static final String ACTION_SEND = ACTION_SEND();
    public static final String ACTION_SENDTO = ACTION_SENDTO();
    public static final String ACTION_SEND_MULTIPLE = ACTION_SEND_MULTIPLE();
    public static final String ACTION_SET_WALLPAPER = ACTION_SET_WALLPAPER();
    public static final String ACTION_SHUTDOWN = ACTION_SHUTDOWN();
    public static final String ACTION_SYNC = ACTION_SYNC();
    public static final String ACTION_SYSTEM_TUTORIAL = ACTION_SYSTEM_TUTORIAL();
    public static final String ACTION_TIME_CHANGED = ACTION_TIME_CHANGED();
    public static final String ACTION_TIME_TICK = ACTION_TIME_TICK();
    public static final String ACTION_UID_REMOVED = ACTION_UID_REMOVED();
    public static final String ACTION_UMS_CONNECTED = ACTION_UMS_CONNECTED();
    public static final String ACTION_UMS_DISCONNECTED = ACTION_UMS_DISCONNECTED();
    public static final String ACTION_USER_PRESENT = ACTION_USER_PRESENT();
    public static final String ACTION_VIEW = ACTION_VIEW();
    public static final String ACTION_VOICE_COMMAND = ACTION_VOICE_COMMAND();
    public static final String ACTION_WALLPAPER_CHANGED = ACTION_WALLPAPER_CHANGED();
    public static final String ACTION_WEB_SEARCH = ACTION_WEB_SEARCH();
    public static final String CATEGORY_ALTERNATIVE = CATEGORY_ALTERNATIVE();
    public static final String CATEGORY_BROWSABLE = CATEGORY_BROWSABLE();
    public static final String CATEGORY_DEFAULT = CATEGORY_DEFAULT();
    public static final String CATEGORY_DEVELOPMENT_PREFERENCE = CATEGORY_DEVELOPMENT_PREFERENCE();
    public static final String CATEGORY_EMBED = CATEGORY_EMBED();
    public static final String CATEGORY_FRAMEWORK_INTRUMENT_TEST = CATEGORY_FRAMEWORK_INTRUMENT_TEST();
    public static final String CATEGORY_HOME = CATEGORY_HOME();
    public static final String CATEGORY_INFO = CATEGORY_INFO();
    public static final String CATEGORY_LAUNCHER = CATEGORY_LAUNCHER();
    public static final String CATEGORY_MONKEY = CATEGORY_MONKEY();
    public static final String CATEGORY_OPENABLE = CATEGORY_OPENABLE();
    public static final String CATEGORY_PREFERENCE = CATEGORY_PREFERENCE();
    public static final String CATEGORY_SAMPLE_CODE = CATEGORY_SAMPLE_CODE();
    public static final String CATEGORY_SELECTED_ALTERNATIVE = CATEGORY_SELECTED_ALTERNATIVE();
    public static final String CATEGORY_TAB = CATEGORY_TAB();
    public static final String CATEGORY_TEST = CATEGORY_TEST();
    public static final String CATEGORY_UNIT_TEST = CATEGORY_UNIT_TEST();
    public static final int DEFAULT_ALL = DEFAULT_ALL();
    public static final int DEFAULT_LIGHTS = DEFAULT_LIGHTS();
    public static final int DEFAULT_SOUND = DEFAULT_SOUND();
    public static final int DEFAULT_VIBRATE = DEFAULT_VIBRATE();
    public static final String EXTRA_ALARM_COUNT = EXTRA_ALARM_COUNT();
    public static final String EXTRA_BCC = EXTRA_BCC();
    public static final String EXTRA_CC = EXTRA_CC();
    public static final String EXTRA_DATA_REMOVED = EXTRA_DATA_REMOVED();
    public static final String EXTRA_DATA_KILL_APP = EXTRA_DATA_KILL_APP();
    public static final String EXTRA_EMAIL = EXTRA_EMAIL();
    public static final String EXTRA_INTENT = EXTRA_INTENT();
    public static final String EXTRA_KEY_EVENT = EXTRA_KEY_EVENT();
    public static final String EXTRA_PHONE_NUMBER = EXTRA_PHONE_NUMBER();
    public static final String EXTRA_REPLACING = EXTRA_REPLACING();
    public static final String EXTRA_SHORTCUT_ICON = EXTRA_SHORTCUT_ICON();
    public static final String EXTRA_SHORTCUT_ICON_RESOURCE = EXTRA_SHORTCUT_ICON_RESOURCE();
    public static final String EXTRA_SHORTCUT_INTENT = EXTRA_SHORTCUT_INTENT();
    public static final String EXTRA_SHORTCUT_NAME = EXTRA_SHORTCUT_NAME();
    public static final String EXTRA_STREAM = EXTRA_STREAM();
    public static final String EXTRA_SUBJECT = EXTRA_SUBJECT();
    public static final String EXTRA_TEMPLATE = EXTRA_TEMPLATE();
    public static final String EXTRA_TEXT = EXTRA_TEXT();
    public static final String EXTRA_TITLE = EXTRA_TITLE();
    public static final String EXTRA_UID = EXTRA_UID();
    public static final int FILL_IN_ACTION = FILL_IN_ACTION();
    public static final int FILL_IN_CATEGORIES = FILL_IN_CATEGORIES();
    public static final int FILL_IN_COMPONENT = FILL_IN_COMPONENT();
    public static final int FILL_IN_DATA = FILL_IN_DATA();
    public static final int FILL_IN_PACKAGE = FILL_IN_PACKAGE();
    public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = FLAG_ACTIVITY_BROUGHT_TO_FRONT();
    public static final int FLAG_ACTIVITY_CLEAR_TOP = FLAG_ACTIVITY_CLEAR_TOP();
    public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET();
    public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS();
    public static final int FLAG_ACTIVITY_FORWARD_RESULT = FLAG_ACTIVITY_FORWARD_RESULT();
    public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY();
    public static final int FLAG_ACTIVITY_MULTIPLE_TASK = FLAG_ACTIVITY_MULTIPLE_TASK();
    public static final int FLAG_ACTIVITY_NO_ANIMATION = FLAG_ACTIVITY_NO_ANIMATION();
    public static final int FLAG_ACTIVITY_NO_HISTORY = FLAG_ACTIVITY_NO_HISTORY();
    public static final int FLAG_ACTIVITY_NO_USER_ACTION = FLAG_ACTIVITY_NO_USER_ACTION();
    public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = FLAG_ACTIVITY_PREVIOUS_IS_TOP();
    public static final int FLAG_ACTIVITY_NEW_TASK = FLAG_ACTIVITY_NEW_TASK();
    public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = FLAG_ACTIVITY_REORDER_TO_FRONT();
    public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = FLAG_ACTIVITY_RESET_TASK_IF_NEEDED();
    public static final int FLAG_ACTIVITY_SINGLE_TOP = FLAG_ACTIVITY_SINGLE_TOP();
    public static final int FLAG_AUTO_CANCEL = FLAG_AUTO_CANCEL();
    public static final int FLAG_CANCEL_CURRENT = FLAG_CANCEL_CURRENT();
    public static final int FLAG_DEBUG_LOG_RESOLUTION = FLAG_DEBUG_LOG_RESOLUTION();
    public static final int FLAG_FROM_BACKGROUND = FLAG_FROM_BACKGROUND();
    public static final int FLAG_GRANT_READ_URI_PERMISSION = FLAG_GRANT_READ_URI_PERMISSION();
    public static final int FLAG_GRANT_WRITE_URI_PERMISSION = FLAG_GRANT_WRITE_URI_PERMISSION();
    public static final int FLAG_INSISTENT = FLAG_INSISTENT();
    public static final int FLAG_NO_CLEAR = FLAG_NO_CLEAR();
    public static final int FLAG_NO_CREATE = FLAG_NO_CREATE();
    public static final int FLAG_ONE_SHOT = FLAG_ONE_SHOT();
    public static final int FLAG_ONGOING_EVENT = FLAG_ONGOING_EVENT();
    public static final int FLAG_ONLY_ALERT_ONCE = FLAG_ONLY_ALERT_ONCE();
    public static final int FLAG_RECEIVER_REGISTERED_ONLY = FLAG_RECEIVER_REGISTERED_ONLY();
    public static final int FLAG_SHOW_LIGHTS = FLAG_SHOW_LIGHTS();
    public static final int FLAG_UPDATE_CURRENT = FLAG_UPDATE_CURRENT();
    public static final int PENDIND_INTENT_FOR_ACTIVITY = PENDIND_INTENT_FOR_ACTIVITY();
    public static final int PENDIND_INTENT_FOR_BROADCAST = PENDIND_INTENT_FOR_BROADCAST();
    public static final int PENDIND_INTENT_FOR_SERVICE = PENDIND_INTENT_FOR_SERVICE();
    public static final int PENDIND_INTENT_MAX_VALUE = PENDIND_INTENT_MAX_VALUE();
    public static final int RESULT_CANCELED = RESULT_CANCELED();
    public static final int RESULT_FIRST_USER = RESULT_FIRST_USER();
    public static final int RESULT_OK = RESULT_OK();
    public static final int SCREEN_ORIENTATION_BEHIND = SCREEN_ORIENTATION_BEHIND();
    public static final int SCREEN_ORIENTATION_LANDSCAPE = SCREEN_ORIENTATION_LANDSCAPE();
    public static final int SCREEN_ORIENTATION_NOSENSOR = SCREEN_ORIENTATION_NOSENSOR();
    public static final int SCREEN_ORIENTATION_PORTRAIT = SCREEN_ORIENTATION_PORTRAIT();
    public static final int SCREEN_ORIENTATION_SENSOR = SCREEN_ORIENTATION_SENSOR();
    public static final int SCREEN_ORIENTATION_UNSPECIFIED = SCREEN_ORIENTATION_UNSPECIFIED();
    public static final int SCREEN_ORIENTATION_USER = SCREEN_ORIENTATION_USER();
    public static final int STREAM_DEFAULT = STREAM_DEFAULT();
    public static final int URI_INTENT_SCHEME = URI_INTENT_SCHEME();

    private static Android instance = null;

    public static Android get() {
        if (instance == null) {
            instance = new Android();
        }
        return instance;
    }

    private Android() {
        createPeer();
    }

    public native RemoteViews createRemoteViews(Object config) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createRemoteViews(config);
		var toReturn = @com.emitrom.ti4j.mobile.client.android.RemoteViews::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a <code>Titanium.Android.Intent</code> to be used to start a
     * Broadcast.
     * 
     * @return
     */
    public static native Intent createBroadcastIntent() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createBroadcastIntent();
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a <code>Titanium.Android.Intent</code> to be used to start a
     * Broadcast.
     * 
     * @return
     */
    public Intent createBroadcastIntent(IntentConfig config) {
        return _createBroadcastIntent(config.getJsObj());
    }

    private native Intent _createBroadcastIntent(JavaScriptObject config) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createBroadcastIntent(config);
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a <code>Titanium.Android.Intent</code>. Used to start other
     * Activities and for marshaling data.
     * 
     * @return
     */
    public native Intent createIntent() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createIntent();
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * * Create a <code>Titanium.Android.Intent</code>. Used to start other
     * Activities and for marshaling data.
     * 
     * @param config , config object
     * @return
     */
    public Intent createIntent(IntentConfig config) {
        return _createIntent(config.getJsObj());
    }

    private native Intent _createIntent(JavaScriptObject config) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createIntent(config);
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Display chooser interface to allow selection of desired target.
     * 
     * @return
     */
    public native Intent createIntentChooser() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createIntentChooser();
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Crate a <code>Titanium.Android.Notification</code>. Used to notify the
     * user of an event.
     * 
     * @param options , Options dictionary
     * @return Titanium.Android.Notification
     */
    public native Notification createNotification(Object options) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createNotification(options);
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Notification::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a <code>Titanium.Android.PendingIntent<code> to be used inside a
     * <code>Titanium.Android.Notification<code>
     * 
     * @param intent , the intent that will be executed
     * @return Titanium.Android.PendingIntent
     */
    public native PendingIntent createPendingIntent(Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso
				.createPendingIntent(intent.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		var toReturn = @com.emitrom.ti4j.mobile.client.android.PendingIntent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a <code>Titanium.Android.PendingIntent</code> to be used inside a
     * <code>Titanium.Android.Notification</code>
     * 
     * @param intent , the intent that will be executed
     * 
     * @param flag , optional, default:0 can be any of
     *            AndroidMedia.FLAG_CANCEL_CURRENT,AndroidMedia
     *            .FLAG_NO_CREATE,AndroidMedia.FLAG_ONE_SHOT,
     *            AndroidMedia.FLAG_UPDATE_CURRENT.
     * 
     * @return Titanium.Android.PendingIntent
     */
    public native PendingIntent createPendingIntent(Intent intent, int flags) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso
				.createPendingIntent(
						intent.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						flags);
		var toReturn = @com.emitrom.ti4j.mobile.client.android.PendingIntent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a Titanium.Android.Service so you can start/stop it and listen for
     * events from it.
     * 
     * @param intent , an Intent created with
     *            <code>AndroidMedia.createServiceIntent</code> which specifies
     *            the service to be instantiated.
     * 
     * @return Titanium.Android.Service
     */
    public native Service createService(Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso
				.createService(intent.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Service::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create an Titanium.Android.Intent to be used to start a Service.
     * 
     * @param options , Options dictionary -- pass in a url option to specify
     *            the path to a javascript-based service you create.
     * 
     * @return Titanium.Android.Intent
     */
    public native Intent createServiceIntent(Object options) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createServiceIntent(options);
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create an Titanium.Android.Intent to be used to start a Service.
     * 
     * @param options , Options dictionary -- pass in a url option to specify
     *            the path to a javascript-based service you create.
     * 
     * @return Titanium.Android.Intent
     */
    public native Intent createServiceIntent(String urlToJsFile) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createServiceIntent({
			url : urlToJsFile
		});
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Check on state of Service.
     * 
     * @param intent , An Intent created with
     *            Titanium.Android.createServiceIntent which specifies the
     *            service to check.
     * 
     * @return true if the service is running false otherwise
     */
    public native boolean isServiceRunning(Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.isServiceRunning(intent.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Start a simple service
     * 
     * @param intent , An Intent created with
     *            <code>Titanium.Android.createServiceIntent</code> which
     *            specifies the service to start.
     */
    public native void startService(Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.startService(intent.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Stop a simple service that was started with
     * <code>AndroidMedia.startSerive(Intent intent)</code>
     * 
     * @param intent , An Intent created with
     *            <code>Titanium.Android.createServiceIntent</code> which
     *            specifies the service to start.
     */
    public native void stopService(Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.stopService(intent.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * provides each context an Activity.
     * 
     * @return
     */
    public native Activity getCurrentActivity() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.currentActivity;
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Activity::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * provides each context an Service.
     * 
     * @return
     */
    public native Service getCurrentService() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.currentService;
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Service::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private static native String ACTION_AIRPLANE_MODE_CHANGED() /*-{
		return Titanium.Android.ACTION_AIRPLANE_MODE_CHANGED;
    }-*/;

    private static native String ACTION_ALL_APPS() /*-{
		return Titanium.Android.ACTION_ALL_APPS;
    }-*/;

    private static native String ACTION_ANSWER() /*-{
		return Titanium.Android.ACTION_ANSWER;
    }-*/;

    private static native String ACTION_ATTACH_DATA() /*-{
		return Titanium.Android.ACTION_ATTACH_DATA;
    }-*/;

    private static native String ACTION_BATTERY_CHANGED() /*-{
		return Titanium.Android.ACTION_BATTERY_CHANGED;
    }-*/;

    private static native String ACTION_BATTERY_LOW() /*-{
		return Titanium.Android.ACTION_BATTERY_LOW;
    }-*/;

    private static native String ACTION_BATTERY_OKAY() /*-{
		return Titanium.Android.ACTION_BATTERY_OKAY;
    }-*/;

    private static native String ACTION_BOOT_COMPLETED() /*-{
		return Titanium.Android.ACTION_BOOT_COMPLETED;
    }-*/;

    private static native String ACTION_BUG_REPORT() /*-{
		return Titanium.Android.ACTION_BUG_REPORT;
    }-*/;

    private static native String ACTION_CALL() /*-{
		return Titanium.Android.ACTION_CALL;
    }-*/;

    private static native String ACTION_CALL_BUTTON() /*-{
		return Titanium.Android.ACTION_CALL_BUTTON;
    }-*/;

    private static native String ACTION_CHOOSER() /*-{
		return Titanium.Android.ACTION_CHOOSER;
    }-*/;

    private static native String ACTION_CLOSE_SYSTEM_DIALOGS() /*-{
		return Titanium.Android.ACTION_CLOSE_SYSTEM_DIALOGS;
    }-*/;

    private static native String ACTION_CONFIGURATION_CHANGED() /*-{
		return Titanium.Android.ACTION_CONFIGURATION_CHANGED;
    }-*/;

    private static native String ACTION_CREATE_SHORTCUT() /*-{
		return Titanium.Android.ACTION_CREATE_SHORTCUT;
    }-*/;

    private static native String ACTION_DATE_CHANGED() /*-{
		return this.ACTION_DATE_CHANGED;
    }-*/;

    private static native String ACTION_DEFAULT() /*-{
		return Titanium.Android.ACTION_DEFAULT;
    }-*/;

    private static native String ACTION_DELETE() /*-{
		return Titanium.Android.ACTION_DELETE;
    }-*/;

    private static native String ACTION_DEVICE_STORAGE_LOW() /*-{
		return Titanium.Android.ACTION_DEVICE_STORAGE_LOW;
    }-*/;

    private static native String ACTION_DIAL() /*-{
		return Titanium.Android.ACTION_DIAL;
    }-*/;

    private static native String ACTION_EDIT() /*-{
		return Titanium.Android.ACTION_EDIT;
    }-*/;

    private static native String ACTION_GET_CONTENT() /*-{
		return Titanium.Android.ACTION_GET_CONTENT;
    }-*/;

    private static native String ACTION_GTALK_SERVICE_CONNECTED() /*-{
		return Titanium.Android.ACTION_GTALK_SERVICE_CONNECTED;
    }-*/;

    private static native String ACTION_GTALK_SERVICE_DISCONNECTED() /*-{
		return Titanium.Android.ACTION_GTALK_SERVICE_DISCONNECTED;
    }-*/;

    private static native String ACTION_HEADSET_PLUG() /*-{
		return Titanium.Android.ACTION_HEADSET_PLUG;
    }-*/;

    private static native String ACTION_INPUT_METHOD_CHANGED() /*-{
		return Titanium.Android.ACTION_INPUT_METHOD_CHANGED;
    }-*/;

    private static native String ACTION_INSERT() /*-{
		return Titanium.Android.ACTION_INSERT;
    }-*/;

    private static native String ACTION_INSERT_OR_EDIT() /*-{
		return Titanium.Android.ACTION_INSERT_OR_EDIT;
    }-*/;

    private static native String ACTION_MAIN() /*-{
		return Titanium.Android.ACTION_MAIN;
    }-*/;

    private static native String ACTION_MANAGE_PACKAGE_STORAGE() /*-{
		return Titanium.Android.ACTION_MANAGE_PACKAGE_STORAGE;
    }-*/;

    private static native String ACTION_MEDIA_BAD_REMOVAL() /*-{
		return Titanium.Android.ACTION_MEDIA_BAD_REMOVAL;
    }-*/;

    private static native String ACTION_MEDIA_BUTTON() /*-{
		return Titanium.Android.ACTION_MEDIA_BUTTON;
    }-*/;

    private static native String ACTION_MEDIA_CHECKING() /*-{
		return Titanium.Android.ACTION_MEDIA_CHECKING;
    }-*/;

    private static native String ACTION_MEDIA_EJECT() /*-{
		return Titanium.Android.ACTION_MEDIA_EJECT;
    }-*/;

    private static native String ACTION_MEDIA_MOUNTED() /*-{
		return Titanium.Android.ACTION_MEDIA_MOUNTED;
    }-*/;

    private static native String ACTION_MEDIA_NOFS() /*-{
		return Titanium.Android.ACTION_MEDIA_NOFS;
    }-*/;

    private static native String ACTION_MEDIA_REMOVED() /*-{
		return Titanium.Android.ACTION_MEDIA_REMOVED;
    }-*/;

    private static native String ACTION_MEDIA_SCANNER_FINISHED() /*-{
		return Titanium.Android.ACTION_MEDIA_SCANNER_FINISHED;
    }-*/;

    private static native String ACTION_MEDIA_SCANNER_SCAN_FILE() /*-{
		return Titanium.Android.ACTION_MEDIA_SCANNER_SCAN_FILE;
    }-*/;

    private static native String ACTION_MEDIA_SCANNER_STARTED() /*-{
		return Titanium.Android.ACTION_MEDIA_SCANNER_STARTED;
    }-*/;

    private static native String ACTION_MEDIA_SHARED() /*-{
		return Titanium.Android.ACTION_MEDIA_SHARED;
    }-*/;

    private static native String ACTION_MEDIA_UNMOUNTABLE() /*-{
		return Titanium.Android.ACTION_MEDIA_UNMOUNTABLE;
    }-*/;

    private static native String ACTION_MEDIA_UNMOUNTED() /*-{
		return Titanium.Android.ACTION_MEDIA_UNMOUNTED;
    }-*/;

    private static native String ACTION_NEW_OUTGOING_CALL() /*-{
		return Titanium.Android.ACTION_NEW_OUTGOING_CALL;
    }-*/;

    private static native String ACTION_PACKAGE_ADDED() /*-{
		return Titanium.Android.ACTION_PACKAGE_ADDED;
    }-*/;

    private static native String ACTION_PACKAGE_CHANGED() /*-{
		return Titanium.Android.ACTION_PACKAGE_CHANGED;
    }-*/;

    private static native String ACTION_PACKAGE_DATA_CLEARED() /*-{
		return Titanium.Android.ACTION_PACKAGE_DATA_CLEARED;
    }-*/;

    private static native String ACTION_PACKAGE_INSTALL() /*-{
		return Titanium.Android.ACTION_PACKAGE_INSTALL;
    }-*/;

    private static native String ACTION_PACKAGE_REMOVED() /*-{
		return Titanium.Android.ACTION_PACKAGE_REMOVED;
    }-*/;

    private static native String ACTION_PACKAGE_REPLACED() /*-{
		return Titanium.Android.ACTION_PACKAGE_REPLACED;
    }-*/;

    private static native String ACTION_PACKAGE_RESTARTED() /*-{
		return Titanium.Android.ACTION_PACKAGE_RESTARTED;
    }-*/;

    private static native String ACTION_PICK() /*-{
		return Titanium.Android.ACTION_PICK;
    }-*/;

    private static native String ACTION_PICK_ACTIVITY() /*-{
		return Titanium.Android.ACTION_PICK_ACTIVITY;
    }-*/;

    private static native String ACTION_POWER_CONNECTED() /*-{
		return Titanium.Android.ACTION_POWER_CONNECTED;
    }-*/;

    private static native String ACTION_POWER_DISCONNECTED() /*-{
		return Titanium.Android.ACTION_POWER_DISCONNECTED;
    }-*/;

    private static native String ACTION_POWER_USAGE_SUMMARY() /*-{
		return Titanium.Android.ACTION_POWER_USAGE_SUMMARY;
    }-*/;

    private static native String ACTION_PROVIDER_CHANGED() /*-{
		return Titanium.Android.ACTION_PROVIDER_CHANGED;
    }-*/;

    private static native String ACTION_REBOOT() /*-{
		return Titanium.Android.ACTION_REBOOT;
    }-*/;

    private static native String ACTION_RUN() /*-{
		return Titanium.Android.ACTION_RUN;
    }-*/;

    private static native String ACTION_SCREEN_OFF() /*-{
		return Titanium.Android.ACTION_SCREEN_OFF;
    }-*/;

    private static native String ACTION_SCREEN_ON() /*-{
		return Titanium.Android.ACTION_SCREEN_ON;
    }-*/;

    private static native String ACTION_SEARCH() /*-{
		return Titanium.Android.ACTION_SEARCH;
    }-*/;

    private static native String ACTION_SEARCH_LONG_PRESS() /*-{
		return Titanium.Android.ACTION_SEARCH_LONG_PRESS;
    }-*/;

    private static native String ACTION_SEND() /*-{
		return Titanium.Android.ACTION_SEND;
    }-*/;

    private static native String ACTION_SENDTO() /*-{
		return Titanium.Android.ACTION_SENDTO;
    }-*/;

    private static native String ACTION_SEND_MULTIPLE() /*-{
		return Titanium.Android.ACTION_SEND_MULTIPLE;
    }-*/;

    private static native String ACTION_SET_WALLPAPER() /*-{
		return Titanium.Android.ACTION_SET_WALLPAPER;
    }-*/;

    private static native String ACTION_SHUTDOWN() /*-{
		return Titanium.Android.ACTION_SHUTDOWN;
    }-*/;

    private static native String ACTION_SYNC() /*-{
		return Titanium.Android.ACTION_SYNC;
    }-*/;

    private static native String ACTION_SYSTEM_TUTORIAL() /*-{
		return Titanium.Android.ACTION_SYSTEM_TUTORIAL;
    }-*/;

    private static native String ACTION_TIME_CHANGED() /*-{
		return Titanium.Android.ACTION_TIME_CHANGED;
    }-*/;

    private static native String ACTION_TIME_TICK() /*-{
		return Titanium.Android.ACTION_TIME_TICK;
    }-*/;

    private static native String ACTION_UID_REMOVED() /*-{
		return Titanium.Android.ACTION_UID_REMOVED;
    }-*/;

    private static native String ACTION_UMS_CONNECTED() /*-{
		return Titanium.Android.ACTION_UMS_CONNECTED;
    }-*/;

    private static native String ACTION_UMS_DISCONNECTED() /*-{
		return Titanium.Android.ACTION_UMS_DISCONNECTED;
    }-*/;

    private static native String ACTION_USER_PRESENT() /*-{
		return Titanium.Android.ACTION_USER_PRESENT;
    }-*/;

    private static native String ACTION_VIEW() /*-{
		return Titanium.Android.ACTION_VIEW;
    }-*/;

    private static native String ACTION_VOICE_COMMAND() /*-{
		return Titanium.Android.ACTION_VOICE_COMMAND;
    }-*/;

    private static native String ACTION_WALLPAPER_CHANGED() /*-{
		return Titanium.Android.ACTION_WALLPAPER_CHANGED;
    }-*/;

    private static native String ACTION_WEB_SEARCH() /*-{
		return Titanium.Android.ACTION_WEB_SEARCH;
    }-*/;

    private static native String CATEGORY_ALTERNATIVE() /*-{
		return Titanium.Android.CATEGORY_ALTERNATIVE;
    }-*/;

    private static native String CATEGORY_BROWSABLE() /*-{
		return Titanium.Android.CATEGORY_BROWSABLE;
    }-*/;

    private static native String CATEGORY_DEFAULT() /*-{
		return Titanium.Android.CATEGORY_DEFAULT;
    }-*/;

    private static native String CATEGORY_DEVELOPMENT_PREFERENCE() /*-{
		return Titanium.Android.CATEGORY_DEVELOPMENT_PREFERENCE;
    }-*/;

    private static native String CATEGORY_EMBED() /*-{
		return Titanium.Android.CATEGORY_EMBED;
    }-*/;

    private static native String CATEGORY_FRAMEWORK_INTRUMENT_TEST() /*-{
		return Titanium.Android.CATEGORY_FRAMEWORK_INTRUMENT_TEST;
    }-*/;

    private static native String CATEGORY_HOME() /*-{
		return Titanium.Android.CATEGORY_HOME;
    }-*/;

    private static native String CATEGORY_INFO() /*-{
		return Titanium.Android.CATEGORY_INFO;
    }-*/;

    private static native String CATEGORY_LAUNCHER() /*-{
		return Titanium.Android.CATEGORY_LAUNCHER;
    }-*/;

    private static native String CATEGORY_MONKEY() /*-{
		return Titanium.Android.CATEGORY_MONKEY;
    }-*/;

    private static native String CATEGORY_OPENABLE() /*-{
		return Titanium.Android.CATEGORY_OPENABLE;
    }-*/;

    private static native String CATEGORY_PREFERENCE() /*-{
		return Titanium.Android.CATEGORY_PREFERENCE;
    }-*/;

    private static native String CATEGORY_SAMPLE_CODE() /*-{
		return Titanium.Android.CATEGORY_SAMPLE_CODE;
    }-*/;

    private static native String CATEGORY_SELECTED_ALTERNATIVE() /*-{
		return Titanium.Android.CATEGORY_SELECTED_ALTERNATIVE;
    }-*/;

    private static native String CATEGORY_TAB() /*-{
		return Titanium.Android.CATEGORY_TAB;
    }-*/;

    private static native String CATEGORY_TEST() /*-{
		return Titanium.Android.CATEGORY_TEST;
    }-*/;

    private static native String CATEGORY_UNIT_TEST() /*-{
		return Titanium.Android.CATEGORY_UNIT_TEST;
    }-*/;

    private static native int DEFAULT_ALL() /*-{
		return Titanium.Android.DEFAULT_ALL;
    }-*/;

    private static native int DEFAULT_LIGHTS() /*-{
		return Titanium.Android.DEFAULT_LIGHTS;
    }-*/;

    private static native int DEFAULT_SOUND() /*-{
		return Titanium.Android.DEFAULT_SOUND;
    }-*/;

    private static native int DEFAULT_VIBRATE() /*-{
		return Titanium.Android.DEFAULT_VIBRATE;
    }-*/;

    private static native String EXTRA_ALARM_COUNT() /*-{
		return Titanium.Android.EXTRA_ALARM_COUNT;
    }-*/;

    private static native String EXTRA_BCC() /*-{
		return Titanium.Android.EXTRA_BCC;
    }-*/;

    private static native String EXTRA_CC() /*-{
		return Titanium.Android.EXTRA_CC;
    }-*/;

    private static native String EXTRA_DATA_REMOVED() /*-{
		return Titanium.Android.EXTRA_DATA_REMOVED;
    }-*/;

    private static native String EXTRA_DATA_KILL_APP() /*-{
		return Titanium.Android.EXTRA_DATA_KILL_APP;
    }-*/;

    private static native String EXTRA_EMAIL() /*-{
		return Titanium.Android.EXTRA_EMAIL;
    }-*/;

    private static native String EXTRA_INTENT() /*-{
		return Titanium.Android.EXTRA_INTENT;
    }-*/;

    private static native String EXTRA_KEY_EVENT() /*-{
		return Titanium.Android.EXTRA_KEY_EVENT;
    }-*/;

    private static native String EXTRA_PHONE_NUMBER() /*-{
		return Titanium.Android.EXTRA_PHONE_NUMBER;
    }-*/;

    private static native String EXTRA_REPLACING() /*-{
		return Titanium.Android.EXTRA_REPLACING;
    }-*/;

    private static native String EXTRA_SHORTCUT_ICON() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_ICON;
    }-*/;

    private static native String EXTRA_SHORTCUT_ICON_RESOURCE() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_ICON_RESOURCE;
    }-*/;

    private static native String EXTRA_SHORTCUT_INTENT() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_INTENT;
    }-*/;

    private static native String EXTRA_SHORTCUT_NAME() /*-{
		return Titanium.Android.EXTRA_SHORTCUT_NAME;
    }-*/;

    private static native String EXTRA_STREAM() /*-{
		return Titanium.Android.EXTRA_STREAM;
    }-*/;

    private static native String EXTRA_SUBJECT() /*-{
		return Titanium.Android.EXTRA_SUBJECT;
    }-*/;

    private static native String EXTRA_TEMPLATE() /*-{
		return Titanium.Android.EXTRA_TEMPLATE;
    }-*/;

    private static native String EXTRA_TEXT() /*-{
		return Titanium.Android.EXTRA_TEXT;
    }-*/;

    private static native String EXTRA_TITLE() /*-{
		return Titanium.Android.EXTRA_TITLE;
    }-*/;

    private static native String EXTRA_UID() /*-{
		return Titanium.Android.EXTRA_UID;
    }-*/;

    private static native int FILL_IN_ACTION() /*-{
		return Titanium.Android.FILL_IN_ACTION;
    }-*/;

    private static native int FILL_IN_CATEGORIES() /*-{
		return Titanium.Android.FILL_IN_CATEGORIES;
    }-*/;

    private static native int FILL_IN_COMPONENT() /*-{
		return Titanium.Android.FILL_IN_COMPONENT;
    }-*/;

    private static native int FILL_IN_DATA() /*-{
		return Titanium.Android.FILL_IN_DATA;
    }-*/;

    private static native int FILL_IN_PACKAGE() /*-{
		return Titanium.Android.FILL_IN_PACKAGE;
    }-*/;

    private static native int FLAG_ACTIVITY_BROUGHT_TO_FRONT() /*-{
		return Titanium.Android.FLAG_ACTIVITY_BROUGHT_TO_FRONT;
    }-*/;

    private static native int FLAG_ACTIVITY_CLEAR_TOP() /*-{
		return Titanium.Android.FLAG_ACTIVITY_CLEAR_TOP;
    }-*/;

    private static native int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET() /*-{
		return Titanium.Android.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
    }-*/;

    private static native int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS() /*-{
		return Titanium.Android.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS;
    }-*/;

    private static native int FLAG_ACTIVITY_FORWARD_RESULT() /*-{
		return Titanium.Android.FLAG_ACTIVITY_FORWARD_RESULT;
    }-*/;

    private static native int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY() /*-{
		return Titanium.Android.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY;
    }-*/;

    private static native int FLAG_ACTIVITY_MULTIPLE_TASK() /*-{
		return Titanium.Android.FLAG_ACTIVITY_MULTIPLE_TASK;
    }-*/;

    private static native int FLAG_ACTIVITY_NO_ANIMATION() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NO_ANIMATION;
    }-*/;

    private static native int FLAG_ACTIVITY_NO_HISTORY() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NO_HISTORY;
    }-*/;

    private static native int FLAG_ACTIVITY_NO_USER_ACTION() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NO_USER_ACTION;
    }-*/;

    private static native int FLAG_ACTIVITY_PREVIOUS_IS_TOP() /*-{
		return Titanium.Android.FLAG_ACTIVITY_PREVIOUS_IS_TOP;
    }-*/;

    private static native int FLAG_ACTIVITY_REORDER_TO_FRONT() /*-{
		return Titanium.Android.FLAG_ACTIVITY_REORDER_TO_FRONT;
    }-*/;

    private static native int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED() /*-{
		return Titanium.Android.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED;
    }-*/;

    private static native int FLAG_ACTIVITY_SINGLE_TOP() /*-{
		return Titanium.Android.FLAG_ACTIVITY_SINGLE_TOP;
    }-*/;

    private static native int FLAG_AUTO_CANCEL() /*-{
		return Titanium.Android.FLAG_AUTO_CANCEL;
    }-*/;

    private static native int FLAG_CANCEL_CURRENT() /*-{
		return Titanium.Android.FLAG_CANCEL_CURRENT;
    }-*/;

    private static native int FLAG_DEBUG_LOG_RESOLUTION() /*-{
		return Titanium.Android.FLAG_DEBUG_LOG_RESOLUTION;
    }-*/;

    private static native int FLAG_FROM_BACKGROUND() /*-{
		return Titanium.Android.FLAG_FROM_BACKGROUND;
    }-*/;

    private static native int FLAG_GRANT_READ_URI_PERMISSION() /*-{
		return Titanium.Android.FLAG_GRANT_READ_URI_PERMISSION;
    }-*/;

    private static native int FLAG_GRANT_WRITE_URI_PERMISSION() /*-{
		return Titanium.Android.FLAG_GRANT_READ_URI_PERMISSION;
    }-*/;

    private static native int FLAG_INSISTENT() /*-{
		return Titanium.Android.FLAG_INSISTENT;
    }-*/;

    private static native int FLAG_NO_CLEAR() /*-{
		return Titanium.Android.FLAG_NO_CLEAR;
    }-*/;

    private static native int FLAG_NO_CREATE() /*-{
		return Titanium.Android.FLAG_NO_CREATE;
    }-*/;

    private static native int FLAG_ONE_SHOT() /*-{
		return Titanium.Android.FLAG_ONE_SHOT;
    }-*/;

    private static native int FLAG_ONGOING_EVENT() /*-{
		return Titanium.Android.FLAG_ONGOING_EVENT;
    }-*/;

    private static native int FLAG_ONLY_ALERT_ONCE() /*-{
		return Titanium.Android.FLAG_ONLY_ALERT_ONCE;
    }-*/;

    private static native int FLAG_RECEIVER_REGISTERED_ONLY() /*-{
		return Titanium.Android.FLAG_RECEIVER_REGISTERED_ONLY;
    }-*/;

    private static native int FLAG_SHOW_LIGHTS() /*-{
		return Titanium.Android.FLAG_SHOW_LIGHTS;
    }-*/;

    private static native int FLAG_UPDATE_CURRENT() /*-{
		return Titanium.Android.FLAG_UPDATE_CURRENT;
    }-*/;

    private static native int PENDIND_INTENT_FOR_ACTIVITY() /*-{
		return Titanium.Android.PENDIND_INTENT_FOR_ACTIVITY;
    }-*/;

    private static native int PENDIND_INTENT_FOR_BROADCAST() /*-{
		return Titanium.Android.PENDIND_INTENT_FOR_BROADCAST;
    }-*/;

    private static native int PENDIND_INTENT_FOR_SERVICE() /*-{
		return Titanium.Android.PENDIND_INTENT_FOR_SERVICE;
    }-*/;

    private static native int PENDIND_INTENT_MAX_VALUE() /*-{
		return Titanium.Android.PENDIND_INTENT_MAX_VALUE;
    }-*/;

    private static native JavaScriptObject R() /*-{
		return Titanium.Android.R;
    }-*/;

    private static native int RESULT_CANCELED() /*-{
		return Titanium.Android.RESULT_CANCELED;
    }-*/;

    private static native int RESULT_FIRST_USER() /*-{
		return Titanium.Android.RESULT_FIRST_USER;
    }-*/;

    private static native int RESULT_OK() /*-{
		return Titanium.Android.RESULT_OK;
    }-*/;

    private static native int SCREEN_ORIENTATION_BEHIND() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_BEHIND;
    }-*/;

    private static native int SCREEN_ORIENTATION_LANDSCAPE() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_LANDSCAPE;
    }-*/;

    private static native int SCREEN_ORIENTATION_NOSENSOR() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_NOSENSOR;
    }-*/;

    private static native int SCREEN_ORIENTATION_PORTRAIT() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_PORTRAIT;
    }-*/;

    private static native int SCREEN_ORIENTATION_SENSOR() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_SENSOR;
    }-*/;

    private static native int SCREEN_ORIENTATION_UNSPECIFIED() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_UNSPECIFIED;
    }-*/;

    private static native int SCREEN_ORIENTATION_USER() /*-{
		return Titanium.Android.SCREEN_ORIENTATION_USER;
    }-*/;

    private static native int STREAM_DEFAULT() /*-{
		return Titanium.Android.STREAM_DEFAULT;
    }-*/;

    private static native int URI_INTENT_SCHEME() /*-{
		return Titanium.Android.URI_INTENT_SCHEME;
    }-*/;

    private static native int FLAG_ACTIVITY_NEW_TASK() /*-{
		return Titanium.Android.FLAG_ACTIVITY_NEW_TASK;
    }-*/;

    private static native String ACTION_CAMERA_BUTTON() /*-{
		return Titanium.Android.ACTION_CAMERA_BUTTON;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createAndroid();
    }

}
