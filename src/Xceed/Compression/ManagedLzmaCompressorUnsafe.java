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
import Xceed.Compression.Coder.*;
import Xceed.Compression.*;
import jio.System.*;
import Xceed.Compression.LZMA.*;

public class ManagedLzmaCompressorUnsafe extends CoderCompressor
    implements IDisposable, IManagedLzmaCompressor {
  protected NObject javonetHandle;

  public ManagedLzmaCompressorUnsafe() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.ManagedLzmaCompressorUnsafe");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaCompressorUnsafe(CompressionLevel compressionLevel) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedLzmaCompressorUnsafe",
              NEnum.fromJavaEnum(compressionLevel));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaCompressorUnsafe(CompressionLevel compressionLevel, LZMAHeaderType headerType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedLzmaCompressorUnsafe",
              NEnum.fromJavaEnum(compressionLevel),
              NEnum.fromJavaEnum(headerType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaCompressorUnsafe(LZMAOptions options, LZMAHeaderType headerType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedLzmaCompressorUnsafe",
              options,
              NEnum.fromJavaEnum(headerType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaCompressorUnsafe(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] WriteLZMAProperties(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Xceed.Compression.LZMA.IManagedLzmaCompressor")
              .invoke("WriteLZMAProperties");
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
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
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
