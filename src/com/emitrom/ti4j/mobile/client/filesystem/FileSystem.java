/**************************************************************************
   FileSystem.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.filesystem;

import com.emitrom.ti4j.mobile.client.core.TiFactory;
import com.emitrom.ti4j.mobile.client.core.TiModule;

/**
 * The top level filesystem module. the filesystem module is used for reading
 * and saving files and directories on the device.
 */
public class FileSystem extends TiModule {

    public static final int MODE_APPEND = MODE_APPEND();
    public static final int MODE_READ = MODE_READ();
    public static final int MODE_WRITE = MODE_WRITE();

    private static FileSystem instance = null;

    public static FileSystem get() {
        if (instance == null) {
            instance = new FileSystem();
        }
        return instance;
    }

    private FileSystem() {
        createPeer();
    }

    /**
     * @return Readonly constant where your application data directory is
     *         located. this directory should be used to place
     *         applications-specific files. on iphone, this directory is also
     *         backed up.
     */
    public native String getApplicationDataDirectory() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.applicationDataDirectory;
    }-*/;

    /**
     * @return Readonly constant where your application is located
     */
    public native String getApplicationDirectory() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.applicationDirectory;
    }-*/;

    /**
     * @return Readonly platform specific line ending constant
     */
    public native String getLineEnding() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.lineEnding;
    }-*/;

    /**
     * @return Readonly constant where your application resources are located
     */
    public native String getResourcesDirectory() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.resourcesDirectory;
    }-*/;

    /**
     * @return Readonly path separator constant
     */
    public native String getSeparator() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.separator;
    }-*/;

    /**
     * @return Readonly constant where your application can place temporary
     *         files
     */
    public native String getTempDirectory() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.tempDirectory;
    }-*/;

    public static native File createFile() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createFile();
		var toReturn = @com.emitrom.ti4j.mobile.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native FileStream createFileStream() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createFileStream();
		var toReturn = @com.emitrom.ti4j.mobile.client.filesystem.FileStream::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create temp file and return a
     * {@link com.emitrom.ti4j.mobile.client.filesystem.File}
     */
    public native File createTempDirectory() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createTempDirectory();
		var toReturn = @com.emitrom.ti4j.mobile.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create a temp file and return a
     * {@link com.emitrom.ti4j.mobile.client.filesystem.File}
     */
    public native File createTempFile() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.createTempFile();
		var toReturn = @com.emitrom.ti4j.mobile.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Return a fully formed file path as a
     * {@link com.emitrom.ti4j.mobile.client.filesystem.File} object
     * 
     * @param path
     *            one or more path arguments to form the full path joined
     *            together with the platform specific path separator. if a
     *            relative path is passed, the full path will be relative to the
     *            application resource folder.
     */
    public native File getFile(String path) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.getFile(path);
		var toReturn = @com.emitrom.ti4j.mobile.client.filesystem.File::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public static native boolean isExternalStoragePresent() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.isExternalStoragePresent();
    }-*/;

    private static native final int MODE_APPEND() /*-{
		return Titanium.Filesystem.MODE_APPEND;
    }-*/;

    private static native final int MODE_READ() /*-{
		return Titanium.Filesystem.MODE_READ;
    }-*/;

    private static native final int MODE_WRITE() /*-{
		return Titanium.Filesystem.MODE_WRITE;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeFileSystemModule();
    }

}
