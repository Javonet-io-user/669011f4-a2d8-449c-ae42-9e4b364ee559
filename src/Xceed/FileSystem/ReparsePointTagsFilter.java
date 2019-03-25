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

public class ReparsePointTagsFilter extends Filter {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setMask(ReparsePointTags value) {
    try {
      javonetHandle.set("Mask", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReparsePointTags getMask() {
    try {
      Object res = javonetHandle.<NEnum>get("Mask");
      if (res == null) return null;
      return ReparsePointTags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExpectedResult(ReparsePointTags value) {
    try {
      javonetHandle.set("ExpectedResult", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReparsePointTags getExpectedResult() {
    try {
      Object res = javonetHandle.<NEnum>get("ExpectedResult");
      if (res == null) return null;
      return ReparsePointTags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static FilterScope getDefaultScope() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.ReparsePointTagsFilter").<NEnum>get("DefaultScope");
      if (res == null) return null;
      return FilterScope.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultScope(FilterScope param) {
    try {
      Javonet.getType("Xceed.FileSystem.ReparsePointTagsFilter")
          .set("DefaultScope", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static ReparsePointTags getDefaultMask() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.ReparsePointTagsFilter").<NEnum>get("DefaultMask");
      if (res == null) return null;
      return ReparsePointTags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultMask(ReparsePointTags param) {
    try {
      Javonet.getType("Xceed.FileSystem.ReparsePointTagsFilter")
          .set("DefaultMask", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static ReparsePointTags getDefaultExpectedResult() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.ReparsePointTagsFilter")
              .<NEnum>get("DefaultExpectedResult");
      if (res == null) return null;
      return ReparsePointTags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultExpectedResult(ReparsePointTags param) {
    try {
      Javonet.getType("Xceed.FileSystem.ReparsePointTagsFilter")
          .set("DefaultExpectedResult", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReparsePointTagsFilter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.ReparsePointTagsFilter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReparsePointTagsFilter(FilterScope scope) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Xceed.FileSystem.ReparsePointTagsFilter", NEnum.fromJavaEnum(scope));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReparsePointTagsFilter(ReparsePointTags reparsePointTagMask) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.ReparsePointTagsFilter", NEnum.fromJavaEnum(reparsePointTagMask));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReparsePointTagsFilter(
      ReparsePointTags reparsePointTagMask, ReparsePointTags expectedResult) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.ReparsePointTagsFilter",
              NEnum.fromJavaEnum(reparsePointTagMask),
              NEnum.fromJavaEnum(expectedResult));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReparsePointTagsFilter(
      ReparsePointTags reparsePointTagMask, ReparsePointTags expectedResult, FilterScope scope) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.ReparsePointTagsFilter",
              NEnum.fromJavaEnum(reparsePointTagMask),
              NEnum.fromJavaEnum(expectedResult),
              NEnum.fromJavaEnum(scope));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReparsePointTagsFilter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ReparsePointTagsFilter___IsItemMatching(FileSystemItem item) {
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
