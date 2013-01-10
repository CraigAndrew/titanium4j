/**************************************************************************
   TableViewRow.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.gwt4.ti.mobile.client.ui.interfaces.HasTitle;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A tableview row object created by the method
 * {@link com.emitrom.gwt4.ti.mobile.client.ui.UI.createTableviewRow}.
 * <p>
 * Make sure you set the tableClass on each row instance if using more than one
 * type of row layout. You can use the same value for each instance of a row
 * where the layout is the same - even if the value of the elements inside the
 * row have different values. For example, if the text is the only thing
 * different between two cells but the layout is the same, both row instances
 * should have the same value for tableClass.
 * 
 * You can listen for table row events on all rows by adding an event listener
 * to the table view instance. Events automatically propagate to parent views.
 */
public class TableViewRow extends View implements HasTitle {

    public TableViewRow() {
        createPeer();
    }

    TableViewRow(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The class name of the table. each table view cell must have a
     *         unique class name if the cell layout is different. however, use
     *         the same name for rows that have the same structural layout (even
     *         if the content is different) to provide maximum rendering
     *         performance.
     */
    public native String getClassName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.className;
    }-*/;

    public native void setClassName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.className = value;
    }-*/;

    /**
     * @return Default color of the row when not selected
     */
    public native String getColor() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.color;
    }-*/;

    public native void setColor(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.color = value;
    }-*/;

    /**
     * @return Render a system provided check mark in the right image area of
     *         the row cell
     */
    public native boolean hasCheck() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.hasCheck;
    }-*/;

    public native void setHasCheck(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.hasCheck = value;
    }-*/;

    /**
     * @return Render a system provided right arrow in the right image area of
     *         the row cell
     */
    public native boolean hasChild() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.hasChild;
    }-*/;

    public native void setHasChild(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.hasChild = value;
    }-*/;

    /**
     * @return Render a system provided blue indicator icon in the right image
     *         area of the row cell
     */
    public native boolean hasDetail() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.hasDetail;
    }-*/;

    public native void setHasDetail(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.hasDetail = value;
    }-*/;

    /**
     * @return The indention level for the cell (defaults to 0)
     */
    public native int getIndentionLevel() /*-{
		return jso.indentionLevel;
    }-*/;

    public native void setIndentionLevel(int value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.indentionLevel = value;
    }-*/;

    /**
     * @return The layout algorithm to use for the layout. either absolute
     *         (default) or vertical.
     */
    public native String getLayout() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.layout;
    }-*/;

    public native void setLayout(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.layout = value;
    }-*/;

    /**
     * @return Image url to render in the left image area of the row cell
     */
    public native String getLeftImage() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.leftImage;
    }-*/;

    public native void setLeftImage(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.leftImage = value;
    }-*/;

    /**
     * @return Image url to render in the right image area of the row cell
     */
    public native String getRightImage() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.rightImage;
    }-*/;

    public native void setRightImage(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.rightImage = value;
    }-*/;

    /**
     * @return The background color to render when the row cell is selected
     */
    public native String getSelectedBackgroundColor() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.selectedBackgroundColor;
    }-*/;

    public native void setSelectedBackgroundColor(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.selectedBackgroundColor = value;
    }-*/;

    /**
     * @return The background image to render when the row cell is selected
     */
    public native String getSelectedBackgroundImage() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.selectedBackgroundImage;
    }-*/;

    public native void setSelectedBackgroundImage(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.selectedBackgroundImage = value;
    }-*/;

    /**
     * @return Color of the row during selection
     */
    public native String getSelectedColor() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.selectedColor;
    }-*/;

    public native void setSelectedColor(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.selectedColor = value;
    }-*/;

    /**
     * @return A selection style constant to control the selection color. for
     *         iphone, use the constants from com.emitrom.gwt4.ti.mobile.client
     *         .ui.iphone.TableViewCellSelectionStyle
     */
    public native int getSelectionStyle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.selectionStyle;
    }-*/;

    public native void setSelectionStyle(int value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.selectionStyle = value;
    }-*/;

    public native void setFilter(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.filter = value;
    }-*/;

    public native String getFilter() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.filter;
    }-*/;

    /**
     * @return The title cell value. do not specify if using views as children
     *         of the row
     */
    public native String getTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public native void setTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.title = value;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createTableViewRow();
    }

}
