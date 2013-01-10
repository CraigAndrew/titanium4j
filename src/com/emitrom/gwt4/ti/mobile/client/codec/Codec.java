/**************************************************************************
   Codec.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.codec;

import com.emitrom.gwt4.ti.mobile.client.core.TiFactory;
import com.emitrom.gwt4.ti.mobile.client.core.TiModule;

/**
 * A module for converting Numbers and Strings to and from a
 * {@link com.emitrom.gwt4.ti.mobile.client.buffer.Buffer}.
 */
public class Codec extends TiModule {

    private static Codec instance = null;

    public static Codec get() {
        if (instance == null) {
            instance = new Codec();
        }
        return instance;
    }

    private Codec() {
        createPeer();
    }

    public static final String CHARSET_ASCII = CHARSET_ASCII();
    public static final String CHARSET_ISO_LATIN_1 = CHARSET_ISO_LATIN_1();
    public static final String CHARSET_UTF8 = CHARSET_UTF8();
    public static final String CHARSET_UTF16 = CHARSET_UTF16();
    public static final String CHARSET_UTF16BE = CHARSET_UTF16BE();
    public static final String CHARSET_UTF16LE = CHARSET_UTF16LE();
    public static final String TYPE_BYTE = TYPE_BYTE();
    public static final String TYPE_SHORT = TYPE_SHORT();
    public static final String TYPE_INT = TYPE_INT();
    public static final String TYPE_FLOAT = TYPE_FLOAT();
    public static final String TYPE_LONG = TYPE_LONG();
    public static final String TYPE_DOUBLE = TYPE_DOUBLE();
    public static final int BIG_ENDIAN = BIG_ENDIAN();
    public static final int LITTLE_ENDIAN = LITTLE_ENDIAN();

    /**
     * Get the os native byte order (either
     * {@link com.emitrom.gwt4.ti.mobile.client.codec.CODEC.BIG_ENDIAN} or
     * {@link com.emitrom.gwt4.ti.mobile.client.codec.CODEC.LITTLE_ENDIAN} )
     * 
     * @return The OS native byte order
     */
    public native int getNativeByteOrder() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.getNativeByteOrder();
    }-*/;

    /**
     * Encodes the number .
     * 
     * @param options encodeNumber named options
     * @return The position after the encoded number in 'dest'.
     */
    public native int encodeNumber(EncodeNumberSpec options) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.encodeNumber(options.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Decodes the buffer.
     * 
     * @param options decodeNumber named options
     * @return The Number decoded from `source`.
     */
    public native double decodeNumber(DecodeNumberSpec options) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.decodeNumber(options.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Encodes the string.
     * 
     * @param options encodeString named options
     * @return The position after the encoded String inside 'dest'.
     */
    public native int encodeString(EncodeStringSpec options) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.encodeString(options.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    /**
     * Decodes the buffer.
     * 
     * @param options decodeString named options
     * @return The decoded string
     */
    public native String decodeString(DecodeStringSpec options) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso
				.decodeString(options.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()());
    }-*/;

    private static native final String CHARSET_ASCII() /*-{
		return Titanium.Codec.CHARSET_ASCII;
    }-*/;

    private static native final String CHARSET_ISO_LATIN_1() /*-{
		return Titanium.Codec.CHARSET_ISO_LATIN_1;
    }-*/;

    private static native final String CHARSET_UTF8() /*-{
		return Titanium.Codec.CHARSET_UTF8;
    }-*/;

    private static native final String CHARSET_UTF16() /*-{
		return Titanium.Codec.CHARSET_UTF16;
    }-*/;

    private static native final String CHARSET_UTF16BE() /*-{
		return Titanium.Codec.CHARSET_UTF16BE;
    }-*/;

    private static native final String CHARSET_UTF16LE() /*-{
		return Titanium.Codec.CHARSET_UTF16LE;
    }-*/;

    private static native final String TYPE_BYTE() /*-{
		return Titanium.Codec.TYPE_BYTE;
    }-*/;

    private static native final String TYPE_SHORT() /*-{
		return Titanium.Codec.TYPE_SHORT;
    }-*/;

    private static native final String TYPE_INT() /*-{
		return Titanium.Codec.TYPE_INT;
    }-*/;

    private static native final String TYPE_FLOAT() /*-{
		return Titanium.Codec.TYPE_FLOAT;
    }-*/;

    private static native final String TYPE_LONG() /*-{
		return Titanium.Codec.TYPE_LONG;
    }-*/;

    private static native final String TYPE_DOUBLE() /*-{
		return Titanium.Codec.TYPE_DOUBLE;
    }-*/;

    private static native final int BIG_ENDIAN() /*-{
		return Titanium.Codec.BIG_ENDIAN;
    }-*/;

    private static native final int LITTLE_ENDIAN() /*-{
		return Titanium.Codec.LITTLE_ENDIAN;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createCodec();
    }

}
