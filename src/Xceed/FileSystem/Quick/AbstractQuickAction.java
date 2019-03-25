package Xceed.FileSystem.Quick;

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
import Xceed.FileSystem.Quick.*;
import Xceed.FileSystem.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public abstract class AbstractQuickAction {
  protected NObject javonetHandle;

  public AbstractQuickAction(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractQuickActionItem[] GetFolderContents(
      AbstractFolder folderToList,
      java.lang.Boolean recursive,
      java.lang.String[] filters,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke(
              "GetFolderContents", folderToList, recursive, new Object[] {filters});
      if (res == null) return null;
      return (AbstractQuickActionItem[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<FileSystemItem> CreateItemListFromPaths(
      AbstractFolder sourceParentFolder,
      java.lang.Boolean isFromLocalDisk,
      java.lang.String[] filePaths,
      java.lang.Boolean recursive,
      Filter notFilter) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateItemListFromPaths",
              sourceParentFolder,
              isFromLocalDisk,
              new Object[] {filePaths},
              recursive,
              notFilter);
      if (res == null) return null;
      return new List<FileSystemItem>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveFiles(
      AbstractFolder folder, java.lang.Boolean recursive, java.lang.String[] filesToRemove) {
    try {
      javonetHandle.invoke("RemoveFiles", folder, recursive, new Object[] {filesToRemove});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddUserData(java.lang.String eventName, Object[] userData) {
    try {
      javonetHandle.invoke("AddUserData", eventName, new Object[] {userData});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object[] GetUserData(java.lang.String eventName, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetUserData", eventName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResetUserData() {
    try {
      javonetHandle.invoke("ResetUserData");
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
