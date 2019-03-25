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
import jio.System.Collections.Generic.*;
import Xceed.FileSystem.Threading.*;

public class FileSystemEventsSession {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public FileSystemEvents getEvents() {
    try {
      Object res = javonetHandle.<NObject>get("Events");
      if (res == null) return null;
      return new FileSystemEvents((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getUserData() {
    try {
      Object res = javonetHandle.<NObject>get("UserData");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentItem(FileSystemItem value) {
    try {
      javonetHandle.set("CurrentItem", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileSystemItem getCurrentItem() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentItem");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTargetItem(FileSystemItem value) {
    try {
      javonetHandle.set("TargetItem", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileSystemItem getTargetItem() {
    try {
      Object res = javonetHandle.<NObject>get("TargetItem");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsEmpty() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsEmpty");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgressionInfo getAllFileBytes() {
    try {
      Object res = javonetHandle.<NObject>get("AllFileBytes");
      if (res == null) return null;
      return new ProgressionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMultiThreadManager(IMultiThreadManager value) {
    try {
      javonetHandle.set("MultiThreadManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IMultiThreadManager getMultiThreadManager() {
    try {
      Object res = javonetHandle.<NObject>get("MultiThreadManager");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FileSystemEventsSession(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnScanningFolder(AbstractFolder currentFolder) {
    try {
      javonetHandle.invoke("OnScanningFolder", currentFolder);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnNewItemToProcess(FileSystemItem currentItem, FileSystemItem targetItem) {
    try {
      javonetHandle.invoke("OnNewItemToProcess", currentItem, targetItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnProcessingNewItem(
      FileSystemItem current, FileSystemItem target, java.lang.Boolean raiseBytesProgression) {
    try {
      javonetHandle.invoke("OnProcessingNewItem", current, target, raiseBytesProgression);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnProcessingNewItem(
      FileSystemItem current,
      FileSystemItem target,
      java.lang.Boolean raiseBytesProgression,
      ByteProgressionEventArgs byteProgressionArgs,
      ProgressionInfo currentFileBytes) {
    try {
      javonetHandle.invoke(
          "OnProcessingNewItem",
          current,
          target,
          raiseBytesProgression,
          byteProgressionArgs,
          currentFileBytes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemPair GetNextItemPair(java.lang.Boolean raiseBytesProgression) {
    try {
      Object res = javonetHandle.invoke("GetNextItemPair", raiseBytesProgression);
      if (res == null) return null;
      return new ItemPair((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemPair GetNextItemPair(
      java.lang.Boolean raiseEvents, java.lang.Boolean raiseBytesProgression) {
    try {
      Object res = javonetHandle.invoke("GetNextItemPair", raiseEvents, raiseBytesProgression);
      if (res == null) return null;
      return new ItemPair((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBytesProcessed(java.lang.Long increment) {
    try {
      javonetHandle.invoke("OnBytesProcessed", increment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBytesProcessed(
      ByteProgressionEventArgs byteProgressionArgs, java.lang.Long increment) {
    try {
      javonetHandle.invoke("OnBytesProcessed", byteProgressionArgs, increment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBytesCompleted() {
    try {
      javonetHandle.invoke("OnBytesCompleted");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnBytesCompleted(ByteProgressionEventArgs byteProgressionArgs) {
    try {
      javonetHandle.invoke("OnBytesCompleted", byteProgressionArgs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnItemCompleted() {
    try {
      javonetHandle.invoke("OnItemCompleted");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnItemCompleted(FileSystemItem current, FileSystemItem target) {
    try {
      javonetHandle.invoke("OnItemCompleted", current, target);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnUndoBytesProcessed() {
    try {
      javonetHandle.invoke("OnUndoBytesProcessed");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnUndoBytesProcessed(ByteProgressionEventArgs byteProgressionArgs) {
    try {
      javonetHandle.invoke("OnUndoBytesProcessed", byteProgressionArgs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnUndoBytesProcessed(ProgressionInfo currentFileBytes) {
    try {
      javonetHandle.invoke("OnUndoBytesProcessed", currentFileBytes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemExceptionAction OnException(jio.System.Exception except) {
    try {
      Object res = javonetHandle.invoke("OnException", except);
      if (res == null) return null;
      return ItemExceptionAction.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemExceptionAction OnException(
      jio.System.Exception except, FileSystemItem currentItem, FileSystemItem targetItem) {
    try {
      Object res = javonetHandle.invoke("OnException", except, currentItem, targetItem);
      if (res == null) return null;
      return ItemExceptionAction.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ItemExceptionAction OnPathException(
      jio.System.Exception exception,
      jio.System.Type targetType,
      AtomicReference<java.lang.String> path) {
    try {
      Object res = javonetHandle.invoke("OnPathException", exception, targetType, new NRef(path));
      if (res == null) return null;
      return ItemExceptionAction.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnPropertiesApplied() {
    try {
      javonetHandle.invoke("OnPropertiesApplied");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnCompletion() {
    try {
      javonetHandle.invoke("OnCompletion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean AssignComparer(IComparer<ItemPair> comparer) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("AssignComparer", comparer);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ByteProgressionEventArgs CreateByteProgressionEventArgs() {
    try {
      Object res = javonetHandle.invoke("CreateByteProgressionEventArgs");
      if (res == null) return null;
      return new ByteProgressionEventArgs((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
