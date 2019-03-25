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

public class DiskFolder extends AbstractFolder {
  protected NObject javonetHandle;
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

  public DiskFolder(java.lang.String folderName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.DiskFolder", folderName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DiskFolder(FileSystemEvents events, Object userData, java.lang.String folderName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.DiskFolder", events, userData, folderName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DiskFolder(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
