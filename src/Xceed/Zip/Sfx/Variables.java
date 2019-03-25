package Xceed.Zip.Sfx;

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
import Xceed.Zip.Sfx.*;

public class Variables {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getErrorNumber() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("ErrorNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setErrorNumber(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("ErrorNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDiskNumber() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("DiskNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDiskNumber(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("DiskNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDestinationFile() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("DestinationFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDestinationFile(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("DestinationFile", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDestinationFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("DestinationFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDestinationFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("DestinationFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSfxFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("SfxFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSfxFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("SfxFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWindowsFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("WindowsFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWindowsFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("WindowsFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSystemFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("SystemFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSystemFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("SystemFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTempFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("TempFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTempFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("TempFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRandomFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("RandomFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRandomFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("RandomFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getProgramFilesFolder() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("ProgramFilesFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProgramFilesFolder(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("ProgramFilesFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSystemDrive() {
    try {
      java.lang.String res = Javonet.getType("Xceed.Zip.Sfx.Variables").get("SystemDrive");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSystemDrive(java.lang.String param) {
    try {
      Javonet.getType("Xceed.Zip.Sfx.Variables").set("SystemDrive", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Variables() {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.Sfx.Variables");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Variables(NObject handle) {
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
