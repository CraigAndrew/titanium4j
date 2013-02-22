/**************************************************************************
   RowAnimationStyle.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
 * A set of constants for the animation styles used for transition on table view
 * rows.
 */
public class RowAnimationStyle {

    public static final int BOTTOM = BOTTOM();
    public static final int FADE = FADE();
    public static final int LEFT = LEFT();
    public static final int NONE = NONE();
    public static final int RIGHT = RIGHT();
    public static final int TOP = TOP();

    private RowAnimationStyle() {
    }

    private static native final int BOTTOM() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.BOTTOM;
    }-*/;

    private static native final int FADE() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.FADE;
    }-*/;

    private static native final int LEFT() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.LEFT;
    }-*/;

    private static native final int NONE() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.NONE;
    }-*/;

    private static native final int RIGHT() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.RIGHT;
    }-*/;

    private static native final int TOP() /*-{
		return Titanium.UI.iPhone.RowAnimationStyle.TOP;
    }-*/;

}
