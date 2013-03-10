/************************************************************************
  Bytes.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.bytes;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * An object for holding arrays of bytes.
 * 
 * @author Ekambi
 * 
 */
public class Bytes extends JavaScriptObject {

  protected Bytes() {

  }

  /**
   * Return the character code (or byte value) at the given index in a Bytes.
   * 
   * @param index, The index to look for a character code at.
   * @return
   */
  public static native int byteAt(int index)/*-{
		return Ti.Bytes.byteAt(index);
  }-*/;

  /**
   * Return a character representing a byte at the given index in a Bytes.
   * 
   * @param index, The index to look for a character at.
   * @return
   */
  public static native String chartAt(int index)/*-{
		return this.chartAt(index);
  }-*/;

  /**
   * Concatenate multiple Bytes into one Bytes.
   * 
   * @param bytes, A variable-length list of Bytes to concatenate to this Bytes
   *          object.
   * @return
   */
  public static native Bytes concat(Bytes... bytes)/*-{
		return Ti.Bytes.concat(bytes);
  }-*/;

  /**
   * Concatenate multiple string into one Bytes.
   * 
   * @param bytes, A variable-length list of string to concatenate to this Bytes
   *          object.
   * @return
   */
  public static native Bytes concat(String... bytes)/*-{
		return Ti.Bytes.concat(bytes);
  }-*/;

  /**
   * Return the index of a String within this Bytes. The String will first be
   * converted to UTF-8 before this method searches the Bytes object.
   * 
   * @param needle, The String to search for.
   * @return
   */
  public static native int indexOf(String needle)/*-{
		return Ti.Bytes.indexOf(needle);
  }-*/;

  /**
   * Return the last index of a String within this Bytes. The String will first
   * be converted to UTF-8 before this method searches the Bytes object.
   * 
   * @param needle, The String to search for.
   * @return
   */
  public static native int lasIndexOf(String needle)/*-{
		return Ti.Bytes.lasIndexOf(needle);
  }-*/;

  /**
   * Split a bytes as if it were a String given a delimiter. The Bytes object is
   * expected to contain a UTF-8 encoded String. That means that the first NUL
   * character in the string will be the end of the string.
   * 
   * @param delimiter, The index to look for a character at
   * @return
   */
  public static native JsArrayString slipt(String delimiter)/*-{
		return Ti.Bytes.slipt(delimiter);
  }-*/;

  /**
   * 
   * Split a bytes as if it were a String given a delimiter. The Bytes object is
   * expected to contain a UTF-8 encoded String. That means that the first NUL
   * character in the string will be the end of the string.
   * 
   * @param delimiter, The index to look for a character at
   * @param limit,The maximum number of matches to return
   * @return
   */
  public static native JsArrayString slipt(String delimiter, int limit)/*-{
		return Ti.Bytes.slipt(delimiter, limit);
  }-*/;

  /**
   * The number of bytes in this Bytes object.
   * 
   * @return
   */
  public static native int getLength()/*-{
		return Ti.Bytes.length;
  }-*/;

  /**
   * Return a substring of a Bytes given a start index and a length. This
   * assumes that Bytes contains a UTF-8 string. This means that the first NUL
   * character in the Bytes object will signify the end of the string. If no
   * length index is given, return all characters from the start index to the
   * end of the string.
   * 
   * @param startIndex, The starting index
   * @return
   */
  public static native String substr(int startIndex)/*-{
		return Ti.Bytes.substr(startIndex);
  }-*/;

  /**
   * 
   * Return a substring of a Bytes given a start index and a length. This
   * assumes that Bytes contains a UTF-8 string. This means that the first NUL
   * character in the Bytes object will signify the end of the string. If no
   * length index is given, return all characters from the start index to the
   * end of the string.
   * 
   * @param startIndex, The starting index
   * @param length,The length of the substring
   * @return
   */
  public static native String substr(int startIndex, int length)/*-{
		return Ti.Bytes.substr(startIndex, length);
  }-*/;

  /**
   * Return a substring of a Bytes given a start index and end index. This
   * assumes that Bytes contains a UTF-8 string. This means that the first NUL
   * character in the Bytes object will signify the end of the string. If no end
   * index is given, return all characters from the start index to the end of
   * the string. If startIndex > endIndex, the indices are swapped.
   * 
   * @param startIndex, The starting index
   * @return
   */
  public static native String substring(int startIndex)/*-{
		return Ti.Bytes.substring(startIndex);
  }-*/;

  /**
   * 
   * Return a substring of a Bytes given a start index and end index. This
   * assumes that Bytes contains a UTF-8 string. This means that the first NUL
   * character in the Bytes object will signify the end of the string. If no end
   * index is given, return all characters from the start index to the end of
   * the string. If startIndex > endIndex, the indices are swapped.
   * 
   * @param startIndex, The starting index
   * @param endIndex, The ending index
   * @return
   */
  public static native String substring(int startIndex, int endIndex)/*-{
		return Ti.Bytes.substring(startIndex, endIndex);
  }-*/;

  /**
   * Convert characters in the Bytes to lower-case as if it it were a String.
   * This method assumes that Bytes contains a UTF-8 string. This means that the
   * first NUL character in the Bytes object will signify the end of the string.
   * 
   * @return
   */
  public static native String toLowerCase()/*-{
		return Ti.Bytes.toLowerCase();
  }-*/;

  /**
   * Return a string representation of a Byte object. This method assumes that
   * Bytes contains a UTF-8 string. This means that the first NUL character in
   * the Bytes object will signify the end of the string.
   * 
   * @return
   */
  public static native String toByteString()/*-{
		return Ti.Bytes.toString();
  }-*/;

  /**
   * Convert characters in the Bytes to upper-case as if it it were a String.
   * This method assumes that Bytes contains a UTF-8 string. This means that the
   * first NUL character in the Bytes object will signify the end of the string.
   * 
   * @return
   */
  public static native String toUpperCase()/*-{
		return Ti.Bytes.toUpperCase();
  }-*/;

}
