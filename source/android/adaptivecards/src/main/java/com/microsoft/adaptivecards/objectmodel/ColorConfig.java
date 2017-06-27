/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class ColorConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ColorConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColorConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ColorConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNormal(String value) {
    AdaptiveCardObjectModelJNI.ColorConfig_normal_set(swigCPtr, this, value);
  }

  public String getNormal() {
    return AdaptiveCardObjectModelJNI.ColorConfig_normal_get(swigCPtr, this);
  }

  public void setSubtle(String value) {
    AdaptiveCardObjectModelJNI.ColorConfig_subtle_set(swigCPtr, this, value);
  }

  public String getSubtle() {
    return AdaptiveCardObjectModelJNI.ColorConfig_subtle_get(swigCPtr, this);
  }

  public static ColorConfig Deserialize(SWIGTYPE_p_Json__Value json, ColorConfig defaultValue) {
    return new ColorConfig(AdaptiveCardObjectModelJNI.ColorConfig_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(json), ColorConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public ColorConfig() {
    this(AdaptiveCardObjectModelJNI.new_ColorConfig(), true);
  }

}
