package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class ListItem extends ProxyObject {

    protected ListItem(JavaScriptObject obj) {
        this.jsObj = obj;
    }

    /**
     * Gets an accessory on the right side of an item.
     * <p>
     * Specify one of the following: Titanium.UI.LIST_ACCESSORY_TYPE_CHECKMARK,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DISCLOSURE, or
     * Titanium.UI.LIST_ACCESSORY_TYPE_NONE.
     * <p>
     * Default: Titanium.UI.LIST_ACCESSORY_TYPE_NONE
     */
    public native String getAccessoryType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.accessoryType;
    }-*/;

    /**
     * Sets an accessory on the right side of an item.
     * <p>
     * Specify one of the following: Titanium.UI.LIST_ACCESSORY_TYPE_CHECKMARK,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DETAIL,
     * Titanium.UI.LIST_ACCESSORY_TYPE_DISCLOSURE, or
     * Titanium.UI.LIST_ACCESSORY_TYPE_NONE.
     * <p>
     * Default: Titanium.UI.LIST_ACCESSORY_TYPE_NONE
     */
    public native void setAccessoryType(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.accessoryType = value;
    }-*/;

}
