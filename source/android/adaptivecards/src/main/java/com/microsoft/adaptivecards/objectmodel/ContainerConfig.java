/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class ContainerConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ContainerConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContainerConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ContainerConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSeparation(SeparationConfig value) {
    AdaptiveCardObjectModelJNI.ContainerConfig_separation_set(swigCPtr, this, SeparationConfig.getCPtr(value), value);
  }

  public SeparationConfig getSeparation() {
    long cPtr = AdaptiveCardObjectModelJNI.ContainerConfig_separation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparationConfig(cPtr, false);
  }

  public void setNormal(ContainerStyleConfig value) {
    AdaptiveCardObjectModelJNI.ContainerConfig_normal_set(swigCPtr, this, ContainerStyleConfig.getCPtr(value), value);
  }

  public ContainerStyleConfig getNormal() {
    long cPtr = AdaptiveCardObjectModelJNI.ContainerConfig_normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerStyleConfig(cPtr, false);
  }

  public void setEmphasis(ContainerStyleConfig value) {
    AdaptiveCardObjectModelJNI.ContainerConfig_emphasis_set(swigCPtr, this, ContainerStyleConfig.getCPtr(value), value);
  }

  public ContainerStyleConfig getEmphasis() {
    long cPtr = AdaptiveCardObjectModelJNI.ContainerConfig_emphasis_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerStyleConfig(cPtr, false);
  }

  public static ContainerConfig Deserialize(SWIGTYPE_p_Json__Value json, ContainerConfig defaultValue) {
    return new ContainerConfig(AdaptiveCardObjectModelJNI.ContainerConfig_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(json), ContainerConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public ContainerConfig() {
    this(AdaptiveCardObjectModelJNI.new_ContainerConfig(), true);
  }

}
