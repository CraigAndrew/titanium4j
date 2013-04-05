/**************************************************************************
 * View.java is part of Titanium4j Mobile 3.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.mobile.client.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.emitrom.ti4j.mobile.client.blob.Blob;
import com.emitrom.ti4j.mobile.client.core.Size;
import com.emitrom.ti4j.mobile.client.core.Unit;
import com.emitrom.ti4j.mobile.client.core.events.TiEventListener;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.ClickHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleClickHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleTapHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.LongClickHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.LongPressHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.SingleTapHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.SwipeHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchEndHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchMoveHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchStartHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.TwoFingerTapHandler;
import com.emitrom.ti4j.mobile.client.core.handlers.ui.UIEventHandler;
import com.emitrom.ti4j.mobile.client.ui.fx.AnimationConfig;
import com.emitrom.ti4j.mobile.client.ui.interfaces.Animatable;
import com.emitrom.ti4j.mobile.client.ui.interfaces.Displayable;
import com.emitrom.ti4j.mobile.client.ui.interfaces.Focusable;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasAnchor;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasBackground;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasBlob;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasBorder;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasBoxSize;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasChildren;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasInteractionHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasUIHandler;
import com.emitrom.ti4j.mobile.client.ui.interfaces.HasWidgets;
import com.emitrom.ti4j.mobile.client.ui.ios.Matrix3D;
import com.emitrom.ti4j.mobile.client.ui.style.Color;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The view is an empty drawing surface or container. the view can be created by
 * the method {@link com.emitrom.ti4j.mobile.client.ui.UI.createView} .
 */
