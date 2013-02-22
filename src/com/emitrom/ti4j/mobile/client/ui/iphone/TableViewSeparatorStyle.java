/**************************************************************************
   TableViewSeparatorStyle.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.iphone;


/**
 * Set of constants for the style that can be used for the `separatorstyle`
 * property of {@link com.emitrom.ti4j.mobile.client.ui.TableView}.
 */
public class TableViewSeparatorStyle {

    public static final int NONE = NONE();
    public static final int SINGLE_LINE = SINGLE_LINE();

    private TableViewSeparatorStyle() {
    }

    private static native final int NONE() /*-{
		return Titanium.UI.iPhone.TableViewSeparatorStyle.NONE;
    }-*/;

    private static native final int SINGLE_LINE() /*-{
		return Titanium.UI.iPhone.TableViewSeparatorStyle.SINGLE_LINE;
    }-*/;

}
