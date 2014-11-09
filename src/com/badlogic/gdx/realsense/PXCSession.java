/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCSession extends PXCBase {
  private long swigCPtr;

  protected PXCSession(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCSession_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCSession obj) {
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

  static public class ImplVersion {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ImplVersion(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ImplVersion obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCSession_ImplVersion(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setMajor(short value) {
      realsenseJNI.PXCSession_ImplVersion_major_set(swigCPtr, this, value);
    }
  
    public short getMajor() {
      return realsenseJNI.PXCSession_ImplVersion_major_get(swigCPtr, this);
    }
  
    public void setMinor(short value) {
      realsenseJNI.PXCSession_ImplVersion_minor_set(swigCPtr, this, value);
    }
  
    public short getMinor() {
      return realsenseJNI.PXCSession_ImplVersion_minor_get(swigCPtr, this);
    }
  
    public ImplVersion() {
      this(realsenseJNI.new_PXCSession_ImplVersion(), true);
    }
  
  }

  static public class ImplDesc {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ImplDesc(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ImplDesc obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCSession_ImplDesc(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setGroup(PXCSession.ImplGroup value) {
      realsenseJNI.PXCSession_ImplDesc_group_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCSession.ImplGroup getGroup() {
      return PXCSession.ImplGroup.swigToEnum(realsenseJNI.PXCSession_ImplDesc_group_get(swigCPtr, this));
    }
  
    public void setSubgroup(PXCSession.ImplSubgroup value) {
      realsenseJNI.PXCSession_ImplDesc_subgroup_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCSession.ImplSubgroup getSubgroup() {
      return PXCSession.ImplSubgroup.swigToEnum(realsenseJNI.PXCSession_ImplDesc_subgroup_get(swigCPtr, this));
    }
  
    public void setAlgorithm(int value) {
      realsenseJNI.PXCSession_ImplDesc_algorithm_set(swigCPtr, this, value);
    }
  
    public int getAlgorithm() {
      return realsenseJNI.PXCSession_ImplDesc_algorithm_get(swigCPtr, this);
    }
  
    public void setIuid(int value) {
      realsenseJNI.PXCSession_ImplDesc_iuid_set(swigCPtr, this, value);
    }
  
    public int getIuid() {
      return realsenseJNI.PXCSession_ImplDesc_iuid_get(swigCPtr, this);
    }
  
    public void setVersion(PXCSession.ImplVersion value) {
      realsenseJNI.PXCSession_ImplDesc_version_set(swigCPtr, this, PXCSession.ImplVersion.getCPtr(value), value);
    }
  
    public PXCSession.ImplVersion getVersion() {
      long cPtr = realsenseJNI.PXCSession_ImplDesc_version_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCSession.ImplVersion(cPtr, false);
    }
  
    public void setReserved2(int value) {
      realsenseJNI.PXCSession_ImplDesc_reserved2_set(swigCPtr, this, value);
    }
  
    public int getReserved2() {
      return realsenseJNI.PXCSession_ImplDesc_reserved2_get(swigCPtr, this);
    }
  
    public void setMerit(int value) {
      realsenseJNI.PXCSession_ImplDesc_merit_set(swigCPtr, this, value);
    }
  
    public int getMerit() {
      return realsenseJNI.PXCSession_ImplDesc_merit_get(swigCPtr, this);
    }
  
    public void setVendor(int value) {
      realsenseJNI.PXCSession_ImplDesc_vendor_set(swigCPtr, this, value);
    }
  
    public int getVendor() {
      return realsenseJNI.PXCSession_ImplDesc_vendor_get(swigCPtr, this);
    }
  
    public void setCuids(SWIGTYPE_p_int value) {
      realsenseJNI.PXCSession_ImplDesc_cuids_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getCuids() {
      long cPtr = realsenseJNI.PXCSession_ImplDesc_cuids_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public void setFriendlyName(SWIGTYPE_p_wchar_t value) {
      realsenseJNI.PXCSession_ImplDesc_friendlyName_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_wchar_t getFriendlyName() {
      long cPtr = realsenseJNI.PXCSession_ImplDesc_friendlyName_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCSession_ImplDesc_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCSession_ImplDesc_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public ImplDesc() {
      this(realsenseJNI.new_PXCSession_ImplDesc(), true);
    }
  
  }

  public PXCSession.ImplVersion QueryVersion() {
    return new PXCSession.ImplVersion(realsenseJNI.PXCSession_QueryVersion(swigCPtr, this), true);
  }

  public pxcStatus QueryImpl(PXCSession.ImplDesc templat, int idx, PXCSession.ImplDesc desc) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_QueryImpl(swigCPtr, this, PXCSession.ImplDesc.getCPtr(templat), templat, idx, PXCSession.ImplDesc.getCPtr(desc), desc));
  }

  public pxcStatus CreateImpl(PXCSession.ImplDesc desc, int iuid, int cuid, SWIGTYPE_p_p_void instance) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_CreateImpl__SWIG_0(swigCPtr, this, PXCSession.ImplDesc.getCPtr(desc), desc, iuid, cuid, SWIGTYPE_p_p_void.getCPtr(instance)));
  }

  public pxcStatus CreateImpl(PXCSession.ImplDesc desc, int cuid, SWIGTYPE_p_p_void instance) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_CreateImpl__SWIG_1(swigCPtr, this, PXCSession.ImplDesc.getCPtr(desc), desc, cuid, SWIGTYPE_p_p_void.getCPtr(instance)));
  }

  public pxcStatus CreateImpl(int cuid, SWIGTYPE_p_p_void instance) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_CreateImpl__SWIG_2(swigCPtr, this, cuid, SWIGTYPE_p_p_void.getCPtr(instance)));
  }

  public PXCSenseManager CreateSenseManager() {
    long cPtr = realsenseJNI.PXCSession_CreateSenseManager(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCSenseManager(cPtr, false);
  }

  public PXCCaptureManager CreateCaptureManager() {
    long cPtr = realsenseJNI.PXCSession_CreateCaptureManager(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCCaptureManager(cPtr, false);
  }

  public PXCAudioSource CreateAudioSource() {
    long cPtr = realsenseJNI.PXCSession_CreateAudioSource(swigCPtr, this);
    return (cPtr == 0) ? null : new PXCAudioSource(cPtr, false);
  }

  public pxcStatus QueryModuleDesc(PXCBase module, PXCSession.ImplDesc desc) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_QueryModuleDesc(swigCPtr, this, PXCBase.getCPtr(module), module, PXCSession.ImplDesc.getCPtr(desc), desc));
  }

  public PXCImage CreateImage(PXCImage.ImageInfo info, PXCImage.ImageData data) {
    long cPtr = realsenseJNI.PXCSession_CreateImage__SWIG_0(swigCPtr, this, PXCImage.ImageInfo.getCPtr(info), info, PXCImage.ImageData.getCPtr(data), data);
    return (cPtr == 0) ? null : new PXCImage(cPtr, false);
  }

  public PXCImage CreateImage(PXCImage.ImageInfo info) {
    long cPtr = realsenseJNI.PXCSession_CreateImage__SWIG_1(swigCPtr, this, PXCImage.ImageInfo.getCPtr(info), info);
    return (cPtr == 0) ? null : new PXCImage(cPtr, false);
  }

  public PXCAudio CreateAudio(PXCAudio.AudioInfo info, PXCAudio.AudioData data) {
    long cPtr = realsenseJNI.PXCSession_CreateAudio__SWIG_0(swigCPtr, this, PXCAudio.AudioInfo.getCPtr(info), info, PXCAudio.AudioData.getCPtr(data), data);
    return (cPtr == 0) ? null : new PXCAudio(cPtr, false);
  }

  public PXCAudio CreateAudio(PXCAudio.AudioInfo info) {
    long cPtr = realsenseJNI.PXCSession_CreateAudio__SWIG_1(swigCPtr, this, PXCAudio.AudioInfo.getCPtr(info), info);
    return (cPtr == 0) ? null : new PXCAudio(cPtr, false);
  }

  public pxcStatus LoadImplFromFile(SWIGTYPE_p_wchar_t moduleName) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_LoadImplFromFile(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(moduleName)));
  }

  public pxcStatus UnloadImplFromFile(SWIGTYPE_p_wchar_t moduleName) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSession_UnloadImplFromFile(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(moduleName)));
  }

  public static PXCSession CreateInstance() {
    long cPtr = realsenseJNI.PXCSession_CreateInstance();
    return (cPtr == 0) ? null : new PXCSession(cPtr, false);
  }

  public final static class ImplGroup {
    public final static PXCSession.ImplGroup IMPL_GROUP_ANY = new PXCSession.ImplGroup("IMPL_GROUP_ANY", realsenseJNI.PXCSession_IMPL_GROUP_ANY_get());
    public final static PXCSession.ImplGroup IMPL_GROUP_OBJECT_RECOGNITION = new PXCSession.ImplGroup("IMPL_GROUP_OBJECT_RECOGNITION", realsenseJNI.PXCSession_IMPL_GROUP_OBJECT_RECOGNITION_get());
    public final static PXCSession.ImplGroup IMPL_GROUP_SPEECH_RECOGNITION = new PXCSession.ImplGroup("IMPL_GROUP_SPEECH_RECOGNITION", realsenseJNI.PXCSession_IMPL_GROUP_SPEECH_RECOGNITION_get());
    public final static PXCSession.ImplGroup IMPL_GROUP_SENSOR = new PXCSession.ImplGroup("IMPL_GROUP_SENSOR", realsenseJNI.PXCSession_IMPL_GROUP_SENSOR_get());
    public final static PXCSession.ImplGroup IMPL_GROUP_CORE = new PXCSession.ImplGroup("IMPL_GROUP_CORE", realsenseJNI.PXCSession_IMPL_GROUP_CORE_get());
    public final static PXCSession.ImplGroup IMPL_GROUP_USER = new PXCSession.ImplGroup("IMPL_GROUP_USER", realsenseJNI.PXCSession_IMPL_GROUP_USER_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ImplGroup swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ImplGroup.class + " with value " + swigValue);
    }

    private ImplGroup(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ImplGroup(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ImplGroup(String swigName, ImplGroup swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ImplGroup[] swigValues = { IMPL_GROUP_ANY, IMPL_GROUP_OBJECT_RECOGNITION, IMPL_GROUP_SPEECH_RECOGNITION, IMPL_GROUP_SENSOR, IMPL_GROUP_CORE, IMPL_GROUP_USER };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class ImplSubgroup {
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_ANY = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_ANY", realsenseJNI.PXCSession_IMPL_SUBGROUP_ANY_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_FACE_ANALYSIS = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_FACE_ANALYSIS", realsenseJNI.PXCSession_IMPL_SUBGROUP_FACE_ANALYSIS_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_GESTURE_RECOGNITION = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_GESTURE_RECOGNITION", realsenseJNI.PXCSession_IMPL_SUBGROUP_GESTURE_RECOGNITION_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_SEGMENTATION = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_SEGMENTATION", realsenseJNI.PXCSession_IMPL_SUBGROUP_SEGMENTATION_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_PULSE_ESTIMATION = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_PULSE_ESTIMATION", realsenseJNI.PXCSession_IMPL_SUBGROUP_PULSE_ESTIMATION_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_EMOTION_RECOGNITION = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_EMOTION_RECOGNITION", realsenseJNI.PXCSession_IMPL_SUBGROUP_EMOTION_RECOGNITION_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_OBJECT_TRACKING = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_OBJECT_TRACKING", realsenseJNI.PXCSession_IMPL_SUBGROUP_OBJECT_TRACKING_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_3DSEG = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_3DSEG", realsenseJNI.PXCSession_IMPL_SUBGROUP_3DSEG_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_3DSCAN = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_3DSCAN", realsenseJNI.PXCSession_IMPL_SUBGROUP_3DSCAN_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_AUDIO_CAPTURE = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_AUDIO_CAPTURE", realsenseJNI.PXCSession_IMPL_SUBGROUP_AUDIO_CAPTURE_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_VIDEO_CAPTURE = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_VIDEO_CAPTURE", realsenseJNI.PXCSession_IMPL_SUBGROUP_VIDEO_CAPTURE_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_SPEECH_RECOGNITION = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_SPEECH_RECOGNITION", realsenseJNI.PXCSession_IMPL_SUBGROUP_SPEECH_RECOGNITION_get());
    public final static PXCSession.ImplSubgroup IMPL_SUBGROUP_SPEECH_SYNTHESIS = new PXCSession.ImplSubgroup("IMPL_SUBGROUP_SPEECH_SYNTHESIS", realsenseJNI.PXCSession_IMPL_SUBGROUP_SPEECH_SYNTHESIS_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ImplSubgroup swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ImplSubgroup.class + " with value " + swigValue);
    }

    private ImplSubgroup(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ImplSubgroup(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ImplSubgroup(String swigName, ImplSubgroup swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ImplSubgroup[] swigValues = { IMPL_SUBGROUP_ANY, IMPL_SUBGROUP_FACE_ANALYSIS, IMPL_SUBGROUP_GESTURE_RECOGNITION, IMPL_SUBGROUP_SEGMENTATION, IMPL_SUBGROUP_PULSE_ESTIMATION, IMPL_SUBGROUP_EMOTION_RECOGNITION, IMPL_SUBGROUP_OBJECT_TRACKING, IMPL_SUBGROUP_3DSEG, IMPL_SUBGROUP_3DSCAN, IMPL_SUBGROUP_AUDIO_CAPTURE, IMPL_SUBGROUP_VIDEO_CAPTURE, IMPL_SUBGROUP_SPEECH_RECOGNITION, IMPL_SUBGROUP_SPEECH_SYNTHESIS };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
