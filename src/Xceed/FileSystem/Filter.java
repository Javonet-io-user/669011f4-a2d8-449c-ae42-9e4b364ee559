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

public abstract class Filter {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setScope(FilterScope value) {
    try {
      javonetHandle.set("Scope", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FilterScope getScope() {
    try {
      Object res = javonetHandle.<NEnum>get("Scope");
      if (res == null) return null;
      return FilterScope.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Filter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Filter[] GetFiltersFromParams(Object[] filters, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.FileSystem.Filter")
              .invoke("GetFiltersFromParams", new Object[] {filters});
      if (res == null) return null;
      return (Filter[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsItemMatchingOne(FileSystemItem item, Filter[] filters) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Xceed.FileSystem.Filter")
              .invoke("IsItemMatchingOne", item, new Object[] {filters});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static FilterResult IsItemMatchingOne(
      FileSystemItem item, FilterScope applicableScope, Filter[] filters) {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.Filter")
              .invoke(
                  "IsItemMatchingOne",
                  item,
                  NEnum.fromJavaEnum(applicableScope),
                  new Object[] {filters});
      if (res == null) return null;
      return FilterResult.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsItemMatchingAll(FileSystemItem item, Filter[] filters) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Xceed.FileSystem.Filter")
              .invoke("IsItemMatchingAll", item, new Object[] {filters});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static FilterResult IsItemMatchingAll(
      FileSystemItem item, FilterScope applicableScope, Filter[] filters) {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.Filter")
              .invoke(
                  "IsItemMatchingAll",
                  item,
                  NEnum.fromJavaEnum(applicableScope),
                  new Object[] {filters});
      if (res == null) return null;
      return FilterResult.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsItemMatching(FileSystemItem item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsItemMatching", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FilterResult IsItemMatching(FileSystemItem item, FilterScope applicableScope) {
    try {
      Object res =
          javonetHandle.invoke("IsItemMatching", item, NEnum.fromJavaEnum(applicableScope));
      if (res == null) return null;
      return FilterResult.valueOf(((NEnum) res).getValueName());
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
