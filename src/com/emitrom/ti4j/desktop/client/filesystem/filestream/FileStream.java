/************************************************************************
  FileStream.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.filesystem.filestream;

import com.emitrom.ti4j.desktop.client.bytes.Bytes;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A object for reading and writing data to files.
 * 
 * @author Ekambi
 * 
 */
public class FileStream extends JavaScriptObject {

  public static final int MODE_APPEND = FileStream.MODE_APPEND();
  public static final int MODE_READ = FileStream.MODE_READ();
  public static final int MODE_WRITE = FileStream.MODE_WRITE();

  protected FileStream() {

  }

  /**
   * Close this Filsystem.Filstream. Return true if the stream closed without
   * any problems and false otherwise.
   * 
   * @return
   */
  public final native boolean close()/*-{
		return this.close();
  }-*/;

  /**
   * Return true if this Fileystem.Filestream is open and false otherwise.
   * 
   * @return
   */
  public final native boolean isOpen()/*-{
		return this.isOpen();
  }-*/;

  /**
   * Open this Filesystem.Filestream. Return true if the operation is successful
   * or false otherwise.
   * 
   * @return
   */
  public final native boolean open()/*-{
		return this.open();
  }-*/;

  /**
   * Open this Filesystem.Filestream. Return true if the operation is successful
   * or false otherwise.
   * 
   * @param mode,The mode to use for opening this Filesystem.Filestream. This is
   *          either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
   *          supplied the stream will be open in MODE_READ.
   * @return
   */
  public final native FileStream open(int mode)/*-{
		this.open(mode);
  }-*/;

  /**
   * 
   ** Open this Filesystem.Filestream. Return true if the operation is successful
   * or false otherwise.
   * 
   * @param mode,The mode to use for opening this Filesystem.Filestream. This is
   *          either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
   *          supplied the stream will be open in MODE_READ.
   * 
   * @param binary, Whether or not to open this stream in binary mode. If not
   *          supplied this will be false.
   * @return
   */
  public final native FileStream open(int mode, boolean binary)/*-{
		return this.open(mode, binary);
  }-*/;

  /**
   * 
   * 
   ** Open this Filesystem.Filestream. Return true if the operation is successful
   * or false otherwise.
   * 
   * @param mode,The mode to use for opening this Filesystem.Filestream. This is
   *          either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
   *          supplied the stream will be open in MODE_READ.
   * 
   * @param binary, Whether or not to open this stream in binary mode. If not
   *          supplied this will be false.
   * 
   * @param append,Whether or not to open this stream in append mode. If not
   *          supplied this will be false.
   * @return
   */
  public final native FileStream open(int mode, boolean binary, boolean append)/*-{
		return this.open(mode, binary, append);
  }-*/;

  /**
   * Read data from a Filesystem.Filestream into a Bytes object and return it.
   * This method will throw an exception if the operation fails.
   * 
   * @param size, Number of bytes to read from the file.
   * @return
   */
  public final native Bytes read(int size)/*-{
		return this.read(size);
  }-*/;

  /**
   * Reads one line from this Filesystem.Filestream. The stream must be open
   * before using this method (or an exception will be thrown). Each call will
   * return a Bytes object until the end of the stream, when null will be
   * returned.
   * 
   * @return
   */
  public final native Bytes readLine()/*-{
		return this.readLine();
  }-*/;

  /**
   * Return true if this Filesystem.Filestream is ready for IO operations or
   * false otherwise.
   * 
   * @return
   */
  public final native boolean isReady()/*-{
		return this.ready();
  }-*/;

  /**
   * Set the current read/write position with in the file.
   * 
   * @param offset, new position relative to the absolute position specifed by
   *          the dir parameter
   * 
   * @param dir, specifies an absolute position in the file where offset will be
   *          applied
   */
  public final native void seek(int offset, int dir)/*-{
		this.seek(offset, dir);
  }-*/;

  /**
   * Returns current position in file relative to the beginning
   * 
   * @return
   */
  public final native int tell()/*-{
		return this.tell();
  }-*/;

  /**
   * Writes a line to this Filesystem.Filestream. Return true if this operation
   * succeeds and false otherwise.
   * 
   * @param data, The data to write to this Filesystem.Filestream.
   * @return
   */
  public final native boolean write(String data)/*-{
		return this.write(data);
  }-*/;

  /**
   * Writes a line to this Filesystem.Filestream. Return true if this operation
   * succeeds and false otherwise.
   * 
   * @param data, The data to write to this Filesystem.Filestream.
   * @return
   */
  public final native boolean write(double data)/*-{
		return this.write(data);
  }-*/;

  /**
   * Writes a line to this Filesystem.Filestream. Return true if this operation
   * succeeds and false otherwise.
   * 
   * @param data, The data to write to this Filesystem.Filestream.
   * @return
   */
  public final native boolean write(Bytes data)/*-{
		return this.write(data);
  }-*/;

  /**
   * Writes a line to this Filesystem.Filestream. The data will be followed by
   * the platform dependent line-ending sequence. Return true if this operation
   * succeeds and false otherwise.
   * 
   * @param data, The data to write to this Filesystem.Filestream.
   * @return
   */
  public final native boolean writeLine(String data)/*-{
		return this.writeLine(data);
  }-*/;

  /**
   * Writes a line to this Filesystem.Filestream. The data will be followed by
   * the platform dependent line-ending sequence. Return true if this operation
   * succeeds and false otherwise.
   * 
   * @param data, The data to write to this Filesystem.Filestream.
   * @return
   */
  public final native boolean writeLine(double data)/*-{
		return this.writeLine(data);
  }-*/;

  /**
   * Writes a line to this Filesystem.Filestream. The data will be followed by
   * the platform dependent line-ending sequence. Return true if this operation
   * succeeds and false otherwise.
   * 
   * @param data, The data to write to this Filesystem.Filestream.
   * @return
   */
  public final native boolean writeLine(Bytes data)/*-{
		return this.writeLine(data);
  }-*/;

  private static native int MODE_APPEND()/*-{
		return Ti.FileSystem.FileStream.MODE_APPEND;
  }-*/;

  private static native int MODE_READ()/*-{
		return Ti.FileSystem.FileStream.MODE_READ;
  }-*/;

  private static native int MODE_WRITE()/*-{
		return Ti.FileSystem.FileStream.MODE_WRITE();
  }-*/;

}
