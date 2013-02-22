/**************************************************************************
   HasWidgets.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

import com.emitrom.ti4j.mobile.client.ui.View;

public interface HasWidgets {

    /**
     * Add a child to the view hierarchy
     * 
     * @param view the view to add to this views hierarchy
     */
    public abstract void add(View view);

    /**
     * Remove a previously add view from the view hierarchy
     * 
     * @param view the view to remove from this views hierarchy
     */
    public abstract void remove(View view);

}