/**************************************************************************
   Contacts.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.contacts;

import java.util.ArrayList;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * 
 * The top level contacts module. the contacts module is used accessing the
 * device address book. (read-only on android.)
 * <p>
 * Contacts on AndroidMedia are currently only read-only, so methods such as
 * 'createPerson', 'removePerson', etc..., are not supported. Person objects
 * which have been removed from the database are invalidated after a save
 * operation, whether from creating a new contact or explicitly calling
 * Contacts.save(). Using them may result in unpredictable behavior, including
 * crashes.
 */
public class Contacts extends TiModule {

    private static Contacts instance = null;

    public static Contacts get() {
        if (instance == null) {
            instance = new Contacts();
        }
        return instance;
    }

    private Contacts() {
        createPeer();
    }

    public static final int CONTACTS_KIND_ORGANIZATION = CONTACTS_KIND_ORGANIZATION();
    public static final int CONTACTS_KIND_PERSON = CONTACTS_KIND_PERSON();
    public static final int CONTACTS_SORT_FIRST_NAME = CONTACTS_SORT_FIRST_NAME();
    public static final int CONTACTS_SORT_LAST_NAME = CONTACTS_SORT_LAST_NAME();

    /**
     * Create and return an instance of
     * com.emitrom.ti4j.mobile.client.contacts.Group. Only on iOs available
     * 
     */
    public native Group createGroup() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createGroup();
		var toReturn = @com.emitrom.ti4j.mobile.client.contacts.Group::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * com.emitrom.ti4j.mobile.client.contacts.Group. Only on iOs available
     * 
     * @param parameters (optional) a dictionary object properties defined in
     *            com.emitrom.ti4j.mobile.client.contacts.Group.Group
     */
    public native Group createGroup(Object parameters) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createGroup(parameters);
		var toReturn = @com.emitrom.ti4j.mobile.client.contacts.Group::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * com.emitrom.ti4j.mobile.client.contacts.Person. Only available on iOs.
     */
    public native Person createPerson() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createPerson();
		var toReturn = @com.emitrom.ti4j.mobile.client.contacts.Person::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * com.emitrom.ti4j.mobile.client.contacts.Person. Only available on iOs.
     * 
     * @param parameters (optional) a dictionary object properties defined in
     *            com.emitrom.ti4j.mobile.client.contacts.Person
     */
    public native Person createPerson(Object parameters) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createPerson(parameters);
		var toReturn = @com.emitrom.ti4j.mobile.client.contacts.Person::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns an of all
     * {@link com.emitrom.ti4j.mobile.client.contacts.Group} objects in the
     * contacts database.Only available on iOs.
     */
    public native void getAllGroups() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getAllGroups();
    }-*/;

    /**
     * Returns an array of all
     * {@link com.emitrom.ti4j.mobile.client.contacts.Person} objects in the
     * contacts database
     */
    public native void getAllPeople() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getAllPeople();
    }-*/;

    /**
     * Returns a {@link com.emitrom.ti4j.mobile.client.contacts.Group} object
     * with the given id.Available only on iOs.
     * 
     * @param id The database ID of the group to retrieve
     */
    public native Group getGroupByID(int id) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.getGroupByID(id);
		var toReturn = @com.emitrom.ti4j.mobile.client.contacts.Group::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns an array of
     * {@link com.emitrom.ti4j.mobile.client.contacts.Person} objects who
     * have a name (first, last, middle, composite) which matches the given name
     * 
     * @param name The name to match in the database
     */

    private ArrayList<Person> getPeopleWithName(String name) {
        ArrayList<Person> result = new ArrayList<Person>();
        JsArray<JavaScriptObject> array = _getPeopleWithName(name);
        for (int i = 0; i < array.length(); i++) {
            result.add(new Person(array.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getPeopleWithName(String name) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.getPeopleWithName(name);
    }-*/;

    /**
     * Returns a {@com.emitrom.ti4j.mobile.client.contacts.Person} object
     * with the given id
     * 
     * @param id The database ID of the person to retrieve
     */
    public native Person getPersonByID(int id) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.getPersonByID(id);
		var toReturn = @com.emitrom.ti4j.mobile.client.contacts.Person::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Removes a group from the contacts database.
     * 
     * @platforms iphone, ipad
     * @param group The {@link com.emitrom.ti4j.mobile.client.contacts.Group}
     *            object to remove from the database.
     */
    public native void removeGroup(Group group) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.removeGroup(group.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Removes a person from the contacts database. only on iOs
     * 
     * @param person The
     *            {@link com.emitrom.ti4j.mobile.client.contacts.Person}
     *            object to remove from the database.
     */
    public native void removePerson(Person person) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.removePerson(person.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Reverts all changes made to the previous save of the database. only on
     * iOs
     */
    public static native void revert() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.revert();
    }-*/;

    /**
     * Saves all changes to contacts to the database.
     */
    public static native void save() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.save();
    }-*/;

    /**
     * Displays the contact picker
     * 
     * @param animated Whether or not to animate the show/hide of the contacts
     *            picker
     * @param fields A list of field names to show when selecting properties,
     *            default is to show all available
     */
    public void showContacts(TiEventListener<?> cancel, TiEventListener<?> selectedPerson,
                    TiEventListener<?> selectedProperty, boolean animated, JsArrayString fields) {
        showContacts(cancel.getJsoPeer(), selectedPerson.getJsoPeer(), selectedProperty.getJsoPeer(), animated, fields);
    }

    private native void showContacts(JavaScriptObject cancel, JavaScriptObject selectedPerson,
                    JavaScriptObject selectedProperty, boolean animated, JsArrayString fields) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.showContacts(cancel, selectedPerson, selectedProperty, animated,
				fields);
    }-*/;

    private static native final int CONTACTS_KIND_PERSON() /*-{
		return Titanium.Contacts.CONTACTS_KIND_PERSON;
    }-*/;

    private static native final int CONTACTS_SORT_FIRST_NAME() /*-{
		return Titanium.Contacts.CONTACTS_SORT_FIRST_NAME;
    }-*/;

    private static native final int CONTACTS_SORT_LAST_NAME() /*-{
		return Titanium.Contacts.CONTACTS_SORT_LAST_NAME;
    }-*/;

    private static native final int CONTACTS_KIND_ORGANIZATION() /*-{
		return Titanium.Contacts.CONTACTS_KIND_ORGANIZATION;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeContactModule();
    }

}
