/**************************************************************************
   TableView.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import java.util.List;

import com.emitrom.ti4j.mobile.client.core.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewHandler;
import com.emitrom.ti4j.mobile.client.data.TableViewBaseModel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A table view allows you to create a scrollable table of content in a
 * list-based fashion.
 */
public class TableView extends View {

    private List<? extends TableViewBaseModel> data;

    public TableView() {
        createPeer();
    }

    public TableView(List<? extends TableViewBaseModel> data) {
        this();
        setDataFromModel(data);
    }

    TableView(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return True if the rows can be selected
     */
    public native boolean allowsSelection() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.allowsSelection;
    }-*/;

    public native void setAllowsSelection(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.allowsSelection = value;
    }-*/;

    /**
     * @return True if the rows can be selected while editing the table (ios
     *         only) Available only on iOs
     */
    public native boolean allowsSelectionDuringEditing() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.allowsSelectionDuringEditing;
    }-*/;

    public native void setAllowsSelectionDuringEditing(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.allowsSelectionDuringEditing = value;
    }-*/;

    /**
     * @return The data array of objects to be used for the rows of the table
     *         view
     */
    public native JsArray<JavaScriptObject> getData() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.data;
    }-*/;

    public void setDataFromModel(List<? extends TableViewBaseModel> data) {
        this.data = data;
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (TableViewBaseModel model : data) {
            values.push(model.getJsObj());
        }
        _setData(values);
    }

    public void setData(List<? extends TableViewRow> rows) {
        JsArray<JavaScriptObject> values = JsArray.createArray().cast();
        for (TableViewRow row : rows) {
            values.push(row.getJsObj());
        }
        _setData(values);
    }

    private native void _setData(Object value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.data = value;
    }-*/;

    /**
     * @return Allow the table view to be editable (jso must be true for
     *         swipe-to-delete) (ios only)
     * 
     */
    public native boolean isEditable() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.editable;
    }-*/;

    public native void setEditable(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.editable = value;
    }-*/;

    /**
     * @return Boolean to control the editing state of the table view (ios only)
     *         Available only on iOs
     */
    public native boolean isEditing() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.editing;
    }-*/;

    public native void setEditing(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.editing = value;
    }-*/;

    /**
     * @return The filter attribute to be used when searching. jso property maps
     *         to your data object or a property on the row object
     */
    public native String getFilterAttribute() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.filterAttribute;
    }-*/;

    public native void setFilterAttribute(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.filterAttribute = value;
    }-*/;

    /**
     * @return Boolean to indicate if the search should be case sensitive or
     *         case insensitive (default)
     */
    public native boolean isFilterCaseInsensitive() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.filterCaseInsensitive;
    }-*/;

    public native void setFilterCaseInsensitive(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.filterCaseInsensitive = value;
    }-*/;

    /**
     * @return The table view footer title
     */
    public native String getFooterTitle() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.footerTitle;
    }-*/;

    public native void setFooterTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.footerTitle = value;
    }-*/;

    /**
     * @return The table view footer as a view that will be rendered instead of
     *         a label
     */
    public native View getFooterView() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.footerView;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setFooterView(View value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.footerView = value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The table view header title
     */
    public native String getHeaderTitle() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.headerTitle;
    }-*/;

    public native void setHeaderTitle(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.headerTitle = value;
    }-*/;

    /**
     * @return The table view header as a view that will be rendered instead of
     *         a label
     */
    public native View getHeaderView() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.headerView;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setHeaderView(View value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.headerView = value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The table view header as a view that will be rendered instead of
     *         a label
     */
    public native View getHeaderPullView() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.headerPullView;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.View::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setHeaderPullView(View value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.headerPullView = value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return An array of objects (with title and index properties) to control
     *         the table view index
     */
    public native <T> T getIndex() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.index;
    }-*/;

    public native void setIndex(JsArray<JavaScriptObject> value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.index = value;
    }-*/;

    /**
     * @return Max row height for table view rows
     */
    public native double getMaxRowHeight() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.maxRowHeight;
    }-*/;

    public native void setMaxRowHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.maxRowHeight = value;
    }-*/;

    /**
     * @return Min row height for table view rows
     */
    public native double getMinRowHeight() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.minRowHeight;
    }-*/;

    public native void setMinRowHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.minRowHeight = value;
    }-*/;

    /**
     * @return Boolean to control the moveable state of the table view (ios
     *         only) Available only on iOs
     */
    public native boolean isMoving() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.moving;
    }-*/;

    public native void setMoving(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.moving = value;
    }-*/;

    /**
     * @return Default row height for table view rows
     */
    public native double getRowHeight() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.rowHeight;
    }-*/;

    public native void setRowHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.rowHeight = value;
    }-*/;

    /**
     * @return True (default) if tableview can be scrolled
     */
    public native boolean isScrollable() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.scrollable;
    }-*/;

    public native void setScrollable(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.scrollable = value;
    }-*/;

    /**
     * @return The search field to use for the table view
     */
    public native <T> T getSearch() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.search;
    }-*/;

    public native void setSearch(SearchBar value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.search = value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return Boolean to control the visibility of the search field
     */
    public native boolean isSearchHidden() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.searchHidden;
    }-*/;

    public native void setSearchHidden(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.searchHidden = value;
    }-*/;

    /**
     * @return The separator color color as a hex or named value
     */
    public native String getSeparatorColor() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.separatorColor;
    }-*/;

    public native void setSeparatorColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.separatorColor = value;
    }-*/;

    /**
     * @return The separator style constant. For iphone, com.emitrom.gwt4.ti.
     *         .mobile.client.ui.iphone.TableViewSeparatorStyle
     */
    public native int getSeparatorStyle() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.separatorStyle;
    }-*/;

    public native void setSeparatorStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.separatorStyle = value;
    }-*/;

    /**
     * @return Whether tableview displays vertical scroll indicator (ios only)
     *         Available only on iOs
     */
    public native boolean showVerticalScrollIndicator() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.showVerticalScrollIndicator;
    }-*/;

    public native void setShowVerticalScrollIndicator(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.showVerticalScrollIndicator = value;
    }-*/;

    /**
     * @return The style of the table view. constant from
     *         {@link com.emitrom.ti4j.mobile.client.ui.iphone.TableViewStyle}
     *         Iphone only
     */
    public native int getStyle() /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		return jso.style;
    }-*/;

    public native void setStyle(int value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.style = value;
    }-*/;

    /**
     * Append a row to the table, optionally with animation
     * 
     * @param row
     *            row to append
     * @param properties
     *            animation properties
     */
    public native void appendRow(TableViewRow row, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.appendRow(
						row.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()(),
						properties);
    }-*/;

    /**
     * Delete an existing row, optionally with animation
     * 
     * @param row
     *            index of row to delete
     * @param properties
     *            animation properties
     */
    public native void deleteRow(int row, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.deleteRow(row, properties);
    }-*/;

    /**
     * Programmatically deselect a row
     * 
     * @param row
     *            row index to deselect
     */
    public native void deselectRow(int row) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.deselectRow(row);
    }-*/;

    /**
     * Insert a row before another row, optionally with animation
     * 
     * @param index
     *            index
     * @param row
     *            row to insert
     * @param properties
     *            animation properties
     */
    public native void insertRowAfter(int index, TableViewRow row, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.insertRowAfter(
						index,
						row.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()(),
						properties);
    }-*/;

    /**
     * Insert a row after another row, optionally with animation
     * 
     * @param index
     *            index
     * @param row
     *            row to insert
     * @param properties
     *            animation properties
     */
    public native void insertRowBefore(int index, TableViewRow row, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.insertRowBefore(index, row, properties);
    }-*/;

    /**
     * Scroll to a specific row index and ensure that that row is on screen
     * 
     * @param index
     *            index
     * @param properties
     *            animation properties. 'position' property controls the
     *            position constant to use for position (on iPhone, use
     *            constants from com.emitrom.ti4j.mobile.client.ui.iphone.
     *            TableViewScrollPosition).
     */
    public native void scrollToIndex(int index, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.scrollToIndex(index, properties);
    }-*/;

    /**
     * Scroll the table to a specific top position where 0 is the topmost y
     * position in the table view
     * 
     * @param top
     *            y position
     * @param properties
     *            optional dictionary with the key `animated` (default, true) as
     *            boolean to indicate if the scroll should be animated or
     *            immediate
     */
    public native void scrollToTop(double top, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.scrollToTop(top, properties);
    }-*/;

    /**
     * Programmatically select a row
     * 
     * @param row
     *            row index to select
     */
    public native void selectRow(int row) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso.selectRow(row);
    }-*/;

    /**
     * Sets this tableview's content insets.
     * 
     * A table view is essentially a scroll view that contains a set of static
     * row views that represents the content. Thus, the setContentInsets method
     * facilitates a margin, or inset, distance between the content and the
     * container scroll view.
     * 
     * Typically used with the headerPullView property.
     * 
     * @iOs Only
     */
    public native void setContentInsets(TableViewEdgeInsets value) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.setContentInsets(value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Sets this tableview's content insets.
     * 
     * A table view is essentially a scroll view that contains a set of static
     * row views that represents the content. Thus, the setContentInsets method
     * facilitates a margin, or inset, distance between the content and the
     * container scroll view.
     * 
     * Typically used with the headerPullView property.
     * 
     * @iOs Only
     */
    public native void setContentInsets(TableViewEdgeInsets value, boolean animate) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.setContentInsets(
						value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()(),
						{
							animated : animate
						});
    }-*/;

    /**
     * Sets this tableview's content insets.
     * 
     * A table view is essentially a scroll view that contains a set of static
     * row views that represents the content. Thus, the setContentInsets method
     * facilitates a margin, or inset, distance between the content and the
     * container scroll view.
     * 
     * Typically used with the headerPullView property.
     * 
     * @iOs Only
     */
    public native void setContentInsets(TableViewEdgeInsets value, Animation animation) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.setContentInsets(
						value.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()(),
						animation.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Update an existing row, optionally with animation
     * 
     * @param row
     *            row data to update
     * @param properties
     *            animation properties
     */
    public native void updateRow(TableViewRow row, Object properties) /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.updateRow(
						row.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()(),
						properties);
    }-*/;

    public native CallbackRegistration addRowSelectionHandler(TableViewHandler handler)
    /*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;
    

    public native void addDeleteHandler(TableViewHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::DELETE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
    }-*/;

    public native void addMoveHandler(TableViewHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::MOVE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
    }-*/;

    public native void addScrollHandler(TableViewHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::SCROLL,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
    }-*/;

    public native void addScrollEndHandler(TableViewHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::SCROLL_END,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.tableview.TableViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TableViewHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/tableview/TableViewEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createTableView();
    }

    public static TableView from(ProxyObject obj) {
        return new TableView(obj.getJsObj());
    }

}
