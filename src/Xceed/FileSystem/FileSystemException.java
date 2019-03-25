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
import jio.System.*;
import Xceed.FileSystem.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class FileSystemException extends ApplicationException implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMessage() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._Exception")
              .invoke("get_Message");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setItem(FileSystemItem value) {
    try {
      javonetHandle.set("Item", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileSystemItem getItem() {
    try {
      Object res = javonetHandle.<NObject>get("Item");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FileSystemException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemException(java.lang.String message, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemException", message, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemException(java.lang.String message, FileSystemItem item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemException", message, item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemException(
      java.lang.String message, FileSystemItem item, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemException", message, item, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemException(NObject handle) {
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
