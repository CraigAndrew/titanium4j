/**************************************************************************
   ChatMessage.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.cloud.chats;

import com.emitrom.ti4j.mobile.client.cloud.core.AbstractCloudObject;
import com.emitrom.ti4j.core.client.JsoHelper;
import com.google.gwt.core.client.JsArrayString;

/**
 * Represent a chat object
 * 
 */
public class ChatMessage extends AbstractCloudObject {

    public ChatMessage() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Comma separated user id(s) of the recipient(s). The current user id and
     * to_ids together determine which chat group a message belongs to.
     * <p>
     * Alternatively, you can use chat_group_id to identify a chat group
     * instead.
     * 
     * @param ids
     */
    public void setToIds(String... ids) {
        JsArrayString toIds = JsArrayString.createArray().cast();
        for (String s : ids) {
            toIds.push(s);
        }
        setToIds(toIds.join(","));
    }

    /**
     * Comma separated user id(s) of the recipient(s). The current user id and
     * to_ids together determine which chat group a message belongs to.
     * <p>
     * Alternatively, you can use chat_group_id to identify a chat group
     * instead.
     * 
     * @param ids
     */
    public native void setToIds(String ids)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.to_ids = ids;
    }-*/;

    /**
     * A chat group's id. Instead of using to_id , if you already know the id of
     * a chat group, you can use it to specify which chat group this message
     * should go to.
     * 
     * @param ids
     */
    public native void setChatGroupId(String id)/*-{
		var peer = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		peer.chat_group_id = id;
    }-*/;

}
