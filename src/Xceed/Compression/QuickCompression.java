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

public class QuickCompression {
  protected NObject javonetHandle;

  public QuickCompression(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Compress(java.lang.Byte[] buffer, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke("Compress", new Object[] {buffer});
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Compress(
      java.lang.Byte[] buffer,
      CompressionMethod method,
      CompressionLevel level,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke(
                  "Compress",
                  new Object[] {buffer},
                  NEnum.fromJavaEnum(method),
                  NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Compress(
      java.lang.Byte[] buffer,
      java.lang.Integer offset,
      java.lang.Integer count,
      CompressionMethod method,
      CompressionLevel level,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke(
                  "Compress",
                  new Object[] {buffer},
                  offset,
                  count,
                  NEnum.fromJavaEnum(method),
                  NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Decompress(java.lang.Byte[] buffer, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke("Decompress", new Object[] {buffer});
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Decompress(
      java.lang.Byte[] buffer, CompressionMethod method, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke("Decompress", new Object[] {buffer}, NEnum.fromJavaEnum(method));
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Decompress(
      java.lang.Byte[] buffer,
      java.lang.Integer offset,
      java.lang.Integer count,
      CompressionMethod method,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke(
                  "Decompress", new Object[] {buffer}, offset, count, NEnum.fromJavaEnum(method));
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] Decompress(
      java.lang.Byte[] buffer,
      java.lang.Integer offset,
      java.lang.Integer count,
      CompressionMethod method,
      java.lang.Boolean enforceFormatIntegrity,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Compression.QuickCompression")
              .invoke(
                  "Decompress",
                  new Object[] {buffer},
                  offset,
                  count,
                  NEnum.fromJavaEnum(method),
                  enforceFormatIntegrity);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
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
