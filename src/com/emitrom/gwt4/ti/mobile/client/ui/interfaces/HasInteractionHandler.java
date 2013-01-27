/**************************************************************************
   HasInteractionHandler.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui.interfaces;

import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.ClickHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DoubleClickHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DoubleTapHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.LongClickHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.LongPressHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.SingleTapHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.SwipeHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TouchEndHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TouchMoveHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TouchStartHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TwoFingerTapHandler;

public interface HasInteractionHandler {

    public CallbackRegistration addClickHandler(ClickHandler handler) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.ClickHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/ClickEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.ClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addDoubleClickHandler(DoubleClickHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.DoubleClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DoubleClickHandler::onDoubleClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/DoubleClickEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.DoubleClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addDoubleTapHandler(DoubleTapHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.DoubleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.DoubleTapHandler::onDoubleTap(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/DoubleTapEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.DoubleTapEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addLongClickHandler(LongClickHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.LongClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.LongClickHandler::onLongClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/LongClickEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.LongClickEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addLongPressHandler(LongPressHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.LongPressEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.LongPressHandler::onLongPress(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/LongPressEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.LongPressEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;


    public CallbackRegistration addSingleTapHandler(SingleTapHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.SingleTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.SingleTapHandler::onSingleTap(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/SingleTapEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.SingleTapEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addSwipeHandler(SwipeHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.SwipeEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.SwipeHandler::onSwipe(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/SwipeEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.SwipeEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public void addTouchCancelHandler(InteractionHandler handler)/*-{
                                                                 var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                                 jso
                                                                 .addEventListener(
                                                                 @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::TOUCH_CANCEL,
                                                                 function(e) {
                                                                 var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                                 handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                                 });
                                                                 }-*/;

    public CallbackRegistration addTouchEndHandler(TouchEndHandler handler)/*-{
                                                              var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                              jso
                                                              .addEventListener(
                                                              @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::TOUCH_END,
                                                              function(e) {
                                                              var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                              handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                              });
                                                              }-*/;

    public CallbackRegistration addTouchMoveHandler(TouchMoveHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.TouchMoveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TouchMoveHandler::onTouchMove(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/TouchMoveEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.TouchMoveEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addTouchStartHandler(TouchStartHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.TouchStartEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TouchStartHandler::onTouchStart(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/TouchStartEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.TouchStartEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

    public CallbackRegistration addTwoFingerTapHandler(TwoFingerTapHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var listener = function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.TwoFingerTapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.TwoFingerTapHandler::onTwoFingerTap(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/TwoFingerTapEvent;)(eventObject);
						};
		var name = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.TwoFingerTapEvent::EVENT_NAME;
		var v = jso
				.addEventListener(
						name,
						listener);
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.CallbackRegistration::new(Lcom/emitrom/gwt4/ti/mobile/client/ui/UIObject;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,name,listener);
		return toReturn;
						
	}-*/;

}