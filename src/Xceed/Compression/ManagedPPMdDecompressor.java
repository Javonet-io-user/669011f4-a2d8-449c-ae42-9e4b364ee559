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
import jio.System.IO.*;
import Xceed.Compression.PPMd.*;
import jio.System.*;

public class ManagedPPMdDecompressor extends Decompressor implements IDisposable {
  protected NObject javonetHandle;

  public ManagedPPMdDecompressor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.ManagedPPMdDecompressor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedPPMdDecompressor(
      java.lang.Integer allocatorSize, java.lang.Byte modelOrder, ModelRestorationMethod method) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedPPMdDecompressor",
              allocatorSize,
              modelOrder,
              NEnum.fromJavaEnum(method));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedPPMdDecompressor(NObject handle) {
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
  public static java.lang.Boolean ReadPPMdZipHeader(
      Stream stream,
      AtomicReference<java.lang.Integer> allocatorSize,
      AtomicReference<java.lang.Byte> modelOrder,
      ModelRestorationMethod method) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Xceed.Compression.ManagedPPMdDecompressor")
              .invoke(
                  "ReadPPMdZipHeader",
                  stream,
                  new NOut(
                      allocatorSize, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
                  new NOut(modelOrder, JavonetHelper.JavaToDotnetType.get(java.lang.Byte.class)),
                  NEnum.fromJavaEnum(method));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Decompress(
      java.lang.Byte[] buffer,
      java.lang.Integer offset,
      java.lang.Integer count,
      AtomicReference<java.lang.Boolean> endOfData,
      AtomicReference<java.lang.Byte[]> decompressed,
      AtomicReference<java.lang.Integer> remaining) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "Decompress",
              new Object[] {buffer},
              offset,
              count,
              new NRef(endOfData),
              new NOut(decompressed, JavonetHelper.JavaToDotnetType.get(java.lang.Byte[].class)),
              new NOut(remaining, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ManagedPPMdDecompressor___Decompress(
      Stream compressedStream,
      Stream decompressedStream,
      AtomicReference<java.lang.Boolean> endOfData) {
    try {
      javonetHandle.invoke("Decompress", compressedStream, decompressedStream, new NRef(endOfData));
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
