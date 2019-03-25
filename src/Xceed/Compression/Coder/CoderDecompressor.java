package Xceed.Compression.Coder;

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
import Xceed.Compression.Coder.*;
import jio.System.*;

public abstract class CoderDecompressor extends Decompressor implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getTotalSuppliedDataCount() {
    try {
      java.lang.Long res = javonetHandle.get("TotalSuppliedDataCount");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCompressedSize(java.lang.Long value) {
    try {
      javonetHandle.set("CompressedSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getCompressedSize() {
    try {
      java.lang.Long res = javonetHandle.get("CompressedSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUncompressedSize(java.lang.Long value) {
    try {
      javonetHandle.set("UncompressedSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getUncompressedSize() {
    try {
      java.lang.Long res = javonetHandle.get("UncompressedSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CoderDecompressor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.Coder.CoderDecompressor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoderDecompressor(java.lang.Long compressedSize, java.lang.Long uncompressedSize) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.Coder.CoderDecompressor", compressedSize, uncompressedSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoderDecompressor(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
