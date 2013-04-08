package com.emitrom.ti4j.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

public class RelatedPerson extends ProxyObject {

    protected RelatedPerson(JavaScriptObject obj) {
        jsObj = obj;
    }

    public String getHome() {
        return JsoHelper.getAttribute(jsObj, "home");
    }

    public String getWork() {
        return JsoHelper.getAttribute(jsObj, "work");
    }

    public String getOther() {
        return JsoHelper.getAttribute(jsObj, "other");
    }

    public String getWorkFax() {
        return JsoHelper.getAttribute(jsObj, "workFax");
    }

    public String getHomeFax() {
        return JsoHelper.getAttribute(jsObj, "homeFax");
    }

    public String geMain() {
        return JsoHelper.getAttribute(jsObj, "main");
    }

    public String getIPhone() {
        return JsoHelper.getAttribute(jsObj, "iPhone");
    }

    static List<RelatedPerson> fromJsArray(JavaScriptObject obj) {
        List<RelatedPerson> toReturn = new ArrayList<RelatedPerson>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new RelatedPerson(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }
}
