/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCSizeI32 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PXCSizeI32(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCSizeI32 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        realsenseJNI.delete_PXCSizeI32(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWidth(int value) {
    realsenseJNI.PXCSizeI32_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return realsenseJNI.PXCSizeI32_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    realsenseJNI.PXCSizeI32_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return realsenseJNI.PXCSizeI32_height_get(swigCPtr, this);
  }

  public PXCSizeI32() {
    this(realsenseJNI.new_PXCSizeI32(), true);
  }

}
