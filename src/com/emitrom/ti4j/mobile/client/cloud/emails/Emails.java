/**************************************************************************
   Emails.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.emails;

import com.emitrom.ti4j.mobile.client.cloud.core.BaseCloudResponseHandler;
import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * Provides methods for accessing ACS Email service.
 * 
 */
public class Emails extends TiModule {

    public static final Emails INSTANCE = new Emails();

    public static Emails get() {
        return INSTANCE;
    }

    private Emails() {
        createPeer();
    }

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeEmails();
    }

    /**
     * Send an email to a list of email adresses.
     */
    public native void send(Email email, BaseCloudResponseHandler handler)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer
				.send(
						email.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
						function(e) {
							var response = @com.emitrom.ti4j.mobile.client.cloud.core.BaseCloudResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.cloud.core.BaseCloudResponseHandler::onResponse(Lcom/emitrom/ti4j/mobile/client/cloud/core/BaseCloudResponse;)(response);
						});
    }-*/;

}
