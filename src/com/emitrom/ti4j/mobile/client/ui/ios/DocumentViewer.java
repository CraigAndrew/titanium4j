/**************************************************************************
 * DocumentViewer.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom
 * LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.ui.ios;

import com.emitrom.ti4j.mobile.client.ui.View;

/**
 * A documentviewer provides in-app support for managing user interactions with
 * files in the local system. for example, an email program might use this class
 * to allow the user to preview attachments and open them in other apps. use
 * this class to present an appropriate user interface for previewing or
 * printing a specified file. the documentviewere is created by the method
 * {@link com.emitrom.ti4j.mobile.client.ui.ipad.IPad.createDocumentViewer} .
 */
public class DocumentViewer extends View {

    public DocumentViewer() {
        createPeer();
    }

    /**
     * To display the document viewer over the current view.
     * 
     * @param animated
     *            is a boolean indicating if the showing of the viewer should be
     *            animated.
     * @param view
     *            The view property would specify the view relative to where the
     *            viewer should display.
     */
    public native void show(boolean animated, View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.show(animated,
				view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Change the url of the document viewer
     * 
     * @param url
     *            the new url
     */
    public native void setUrl(String url) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.setUrl(url);
    }-*/;

    @Override
    public void createPeer() {
        jsObj = IOS.createDocumentViewer();
    }

}
