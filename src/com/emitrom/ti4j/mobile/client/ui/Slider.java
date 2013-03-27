/**************************************************************************
   Slider.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.mobile.client.ui;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.SliderChangeHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasExtremum;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * * A slider is created by the method
 * {@link com.emitrom.ti4j.mobile.client.ui.UI.createSlider}.
 */
public class Slider extends View implements HasExtremum {

    public Slider() {
        createPeer();
    }

    Slider(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The image url of the slider left track when in the disabled state
     */
    public native String getDisabledLeftTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.disabledLeftTrackImage;
    }-*/;

    public native void setDisabledLeftTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.disabledLeftTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider right track when in the disabled
     *         state
     */
    public native String getDisabledRightTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.disabledRightTrackImage;
    }-*/;

    public native void setDisabledRightTrackImage(String value) /*-{
		jso.disabledRightTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider thumb when in the disabled state
     */
    public native String getDisabledThumbImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.disabledThumbImage;
    }-*/;

    public native void setDisabledThumbImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.disabledThumbImage = value;
    }-*/;

    /**
     * @return Boolean to indicate the enabled state of the slider
     */
    public native boolean isEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.enabled;
    }-*/;

    public native void setEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.enabled = value;
    }-*/;

    /**
     * @return The image url of the slider left track when in the highlighted
     *         state
     */
    public native String getHighlightedLeftTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.highlightedLeftTrackImage;
    }-*/;

    public native void setHighlightedLeftTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.highlightedLeftTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider right track when in the highlighted
     *         state
     */
    public native String getHighlightedRightTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.highlightedRightTrackImage;
    }-*/;

    public native void setHighlightedRightTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.highlightedRightTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider thumb when in the highlighted state
     */
    public native String getHighlightedThumbImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.highlightedThumbImage;
    }-*/;

    public native void setHighlightedThumbImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.highlightedThumbImage = value;
    }-*/;

    /**
     * @return The image url of the slider left track
     */
    public native String getLeftTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.leftTrackImage;
    }-*/;

    public native void setLeftTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.leftTrackImage = value;
    }-*/;

    /**
     * @return The maximum slider value
     */
    public native double getMax() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.max;
    }-*/;

    public native void setMax(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.max = value;
    }-*/;

    /**
     * @return Value can't be moved higher than maxrange. maxrange equals max by
     *         default. (android) Availabe on Android only
     */
    public native int getMaxRange() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.maxRange;
    }-*/;

    public native void setMaxRange(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.maxRange = value;
    }-*/;

    /**
     * @return The minimum slider value
     */
    public native double getMin() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.min;
    }-*/;

    public native void setMin(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.min = value;
    }-*/;

    /**
     * @return Value can't be moved lower than minrange. minrange equals min by
     *         default. (android) Availabe on Android only
     */
    public native int getMinRange() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.minRange;
    }-*/;

    public native void setMinRange(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.minRange = value;
    }-*/;

    /**
     * @return The image url of the slider right track
     */
    public native String getRightTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rightTrackImage;
    }-*/;

    public native void setRightTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.rightTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider left track when in the selected state
     */
    public native String getSelectedLeftTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selectedLeftTrackImage;
    }-*/;

    public native void setSelectedLeftTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectedLeftTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider right track when in the selected
     *         state
     */
    public native String getSelectedRightTrackImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selectedRightTrackImage;
    }-*/;

    public native void setSelectedRightTrackImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectedRightTrackImage = value;
    }-*/;

    /**
     * @return The image url of the slider thumb when in the selected state
     */
    public native String getSelectedThumbImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.selectedThumbImage;
    }-*/;

    public native void setSelectedThumbImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.selectedThumbImage = value;
    }-*/;

    /**
     * @return The image url to the slider thumb
     */
    public native String getThumbImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.thumbImage;
    }-*/;

    public native void setThumbImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.thumbImage = value;
    }-*/;

    /**
     * @return The value of the slider
     */
    public native double getValue() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.value;
    }-*/;

    public native void setValue(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.value = value;
    }-*/;

    public native void addChangeHandler(SliderChangeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.ti4j.mobile.client.core.events.ui.slider.SliderEvent::CHANGE,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.slider.SliderEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.SliderChangeHandler::onChange(Lcom/emitrom/ti4j/mobile/client/core/events/ui/slider/SliderEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createSlider();
    }

    public static Slider from(ProxyObject proxy) {
        return new Slider(proxy.getJsObj());
    }

}
