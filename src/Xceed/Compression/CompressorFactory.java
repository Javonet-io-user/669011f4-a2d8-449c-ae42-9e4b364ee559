package Xceed.Compression;

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
import Xceed.Compression.*;
import Xceed.Compression.LZMA.*;

public class CompressorFactory {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Compressor CreateLzmaCompressor() {
    try {
      Object res =
          Javonet.getType("Xceed.Compression.CompressorFactory").invoke("CreateLzmaCompressor");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Compressor CreateLzmaCompressor(CompressionLevel compressionLevel) {
    try {
      Object res =
          Javonet.getType("Xceed.Compression.CompressorFactory")
              .invoke("CreateLzmaCompressor", NEnum.fromJavaEnum(compressionLevel));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Compressor CreateLzmaCompressor(
      CompressionLevel compressionLevel, LZMAHeaderType headerType) {
    try {
      Object res =
          Javonet.getType("Xceed.Compression.CompressorFactory")
              .invoke(
                  "CreateLzmaCompressor",
                  NEnum.fromJavaEnum(compressionLevel),
                  NEnum.fromJavaEnum(headerType));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Compressor CreateLzmaCompressor(LZMAOptions options, LZMAHeaderType headerType) {
    try {
      Object res =
          Javonet.getType("Xceed.Compression.CompressorFactory")
              .invoke("CreateLzmaCompressor", options, NEnum.fromJavaEnum(headerType));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
