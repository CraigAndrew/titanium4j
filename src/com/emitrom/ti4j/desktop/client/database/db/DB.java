/************************************************************************
  DB.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.database.db;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a Ti Database.
 * 
 * @author Ekambi
 * 
 */
public class DB extends JavaScriptObject {

  protected DB() {

  }

  /**
   * Close an open Database.DB. If the database is not open, this method will do
   * nothing.
   */
  public final native void close()/*-{
		this.close();
  }-*/;

  /**
   * Executes an SQL query on this Database.DB. Currently all queries must be
   * valid SQLite-style SQL.
   * 
   * @param query, The SQL query to execute on this Database.DB.
   */
  public final native void execute(String query)/*-{
		this.execute(query);
  }-*/;

  /**
   * Executes an SQL query on this Database.DB. Currently all queries must be
   * valid SQLite-style SQL.
   * 
   * @param query, The SQL query to execute on this Database.DB.
   * 
   * @param args, A variable-length argument list of values to use with the
   *          given query
   */
  public final native void execute(String query, Object... args)/*-{
		this.execute(query, args);
  }-*/;

  /**
   * Get the full filesystem path to the database. If this database was opened
   * via Datbase.openFile this path will be the originally path used, otherwise
   * it will be the path to a WebKit database in the application data directory.
   * 
   * @return
   */
  public final native String getPath()/*-{
		return this.getPath();
  }-*/;

  /**
   * Remove a Database.DB. This method will close the database if it is open and
   * remove the file from the filesystem.
   */
  public final native void remove()/*-{
		this.remove();
  }-*/;

  /**
   * The row id of the last insert operation.
   * 
   * @return
   */
  public final native int getLastInsertedRowId()/*-{
		return this.lastInsertedRowId;
  }-*/;

  /**
   * The number of rows affected by the last execute call.
   * 
   * @return
   */
  public final native double getRowsAffected()/*-{
		return this.rowsAffected;
  }-*/;

}
