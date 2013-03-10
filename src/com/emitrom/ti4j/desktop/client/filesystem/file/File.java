/************************************************************************
  File.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.filesystem.file;

import com.emitrom.ti4j.desktop.client.filesystem.filestream.FileStream;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * An object which represents a path to a file or directory. A Filesystem.File
 * is not guaranteed to be a valid path.
 * 
 * @author Ekambi
 * 
 */
public class File extends JavaScriptObject {

  protected File() {

  }

  /**
   * Copies a file to the specified location. If the target is a directory the
   * file will be written to that directory. If the target is a file, the file
   * will be written to that file.
   * 
   * @param target, The target of this move operation.
   */
  public final native void copy(String target)/*-{
		this.copy(target);
  }-*/;

  /**
   * Copies a file to the specified location. If the target is a directory the
   * file will be written to that directory. If the target is a file, the file
   * will be written to that file.
   * 
   * @param target, The target of this move operation.
   */
  public final native void copy(File target)/*-{
		this.copy(target);
  }-*/;

  /**
   * Create a new directory at this File object's path. If the directory already
   * exists, this method will do nothing. This method will return true if the
   * directory was created or false if it was not.
   */
  public final native boolean createDirectory()/*-{
		return this.createDirectory();
  }-*/;

  /**
   * Creates a shortcut to a file or directory at this Filesystem.File's path.
   * On Windows this will create a Win32 style shortcut. On Linux and OS X this
   * will create a symlink. If the operation is successful this method will
   * return true and false otherwise.
   * 
   * @param target, The target of this shortcut.
   */
  public final native boolean createShortcut(String target)/*-{
		return this.createShortcut(target);
  }-*/;

  /**
   * Creates a shortcut to a file or directory at this Filesystem.File's path.
   * On Windows this will create a Win32 style shortcut. On Linux and OS X this
   * will create a symlink. If the operation is successful this method will
   * return true and false otherwise.
   * 
   * @param target, The target of this shortcut.
   */
  public final native boolean createShortcut(File target)/*-{
		return this.createShortcut(target);
  }-*/;

  /**
   * Return the timestamp for when this file or directory was created. The
   * return value of this function will be microseconds since the epoch at the
   * time this file was created.
   * 
   * @return
   */
  public final native double createTimeStamp()/*-{
		return this.createTimeStamp();
  }-*/;

  /**
   * Remove the file or directory specified by this Filesystem.File. Return true
   * if removal succeeded and false otherwise.
   * 
   * @param recursive
   * @return
   */
  public final native boolean deleteDirectory(boolean recursive)/*-{
		return this.deleteDirectory(recursive);
  }-*/;

  /**
   * Remove the file or directory specified by this Filesystem.File, this method
   * never removes directories recursively. Return true if removal succeeded and
   * false otherwise.
   * 
   * @return
   */
  public final native String deleteFile()/*-{
		return this.deleteFile();
  }-*/;

  /**
   * Return true if a file or directory exists at the path specified by this
   * Filesystem.File.
   * 
   * @return
   */
  public final native boolean exists()/*-{
		return this.exists();
  }-*/;

  /**
   * Return the extension of this Filesystem.File.
   * 
   * @return
   */
  public final native String getExtension()/*-{
		return this.extension();
  }-*/;

  /**
   * If this Filesystem.File specifies the path to a directory, return an Array
   * of items inside this directory. If this path does not exist or is not a
   * directory, return null.
   * 
   * @return
   */
  public final native JsArray<File> getDirectoryListing()/*-{
		return this.getDirectoryListing();
  }-*/;

  /**
   * Return true if the path specified by this Filesystem.File refers to a
   * directory or false otherwise.
   * 
   * @return
   */
  public final native boolean isDirectory()/*-{
		return this.isDirectory();
  }-*/;

  /**
   * Return true if the directory or file at the path specified by this
   * Filesystem.File object has the executable bit set. If the file does not
   * exists, this method will return false.
   * 
   * @return
   */
  public final native boolean isExecutable()/*-{
		return this.isExecutable();
  }-*/;

  /**
   * Return true if the path specified by this Filesystem.File refers to a file
   * or false otherwise.
   * 
   * @return
   */
  public final native boolean isFile()/*-{
		return this.isFile();
  }-*/;

  /**
   * Return true if the path specified by this Filesystem.File refers to a
   * hidden file. On Windows this means that the file has the hidden attribute
   * and on Linux and OS X this means that the basename of this path begins with
   * a period.
   * 
   * @return
   */
  public final native boolean isHidden()/*-{
		return this.isHidden();
  }-*/;

  /**
   * Return true if the path specified by this Filesystem.File refers to a
   * read-only file.
   * 
   * @return
   */
  public final native boolean isReadOnly()/*-{
		return this.isReadOnly();
  }-*/;

  /**
   * Return true if the path specified by this Filesystem.File refers to a
   * symbolic link.
   * 
   * @return
   */
  public final native boolean isSymbolicLink()/*-{
		return this.isSymbolicLink();
  }-*/;

