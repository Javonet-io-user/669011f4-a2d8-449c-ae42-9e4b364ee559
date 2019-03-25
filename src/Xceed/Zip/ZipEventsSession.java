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
import Xceed.FileSystem.*;
import Xceed.Zip.*;

public class ZipEventsSession extends FileSystemEventsSession {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ZipEvents getEventsAsZipEventsSession() {
    try {
      Object res = javonetHandle.<NObject>get("Events");
      if (res == null) return null;
      return new ZipEvents((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgressionInfo getZipAllItems() {
    try {
      Object res = javonetHandle.<NObject>get("ZipAllItems");
      if (res == null) return null;
      return new ProgressionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgressionInfo getZipAllFileBytes() {
    try {
      Object res = javonetHandle.<NObject>get("ZipAllFileBytes");
      if (res == null) return null;
      return new ProgressionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgressionInfo getZipCurrentFileBytes() {
    try {
      Object res = javonetHandle.<NObject>get("ZipCurrentFileBytes");
      if (res == null) return null;
      return new ProgressionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ZipEventsSession(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void InitializeTotalItems(java.lang.Long totalItems) {
    try {
      javonetHandle.invoke("InitializeTotalItems", totalItems);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void InitializeTotalBytes(java.lang.Long totalBytes) {
    try {
      javonetHandle.invoke("InitializeTotalBytes", totalBytes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void InitializeCurrentTotalBytes(java.lang.Long totalBytes) {
    try {
      javonetHandle.invoke("InitializeCurrentTotalBytes", totalBytes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnReadingZipItemProgression(FileSystemItem currentItem) {
    try {
      javonetHandle.invoke("OnReadingZipItemProgression", currentItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBuildingZipItemProgression(FileSystemItem currentItem) {
    try {
      javonetHandle.invoke("OnBuildingZipItemProgression", currentItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBuildingZipByteProgression(java.lang.Long increment) {
    try {
      javonetHandle.invoke("OnBuildingZipByteProgression", increment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnCopyingZipByteProgression(java.lang.Long increment) {
    try {
      javonetHandle.invoke("OnCopyingZipByteProgression", increment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnGatheringZipContentByteProgression(java.lang.Long increment) {
    try {
      javonetHandle.invoke("OnGatheringZipContentByteProgression", increment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBuildingZipItemCompletion() {
    try {
      javonetHandle.invoke("OnBuildingZipItemCompletion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnReadingZipItemCompletion() {
    try {
      javonetHandle.invoke("OnReadingZipItemCompletion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnCopyingZipByteCompletion() {
    try {
      javonetHandle.invoke("OnCopyingZipByteCompletion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnGatheringZipContentByteCompletion() {
    try {
      javonetHandle.invoke("OnGatheringZipContentByteCompletion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBuildingZipByteCompletion() {
    try {
      javonetHandle.invoke("OnBuildingZipByteCompletion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDiskRequired(DiskRequiredEventArgs e) {
    try {
      javonetHandle.invoke("OnDiskRequired", e);
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
