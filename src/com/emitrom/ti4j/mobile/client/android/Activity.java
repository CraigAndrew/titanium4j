/**************************************************************************
   Activity.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.core.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.EventDispatcher;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.emitrom.ti4j.mobile.client.core.handlers.activity.CreateHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.activity.DestroyHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.activity.PauseHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.activity.ResumeHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.activity.StartHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.activity.StopHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.intent.NewIntentHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Titanium binding of an AndroidMedia Activity
 */
public class Activity extends EventDispatcher {

    public Activity() {
        jsObj = JsoHelper.createObject();
    }

    public Activity(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Called when the activity is done and should be closed. Also see
     * AndroidMedia's documentation for finish
     * (http://developer.android.com/reference/android/
     * app/activity.html#finish)
     */
    public native void finish() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.finish();
    }-*/;

    /**
     * Returns the Titanium.Android.Intent that was used to start this Activity.
     * 
     * @return The intent that was used to start this Activity.
     */
    public native Intent getIntent() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.getIntent();
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Get an AndroidMedia or Application string using the passed-in Resource ID
     * Also see AndroidMedia's documentation for getString
     * 
     * @param resourceId , A Resource ID from the Application or AndroidMedia.
     * @return
     */
    public native String getString(int resourceId) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getString(resourceId);
    }-*/;

    /**
     * Get an AndroidMedia or Application string using the passed-in Resource ID
     * and optional format arguments. Also see AndroidMedia's documentation for
     * getString and String Resources
     * 
     * @param resourceId , a Resource ID from the Application or AndroidMedia.
     * @param format , optional format arguments for the String resource
     * @return
     */
    public native String getString(int resourceId, Object format) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getString(resourceId, format);
    }-*/;

    /**
     * Set the requested Activity orientation. Also see AndroidMedia's
     * documentation for setRequestedOrientation
     * 
     * @param orientation , Can be one of
     *            AndroidMedia.SCREEN_ORIENTATION_BEHIND,
     *            AndroidMedia.SCREEN_ORIENTATION_LANDSCAPE,
     *            AndroidMedia.SCREEN_ORIENTATION_NOSENSOR,
     *            AndroidMedia.SCREEN_ORIENTATION_PORTRAIT,
     *            AndroidMedia.SCREEN_ORIENTATION_SENSOR,
     *            AndroidMedia.SCREEN_ORIENTATION_UNSPECIFIED,
     *            AndroidMedia.SCREEN_ORIENTATION_USER
     */
    public native void setRequestedOrientation(int orientation) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.setRequestedOrientation(orientation);
    }-*/;

    /**
     * @return The requested orientation of this activity. see possible constant
     *         values that begin with SCREEN_ORIENTATION in
     *         {@link com.emitrom.ti4j.mobile.client.android.Android}.
     */
    public native int getRequestedOrientation() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.requestedOrientation;
    }-*/;

    /**
     * Sets the result of this Activity using an Intent. This should be used in
     * the case when the Activity responds to startActivityForResult. Also see
     * AndroidMedia's documentation for setResult
     * 
     * @param resultCode , The result code for this Activity. Must be one of
     *            AndroidMedia.RESULT_OK,AndroidMedia.RESULT_CANCELED,
     *            AndroidMedia.RESULT_FIRST_USER
     */
    public native void setResult(int resultCode) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.setResult(resultCode);
    }-*/;

    /**
     * Sets the result of this Activity using an Intent. This should be used in
     * the case when the Activity responds to startActivityForResult. Also see
     * AndroidMedia's documentation for setResult
     * 
     * @param resultCode , The result code for this Activity. Must be one of
     *            AndroidMedia.RESULT_OK,AndroidMedia.RESULT_CANCELED,
     *            AndroidMedia.RESULT_FIRST_USER
     * 
     * @param intent , An optional Titanium.Android.Intent with extra result
     *            data
     */
    public native void setResult(int resultCode, Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.setResult(
						resultCode,
						intent.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Starts a new Activity, using the passed in Intent as the description.
     * Also see AndroidMedia's documentation for startActivity
     * 
     * @param intent , Description of the Activity to start
     */
    public native void startActivity(Intent intent) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.startActivity(intent.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * The same as startActivity, but also accepts a event listener for handling
     * the result of the started Activity. Also see AndroidMedia's documentation
     * for startActivityForResult
     * 
     * @param intent , Description of the Activity to start
     * @param listener , A event listener that is executed when the Activity has
     *            set it's result.
     */
    public void startActivityForResult(Intent intent, TiEventListener<?> listener) {
        _startActivityForResult(intent.getJsObj(), listener.getJsoPeer());
    }

    private native void _startActivityForResult(JavaScriptObject intent, JavaScriptObject listener) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.startActivityForResult(intent, listener);
    }-*/;

    /**
     * The Intent that was used to start this Activity
     * 
     * @return, The Intent that was used to start this Activity
     */
    public native Intent getIntentProperty() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.intent;
		var toReturn = @com.emitrom.ti4j.mobile.client.android.Intent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Set an event listener that is called to initially create an AndroidMedia
     * Options Menu for this Activity when the user presses the Menu button
     * 
     * @param listener
     */
    public void setOncreateOptionsMenu(TiEventListener<?> listener) {
        setOncreateOptionsMenu(listener.getJsoPeer());
    }

    private native void setOncreateOptionsMenu(JavaScriptObject callback) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.oncreateOptionsMenu = callback;
    }-*/;

    /**
     * Set an event listener that is called to prepare an Options Menu for
     * displaying on this Activity when the user presses the Menu button.
     * 
     * @param listener
     */
    public void setOnPrepareOptionsMenu(TiEventListener<?> listener) {
        setOnPrepareOptionsMenu(listener.getJsoPeer());
    }

    private native void setOnPrepareOptionsMenu(JavaScriptObject callback) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.onPrepareOptionsMenu = callback;
    }-*/;

    public native void addCreateHandler(CreateHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::CREATE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.CreateEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.activity.CreateHandler::onCreate(Lcom/emitrom/ti4j/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
    }-*/;

    public native void addDestroyHandler(DestroyHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::DESTROY,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.DestroyEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.activity.DestroyHandler::onDestroy(Lcom/emitrom/ti4j/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
    }-*/;

    public native void addNewIntentHandler(NewIntentHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.android.NewIntentEvent::NEW_INTENT,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.android.NewIntentEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.intent.NewIntentHandler::onNewIntent(Lcom/emitrom/ti4j/mobile/client/core/events/android/NewIntentEvent;)(eventObject);
						});
    }-*/;

    public native void addPauseHandler(PauseHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::PAUSE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.PauseEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.activity.PauseHandler::onPause(Lcom/emitrom/ti4j/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
    }-*/;

    public native void addResumeHandler(ResumeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::RESUME,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.activity.ResumeHandler::onResume(Lcom/emitrom/ti4j/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
    }-*/;

    public native void addStartHandler(StartHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::START,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.activity.StartHandler::onStart(Lcom/emitrom/ti4j/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
    }-*/;

    public native void addStopHandler(StopHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::STOP,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.activity.ActivityEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.activity.StopHandler::onStop(Lcom/emitrom/ti4j/mobile/client/core/events/activity/ActivityEvent;)(eventObject);
						});
    }-*/;

}
