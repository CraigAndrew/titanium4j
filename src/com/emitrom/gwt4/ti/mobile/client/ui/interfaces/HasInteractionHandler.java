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

import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler;

public interface HasInteractionHandler {

    public void addClickHandler(InteractionHandler handler)/*-{
                                                           var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                           jso
                                                           .addEventListener(
                                                           @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::CLICK,
                                                           function(e) {
                                                           var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                           handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                           });
                                                           }-*/;

    public void addDoubleClickHandler(InteractionHandler handler)/*-{
                                                                 var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                                 jso
                                                                 .addEventListener(
                                                                 @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::DOUBLE_CLICK,
                                                                 function(e) {
                                                                 var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                                 handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                                 });
                                                                 }-*/;

    public void addDoubleTapHandler(InteractionHandler handler)/*-{
                                                               var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                               jso
                                                               .addEventListener(
                                                               @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::DOUBLE_TAP,
                                                               function(e) {
                                                               var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                               handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                               });
                                                               }-*/;

    public void addLongClickHandler(InteractionHandler handler)/*-{
                                                               var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                               jso
                                                               .addEventListener(
                                                               @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::LONG_CLICK,
                                                               function(e) {
                                                               var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                               handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                               });
                                                               }-*/;

    public void addLongPressHandler(InteractionHandler handler)/*-{
                                                               var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                               jso
                                                               .addEventListener(
                                                               @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::LONG_PRESS,
                                                               function(e) {
                                                               var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                               handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                               });
                                                               }-*/;

    public void addSingleTapHandler(InteractionHandler handler)/*-{
                                                               var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                               jso
                                                               .addEventListener(
                                                               @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::SINGLE_TAP,
                                                               function(e) {
                                                               var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                               handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                               });
                                                               }-*/;

    public void addSwipeHandler(InteractionHandler handler)/*-{
                                                           var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                           jso
                                                           .addEventListener(
                                                           @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::SWIPE,
                                                           function(e) {
                                                           var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                           handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                           });
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

    public void addTouchEndHandler(InteractionHandler handler)/*-{
                                                              var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                              jso
                                                              .addEventListener(
                                                              @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::TOUCH_END,
                                                              function(e) {
                                                              var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                              handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                              });
                                                              }-*/;

    public void addTouchMoveHandler(InteractionHandler handler)/*-{
                                                               var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                               jso
                                                               .addEventListener(
                                                               @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::TOUCH_MOVE,
                                                               function(e) {
                                                               var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                               handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                               });
                                                               }-*/;

    public void addTouchStartHandler(InteractionHandler handler)/*-{
                                                                var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                                jso
                                                                .addEventListener(
                                                                @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::TOUCH_START,
                                                                function(e) {
                                                                var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                                handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                                });
                                                                }-*/;

    public void addTwoFingerTapHandler(InteractionHandler handler)/*-{
                                                                  var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
                                                                  jso
                                                                  .addEventListener(
                                                                  @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::TWO_FINGER_TAP,
                                                                  function(e) {
                                                                  var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.InteractionEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                                                                  handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.InteractionHandler::onClick(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/InteractionEvent;)(eventObject);
                                                                  });
                                                                  }-*/;

}