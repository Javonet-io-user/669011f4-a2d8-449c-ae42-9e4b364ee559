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

public class ManagedLzmaDecompressorUnsafe extends CoderDecompressor
    implements IDisposable, IManagedLzmaDecompressor {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setHeaderType(LZMAHeaderType value) {
    try {
      javonetHandle.set("HeaderType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LZMAHeaderType getHeaderType() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Xceed.Compression.LZMA.IManagedLzmaDecompressor")
              .invoke("get_HeaderType");
      if (res == null) return null;
      return LZMAHeaderType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ManagedLzmaDecompressorUnsafe() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.ManagedLzmaDecompressorUnsafe");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaDecompressorUnsafe(LZMAHeaderType headerType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedLzmaDecompressorUnsafe", NEnum.fromJavaEnum(headerType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaDecompressorUnsafe(
      java.lang.Long compressedSize, java.lang.Long uncompressedSize, LZMAHeaderType headerType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.ManagedLzmaDecompressorUnsafe",
              compressedSize,
              uncompressedSize,
              NEnum.fromJavaEnum(headerType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ManagedLzmaDecompressorUnsafe(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetLZMAProperties(java.lang.Byte[] properties) {
    try {
      javonetHandle
          .explicitInterface("Xceed.Compression.LZMA.IManagedLzmaDecompressor")
          .invoke("SetLZMAProperties", new Object[] {properties});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetLZMAProperties(
      java.lang.Byte[] properties, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("SetLZMAProperties", new Object[] {properties}, offset, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
