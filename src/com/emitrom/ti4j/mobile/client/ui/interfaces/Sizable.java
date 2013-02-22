/**************************************************************************
   Sizable.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui.interfaces;

public interface Sizable {

    public void setHeight(double value);

    public void setHeight(String value);

    /**
     * @return Property for the view height. can be either a double value or a
     *         dimension string ie 'auto' (default).
     */
    public double getHeight();

    public void setWidth(String value);

    public void setWidth(double value);

    /**
     * @return Property for the view width. can be either a double value or a
     *         dimension string ie 'auto' (default).
     */
    public double getWidth();

}