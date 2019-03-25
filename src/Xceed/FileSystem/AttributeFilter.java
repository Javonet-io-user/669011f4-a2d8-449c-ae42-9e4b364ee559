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
import jio.System.IO.*;

public class AttributeFilter extends Filter {
  protected NObject javonetHandle;
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

  public AttributeFilter(FileAttributes attributes) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Xceed.FileSystem.AttributeFilter", NEnum.fromJavaEnum(attributes));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AttributeFilter(FileAttributes attributes, FilterScope scope) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.AttributeFilter",
              NEnum.fromJavaEnum(attributes),
              NEnum.fromJavaEnum(scope));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AttributeFilter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean AttributeFilter___IsItemMatching(FileSystemItem item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsItemMatching", item);
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
