/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCAudio extends PXCBase {
  private long swigCPtr;

  protected PXCAudio(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCAudio_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCAudio obj) {
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

  public static SWIGTYPE_p_wchar_t AudioFormatToString(PXCAudio.AudioFormat format) {
    long cPtr = realsenseJNI.PXCAudio_AudioFormatToString(format.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public static int AudioFormatToSize(PXCAudio.AudioFormat format) {
    return realsenseJNI.PXCAudio_AudioFormatToSize(format.swigValue());
  }

  static public class AudioInfo {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected AudioInfo(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(AudioInfo obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCAudio_AudioInfo(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setBufferSize(int value) {
      realsenseJNI.PXCAudio_AudioInfo_bufferSize_set(swigCPtr, this, value);
    }
  
    public int getBufferSize() {
      return realsenseJNI.PXCAudio_AudioInfo_bufferSize_get(swigCPtr, this);
    }
  
    public void setFormat(PXCAudio.AudioFormat value) {
      realsenseJNI.PXCAudio_AudioInfo_format_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCAudio.AudioFormat getFormat() {
      return PXCAudio.AudioFormat.swigToEnum(realsenseJNI.PXCAudio_AudioInfo_format_get(swigCPtr, this));
    }
  
    public void setSampleRate(int value) {
      realsenseJNI.PXCAudio_AudioInfo_sampleRate_set(swigCPtr, this, value);
    }
  
    public int getSampleRate() {
      return realsenseJNI.PXCAudio_AudioInfo_sampleRate_get(swigCPtr, this);
    }
  
    public void setNchannels(int value) {
      realsenseJNI.PXCAudio_AudioInfo_nchannels_set(swigCPtr, this, value);
    }
  
    public int getNchannels() {
      return realsenseJNI.PXCAudio_AudioInfo_nchannels_get(swigCPtr, this);
    }
  
    public void setChannelMask(PXCAudio.ChannelMask value) {
      realsenseJNI.PXCAudio_AudioInfo_channelMask_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCAudio.ChannelMask getChannelMask() {
      return PXCAudio.ChannelMask.swigToEnum(realsenseJNI.PXCAudio_AudioInfo_channelMask_get(swigCPtr, this));
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCAudio_AudioInfo_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCAudio_AudioInfo_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public AudioInfo() {
      this(realsenseJNI.new_PXCAudio_AudioInfo(), true);
    }
  
  }

  static public class AudioData {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected AudioData(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(AudioData obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCAudio_AudioData(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setFormat(PXCAudio.AudioFormat value) {
      realsenseJNI.PXCAudio_AudioData_format_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCAudio.AudioFormat getFormat() {
      return PXCAudio.AudioFormat.swigToEnum(realsenseJNI.PXCAudio_AudioData_format_get(swigCPtr, this));
    }
  
    public void setDataSize(int value) {
      realsenseJNI.PXCAudio_AudioData_dataSize_set(swigCPtr, this, value);
    }
  
    public int getDataSize() {
      return realsenseJNI.PXCAudio_AudioData_dataSize_get(swigCPtr, this);
    }
  
    public void setDataPtr(SWIGTYPE_p_unsigned_char value) {
      realsenseJNI.PXCAudio_AudioData_dataPtr_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_char getDataPtr() {
      long cPtr = realsenseJNI.PXCAudio_AudioData_dataPtr_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
    }
  
    public AudioData() {
      this(realsenseJNI.new_PXCAudio_AudioData(), true);
    }
  
  }

  public PXCAudio.AudioInfo QueryInfo() {
    return new PXCAudio.AudioInfo(realsenseJNI.PXCAudio_QueryInfo(swigCPtr, this), true);
  }

  public SWIGTYPE_p___int64 QueryTimeStamp() {
    return new SWIGTYPE_p___int64(realsenseJNI.PXCAudio_QueryTimeStamp(swigCPtr, this), true);
  }

  public PXCAudio.Option QueryOptions() {
    return PXCAudio.Option.swigToEnum(realsenseJNI.PXCAudio_QueryOptions(swigCPtr, this));
  }

  public void SetTimeStamp(SWIGTYPE_p___int64 ts) {
    realsenseJNI.PXCAudio_SetTimeStamp(swigCPtr, this, SWIGTYPE_p___int64.getCPtr(ts));
  }

  public void SetOptions(PXCAudio.Option options) {
    realsenseJNI.PXCAudio_SetOptions(swigCPtr, this, options.swigValue());
  }

  public pxcStatus CopyAudio(PXCAudio src_audio) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudio_CopyAudio(swigCPtr, this, PXCAudio.getCPtr(src_audio), src_audio));
  }

  public pxcStatus AcquireAccess(PXCAudio.Access access, PXCAudio.AudioFormat format, int options, PXCAudio.AudioData data) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudio_AcquireAccess__SWIG_0(swigCPtr, this, access.swigValue(), format.swigValue(), options, PXCAudio.AudioData.getCPtr(data), data));
  }

  public pxcStatus AcquireAccess(PXCAudio.Access access, PXCAudio.AudioFormat format, PXCAudio.AudioData data) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudio_AcquireAccess__SWIG_1(swigCPtr, this, access.swigValue(), format.swigValue(), PXCAudio.AudioData.getCPtr(data), data));
  }

  public pxcStatus AcquireAccess(PXCAudio.Access access, PXCAudio.AudioData data) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudio_AcquireAccess__SWIG_2(swigCPtr, this, access.swigValue(), PXCAudio.AudioData.getCPtr(data), data));
  }

  public pxcStatus ReleaseAccess(PXCAudio.AudioData data) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCAudio_ReleaseAccess(swigCPtr, this, PXCAudio.AudioData.getCPtr(data), data));
  }

  public void AddRef() {
    realsenseJNI.PXCAudio_AddRef(swigCPtr, this);
  }

  public final static class AudioFormat {
    public final static PXCAudio.AudioFormat AUDIO_FORMAT_PCM = new PXCAudio.AudioFormat("AUDIO_FORMAT_PCM", realsenseJNI.PXCAudio_AUDIO_FORMAT_PCM_get());
    public final static PXCAudio.AudioFormat AUDIO_FORMAT_IEEE_FLOAT = new PXCAudio.AudioFormat("AUDIO_FORMAT_IEEE_FLOAT", realsenseJNI.PXCAudio_AUDIO_FORMAT_IEEE_FLOAT_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AudioFormat swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AudioFormat.class + " with value " + swigValue);
    }

    private AudioFormat(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AudioFormat(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AudioFormat(String swigName, AudioFormat swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AudioFormat[] swigValues = { AUDIO_FORMAT_PCM, AUDIO_FORMAT_IEEE_FLOAT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class ChannelMask {
    public final static PXCAudio.ChannelMask CHANNEL_MASK_FRONT_LEFT = new PXCAudio.ChannelMask("CHANNEL_MASK_FRONT_LEFT", realsenseJNI.PXCAudio_CHANNEL_MASK_FRONT_LEFT_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_FRONT_RIGHT = new PXCAudio.ChannelMask("CHANNEL_MASK_FRONT_RIGHT", realsenseJNI.PXCAudio_CHANNEL_MASK_FRONT_RIGHT_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_FRONT_CENTER = new PXCAudio.ChannelMask("CHANNEL_MASK_FRONT_CENTER", realsenseJNI.PXCAudio_CHANNEL_MASK_FRONT_CENTER_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_LOW_FREQUENCY = new PXCAudio.ChannelMask("CHANNEL_MASK_LOW_FREQUENCY", realsenseJNI.PXCAudio_CHANNEL_MASK_LOW_FREQUENCY_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_BACK_LEFT = new PXCAudio.ChannelMask("CHANNEL_MASK_BACK_LEFT", realsenseJNI.PXCAudio_CHANNEL_MASK_BACK_LEFT_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_BACK_RIGHT = new PXCAudio.ChannelMask("CHANNEL_MASK_BACK_RIGHT", realsenseJNI.PXCAudio_CHANNEL_MASK_BACK_RIGHT_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_SIDE_LEFT = new PXCAudio.ChannelMask("CHANNEL_MASK_SIDE_LEFT", realsenseJNI.PXCAudio_CHANNEL_MASK_SIDE_LEFT_get());
    public final static PXCAudio.ChannelMask CHANNEL_MASK_SIDE_RIGHT = new PXCAudio.ChannelMask("CHANNEL_MASK_SIDE_RIGHT", realsenseJNI.PXCAudio_CHANNEL_MASK_SIDE_RIGHT_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ChannelMask swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ChannelMask.class + " with value " + swigValue);
    }

    private ChannelMask(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ChannelMask(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ChannelMask(String swigName, ChannelMask swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ChannelMask[] swigValues = { CHANNEL_MASK_FRONT_LEFT, CHANNEL_MASK_FRONT_RIGHT, CHANNEL_MASK_FRONT_CENTER, CHANNEL_MASK_LOW_FREQUENCY, CHANNEL_MASK_BACK_LEFT, CHANNEL_MASK_BACK_RIGHT, CHANNEL_MASK_SIDE_LEFT, CHANNEL_MASK_SIDE_RIGHT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class Access {
    public final static PXCAudio.Access ACCESS_READ = new PXCAudio.Access("ACCESS_READ", realsenseJNI.PXCAudio_ACCESS_READ_get());
    public final static PXCAudio.Access ACCESS_WRITE = new PXCAudio.Access("ACCESS_WRITE", realsenseJNI.PXCAudio_ACCESS_WRITE_get());
    public final static PXCAudio.Access ACCESS_READ_WRITE = new PXCAudio.Access("ACCESS_READ_WRITE", realsenseJNI.PXCAudio_ACCESS_READ_WRITE_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Access swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Access.class + " with value " + swigValue);
    }

    private Access(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Access(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Access(String swigName, Access swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Access[] swigValues = { ACCESS_READ, ACCESS_WRITE, ACCESS_READ_WRITE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class Option {
    public final static PXCAudio.Option OPTION_ANY = new PXCAudio.Option("OPTION_ANY", realsenseJNI.PXCAudio_OPTION_ANY_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Option swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Option.class + " with value " + swigValue);
    }

    private Option(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Option(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Option(String swigName, Option swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Option[] swigValues = { OPTION_ANY };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
