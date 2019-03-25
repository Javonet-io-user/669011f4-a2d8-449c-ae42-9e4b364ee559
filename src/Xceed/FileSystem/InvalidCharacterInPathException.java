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

public class InvalidCharacterInPathException extends FileSystemException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setPath(java.lang.String value) {
    try {
      javonetHandle.set("Path", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPath() {
    try {
      java.lang.String res = javonetHandle.get("Path");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInvalidChars(java.lang.Character[] value) {
    try {
      javonetHandle.set("InvalidChars", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character[] getInvalidChars(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("InvalidChars");
      if (res == null) return null;
      return (java.lang.Character[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getInvalidChar() {
    try {
      java.lang.Character res = javonetHandle.get("InvalidChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInvalidCharIndex(java.lang.Integer value) {
    try {
      javonetHandle.set("InvalidCharIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getInvalidCharIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("InvalidCharIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public InvalidCharacterInPathException(
      java.lang.String path,
      java.lang.Integer invalidCharIndex,
      java.lang.Character[] invalidChars,
      FileSystemItem item) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.InvalidCharacterInPathException",
              path,
              invalidCharIndex,
              new Object[] {invalidChars},
              item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidCharacterInPathException(
      java.lang.String path,
      java.lang.Integer invalidCharIndex,
      java.lang.Character[] invalidChars,
      FileSystemItem item,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.InvalidCharacterInPathException",
              path,
              invalidCharIndex,
              new Object[] {invalidChars},
              item,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidCharacterInPathException(
      java.lang.String path,
      java.lang.Integer invalidCharIndex,
      java.lang.Character[] invalidChars,
      java.lang.String message,
      FileSystemItem item,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.InvalidCharacterInPathException",
              path,
              invalidCharIndex,
              new Object[] {invalidChars},
              message,
              item,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidCharacterInPathException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DefaultMessage(
      java.lang.String path, java.lang.Integer invalidCharIndex, FileSystemItem item) {
    try {
      java.lang.String res =
          Javonet.getType("Xceed.FileSystem.InvalidCharacterInPathException")
              .invoke("DefaultMessage", path, invalidCharIndex, item);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
