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

public class DeriveBytesRfc2898 {
  protected NObject javonetHandle;

  public DeriveBytesRfc2898(java.lang.String password, java.lang.Byte[] salt) {
    try {
      javonetHandle =
          Javonet.New("Xceed.Compression.DeriveBytesRfc2898", password, new Object[] {salt});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DeriveBytesRfc2898(
      java.lang.String password, java.lang.Byte[] salt, java.lang.Integer iterations) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.DeriveBytesRfc2898", password, new Object[] {salt}, iterations);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DeriveBytesRfc2898(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetBytes(java.lang.Integer count, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetBytes", count);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
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
