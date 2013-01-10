/**************************************************************************
   Accelerometer.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.accelerometer;

import com.emitrom.gwt4.ti.mobile.client.core.TiFactory;
import com.emitrom.gwt4.ti.mobile.client.core.TiModule;
import com.emitrom.gwt4.ti.mobile.client.core.events.TiEventListener;
import com.emitrom.gwt4.ti.mobile.client.core.events.UpdateEvent;

/**
 * The top level Accelerometer module. The Accelerometer modules contains
 * methods and properties for using the device accelerometer.
 * 
 * You'll want to be selective about turning on and off the device
 * accelerometer. It's recommended you turn off the accelerometer when you're
 * not using it. You can turn off the accelerometer by simply removing your
 * event listener function. You can turn it back on by re-adding the same
 * function with `addEventListener`.
 * Accelerometer.removeEventListener('update',myFunction);
 */
public class Accelerometer extends TiModule {

    private static Accelerometer instance = null;

    public static Accelerometer get() {
        if (instance == null) {
            instance = new Accelerometer();
        }
        return instance;
    }

    private Accelerometer() {
        createPeer();
    }

    /**
     * Convenient method for
     * <code>Acceterometer.addEventListener(UpdateEvent.UPDATE, listener);</code>
     * 
     * @param listener
     */
    public void addUpdateHandler(TiEventListener<UpdateEvent> listener) {
        addEventListener(UpdateEvent.UPDATE, listener);
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createAccelerometer();
    }

}