  /**
   * Return true if the path specified by this Filesystem.File refers to a
   * writable file and false otherwise.
   * 
   * @return
   */
  public final native boolean isWritable()/*-{
		return this.isWritable();
  }-*/;

  /**
   * Return the timestamp for when this file or directory was modified. The
   * return value of this function will be microseconds since the epoch at the
   * last time this file was modified.
   * 
   * @return
   */
  public final native double getModificationTimeStamp()/*-{
		return this.modificationTimeStamp();
  }-*/;

  /**
   * Moves to the specified location. If the target is a directory the file will
   * be written to that directory. If the target is a file, the file will be
   * written to that file.
   * 
   * @param target, The target of this move operation.
   * @return
   */
  public final native String move(String target)/*-{
		return this.move(target);
  }-*/;

  /**
   * Moves to the specified location. If the target is a directory the file will
   * be written to that directory. If the target is a file, the file will be
   * written to that file.
   * 
   * @param target, The target of this move operation.
   * @return
   */
  public final native String move(File target)/*-{
		return this.move(target);
  }-*/;

  /**
   * Return the full path of this File.Filesystem object.
   * 
   * @return
   */
  public final native String getNativePath()/*-{
		return this.nativePath();
  }-*/;

  /**
   * Create and open a Filestream for this File object.
   * 
   * @return
   */
  public final native FileStream open()/*-{
		return this.open();
  }-*/;

  /**
   * Create and open a Filestream for this File object.
   * 
   * @param mode,The mode to use for opening this Filesystem.File. This is
   *          either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
   *          supplied the stream will be open in MODE_READ.
   * @return
   */
  public final native FileStream open(int mode)/*-{
		return this.open(mode);
  }-*/;

  /**
   * 
   * Create and open a Filestream for this File object.
   * 
   * @param mode,The mode to use for opening this Filesystem.File. This is
   *          either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
   *          supplied the stream will be open in MODE_READ.
   * @param binary,Whether or not to open this stream in binary mode. If not
   *          supplied this will be false.
   * @return
   */
  public final native FileStream open(int mode, boolean binary)/*-{
		return this.open(mode, binary);
  }-*/;

  /**
   * 
   * Create and open a Filestream for this File object.
   * 
   * @param mode,The mode to use for opening this Filesystem.File. This is
   *          either Filesystem.MODE_READ or Filesystem.MODE_WRITE. If not
   *          supplied the stream will be open in MODE_READ.
   * @param binary,Whether or not to open this stream in binary mode. If not
   *          supplied this will be false.
   * 
   * @param append, Whether or not to open this stream in append mode. If not
   *          supplied this will be false.
   * @return
   */
  public final native FileStream open(int mode, boolean binary, boolean append)/*-{
		return this.open(mode, binary, append);
  }-*/;

  /**
   * Return the parent directory of this File.Filesystem object.
   * 
   * @return
   */
  public final native File getParent()/*-{
		return this.parent();
  }-*/;

  /**
   * Renames a file to the given path.
   * 
   * @param value, The new path of the file
   * @return
   */
  public final native String rename(String value)/*-{
		return this.rename(value);
  }-*/;

  /**
   * Resolves a given relative path against the path specified by this
   * Filesystem.File object. If the given path is absolute, the absolute path is
   * returned.
   * 
   * @param subPath,The subPath to resolve against this Filesystem.File object.
   * @return
   */
  public final native File resolve(String subPath)/*-{
		return this.resolve(subPath);
  }-*/;

  /**
   * Set the execute bit on the file or directory at the path specified by this
   * Filesystem.File object. Return true if the file or directory at this path
   * is executable after the operation completes.
   */
  public final native void setExecutable()/*-{
		this.setExecutable();
  }-*/;

  /**
   * Remove the wrtiable bit and ensure there is a readable bit on the file or
   * directory at the path specified by this Filesystem.File object. Return true
   * if the file or directory at this path is read-only after the operation
   * completes.
   */
  public final native void setReadOnly()/*-{
		this.setReadOnly();
  }-*/;

  /**
   * Set the write bit on the file or directory at the path specified by this
   * Filesystem.File object. Return true if the file or directory at this path
   * is writable after the operation completes.
   */
  public final native void setWritable()/*-{
		this.setWritable();
  }-*/;

  /**
   * Return the size of the file in number of bytes.
   * 
   * @return
   */
  public final native double getSize()/*-{
		return this.size();
  }-*/;

  /**
   * Return the space available on the filesystem containing the path specified
   * by this Filesystem.File object in number of bytes..
   * 
   * @return
   */
  public final native double getSpaceAvailable()/*-{
		return this.spaceAvailable();
  }-*/;

  /**
   * Return the path of this Filesystem.File object as a String.
   * 
   * @return
   */
  public final native String getStringRepresentation()/*-{
		return this.toString();
  }-*/;

  /**
   * Creates a new, empty file in an atomic operation. Returns true if the file
   * was created or false if it already exists.
   * 
   * @return
   */
  public final native boolean touch()/*-{
		return this.touch();
  }-*/;

}
