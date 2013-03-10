/************************************************************************
  Sound.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

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
package com.emitrom.ti4j.desktop.client.media.sound;

import com.emitrom.ti4j.desktop.client.events.TiEventListener;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object allowing for loading simple sounds and simple types of playback.
 * 
 * @author Ekambi
 * 
 */
public class Sound extends JavaScriptObject {

  protected Sound() {

  }

  /**
   * Return the current volume of this Media.Sound object. Volume values will be
   * between 0.0 and 1.0.
   * 
   * @return
   */
  public final native double getVolume()/*-{
		return this.getVolume();
  }-*/;

  /**
   * Return true if this Media.Sound is set to loop and false otherwise.
   * 
   * @return
   */
  public final native boolean isLooping()/*-{
		return this.isLooping();
  }-*/;

  /**
   * Return true if this Media.Sound is set to loop and false otherwise.
   * 
   * @return
   */
  public final native boolean isPaused()/*-{
		return this.isPaused();
  }-*/;

  /**
   * Return true if this Media.Sound is playing and false otherwise.
   * 
   * @return
   */
  public final native boolean isPlaying()/*-{
		return this.isPlaying();
  }-*/;

  public final void onComplete(TiEventListener<?> listener) {
    this.onComplete(listener.getJsoPeer());
  }

  private final native void onComplete(JavaScriptObject listener)/*-{
		this.onComplete(listener);
  }-*/;

  /**
   * Pause a currently playing sound.
   */
  public final native void pause()/*-{
		this.pause();
  }-*/;

  /**
   * Play a sound object. If the sound is paused, it will resume from the
   * current location.
   */
  public final native void play()/*-{
		this.play();
  }-*/;

  /**
   * Reload this sound from the original URL or path.
   */
  public final native void reload()/*-{
		this.reload();
  }-*/;

  /**
   * Set whether or not this sound should loop.
   * 
   * @param value
   */
  public final native void setLooping(boolean value)/*-{
		this.setLooping(value);
  }-*/;

  /**
   * Set the volume of this sound. Sound volumes should be between 0.0 and 1.0.
   * Values outside of this range will be clipped to 0.0 or 1.0.
   */
  public final native void setVolume(double value)/*-{
		this.setVolume(value);
  }-*/;

  /**
   * Stop a currently playing sound.
   */
  public final native void stop()/*-{
		this.stop();
  }-*/;

}
