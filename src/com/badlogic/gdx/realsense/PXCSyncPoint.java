/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCSyncPoint extends PXCBase {
  private long swigCPtr;

  protected PXCSyncPoint(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCSyncPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCSyncPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pxcStatus Synchronize(int timeout) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSyncPoint_Synchronize__SWIG_0(swigCPtr, this, timeout));
  }

  public pxcStatus Synchronize() {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSyncPoint_Synchronize__SWIG_1(swigCPtr, this));
  }

  public static pxcStatus SynchronizeEx(int n, SWIGTYPE_p_p_PXCSyncPoint sps, int n2, SWIGTYPE_p_p_void events, SWIGTYPE_p_int idx, int timeout) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSyncPoint_SynchronizeEx__SWIG_0(n, SWIGTYPE_p_p_PXCSyncPoint.getCPtr(sps), n2, SWIGTYPE_p_p_void.getCPtr(events), SWIGTYPE_p_int.getCPtr(idx), timeout));
  }

  public static pxcStatus SynchronizeEx(int n, SWIGTYPE_p_p_PXCSyncPoint sps, SWIGTYPE_p_int idx, int timeout) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSyncPoint_SynchronizeEx__SWIG_1(n, SWIGTYPE_p_p_PXCSyncPoint.getCPtr(sps), SWIGTYPE_p_int.getCPtr(idx), timeout));
  }

  public static pxcStatus SynchronizeEx(int n, SWIGTYPE_p_p_PXCSyncPoint sps, SWIGTYPE_p_int idx) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSyncPoint_SynchronizeEx__SWIG_2(n, SWIGTYPE_p_p_PXCSyncPoint.getCPtr(sps), SWIGTYPE_p_int.getCPtr(idx)));
  }

  public static pxcStatus SynchronizeEx(int n, SWIGTYPE_p_p_PXCSyncPoint sps) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSyncPoint_SynchronizeEx__SWIG_3(n, SWIGTYPE_p_p_PXCSyncPoint.getCPtr(sps)));
  }

  public static void ReleaseSP(SWIGTYPE_p_p_PXCSyncPoint objects, int startIndex, int nitems) {
    realsenseJNI.PXCSyncPoint_ReleaseSP(SWIGTYPE_p_p_PXCSyncPoint.getCPtr(objects), startIndex, nitems);
  }

  public final static int TIMEOUT_INFINITE = realsenseJNI.PXCSyncPoint_TIMEOUT_INFINITE_get();

  public final static int SYNCEX_LIMIT = realsenseJNI.PXCSyncPoint_SYNCEX_LIMIT_get();

}
