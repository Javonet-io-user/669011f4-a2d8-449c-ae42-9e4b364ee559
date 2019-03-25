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
import Xceed.Zip.ReaderWriter.*;
import jio.System.*;

public class ZipWriterMultiThreadManager implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumThreads() {
    try {
      java.lang.Integer res = javonetHandle.get("NumThreads");
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
      java.lang.Integer res = javonetHandle.get("MemoryPerThread");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMaxThreads() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager").get("MaxThreads");
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
      Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
          .set("MaxThreads", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMinMemoryPerThread() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
              .get("MinMemoryPerThread");
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
      Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
          .set("MinMemoryPerThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getDefaultMemoryPerThread() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
              .get("DefaultMemoryPerThread");
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
      Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
          .set("DefaultMemoryPerThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getMaxMemoryPerThread() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
              .get("MaxMemoryPerThread");
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
      Javonet.getType("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager")
          .set("MaxMemoryPerThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriterMultiThreadManager() {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriterMultiThreadManager(java.lang.Integer numThreads) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager", numThreads);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriterMultiThreadManager(
      java.lang.Integer numThreads, java.lang.Integer memoryPerThread) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Zip.ReaderWriter.ZipWriterMultiThreadManager", numThreads, memoryPerThread);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriterMultiThreadManager(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
