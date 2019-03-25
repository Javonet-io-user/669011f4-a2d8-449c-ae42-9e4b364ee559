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
import jio.System.*;
import Xceed.FileSystem.*;
import jio.System.IO.*;

public abstract class FileSystemItem extends MarshalByRefObject {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getHostedFullName() {
    try {
      java.lang.String res = javonetHandle.get("HostedFullName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AbstractFile getHostFile() {
    try {
      Object res = javonetHandle.<NObject>get("HostFile");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFullName() {
    try {
      java.lang.String res = javonetHandle.get("FullName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasAttributes() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasAttributes");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAttributes(FileAttributes value) {
    try {
      javonetHandle.set("Attributes", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileAttributes getAttributes() {
    try {
      Object res = javonetHandle.<NEnum>get("Attributes");
      if (res == null) return null;
      return FileAttributes.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasCreationDateTime() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasCreationDateTime");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCreationDateTime(DateTime value) {
    try {
      javonetHandle.set("CreationDateTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getCreationDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("CreationDateTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasLastWriteDateTime() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasLastWriteDateTime");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLastWriteDateTime(DateTime value) {
    try {
      javonetHandle.set("LastWriteDateTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastWriteDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("LastWriteDateTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasLastAccessDateTime() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasLastAccessDateTime");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLastAccessDateTime(DateTime value) {
    try {
      javonetHandle.set("LastAccessDateTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastAccessDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("LastAccessDateTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AbstractFolder getParentFolder() {
    try {
      Object res = javonetHandle.<NObject>get("ParentFolder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AbstractFolder getRootFolder() {
    try {
      Object res = javonetHandle.<NObject>get("RootFolder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getExists() {
    try {
      java.lang.Boolean res = javonetHandle.get("Exists");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFolderSeparator() {
    try {
      java.lang.String res =
          Javonet.getType("Xceed.FileSystem.FileSystemItem").get("FolderSeparator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFolderSeparator(java.lang.String param) {
    try {
      Javonet.getType("Xceed.FileSystem.FileSystemItem").set("FolderSeparator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAltFolderSeparator() {
    try {
      java.lang.String res =
          Javonet.getType("Xceed.FileSystem.FileSystemItem").get("AltFolderSeparator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAltFolderSeparator(java.lang.String param) {
    try {
      Javonet.getType("Xceed.FileSystem.FileSystemItem").set("AltFolderSeparator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemItem(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetName(FileSystemEvents events, Object userData, java.lang.String value) {
    try {
      javonetHandle.invoke("SetName", events, userData, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Refresh() {
    try {
      javonetHandle.invoke("Refresh");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Refresh(FileSystemEvents events, Object userData) {
    try {
      javonetHandle.invoke("Refresh", events, userData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Create() {
    try {
      javonetHandle.invoke("Create");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Create(FileSystemEvents events, Object userData) {
    try {
      javonetHandle.invoke("Create", events, userData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Delete() {
    try {
      javonetHandle.invoke("Delete");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Delete(FileSystemEvents events, Object userData) {
    try {
      javonetHandle.invoke("Delete", events, userData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem CopyTo(
      AbstractFolder destinationFolder, java.lang.Boolean replaceExistingFiles) {
    try {
      Object res = javonetHandle.invoke("CopyTo", destinationFolder, replaceExistingFiles);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem CopyTo(
      FileSystemEvents events,
      Object userData,
      AbstractFolder destinationFolder,
      java.lang.Boolean replaceExistingFiles) {
    try {
      Object res =
          javonetHandle.invoke("CopyTo", events, userData, destinationFolder, replaceExistingFiles);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem MoveTo(
      AbstractFolder destinationFolder, java.lang.Boolean replaceExistingFiles) {
    try {
      Object res = javonetHandle.invoke("MoveTo", destinationFolder, replaceExistingFiles);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem MoveTo(
      FileSystemEvents events,
      Object userData,
      AbstractFolder destinationFolder,
      java.lang.Boolean replaceExistingFiles) {
    try {
      Object res =
          javonetHandle.invoke("MoveTo", events, userData, destinationFolder, replaceExistingFiles);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ApplyPropertiesTo(FileSystemItem targetItem) {
    try {
      javonetHandle.invoke("ApplyPropertiesTo", targetItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ApplyPropertiesTo(
      FileSystemEvents events, Object userData, FileSystemItem targetItem) {
    try {
      javonetHandle.invoke("ApplyPropertiesTo", events, userData, targetItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
