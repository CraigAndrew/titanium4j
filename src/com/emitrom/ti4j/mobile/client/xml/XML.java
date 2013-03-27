/**************************************************************************
   XML.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.xml;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * The top level xml module. The xml module is used parsing and processing
 * xml-based content.
 */
public class XML extends TiModule {
    private static XML instance = null;

    public static XML get() {
        if (instance == null) {
            instance = new XML();
        }
        return instance;
    }

    private XML() {
        createPeer();
    }

    public native Attr createAttr() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createAttr();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Attr::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native CharacterData createCharacterData() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createCharacterData();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.CharacterData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Document createDocument() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createDocument();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Document::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native DocumentType createDocumentType() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createDocumentType();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.DocumentType::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native DOMImplementation createDOMImplementation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createDOMImplementation();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.DOMImplementation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Element createElement() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createElement();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Element::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Entity createEntity() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createEntity();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Entity::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native NamedNodeMap createNamedNodeMap() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createNamedNodeMap();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.NamedNodeMap::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Node createNode() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createNamedNode();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Node::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native NodeList createNodeList() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createNodeList();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.NodeList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Notation createNotation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createNotation();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Notation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native ProcessingInstruction createProcessingInstruction() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createProcessingInstruction();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.ProcessingInstruction::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native Text createText() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createText();
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Text::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Parses an xml string into a
     * {@link com.emitrom.ti4j.mobile.client.xml.Document} object. throws an
     * exception if the string is unable to be parsed into a valid document.
     * 
     * @param xml the XML content as a string
     */
    public native Document parseString(String xml) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.parseString(xml);
		var toReturn = @com.emitrom.ti4j.mobile.client.xml.Document::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Serializes a {@link document} object into a string.
     * 
     * @param node The XML DOMNode or DOMDocument to serialize
     */
    public native String serializeToString(Node node) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.serializeToString(node.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeXMLModule();
    }

}
