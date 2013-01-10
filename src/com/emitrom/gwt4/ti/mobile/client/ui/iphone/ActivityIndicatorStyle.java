/**************************************************************************
   ActivityIndicatorStyle.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui.iphone;


/**
 * A set of constants for the styles available for
 * {@link com.emitrom.gwt4.ti.mobile.client.ui.ActivityIndicator} objects.
 */
public class ActivityIndicatorStyle {

    public static final int BIG = BIG();
    public static final int DARK = DARK();
    public static final int PLAIN = PLAIN();

    private ActivityIndicatorStyle() {
    }

    private static native final int BIG() /*-{
		return Titanium.UI.iPhone.ActivityIndicatorStyle.BIG;
    }-*/;

    private static native final int DARK() /*-{
		return Titanium.UI.iPhone.ActivityIndicatorStyle.DARK;
    }-*/;

    private static native final int PLAIN() /*-{
		return Titanium.UI.iPhone.ActivityIndicatorStyle.PLAIN;
    }-*/;

}
