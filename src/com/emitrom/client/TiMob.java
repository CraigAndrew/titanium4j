/**************************************************************************
   TiMob.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.client;

import com.emitrom.ti4j.mobile.client.api.API;
import com.emitrom.ti4j.mobile.client.core.TiEntryPoint;
import com.emitrom.ti4j.mobile.client.ui.Window;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TiMob extends TiEntryPoint {
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    // private static final String SERVER_ERROR = "An error occurred while "
    // + "attempting to contact the server. Please check your network " +
    // "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    @Override
    public void onStart() {

        API.get().debug("Hello, World");
        Window window = new Window();
        window.setTitle("Emitrom");
        window.setModal(true);
        window.open();
        API.get().debug("finished");

    }

}
