/**************************************************************************
   CloudKeyValuesResponse.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.keyvalues;

import java.util.ArrayList;
import java.util.List;

import com.emitrom.ti4j.mobile.client.cloud.core.AbstractCloudResponse;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CloudKeyValuesResponse extends AbstractCloudResponse {

    CloudKeyValuesResponse(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * 
     List of key value objects, if any
     */
    public List<KeyValue> getKeyValues() {
        List<KeyValue> list = new ArrayList<KeyValue>();
        JavaScriptObject chatGroups = _getKeyValues();
        int size = JsoHelper.getJavaScriptObjectArraySize(chatGroups);
        for (int i = 0; i < size; i++) {
            JavaScriptObject chatGroup = JsoHelper.getValueFromJavaScriptObjectArray(chatGroups, i);
            list.add(new KeyValue(chatGroup));
        }
        return list;
    }

    /**
     * 
     Array of chat response objects, if any
     */
    private native JavaScriptObject _getKeyValues()/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return peer.keyvalues;
    }-*/;

}
