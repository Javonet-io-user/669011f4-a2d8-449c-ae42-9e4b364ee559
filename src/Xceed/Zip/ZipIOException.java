package Xceed.Zip;

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
import Xceed.Zip.*;
import Xceed.FileSystem.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class ZipIOException extends ZipException implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public ZipIOException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipIOException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipIOException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipIOException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipIOException(AbstractFile zipFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipIOException", zipFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipIOException(java.lang.String message, AbstractFile zipFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipIOException", message, zipFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipIOException(AbstractFile zipFile, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipIOException", zipFile, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipIOException(
      java.lang.String message, AbstractFile zipFile, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipIOException", message, zipFile, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipIOException(NObject handle) {
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
