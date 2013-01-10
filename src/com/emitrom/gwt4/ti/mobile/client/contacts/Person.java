/**************************************************************************
   Person.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
 * An object which represents a person in the contacts database.
 * <p>
 * There are two kinds of properties: single value and multivalue. Single value
 * properties are returned as a direct value, while mutlivalue properties are
 * returned as dictionary objects with keys which represent labels of the
 * property, with values that are arrays of all values in the property which
 * correspond to that label (e.g. {"home" : [address1, address2]})
 */
public class Person extends EventDispatcher {

    public static Object URL = URL();

    public Person() {
        jsObj = JsoHelper.createObject();
    }

    public Person(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The addresses for the person. multi-value, valid labels are:
     *         home, work, other. values are dictionaries.
     */
    public native Object getAddress() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.address;
    }-*/;

    public native void setAddress(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.address = value;
    }-*/;

    /**
     * @return The birthday of the person. single value, format is
     *         "yyyy-mm-dd't'hh:mm:ss'.'sss+0000"
     */
    public native String getBirthday() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.birthday;
    }-*/;

    public native void setBirthday(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.birthday = value;
    }-*/;

    /**
     * @return The date the person was created in the database. single value,
     *         format is "yyyy-mm-dd't'hh:mm:ss'.'sss+0000", read-only
     */
    public native String getCreated() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.created;
    }-*/;

    /**
     * @return Dates associated with the person. multi-value, valid labels are:
     *         `anniversary`. values are strings of format
     *         "yyyy-mm-dd't'hh:mm:ss'.'sss+0000"
     */
    public native Object getDate() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.date;
    }-*/;

    public native void setDate(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.date = value;
    }-*/;

    /**
     * @return The department of the person. single value
     */
    public native String getDepartment() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.department;
    }-*/;

    public native void setDepartment(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.department = value;
    }-*/;

    /**
     * @return The email addresses for the person. multi-value, valid labels
     *         are: home, work, other. values are strings.
     */
    public native Object getEmail() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.email;
    }-*/;

    public native void setEmail(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.email = value;
    }-*/;

    /**
     * @return The first name of the person. single value
     */
    public native String getFirstName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.firstName;
    }-*/;

    public native void setFirstName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.firstName = value;
    }-*/;

    /**
     * @return The phonetic first name of the person. single value
     */
    public native String getFirstPhonetic() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.firstPhonetic;
    }-*/;

    public native void setFirstPhonetic(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.firstPhonetic = value;
    }-*/;

    /**
     * @return The localized full name of the person. single value, read-only
     */
    public native String getFullName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.fullName;
    }-*/;

    public native void setFullName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.fullName = value;
    }-*/;

    /**
     * @return A blob object representing the image for the person. set to
     *         `null` to remove the image. single value
     */
    public native Object getImage() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.image;
    }-*/;

    public native void setImage(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.image = value;
    }-*/;

    /**
     * @return The instant messenger names for the person. multi-value, valid
     *         labels are: `aim`, `icq`, `jabber`, `msn`, `yahoo`. values are
     *         dictionaries.
     */
    public native Object getInstantMessage() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.instantMessage;
    }-*/;

    public native void setInstantMessage(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.instantMessage = value;
    }-*/;

    /**
     * @return The job title of the person. single value
     */
    public native String getJobTitle() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.jobTitle;
    }-*/;

    public native void setJobTitle(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.jobTitle = value;
    }-*/;

    /**
     * @return The kind of person. single value, one of
     *         {@link com.emitrom.gwt4.ti.mobile.client.contacts.Contacts.KIND_PERSON}
     *         or
     *         {@link com.emitrom.gwt4.ti.mobile.client.contacts.Contacts.KIND_ORGANIZATION}
     */
    public native int getKind() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.kind;
    }-*/;

    public native void setKind(int value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.kind = value;
    }-*/;

    /**
     * @return The last name of the person. single value
     */
    public native String getLastName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.lastName;
    }-*/;

    public native void setLastName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.lastName = value;
    }-*/;

    /**
     * @return The phonetic last name of the person. single value
     */
    public native String getLastPhonetic() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.lastPhonetic;
    }-*/;

    public native void setLastPhonetic(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.lastPhonetic = value;
    }-*/;

    /**
     * @return The middle name of the person. single value
     */
    public native String getMiddleName() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.middleName;
    }-*/;

    public native void setMiddleName(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.middleName = value;
    }-*/;

    /**
     * @return The phonetic middle name of the person. single value
     */
    public native String getMiddlePhonetic() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.middlePhonetic;
    }-*/;

    public native void setMiddlePhonetic(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.middlePhonetic = value;
    }-*/;

    /**
     * @return The most recent date the person was modified. single value,
     *         format is "yyyy-mm-dd't'hh:mm:ss'.'sss+0000", read-only
     */
    public native String getModified() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.modified;
    }-*/;

    public native void setModified(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.modified = value;
    }-*/;

    /**
     * @return The nickname of the person. single value
     */
    public native String getNickname() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.nickname;
    }-*/;

    public native void setNickname(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.nickname = value;
    }-*/;

    /**
     * @return Notes for the person. single value
     */
    public native String getNote() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.note;
    }-*/;

    public native void setNote(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.note = value;
    }-*/;

    /**
     * @return The organization the person belongs to. single value
     */
    public native String getOrganization() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.organization;
    }-*/;

    public native void setOrganization(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.organization = value;
    }-*/;

    /**
     * @return The phone numbers for the person. multi-value, valid labels are:
     *         home, work, other, mobile, pager, workfax, homefax, main, iphone.
     *         values are strings.
     */
    public native Object getPhone() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.phone;
    }-*/;

    public native void setPhone(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.phone = value;
    }-*/;

    /**
     * @return The prefix for the person. single value
     */
    public native String getPrefix() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.prefix;
    }-*/;

    public native void setPrefix(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.prefix = value;
    }-*/;

    /**
     * @return The names of people the person is related to. multi-value, valid
     *         labels are: mother, father, parent, sister, brother, child,
     *         friend, spouse, partner, manager, assistant. values are strings.
     */
    public native Object getRelatedNames() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.relatedNames;
    }-*/;

    public native void setRelatedNames(Object value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.relatedNames = value;
    }-*/;

    /**
     * @return The suffix for the person. single value
     */
    public native String getSuffix() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.suffix;
    }-*/;

    public native void setSuffix(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.suffix = value;
    }-*/;

    private static native Object URL() /*-{
		return Titanium.Contacts.Person.URL;
    }-*/;

}