public class View extends UIObject implements HasWidgets, Animatable, HasAnchor, HasBackground, HasBorder, Focusable,
                HasBoxSize, HasBlob, Displayable, HasInteractionHandler, HasUIHandler, HasChildren,
                HasWidgets.ForIsWidget {

    public View() {
        createPeer();
    }

    View(JavaScriptObject obj) {
        jsObj = obj;
    }

    private List<View> children = new ArrayList<View>();

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getAnchorPoint()
     */
    @Override
    public native Point getAnchorPoint() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.anchorPoint;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasAnchor#setAnchorPoint(com.emitrom
     * .gwt4.ti.mobile.client.ui.Point)
     */
    @Override
    public native void setAnchorPoint(Point value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.anchorPoint = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getAnimatedCenterPoint()
     */
    @Override
    public native Point getAnimatedCenterPoint() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.animatedCenterPoint;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setAnimatedCenterPoint
     * (com.emitrom.ti4j.mobile.client.ui.Point)
     */
    @Override
    public native void setAnimatedCenterPoint(Point value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.animatedCenterPoint = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundColor()
     */
    @Override
    public native String getBackgroundColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundColor;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundColor
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundColor = value;
    }-*/;

    public void setBackgroundColor(Color color) {
        setBackgroundColor(color.getRgb());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundDisabledColor
     * ()
     */
    @Override
    public native String getBackgroundDisabledColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundDisabledColor;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundDisabledColor
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundDisabledColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundDisabledColor = value;
    }-*/;

    public void setBackgroundDisabledColor(Color color) {
        setBackgroundDisabledColor(color.getRgb());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundDisabledImage
     * ()
     */
    @Override
    public native String getBackgroundDisabledImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundDisabledImage;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundDisabledImage
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundDisabledImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundDisabledImage = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundFocusedColor
     * ()
     */
    @Override
    public native String getBackgroundFocusedColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundFocusedColor;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundFocusedColor
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundFocusedColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundFocusedColor = value;
    }-*/;

    public void setBackgroundFocusedColor(Color color) {
        setBackgroundFocusedColor(color.getRgb());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundFocusedImage
     * ()
     */
    @Override
    public native String getBackgroundFocusedImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundFocusedImage;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundFocusedImage
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundFocusedImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundFocusedImage = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundGradient ()
     */
    @Override
    public native Object getBackgroundGradient() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundGradient;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundGradient
     * (java.lang.Object)
     */
    @Override
    public native void setBackgroundGradient(Object value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundGradient = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundImage()
     */
    @Override
    public native String getBackgroundImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundImage;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundImage
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundImage = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundLeftCap()
     */
    @Override
    public native <T> T getBackgroundLeftCap() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundLeftCap;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundLeftCap
     * (double)
     */
    @Override
    public void setBackgroundLeftCap(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "backgroundLeftCap", value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundSelectedColor
     * ()
     */
    @Override
    public native String getBackgroundSelectedColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundSelectedColor;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundSelectedColor
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundSelectedColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundSelectedColor = value;
    }-*/;

    public void setBackgroundSelectedColor(Color color) {
        setBackgroundSelectedColor(color.getRgb());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundSelectedImage
     * ()
     */
    @Override
    public native String getBackgroundSelectedImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundSelectedImage;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundSelectedImage
     * (java.lang.String)
     */
    @Override
    public native void setBackgroundSelectedImage(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundSelectedImage = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBackground#getBackgroundTopCap()
     */
    @Override
    public native <T> T getBackgroundTopCap() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundTopCap;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBackground#setBackgroundTopCap
     * (double)
     */
    @Override
    public native void setBackgroundTopCap(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.backgroundTopCap = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBorder#getBorderColor()
     */
    @Override
    public native String getBorderColor() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.borderColor;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBorder#setBorderColor(java.lang
     * .String)
     */
    @Override
    public native void setBorderColor(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.borderColor = value;
    }-*/;

    public void setBorderColor(Color color) {
        setBorderColor(color.getRgb());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBorder#getBorderRadius()
     */
    @Override
    public native <T> T getBorderRadius() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.borderRadius;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBorder#setBorderRadius(double)
     */
    @Override
    public native void setBorderRadius(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.borderRadius = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBorder#getBorderWidth()
     */
    @Override
    public native <T> T getBorderWidth() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.borderWidth;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBorder#setBorderWidth(double)
     */
    @Override
    public void setBorderWidth(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "borderWidth", value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setBottom(double)
     */
    @Override
    public void setBottom(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "bottom", value);
    }

    public void setBottom(double value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "bottom", Double.toString(value), unit);
    }

    private native void _setBottom(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.bottom = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasAnchor#setBottom(java.lang.String )
     */
    @Override
    public void setBottom(String value) {
        UI.get().setSizePropertyAsString(jsObj, "bottom", value);
    }

    private native void _setBottom(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.bottom = value;
    }-*/;

    public void setBottom(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "bottom", value, unit);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getBottom
     */
    @Override
    public native double getBottom() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.bottom;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getCenter()
     */
    @Override
    public native Point getCenter() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.center;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setCenter(com.emitrom.
     * gwt4.ti.mobile.client.ui.Point)
     */
    @Override
    public native void setCenter(Point value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.center = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#isFocusable()
     */
    @Override
    public native boolean isFocusable() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.focusable;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#setFocusable(boolean)
     */
    @Override
    public native void setFocusable(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.focusable = value;
    }-*/;

    /**
     * The frame of the view (position relative to parent bounds) in system
     * units.
     * <p>
     * The correct values will only be available when layout is complete. To
     * determine when layout is complete, add a listener for the postlayout
     * event.
     * 
     * @return
     */
    public native Size getRect() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.rect;
		return @com.emitrom.ti4j.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native JavaScriptObject getRectangle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.rect;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBoxSize#setHeight(double)
     */
    @Override
    public void setHeight(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "height", value);
    }

    public void setHeight(double value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "height", Double.toString(value), unit);
    }

    private native void _setHeight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.height = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBoxSize#setHeight(java.lang.String )
     */
    @Override
    public void setHeight(String value) {
        UI.get().setSizePropertyAsString(jsObj, "height", value);
    }

    public void setHeight(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "height", value, unit);
    }

    private native void _setHeight(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.height = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBoxSize#getHeight()
     */
    @Override
    public native double getHeight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.height;
    }-*/;

    /**
     * Sets the position of this view relative to his parent. This method will
     * set the top, right, bottom and left postion of the view
     * 
     * @param position
     *            , the position relative to the parent.
     */
    public void setConstraintPosition(double position) {
        setLeft(position);
        setRight(position);
        setBottom(position);
        setTop(position);
    }

    /**
     * Sets the position of this view relative to his parent. This method will
     * set the top, right, bottom and left postion of the view
     * 
     * @param position
     *            , the position relative to the parent.
     */
    public void setConstraintPosition(String position) {
        setLeft(position);
        setRight(position);
        setBottom(position);
        setTop(position);
    }

    /**
     * Sets the position of this view relative to his parent. This method will
     * set the top, right, bottom and left postion of the view
     * 
     * @param position
     *            , the position relative to the parent.
     * @param unit
     *            , the unit system to use
     */
    public void setConstraintPosition(String position, Unit unit) {
        setLeft(position, unit);
        setRight(position, unit);
        setBottom(position, unit);
        setTop(position, unit);
    }

    /**
     * Sets the position of this view relative to his parent.
     * 
     * @param leftRight
     *            , the right and left value
     * @param topBottom
     *            , the top and bottom value
     */
    public void setConstraintPosition(double leftRight, double topBottom) {
        setLeft(leftRight);
        setRight(leftRight);
        setBottom(topBottom);
        setTop(topBottom);
    }

    /**
     * Sets the position of this view relative to his parent.
     * 
     * @param leftRight
     *            , the right and left value
     * @param topBottom
     *            , the top and bottom value
     */
    public void setConstraintPosition(String leftRight, String topBottom) {
        setLeft(leftRight);
        setRight(leftRight);
        setBottom(topBottom);
        setTop(topBottom);
    }

    /**
     * Sets the position of this view relative to his parent.
     * 
     * @param leftRight
     *            , the right and left value
     * @param topBottom
     *            , the top and bottom value
     * @param unit
     *            , the unit system to be used
     */
    public void setConstraintPosition(String leftRight, String topBottom, Unit unit) {
        setLeft(leftRight, unit);
        setRight(leftRight, unit);
        setBottom(topBottom, unit);
        setTop(topBottom, unit);
    }

    /**
     * Sets the position of this view relative to his parent.
     * 
     * @param left
     *            , the left value
     * @param right
     *            , the right value
     * @param bottom
     *            , the bottom value
     * @param top
     *            , the top value
     */
    public void setConstraintPosition(double top, double right, double bottom, double left) {
        setLeft(left);
        setRight(right);
        setBottom(bottom);
        setTop(top);
    }

    /**
     * Sets the position of this view relative to his parent.
     * 
     * @param left
     *            , the left value
     * @param right
     *            , the right value
     * @param bottom
     *            , the bottom value
     * @param top
     *            , the top value
     */
    public void setConstraintPosition(String top, String right, String bottom, String left) {
        setLeft(left);
        setRight(right);
        setBottom(bottom);
        setTop(top);
    }

    /**
     * Sets the position of this view relative to his parent.
     * 
     * @param left
     *            , the left value
     * @param right
     *            , the right value
     * @param bottom
     *            , the bottom value
     * @param top
     *            , the top value
     */
    public void setConstraintPosition(String top, String right, String bottom, String left, Unit unit) {
        setLeft(left, unit);
        setRight(right, unit);
        setBottom(bottom, unit);
        setTop(top, unit);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setLeft(double)
     */
    @Override
    public void setLeft(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "left", value);
    }

    public void setLeft(double value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "left", Double.toString(value), unit);
    }

    private native void _setLeft(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.left = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasAnchor#setLeft(java.lang.String)
     */
    @Override
    public void setLeft(String value) {
        UI.get().setSizePropertyAsString(jsObj, "left", value);
    }

    public void setLeft(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "left", value, unit);
    }

    private native void _setLeft(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.left = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getLeft()
     */
    @Override
    public native double getLeft() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.left;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#getOpacity()
     */
    @Override
    public native double getOpacity() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.opacity;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#setOpacity(double)
     */
    @Override
    public native void setOpacity(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.opacity = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setRight(double)
     */
    @Override
    public void setRight(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "right", value);
    }

    public void setRight(double value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "right", Double.toString(value), unit);
    }

    private native void _setRight(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.right = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasAnchor#setRight(java.lang.String)
     */
    @Override
    public void setRight(String value) {
        UI.get().setSizePropertyAsString(jsObj, "right", value);
    }

    public void setRight(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "bottom", value, unit);
    }

    private native void _setRight(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.right = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getRight()
     */
    @Override
    public native double getRight() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.right;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBoxSize#getSize()
     */
    @Override
    public native Size getSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.size;
		var toReturn = @com.emitrom.ti4j.mobile.client.core.Size::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBoxSize#setSize(java.lang.Object)
     */
    @Override
    public native void setSize(Object value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.size = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /**
     * Sets the button size
     * 
     * @param width
     *            , the button width
     * @param height
     *            , the button height
     */
    public void setSize(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    /**
     * Sets the button size
     * 
     * @param width
     *            , the button width
     * @param height
     *            , the button height
     */
    public void setSize(String width, String height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    /**
     * Sets the button size
     * 
     * @param width
     *            , the button width
     * @param height
     *            , the button height
     * @param unit
     *            , the unit to use
     */
    public void setSize(int width, int height, Unit unit) {
        this.setWidth(width, unit);
        this.setHeight(height, unit);
    }

    /**
     * Sets the button size
     * 
     * @param width
     *            , the button width
     * @param height
     *            , the button height
     * @param unit
     *            , the unit to use
     */
    public void setSize(String width, String height, Unit unit) {
        this.setWidth(width, unit);
        this.setHeight(height, unit);
    }

    /**
     * @return One of titanium.ui.android.soft_keyboard_default_on_focus,
     *         titanium.ui.android.soft_keyboard_hide_on_focus, or
     *         titanium.ui.android.soft_keyboard_show_on_focus. (android only)
     *         Available on Android only
     */
    public native int getSoftKeyboardOnFocus() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.softKeyboardOnFocus;
    }-*/;

    public native void setSoftKeyboardOnFocus(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.softKeyboardOnFocus = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setTop(double)
     */
    @Override
    public void setTop(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "top", value);
    }

    public void setTop(double value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "top", Double.toString(value), unit);
    }

    private native void _setTop(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.top = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#setTop(java.lang.String)
     */
    @Override
    public void setTop(String value) {
        UI.get().setSizePropertyAsString(jsObj, "top", value);
    }

    public void setTop(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "top", value, unit);
    }

    private native void _setTop(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.top = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasAnchor#getTop()
     */
    @Override
    public native double getTop() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.top;
    }-*/;

    /**
     * @return A boolean indicating if the view should receive touch events
     *         (true, default) or forward them to peers (false)
     */
    public native boolean isTouchEnabled() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.touchEnabled;
    }-*/;

    public native void setTouchEnabled(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.touchEnabled = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#getTransform()
     */
    @Override
    public native Object getTransform() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.transform;
    }-*/;

    /**
     * transformation matrix to applied to the view.
     * 
     * @return
     */
    public native Matrix2D getTransform2D() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.transform;
		return @com.emitrom.ti4j.mobile.client.ui.Matrix2D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * transformation matrix to applied to the view.
     * 
     * @return
     */
    public native Matrix3D getTransform3D() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.transform;
		return @com.emitrom.ti4j.mobile.client.ui.ios.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setTransform(Matrix2D value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.transform = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    public native void setTransform(Matrix3D value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.transform = value.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#isVisible()
     */
    @Override
    public native boolean isVisible() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.visible;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#setVisible(boolean)
     */
    @Override
    public native void setVisible(boolean value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.visible = value;
    }-*/;

    public void setWidth(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "width", value);
    }

    public void setWidth(double value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "width", Double.toString(value), unit);
    }

    private native void _setWidth(double value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.width = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasBoxSize#setWidth(java.lang.String )
     */
    @Override
    public void setWidth(String value) {
        UI.get().setSizePropertyAsString(jsObj, "width", value);
    }

    public void setWidth(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "width", value, unit);
    }

    private native void _setWidth(String value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.width = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBoxSize#getWidth()
     */
    @Override
    public native double getWidth() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.width;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#getZIndex()
     */
    @Override
    public native int getZIndex() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.zIndex;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Focusable#setZIndex(int)
     */
    @Override
    public native void setZIndex(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.zIndex = value;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasWidgets#add(com.emitrom.gwt4.
     * ti.mobile.client.ui.HasWidgets)
     */
    @Override
    public void add(View view) {
        this.children.add(view);
        _addNative(view);
    }

    public void add(IAsView view) {
        add(view.asView());
    }

    private native void _addNative(View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.add(view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Animatable#animate(com.emitrom.gwt4
     * .ti.mobile.client.ui.fx.AnimationConfig)
     */
    @Override
    public native void animate(AnimationConfig obj)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.animate(obj.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Animatable#animate(com.emitrom.gwt4
     * .ti.mobile.client.ui.fx.AnimationConfig)
     */
    @Override
    public native void animate(Animation animation)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.animate(animation.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.Animatable#animate(com.emitrom.gwt4
     * .ti.mobile.client.ui.fx.AnimationConfig,
     * com.emitrom.ti4j.mobile.client.core.events.TiEventListener)
     */
    @Override
    public void animate(AnimationConfig config, TiEventListener<?> listener) {
        _animate(config.getJsObj(), listener.getJsoPeer());
    }

    private native void _animate(JavaScriptObject obj, JavaScriptObject callback) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.animate(obj, callback);
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Displayable#hide()
     */

    @Override
    public native void hide() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.hide();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasWidgets#remove(com.emitrom.gwt4
     * .ti.mobile.client.ui.HasWidgets)
     */
    private native void _remove(View view) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso
				.remove(view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
    }-*/;

    @Override
    public void remove(View view) {
        children.remove(view);
        _remove(view);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.Displayable#show()
     */
    @Override
    public native void show() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.show();
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBlob#toImage()
     */
    @Override
    public native Blob toImage() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.toImage();
		var toReturn = @com.emitrom.ti4j.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasBlob#toImage(com.emitrom.gwt4
     * .ti.mobile.client.core.events.TiEventListener)
     */
    @Override
    public void toImage(TiEventListener<?> callback) {
        _toImage(callback.getJsoPeer());
    }

    private native Blob _toImage(JavaScriptObject f) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.toImage(f);
		var toReturn = @com.emitrom.ti4j.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#addClickHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addClickHandler(ClickHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.ClickHandler::onClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/ClickEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addDoubleClickHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addDoubleClickHandler(DoubleClickHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleClickHandler::onDoubleClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/DoubleClickEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addDoubleTapHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addDoubleTapHandler(DoubleTapHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.DoubleTapHandler::onDoubleTap(Lcom/emitrom/ti4j/mobile/client/core/events/ui/DoubleTapEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.DoubleTapEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addLongClickHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addLongClickHandler(LongClickHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.LongClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.LongClickHandler::onLongClick(Lcom/emitrom/ti4j/mobile/client/core/events/ui/LongClickEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.LongClickEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addLongPressHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addLongPressHandler(LongPressHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.LongPressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.LongPressHandler::onLongPress(Lcom/emitrom/ti4j/mobile/client/core/events/ui/LongPressEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.LongPressEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasTapHandlers#addSingleTapHandler
     * (com.emitrom.ti4j.mobile.client.core.events.TiEventListener)
     */

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addSingleTapHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addSingleTapHandler(SingleTapHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.SingleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.SingleTapHandler::onSingleTap(Lcom/emitrom/ti4j/mobile/client/core/events/ui/SingleTapEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.SingleTapEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#addSwipeHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addSwipeHandler(SwipeHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.SwipeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.SwipeHandler::onSwipe(Lcom/emitrom/ti4j/mobile/client/core/events/ui/SwipeEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.SwipeEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addTouchCancelHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addTouchCancelHandler(InteractionHandler handler) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchCancelEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchCancelHandler::onCancel(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchCancelEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchCancelEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#addTouchEndHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addTouchEndHandler(TouchEndHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchEndEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchEndHandler::onTouchEnd(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchEndEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchEndEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addTouchMoveHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addTouchMoveHandler(TouchMoveHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchMoveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchMoveHandler::onTouchMove(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchMoveEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchMoveEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addTouchStartHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addTouchStartHandler(TouchStartHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchStartEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TouchStartHandler::onTouchStart(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TouchStartEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TouchStartEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasInteractionHandler#
     * addTwoFingerTapHandler
     * (com.emitrom.ti4j.mobile.client.core.handlers.ui.InteractionHandler)
     */
    @Override
    public native CallbackRegistration addTwoFingerTapHandler(TwoFingerTapHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var listener = function(e) {
			var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.TwoFingerTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.TwoFingerTapHandler::onTwoFingerTap(Lcom/emitrom/ti4j/mobile/client/core/events/ui/TwoFingerTapEvent;)(eventObject);
		};
		var name = @com.emitrom.ti4j.mobile.client.core.events.ui.TwoFingerTapEvent::EVENT_NAME;
		var v = jso.addEventListener(name, listener);
		var toReturn = @com.emitrom.ti4j.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/ti4j/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;

    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createView();
    }

    public static View from(ProxyObject proxy) {
        return new View(proxy.getJsObj());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.emitrom.ti4j.mobile.client.ui.HasUIHandler#addEventHandler(java
     * .lang.String,
     * com.emitrom.ti4j.mobile.client.core.handlers.ui.UIEventHandler)
     */
    @Override
    public native void addEventHandler(String event, UIEventHandler handler)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						event,
						function(e) {
							var eventObject = @com.emitrom.ti4j.mobile.client.core.events.ui.UIEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.ti4j.mobile.client.core.handlers.ui.UIEventHandler::onEvent(Lcom/emitrom/ti4j/mobile/client/core/events/ui/UIEvent;)(eventObject);
						});
    }-*/;

    public native void setBorderSize(int value) /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.borderSize = value;
    }-*/;

    public native int getBorderSize() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.borderSize;
    }-*/;

    @Override
    public void setBorderRadius(String value) {
        UI.get().setSizePropertyAsString(jsObj, "borderRadius", value);
    }

    @Override
    public void setBorderRadius(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "borderRadius", value, unit);
    }

    @Override
    public void setBorderWidth(String value) {
        UI.get().setSizePropertyAsString(jsObj, "borderWidth", value);
    }

    @Override
    public void setBorderWidth(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "borderWidth", value, unit);
    }

    @Override
    public void setBackgroundLeftCap(String value) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundLeftCap", value);
    }

    @Override
    public void setBackgroundLeftCap(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundLeftCap", value, unit);
    }

    @Override
    public void setBackgroundTopCap(String value) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundTopCap", value);
    }

    @Override
    public void setBackgroundTopCap(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundTopCap", value, unit);
    }

    @Override
    public native <T> T getBackgroundRightCap()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundRightCap;
    }-*/;

    @Override
    public void setBackgroundRightCap(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "backgroundRightCap", value);
    }

    @Override
    public void setBackgroundRightCap(String value) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundRightCap", value);
    }

    @Override
    public void setBackgroundRightCap(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundBottomCap", value, unit);
    }

    @Override
    public native <T> T getBackgroundBottomCap()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.backgroundBottomCap;
    }-*/;

    /**
     * Translates a point from this view's coordinate system to another view's
     * coordinate system.
     * <p>
     * If both views are connected in the native view hierarchies, returns the
     * point, converted to destinationView's coordinate system.
     * <p>
     * Returns null if either view is not in the view hierarchy. Keep in mind
     * that views may be removed from the view hierarchy if their window is
     * blurred or if the view is offscreen (such as in some situations with
     * Ti.UI.ScrollableView).
     * <p>
     * If this view is a Ti.UI.ScrollView, the view's x and y offsets are
     * subtracted from the return value.
     * 
     * @param point
     * @param view
     * @return
     */
    public native Point converPointToView(Point point, View view)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.converPointToView(
				point.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()(),
				view.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()());
		return @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Finishes a batch update of the View's layout properties and schedules a
     * layout pass of the view tree.
     * <p>
     * Since the layout pass scheduled is asynchronous, the rect and size values
     * may not be available immediately after finishLayout is called.
     * <p>
     * To be notified when the layout pass completes, add a listener for the
     * postlayout event.
     */
    public native void finishLayout()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.finishLayout();
    }-*/;

    /**
     * Starts a batch update of this view's layout properties.
     * <p>
     * To prevent a layout pass each time a property is modified, call
     * startLayout before changing any properties that may change this view's
     * layout. This initiates a batch update mode where layout changes are
     * deferred.
     */
    public native void startLayout()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		jso.startLayout();
    }-*/;

    @Override
    public void setBackgroundBottomCap(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "backgroundBottomCap", value);
    }

    @Override
    public void setBackgroundBottomCap(String value) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundBottomCap", value);
    }

    @Override
    public void setBackgroundBottomCap(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "backgroundBottomCap", value, unit);
    }

    @Override
    public List<View> getChildren() {
        updateChildren();
        return children;
    }

    private void updateChildren() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            children.get(i).updateWith(_getChildrenAt(i));
        }
    }

    private native JavaScriptObject _getChildren()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.children;
    }-*/;

    private native JavaScriptObject _getChildrenAt(int index)/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.children[index];
    }-*/;

    private native int getChildCount()/*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.children.length;
    }-*/;

    protected void updateWith(JavaScriptObject obj) {
        jsObj = obj;
    }

    @Override
    public void setTransform(Object transform) {

    }

    /**
     * Removes all children views
     */
    public void clear() {
        for (View c : children) {
            remove(c);
        }
    }

    /**
     * Removes all children views and adds the view
     * 
     * @param v
     *            The view to add
     */
    public void setView(View v) {
        setJsObj(v.getJsObj());
    }

    public void setView(IAsView v) {
        setView(v.asView());
    }

    @Override
    public Iterator<View> iterator() {
        return getChildren().iterator();
    }

    @Override
    public void add(IsWidget w) {
        add(w.asWidget());
    }

    public boolean remove(IsWidget w) {
        boolean hasChild = getChildren().contains(w.asWidget());
        remove(w.asWidget());
        return hasChild;
    };
}
