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
import Xceed.FileSystem.Threading.*;
import jio.System.*;

public class ZipMultiThreadManager implements IMultiThreadManager, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumThreads() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.Threading.IMultiThreadManager")
              .invoke("get_NumThreads");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMemoryPerThread() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.Threading.IMultiThreadManager")
              .invoke("get_MemoryPerThread");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowTempFiles(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowTempFiles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowTempFiles() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowTempFiles");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMaxThreads() {
    try {
      java.lang.Integer res = Javonet.getType("Xceed.Zip.ZipMultiThreadManager").get("MaxThreads");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMaxThreads(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Zip.ZipMultiThreadManager").set("MaxThreads", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMinMemoryPerThread() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ZipMultiThreadManager").get("MinMemoryPerThread");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinMemoryPerThread(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Zip.ZipMultiThreadManager").set("MinMemoryPerThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getDefaultMemoryPerThread() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ZipMultiThreadManager").get("DefaultMemoryPerThread");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultMemoryPerThread(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Zip.ZipMultiThreadManager").set("DefaultMemoryPerThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMaxMemoryPerThread() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ZipMultiThreadManager").get("MaxMemoryPerThread");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMaxMemoryPerThread(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Zip.ZipMultiThreadManager").set("MaxMemoryPerThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipMultiThreadManager() {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipMultiThreadManager");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipMultiThreadManager(java.lang.Integer numThreads) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipMultiThreadManager", numThreads);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipMultiThreadManager(java.lang.Integer numThreads, java.lang.Integer memoryPerThread) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipMultiThreadManager", numThreads, memoryPerThread);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipMultiThreadManager(NObject handle) {
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
  public void QueueItem(IMultiThreadItem item) {
    try {
      javonetHandle
          .explicitInterface("Xceed.FileSystem.Threading.IMultiThreadManager")
          .invoke("QueueItem", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ProcessItems(java.lang.Boolean wait) {
    try {
      javonetHandle
          .explicitInterface("Xceed.FileSystem.Threading.IMultiThreadManager")
          .invoke("ProcessItems", wait);
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
