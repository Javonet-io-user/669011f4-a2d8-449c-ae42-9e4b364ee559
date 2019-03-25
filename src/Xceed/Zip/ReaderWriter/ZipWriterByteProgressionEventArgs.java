package Xceed.Zip.ReaderWriter;

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
import jio.System.*;
import Xceed.Zip.ReaderWriter.*;

public class ZipWriterByteProgressionEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getBytesProcessed() {
    try {
      java.lang.Long res = javonetHandle.get("BytesProcessed");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ZipItemLocalHeader getZipItemLocalHeader() {
    try {
      Object res = javonetHandle.<NObject>get("ZipItemLocalHeader");
      if (res == null) return null;
      return new ZipItemLocalHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ZipWriterByteProgressionEventArgs(
      ZipItemLocalHeader zipItemLocalHeader, java.lang.Long bytesProcessed) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Zip.ReaderWriter.ZipWriterByteProgressionEventArgs",
              zipItemLocalHeader,
              bytesProcessed);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriterByteProgressionEventArgs(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
