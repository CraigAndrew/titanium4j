package com.emitrom.ti4j.mobile.client.contacts;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class PersonDate extends ProxyObject {

    protected PersonDate(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native JsArrayString getAnniversary()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.anniversary;
    }-*/;

    public native JsArrayString getOther()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.other;
    }-*/;

}
