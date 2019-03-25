package Xceed.Compression;

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
import Xceed.Compression.*;
import jio.System.*;

public class Rfc2898DeriveBytesManager implements IDisposable {
  protected NObject javonetHandle;

  public Rfc2898DeriveBytesManager() {
    try {
      javonetHandle = Javonet.New("Xceed.Compression.Rfc2898DeriveBytesManager");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Rfc2898DeriveBytesManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FindRfc2898DeriveBytesData(
      java.lang.Byte[] password, java.lang.Integer saltLength, Rfc2898DeriveBytesRecord record) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "FindRfc2898DeriveBytesData", new Object[] {password}, saltLength, record);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean FindRfc2898DeriveBytesData(
      java.lang.Byte[] password, java.lang.Byte[] salt, Rfc2898DeriveBytesRecord record) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "FindRfc2898DeriveBytesData", new Object[] {password}, new Object[] {salt}, record);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CacheRfc2898DeriveBytesData(Rfc2898DeriveBytesRecord record) {
    try {
      javonetHandle.invoke("CacheRfc2898DeriveBytesData", record);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ObtainRfc2898DeriveBytesData(
      java.lang.Byte[] password, java.lang.Byte[] salt, Rfc2898DeriveBytesRecord record) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "ObtainRfc2898DeriveBytesData", new Object[] {password}, new Object[] {salt}, record);
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
