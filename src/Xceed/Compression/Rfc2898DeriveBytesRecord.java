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

public class Rfc2898DeriveBytesRecord {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getPassword(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Password");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPassword(java.lang.Byte[] param) {
    try {
      javonetHandle.set("Password", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getSalt(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("Salt");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSalt(java.lang.Byte[] param) {
    try {
      javonetHandle.set("Salt", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getEncryptionKey(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("EncryptionKey");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncryptionKey(java.lang.Byte[] param) {
    try {
      javonetHandle.set("EncryptionKey", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getAuthenticationKey(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("AuthenticationKey");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setAuthenticationKey(java.lang.Byte[] param) {
    try {
      javonetHandle.set("AuthenticationKey", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getVerifierKey(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("VerifierKey");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setVerifierKey(java.lang.Byte[] param) {
    try {
      javonetHandle.set("VerifierKey", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Rfc2898DeriveBytesRecord(java.lang.Byte[] password) {
    try {
      javonetHandle =
          Javonet.New("Xceed.Compression.Rfc2898DeriveBytesRecord", new Object[] {password});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Rfc2898DeriveBytesRecord(java.lang.Byte[] password, java.lang.Integer saltLength) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.Rfc2898DeriveBytesRecord", new Object[] {password}, saltLength);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Rfc2898DeriveBytesRecord(java.lang.Byte[] password, java.lang.Byte[] salt) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.Rfc2898DeriveBytesRecord",
              new Object[] {password},
              new Object[] {salt});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Rfc2898DeriveBytesRecord(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
