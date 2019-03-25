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
import jio.System.IO.*;
import Xceed.FileSystem.IO.*;

public class DiskFile extends AbstractFile {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultAutomaticReadDiskFileShare(FileShare value) {
    try {
      Javonet.getType("Xceed.FileSystem.DiskFile")
          .set("DefaultAutomaticReadDiskFileShare", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static FileShare getDefaultAutomaticReadDiskFileShare() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.DiskFile")
              .<NEnum>get("DefaultAutomaticReadDiskFileShare");
      if (res == null) return null;
      return FileShare.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultAutomaticWriteDiskFileShare(FileShare value) {
    try {
      Javonet.getType("Xceed.FileSystem.DiskFile")
          .set("DefaultAutomaticWriteDiskFileShare", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static FileShare getDefaultAutomaticWriteDiskFileShare() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.DiskFile")
              .<NEnum>get("DefaultAutomaticWriteDiskFileShare");
      if (res == null) return null;
      return FileShare.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultIOHandler(IIOHandler value) {
    try {
      Javonet.getType("Xceed.FileSystem.DiskFile").set("DefaultIOHandler", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static IIOHandler getDefaultIOHandler() {
    try {
      Object res = Javonet.getType("Xceed.FileSystem.DiskFile").<NObject>get("DefaultIOHandler");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReparsePointTags getReparsePointTags() {
    try {
      Object res = javonetHandle.<NEnum>get("ReparsePointTags");
      if (res == null) return null;
      return ReparsePointTags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DiskFile(java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.DiskFile", fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DiskFile(FileSystemEvents events, Object userData, java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.DiskFile", events, userData, fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DiskFile(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DefaultDiskItemPathExceptionHandler(Object sender, PathExceptionEventArgs e) {
    try {
      Javonet.getType("Xceed.FileSystem.DiskFile")
          .invoke("DefaultDiskItemPathExceptionHandler", sender, e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsReparseTagNameSurrogate() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsReparseTagNameSurrogate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsSameAs(FileSystemItem target) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSameAs", target);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
