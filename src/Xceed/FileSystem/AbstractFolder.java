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

public abstract class AbstractFolder extends FileSystemItem {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsRoot() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsRoot");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public AbstractFolder(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile CreateFile(java.lang.String relativeName, java.lang.Boolean replaceIfExists) {
    try {
      Object res = javonetHandle.invoke("CreateFile", relativeName, replaceIfExists);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile CreateFile(
      FileSystemEvents events,
      Object userData,
      java.lang.String relativeName,
      java.lang.Boolean replaceIfExists) {
    try {
      Object res =
          javonetHandle.invoke("CreateFile", events, userData, relativeName, replaceIfExists);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFolder CreateFolder(java.lang.String relativeName) {
    try {
      Object res = javonetHandle.invoke("CreateFolder", relativeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFolder CreateFolder(
      FileSystemEvents events, Object userData, java.lang.String relativeName) {
    try {
      Object res = javonetHandle.invoke("CreateFolder", events, userData, relativeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile GetFile(java.lang.String relativeName) {
    try {
      Object res = javonetHandle.invoke("GetFile", relativeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile GetFile(
      FileSystemEvents events, Object userData, java.lang.String relativeName) {
    try {
      Object res = javonetHandle.invoke("GetFile", events, userData, relativeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFolder GetFolder(java.lang.String relativeName) {
    try {
      Object res = javonetHandle.invoke("GetFolder", relativeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFolder GetFolder(
      FileSystemEvents events, Object userData, java.lang.String relativeName) {
    try {
      Object res = javonetHandle.invoke("GetFolder", events, userData, relativeName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile[] GetFiles(
      java.lang.Boolean recursive, Object[] filters, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetFiles", recursive, new Object[] {filters});
      if (res == null) return null;
      return (AbstractFile[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile[] GetFiles(
      FileSystemEvents events,
      Object userData,
      java.lang.Boolean recursive,
      Object[] filters,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke("GetFiles", events, userData, recursive, new Object[] {filters});
      if (res == null) return null;
      return (AbstractFile[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFolder[] GetFolders(
      java.lang.Boolean recursive, Object[] filters, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetFolders", recursive, new Object[] {filters});
      if (res == null) return null;
      return (AbstractFolder[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFolder[] GetFolders(
      FileSystemEvents events,
      Object userData,
      java.lang.Boolean recursive,
      Object[] filters,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke("GetFolders", events, userData, recursive, new Object[] {filters});
      if (res == null) return null;
      return (AbstractFolder[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem[] GetItems(java.lang.Boolean recursive, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetItems", recursive);
      if (res == null) return null;
      return (FileSystemItem[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem[] GetItems(
      FileSystemEvents events,
      Object userData,
      java.lang.Boolean recursive,
      Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetItems", events, userData, recursive);
      if (res == null) return null;
      return (FileSystemItem[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyFilesTo(
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "CopyFilesTo",
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyFilesTo(
      FileSystemEvents events,
      Object userData,
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "CopyFilesTo",
          events,
          userData,
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyItemsTo(
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "CopyItemsTo",
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyItemsTo(
      FileSystemEvents events,
      Object userData,
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "CopyItemsTo",
          events,
          userData,
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveFilesTo(
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "MoveFilesTo",
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveFilesTo(
      FileSystemEvents events,
      Object userData,
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "MoveFilesTo",
          events,
          userData,
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveItemsTo(
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "MoveItemsTo",
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveItemsTo(
      FileSystemEvents events,
      Object userData,
      AbstractFolder destinationFolder,
      java.lang.Boolean recursive,
      java.lang.Boolean replaceExistingFiles,
      Object[] filters) {
    try {
      javonetHandle.invoke(
          "MoveItemsTo",
          events,
          userData,
          destinationFolder,
          recursive,
          replaceExistingFiles,
          new Object[] {filters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public AbstractFile CreateTempFile() {
    try {
      Object res = javonetHandle.invoke("CreateTempFile");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
