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

public class ItemPair {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public FileSystemItem getcurrent() {
    try {
      Object res = javonetHandle.<NObject>get("current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setcurrent(FileSystemItem param) {
    try {
      javonetHandle.set("current", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public FileSystemItem gettarget() {
    try {
      Object res = javonetHandle.<NObject>get("target");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void settarget(FileSystemItem param) {
    try {
      javonetHandle.set("target", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemPair(FileSystemItem currentItem, FileSystemItem targetItem) {
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.ItemPair", currentItem, targetItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemPair(NObject handle) {
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
