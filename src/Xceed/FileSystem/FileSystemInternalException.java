package Xceed.FileSystem;

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
import Xceed.FileSystem.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class FileSystemInternalException extends FileSystemException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public FileSystemInternalException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(FileSystemItem item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException", item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(java.lang.String message, FileSystemItem item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException", message, item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException", inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(FileSystemItem item, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException", item, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(java.lang.String message, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemInternalException", message, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(
      java.lang.String message, FileSystemItem item, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Xceed.FileSystem.FileSystemInternalException", message, item, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemInternalException(NObject handle) {
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
