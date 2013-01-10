/**************************************************************************
   TableViewSection.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui;

import com.emitrom.gwt4.ti.mobile.client.ui.interfaces.HasWidgets;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A tableview section object created by the method
 * {@link com.emitrom.gwt4.ti.mobile.client.ui.UI.createTableViewSection}
 */
public class TableViewSection extends View {

    public TableViewSection() {
        createPeer();
    }

    TableViewSection(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The title of the section footer
     */
    public native String getFooterTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    public native void setFooterTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    /**
     * @return A view to use instead of the default label when rendering the
     *         section footer
     */
    public native View getFooterView() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.footerView;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setFooterView(HasWidgets value) /*-{
		jso.footerView = value;
    }-*/;

    /**
     * @return The title of the section header
     */
    public native String getHeaderTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    /**
     * @return A view to use instead of the default label when rendering the
     *         section header
     */
    public native View getHeaderView() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.headerView;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setHeaderView(View value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.headerView = value.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The (readonly) number of rows in the section
     */
    public native int getRowCount() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.rowCount;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createTableViewSection();
    }

}
