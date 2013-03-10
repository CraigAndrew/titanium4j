/************************************************************************
  Notification.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.notification;

import com.emitrom.ti4j.desktop.client.notification.notification.NotificationObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A module for displaying desktop notifications.
 * 
 * @author Ekambi
 * 
 */
public class Notification extends JavaScriptObject {

  protected Notification() {

  }

  /**
   * Create a new Notification object.
   * 
   * @return
   */
  public static native NotificationObject createNotification()/*-{
		return Ti.Notification.createNotification();
  }-*/;

}
