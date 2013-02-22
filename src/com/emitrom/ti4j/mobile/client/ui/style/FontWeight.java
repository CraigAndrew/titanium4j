/**************************************************************************
   FontWeight.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.style;

public enum FontWeight {
    NORMAL("normal"), BOLD("bold");

    public String value;

    private FontWeight(String font) {
        this.value = font;
    }

    public static FontWeight fromValue(String value) {
        if (value.equalsIgnoreCase("normal")) {
            return FontWeight.NORMAL;
        } else if (value.equalsIgnoreCase("bold")) {
            return FontWeight.BOLD;
        }
        return FontWeight.NORMAL;
    }
}
