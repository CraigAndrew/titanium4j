/**************************************************************************
   Group.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.contacts;

import com.emitrom.gwt4.ti.mobile.client.core.JsoHelper;
import com.emitrom.gwt4.ti.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object which represents a group in the contacts database. Available only
 * on iOs.
 */
public class Group extends EventDispatcher {

    public Group() {
        jsObj = JsoHelper.createObject();
    }

    public Group(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The name of the group
     */
    public final native String getName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.name;
    }-*/;

    public final native void setName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.name = value;
    }-*/;

    /**
     * Adds a person to the group
     * 
     * @param person {@link com.emitrom.gwt4.ti.mobile.client.contacts.Person}
     *            object to add to the group
     */
    public final native void add(Person person) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.add(person.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * The complete list of members of the group
     */
    public final native void members() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.members();
    }-*/;

    /**
     * Removes a person from the group
     * 
     * @param person {@link com.emitrom.gwt4.ti.mobile.client.contacts.Person}
     *            object to remove from the group
     */
    public final native void remove(Person person) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.remove(person.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * A list of sorted members
     * 
     * @param sortBy Method for sorting. Must be one of
     *            {@link com.emitrom.gwt4.ti.mobile.client.contacts.Contacts.CONTACTS_SORT_FIRST_NAME}
     *            or
     *            {@link com.emitrom.gwt4.ti.mobile.client.contacts.Contacts.CONTACTS_SORT_LAST_NAME}
     */
    public final native void sortedMembers(int sortBy) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.sortedMembers(sortBy);
    }-*/;

}
