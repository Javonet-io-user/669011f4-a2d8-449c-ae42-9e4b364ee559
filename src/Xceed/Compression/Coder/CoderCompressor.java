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

public abstract class CoderCompressor extends Compressor implements IDisposable {
  protected NObject javonetHandle;

  public CoderCompressor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.Coder.CoderCompressor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CoderCompressor(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
