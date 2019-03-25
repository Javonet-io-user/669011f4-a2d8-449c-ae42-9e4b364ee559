package Xceed.Compression.LZMA;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Xceed.Compression.LZMA.*;
import Xceed.Compression.*;
import jio.System.*;

public class LZMAOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDictionarySize(java.lang.Integer value) {
    try {
      javonetHandle.set("DictionarySize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDictionarySize() {
    try {
      java.lang.Integer res = javonetHandle.get("DictionarySize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumPositionBits(java.lang.Byte value) {
    try {
      javonetHandle.set("NumPositionBits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getNumPositionBits() {
    try {
      java.lang.Byte res = javonetHandle.get("NumPositionBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumLiteralContextBits(java.lang.Byte value) {
    try {
      javonetHandle.set("NumLiteralContextBits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getNumLiteralContextBits() {
    try {
      java.lang.Byte res = javonetHandle.get("NumLiteralContextBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumLiteralPositionBits(java.lang.Byte value) {
    try {
      javonetHandle.set("NumLiteralPositionBits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getNumLiteralPositionBits() {
    try {
      java.lang.Byte res = javonetHandle.get("NumLiteralPositionBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumFastBytes(java.lang.Integer value) {
    try {
      javonetHandle.set("NumFastBytes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumFastBytes() {
    try {
      java.lang.Integer res = javonetHandle.get("NumFastBytes");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMatchFinder(MatchFinder value) {
    try {
      javonetHandle.set("MatchFinder", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MatchFinder getMatchFinder() {
    try {
      Object res = javonetHandle.<NEnum>get("MatchFinder");
      if (res == null) return null;
      return MatchFinder.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseEndOfStreamMarker(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseEndOfStreamMarker", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseEndOfStreamMarker() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseEndOfStreamMarker");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.reflect.Array getPropertyIDs() {
    try {
      Object res = javonetHandle.<NObject>get("PropertyIDs");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object[] getProperties(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Properties");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LZMAOptions() {
    try {
      javonetHandle = Javonet.New("Xceed.Compression.LZMA.LZMAOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LZMAOptions(CompressionLevel level) {
    try {
      javonetHandle = Javonet.New("Xceed.Compression.LZMA.LZMAOptions", NEnum.fromJavaEnum(level));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LZMAOptions(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetTemplate(CompressionLevel compressionLevel) {
    try {
      javonetHandle.invoke("SetTemplate", NEnum.fromJavaEnum(compressionLevel));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
