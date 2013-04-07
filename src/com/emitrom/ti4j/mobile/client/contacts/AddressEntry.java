package com.emitrom.ti4j.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class AddressEntry extends ProxyObject {

    protected AddressEntry(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getCountrycode() {
        return JsoHelper.getAttribute(jsObj, "CountryCode");
    }

    public String getStreet() {
        return JsoHelper.getAttribute(jsObj, "Street");
    }

    public String getCity() {
        return JsoHelper.getAttribute(jsObj, "City");
    }

    public String getCounty() {
        return JsoHelper.getAttribute(jsObj, "County");
    }

    public String getZip() {
        return JsoHelper.getAttribute(jsObj, "Zip");
    }

    public String getState() {
        return JsoHelper.getAttribute(jsObj, "State");
    }

    public String getCountry() {
        return JsoHelper.getAttribute(jsObj, "Country");
    }

    static List<AddressEntry> fromJsArray(JavaScriptObject obj) {
        List<AddressEntry> toReturn = new ArrayList<AddressEntry>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new AddressEntry(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
