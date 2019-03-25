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

public class DateTimeFilter extends Filter {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getMinDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("MinDateTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getMaxDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("MaxDateTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTimeFilter.ApplicableDateTime getApplicableDateTimes() {
    try {
      Object res = javonetHandle.<NEnum>get("ApplicableDateTimes");
      if (res == null) return null;
      return DateTimeFilter.ApplicableDateTime.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DateTimeFilter(DateTime minValue, DateTime maxValue) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.DateTimeFilter", minValue, maxValue);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeFilter(
      DateTime minValue, DateTime maxValue, DateTimeFilter.ApplicableDateTime applicableDateTimes) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.DateTimeFilter",
              minValue,
              maxValue,
              NEnum.fromJavaEnum(applicableDateTimes));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeFilter(DateTime minValue, DateTime maxValue, FilterScope scope) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.DateTimeFilter", minValue, maxValue, NEnum.fromJavaEnum(scope));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeFilter(
      DateTime minValue,
      DateTime maxValue,
      DateTimeFilter.ApplicableDateTime applicableDateTimes,
      FilterScope scope) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.FileSystem.DateTimeFilter",
              minValue,
              maxValue,
              NEnum.fromJavaEnum(applicableDateTimes),
              NEnum.fromJavaEnum(scope));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeFilter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean DateTimeFilter___IsItemMatching(FileSystemItem item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsItemMatching", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public enum ApplicableDateTime {
    Creation(1L),
    LastWrite(2L),
    LastAccess(4L),
    All(7L),
    ;
    private long numVal;

    ApplicableDateTime(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
