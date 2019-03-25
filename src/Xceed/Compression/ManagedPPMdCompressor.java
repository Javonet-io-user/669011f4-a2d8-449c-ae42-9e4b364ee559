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
import Xceed.Compression.PPMd.*;
import jio.System.IO.*;
import jio.System.*;

public class ManagedPPMdCompressor extends Compressor implements IDisposable {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getMinModelOrder() {
    try {
      java.lang.Byte res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("MinModelOrder");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinModelOrder(java.lang.Byte param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("MinModelOrder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getDefaultModelOrder() {
    try {
      java.lang.Byte res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("DefaultModelOrder");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultModelOrder(java.lang.Byte param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("DefaultModelOrder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getMaxModelOrder() {
    try {
      java.lang.Byte res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("MaxModelOrder");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMaxModelOrder(java.lang.Byte param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("MaxModelOrder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMinAllocatorSize() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("MinAllocatorSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinAllocatorSize(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("MinAllocatorSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMaxAllocatorSize() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("MaxAllocatorSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMaxAllocatorSize(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("MaxAllocatorSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Byte getDefaultAllocatorSize() {
    try {
      java.lang.Byte res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("DefaultAllocatorSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultAllocatorSize(java.lang.Byte param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("DefaultAllocatorSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static ModelRestorationMethod getDefaultModelRestorationMethod() {
    try {
      Object res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor")
              .<NEnum>get("DefaultModelRestorationMethod");
      if (res == null) return null;
      return ModelRestorationMethod.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultModelRestorationMethod(ModelRestorationMethod param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor")
          .set("DefaultModelRestorationMethod", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSignature() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("Signature");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSignature(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("Signature", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Character getVariant() {
    try {
      java.lang.Character res =
          Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").get("Variant");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setVariant(java.lang.Character param) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor").set("Variant", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedPPMdCompressor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.ManagedPPMdCompressor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedPPMdCompressor(
      java.lang.Integer allocatorSize, java.lang.Byte modelOrder, ModelRestorationMethod method) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedPPMdCompressor",
              allocatorSize,
              modelOrder,
              NEnum.fromJavaEnum(method));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedPPMdCompressor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ComputePPMdOptions(
      CompressionLevel level,
      AtomicReference<java.lang.Integer> allocatorSize,
      AtomicReference<java.lang.Byte> modelOrder,
      ModelRestorationMethod method) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor")
          .invoke(
              "ComputePPMdOptions",
              NEnum.fromJavaEnum(level),
              new NOut(allocatorSize, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
              new NOut(modelOrder, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
              NEnum.fromJavaEnum(method));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WritePPMdZipHeader(
      Stream stream,
      java.lang.Integer allocatorSize,
      java.lang.Byte modelOrder,
      ModelRestorationMethod method) {
    try {
      Javonet.getType("Xceed.Compression.ManagedPPMdCompressor")
          .invoke(
              "WritePPMdZipHeader", stream, allocatorSize, modelOrder, NEnum.fromJavaEnum(method));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Compress(
      java.lang.Byte[] buffer,
      java.lang.Integer offset,
      java.lang.Integer count,
      java.lang.Boolean endOfData,
      AtomicReference<java.lang.Byte[]> compressed) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "Compress",
              new Object[] {buffer},
              offset,
              count,
              endOfData,
              new NOut(compressed, JavonetHelper.JavaToDotnetType.get(java.lang.Byte[].class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ManagedPPMdCompressor___Compress(
      java.lang.Byte[] buffer,
      java.lang.Integer offset,
      java.lang.Integer count,
      java.lang.Boolean endOfData,
      Stream compressed) {
    try {
      javonetHandle.invoke("Compress", new Object[] {buffer}, offset, count, endOfData, compressed);
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
