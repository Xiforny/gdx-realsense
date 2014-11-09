/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.realsense;

public class PXCSpeechSynthesis extends PXCBase {
  private long swigCPtr;

  protected PXCSpeechSynthesis(long cPtr, boolean cMemoryOwn) {
    super(realsenseJNI.PXCSpeechSynthesis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PXCSpeechSynthesis obj) {
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

  static public class ProfileInfo {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ProfileInfo(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ProfileInfo obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          realsenseJNI.delete_PXCSpeechSynthesis_ProfileInfo(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setOutputs(PXCAudio.AudioInfo value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_outputs_set(swigCPtr, this, PXCAudio.AudioInfo.getCPtr(value), value);
    }
  
    public PXCAudio.AudioInfo getOutputs() {
      long cPtr = realsenseJNI.PXCSpeechSynthesis_ProfileInfo_outputs_get(swigCPtr, this);
      return (cPtr == 0) ? null : new PXCAudio.AudioInfo(cPtr, false);
    }
  
    public void setLanguage(PXCSpeechSynthesis.LanguageType value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_language_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCSpeechSynthesis.LanguageType getLanguage() {
      return PXCSpeechSynthesis.LanguageType.swigToEnum(realsenseJNI.PXCSpeechSynthesis_ProfileInfo_language_get(swigCPtr, this));
    }
  
    public void setVoice(PXCSpeechSynthesis.VoiceType value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_voice_set(swigCPtr, this, value.swigValue());
    }
  
    public PXCSpeechSynthesis.VoiceType getVoice() {
      return PXCSpeechSynthesis.VoiceType.swigToEnum(realsenseJNI.PXCSpeechSynthesis_ProfileInfo_voice_get(swigCPtr, this));
    }
  
    public void setRate(float value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_rate_set(swigCPtr, this, value);
    }
  
    public float getRate() {
      return realsenseJNI.PXCSpeechSynthesis_ProfileInfo_rate_get(swigCPtr, this);
    }
  
    public void setVolume(int value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_volume_set(swigCPtr, this, value);
    }
  
    public int getVolume() {
      return realsenseJNI.PXCSpeechSynthesis_ProfileInfo_volume_get(swigCPtr, this);
    }
  
    public void setPitch(int value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_pitch_set(swigCPtr, this, value);
    }
  
    public int getPitch() {
      return realsenseJNI.PXCSpeechSynthesis_ProfileInfo_pitch_get(swigCPtr, this);
    }
  
    public void setEosPauseDuration(int value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_eosPauseDuration_set(swigCPtr, this, value);
    }
  
    public int getEosPauseDuration() {
      return realsenseJNI.PXCSpeechSynthesis_ProfileInfo_eosPauseDuration_get(swigCPtr, this);
    }
  
    public void setReserved(SWIGTYPE_p_int value) {
      realsenseJNI.PXCSpeechSynthesis_ProfileInfo_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
    }
  
    public SWIGTYPE_p_int getReserved() {
      long cPtr = realsenseJNI.PXCSpeechSynthesis_ProfileInfo_reserved_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
    }
  
    public ProfileInfo() {
      this(realsenseJNI.new_PXCSpeechSynthesis_ProfileInfo(), true);
    }
  
  }

  public pxcStatus QueryProfile(int pidx, PXCSpeechSynthesis.ProfileInfo pinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSpeechSynthesis_QueryProfile__SWIG_0(swigCPtr, this, pidx, PXCSpeechSynthesis.ProfileInfo.getCPtr(pinfo), pinfo));
  }

  public pxcStatus QueryProfile(PXCSpeechSynthesis.ProfileInfo pinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSpeechSynthesis_QueryProfile__SWIG_1(swigCPtr, this, PXCSpeechSynthesis.ProfileInfo.getCPtr(pinfo), pinfo));
  }

  public pxcStatus SetProfile(PXCSpeechSynthesis.ProfileInfo pinfo) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSpeechSynthesis_SetProfile(swigCPtr, this, PXCSpeechSynthesis.ProfileInfo.getCPtr(pinfo), pinfo));
  }

  public pxcStatus BuildSentence(int sid, SWIGTYPE_p_wchar_t sentence) {
    return pxcStatus.swigToEnum(realsenseJNI.PXCSpeechSynthesis_BuildSentence(swigCPtr, this, sid, SWIGTYPE_p_wchar_t.getCPtr(sentence)));
  }

  public PXCAudio QueryBuffer(int sid, int idx) {
    long cPtr = realsenseJNI.PXCSpeechSynthesis_QueryBuffer(swigCPtr, this, sid, idx);
    return (cPtr == 0) ? null : new PXCAudio(cPtr, false);
  }

  public int QueryBufferNum(int sid) {
    return realsenseJNI.PXCSpeechSynthesis_QueryBufferNum(swigCPtr, this, sid);
  }

  public int QuerySampleNum(int sid) {
    return realsenseJNI.PXCSpeechSynthesis_QuerySampleNum(swigCPtr, this, sid);
  }

  public void ReleaseSentence(int sid) {
    realsenseJNI.PXCSpeechSynthesis_ReleaseSentence(swigCPtr, this, sid);
  }

  public final static class LanguageType {
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_US_ENGLISH = new PXCSpeechSynthesis.LanguageType("LANGUAGE_US_ENGLISH", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_US_ENGLISH_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_GB_ENGLISH = new PXCSpeechSynthesis.LanguageType("LANGUAGE_GB_ENGLISH", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_GB_ENGLISH_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_DE_GERMAN = new PXCSpeechSynthesis.LanguageType("LANGUAGE_DE_GERMAN", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_DE_GERMAN_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_US_SPANISH = new PXCSpeechSynthesis.LanguageType("LANGUAGE_US_SPANISH", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_US_SPANISH_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_FR_FRENCH = new PXCSpeechSynthesis.LanguageType("LANGUAGE_FR_FRENCH", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_FR_FRENCH_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_IT_ITALIAN = new PXCSpeechSynthesis.LanguageType("LANGUAGE_IT_ITALIAN", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_IT_ITALIAN_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_JP_JAPANESE = new PXCSpeechSynthesis.LanguageType("LANGUAGE_JP_JAPANESE", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_JP_JAPANESE_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_CN_CHINESE = new PXCSpeechSynthesis.LanguageType("LANGUAGE_CN_CHINESE", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_CN_CHINESE_get());
    public final static PXCSpeechSynthesis.LanguageType LANGUAGE_BR_PORTUGUESE = new PXCSpeechSynthesis.LanguageType("LANGUAGE_BR_PORTUGUESE", realsenseJNI.PXCSpeechSynthesis_LANGUAGE_BR_PORTUGUESE_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static LanguageType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + LanguageType.class + " with value " + swigValue);
    }

    private LanguageType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private LanguageType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private LanguageType(String swigName, LanguageType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static LanguageType[] swigValues = { LANGUAGE_US_ENGLISH, LANGUAGE_GB_ENGLISH, LANGUAGE_DE_GERMAN, LANGUAGE_US_SPANISH, LANGUAGE_FR_FRENCH, LANGUAGE_IT_ITALIAN, LANGUAGE_JP_JAPANESE, LANGUAGE_CN_CHINESE, LANGUAGE_BR_PORTUGUESE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class VoiceType {
    public final static PXCSpeechSynthesis.VoiceType VOICE_ANY = new PXCSpeechSynthesis.VoiceType("VOICE_ANY", realsenseJNI.PXCSpeechSynthesis_VOICE_ANY_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static VoiceType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + VoiceType.class + " with value " + swigValue);
    }

    private VoiceType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private VoiceType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private VoiceType(String swigName, VoiceType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static VoiceType[] swigValues = { VOICE_ANY };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
