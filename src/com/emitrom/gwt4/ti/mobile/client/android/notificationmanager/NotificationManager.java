/**************************************************************************
   NotificationManager.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.gwt4.ti.mobile.client.android.notificationmanager;

import com.emitrom.gwt4.ti.mobile.client.android.Notification;
import com.emitrom.gwt4.ti.mobile.client.core.TiFactory;
import com.emitrom.gwt4.ti.mobile.client.core.TiModule;

/**
 * Module to notify users of events that happen. it is a thin wrapper on
 * Notificationmanager
 * (http://developer.android.com/reference/android/app/notificationmanager
 * .html).
 * <p>
 * The constants above are taken from (http://developer.android
 * .com/reference/android/app/Notification.html).
 */
public class NotificationManager extends TiModule {

    private NotificationManager() {
        createPeer();
    }

    public static final int DEFAULT_ALL = DEFAULT_ALL();
    public static final int DEFAULT_SOUND = DEFAULT_SOUND();
    public static final int DEFAULT_VIBRATE = DEFAULT_VIBRATE();
    public static final int FLAG_AUTO_CANCEL = FLAG_AUTO_CANCEL();
    public static final int FLAG_INSISTENT = FLAG_INSISTENT();
    public static final int FLAG_NO_CLEAR = FLAG_NO_CLEAR();
    public static final int FLAG_ONGOING_EVENT = FLAG_ONGOING_EVENT();
    public static final int FLAG_ONLY_ALERT_ONCE = FLAG_ONLY_ALERT_ONCE();
    public static final int FLAG_SHOW_LIGHTS = FLAG_SHOW_LIGHTS();
    public static final int STREAM_DEFAULT = STREAM_DEFAULT();

    private static NotificationManager instance = null;

    public static NotificationManager get() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    /**
     * Cancel a previously shown notification.
     * 
     * @param id The id you assigned to a notification.
     */
    public native void cancel(int id)
    /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancel(id);
    }-*/;

    /**
     * Cancel all previously shown notifications.
     */
    public native void cancelAll()
    /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.cancelAll();
    }-*/;

    /**
     * Add a persistent notification to the status bar.
     * 
     * @param id An id that may be used to cancel a shown notification.
     * @param notification An instance of
     *            {@link com.emitrom.gwt4.ti.mobile.client.android.Notification}
     *            created with
     *            {@link com.emitrom.gwt4.ti.mobile.client.android.Android}.
     */
    public native void notify(int id, Notification notification) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.notify(
						id,
						notification.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    private static native final int DEFAULT_ALL() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_ALL ? Titanium.Android.NotificationManager.DEFAULT_ALL
				: 0;
    }-*/;

    private static native final int DEFAULT_LIGHTS() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_LIGHTS ? Titanium.Android.NotificationManager.DEFAULT_LIGHTS
				: 0;
    }-*/;

    private static native final int DEFAULT_SOUND() /*-{
		return Titanium.Android.NotificationManager.DEFAULT_SOUND ? Titanium.Android.NotificationManager.DEFAULT_SOUND
				: 0;
    }-*/;

    private static native final int DEFAULT_VIBRATE()
    /*-{
		return Titanium.Android.NotificationManager.DEFAULT_VIBRATE ? Titanium.Android.NotificationManager.DEFAULT_VIBRATE
				: 0;
    }-*/;

    private static native final int FLAG_AUTO_CANCEL()
    /*-{
		return Titanium.Android.NotificationManager.FLAG_AUTO_CANCEL ? Titanium.Android.NotificationManager.FLAG_AUTO_CANCEL
				: 0;
    }-*/;

    private static native final int FLAG_INSISTENT()
    /*-{
		return Titanium.Android.NotificationManager.FLAG_INSISTENT ? Titanium.Android.NotificationManager.FLAG_INSISTENT
				: 0;
    }-*/;

    private static native final int FLAG_NO_CLEAR()
    /*-{
		return Titanium.Android.NotificationManager.FLAG_NO_CLEAR ? Titanium.Android.NotificationManager.FLAG_NO_CLEAR
				: 0;
    }-*/;

    private static native final int FLAG_ONGOING_EVENT()
    /*-{
		return Titanium.Android.NotificationManager.FLAG_ONGOING_EVENT ? Titanium.Android.NotificationManager.FLAG_ONGOING_EVENT
				: 0;
    }-*/;

    private static native final int FLAG_ONLY_ALERT_ONCE()
    /*-{
		return Titanium.Android.NotificationManager.FLAG_ONLY_ALERT_ONCE ? Titanium.Android.NotificationManager.FLAG_ONLY_ALERT_ONCE
				: 0;
    }-*/;

    private static native final int FLAG_SHOW_LIGHTS()
    /*-{
		return Titanium.Android.NotificationManager.FLAG_SHOW_LIGHTS ? Titanium.Android.NotificationManager.FLAG_SHOW_LIGHTS
				: 0;
    }-*/;

    private static native final int STREAM_DEFAULT()
    /*-{
		return Titanium.Android.NotificationManager.STREAM_DEFAULT ? Titanium.Android.NotificationManager.STREAM_DEFAULT
				: 0;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createAndroidNoficationManager();
    }
}
