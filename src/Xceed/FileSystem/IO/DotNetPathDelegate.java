package Xceed.FileSystem.IO;

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
import Xceed.FileSystem.IO.*;

public class DotNetPathDelegate implements IPathDelegate {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getAltDirectorySeparatorChar() {
    try {
      java.lang.Character res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("get_AltDirectorySeparatorChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getDirectorySeparatorChar() {
    try {
      java.lang.Character res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("get_DirectorySeparatorChar");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Character[] getWindowsWhitespace(Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.FileSystem.IO.DotNetPathDelegate")
              .<NObject[]>get("WindowsWhitespace");
      if (res == null) return null;
      return (java.lang.Character[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWindowsWhitespace(java.lang.Character[] param) {
    try {
      Javonet.getType("Xceed.FileSystem.IO.DotNetPathDelegate")
          .set("WindowsWhitespace", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Character[] getWindowsTrailingWhitespace(Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.FileSystem.IO.DotNetPathDelegate")
              .<NObject[]>get("WindowsTrailingWhitespace");
      if (res == null) return null;
      return (java.lang.Character[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWindowsTrailingWhitespace(java.lang.Character[] param) {
    try {
      Javonet.getType("Xceed.FileSystem.IO.DotNetPathDelegate")
          .set("WindowsTrailingWhitespace", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DotNetPathDelegate() {
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.IO.DotNetPathDelegate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DotNetPathDelegate(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Trim(java.lang.String path) {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Xceed.FileSystem.IO.IPathDelegate").invoke("Trim", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String TrimWindows(java.lang.String path) {
    try {
      java.lang.String res =
          Javonet.getType("Xceed.FileSystem.IO.DotNetPathDelegate").invoke("TrimWindows", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetFullPath(java.lang.String path) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("GetFullPath", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetFileName(java.lang.String path) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("GetFileName", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsPathRooted(java.lang.String path) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("IsPathRooted", path);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetPathRoot(java.lang.String path) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("GetPathRoot", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDirectoryName(java.lang.String path) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("GetDirectoryName", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Combine(java.lang.String path1, java.lang.String path2) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IO.IPathDelegate")
              .invoke("Combine", path1, path2);
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
