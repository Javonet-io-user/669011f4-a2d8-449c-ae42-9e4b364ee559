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
import jio.System.IO.*;
import Xceed.Compression.*;
import jio.System.*;
import jio.System.Text.*;

public class AesEncryptionStream extends Stream implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Stream getInnerStream() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Xceed.Utils.Streams.IPassThroughStream")
              .invoke("get_InnerStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTransient(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("Xceed.Utils.Streams.ITransientStream")
          .invoke("set_Transient", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTransient() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Xceed.Utils.Streams.ITransientStream")
              .invoke("get_Transient");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

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
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCanRead() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanRead");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCanSeek() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanSeek");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCanWrite() {
    try {
      java.lang.Boolean res = javonetHandle.get("CanWrite");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getLength() {
    try {
      java.lang.Long res = javonetHandle.get("Length");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPosition(java.lang.Long value) {
    try {
      javonetHandle.set("Position", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getPosition() {
    try {
      java.lang.Long res = javonetHandle.get("Position");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoVerifyAuthenticationValue(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoVerifyAuthenticationValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoVerifyAuthenticationValue() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoVerifyAuthenticationValue");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getAuthenticationCodeLength() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.Compression.AesEncryptionStream").get("AuthenticationCodeLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAuthenticationCodeLength(java.lang.Integer param) {
    try {
      Javonet.getType("Xceed.Compression.AesEncryptionStream")
          .set("AuthenticationCodeLength", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream", innerStream, password, strength, writing);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      IAesAlgorithmManager aesAlgorithmManager,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              aesAlgorithmManager,
              password,
              strength,
              writing);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              rfc2898DeriveBytesManager,
              password,
              strength,
              writing);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      Encoding passwordEncoding,
      java.lang.Integer strength,
      java.lang.Boolean writing) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              rfc2898DeriveBytesManager,
              password,
              passwordEncoding,
              strength,
              writing);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      Encoding passwordEncoding,
      java.lang.Integer strength,
      java.lang.Boolean writing,
      java.lang.Boolean computeAuthenticationCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              rfc2898DeriveBytesManager,
              password,
              passwordEncoding,
              strength,
              writing,
              computeAuthenticationCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      IAesAlgorithmManager aesAlgorithmManager,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              aesAlgorithmManager,
              rfc2898DeriveBytesManager,
              password,
              strength,
              writing);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      IAesAlgorithmManager aesAlgorithmManager,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      Encoding passwordEncoding,
      java.lang.Integer strength,
      java.lang.Boolean writing) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              aesAlgorithmManager,
              rfc2898DeriveBytesManager,
              password,
              passwordEncoding,
              strength,
              writing);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing,
      java.lang.Boolean computeAuthenticationCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              password,
              strength,
              writing,
              computeAuthenticationCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing,
      java.lang.Boolean computeAuthenticationCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              rfc2898DeriveBytesManager,
              password,
              strength,
              writing,
              computeAuthenticationCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      IAesAlgorithmManager aesAlgorithmManager,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      java.lang.Integer strength,
      java.lang.Boolean writing,
      java.lang.Boolean computeAuthenticationCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              aesAlgorithmManager,
              rfc2898DeriveBytesManager,
              password,
              strength,
              writing,
              computeAuthenticationCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(
      Stream innerStream,
      IAesAlgorithmManager aesAlgorithmManager,
      Rfc2898DeriveBytesManager rfc2898DeriveBytesManager,
      java.lang.String password,
      Encoding passwordEncoding,
      java.lang.Integer strength,
      java.lang.Boolean writing,
      java.lang.Boolean computeAuthenticationCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.AesEncryptionStream",
              innerStream,
              aesAlgorithmManager,
              rfc2898DeriveBytesManager,
              password,
              passwordEncoding,
              strength,
              writing,
              computeAuthenticationCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AesEncryptionStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Flush() {
    try {
      javonetHandle.invoke("Flush");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Read(
      java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Read", new Object[] {buffer}, offset, count);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long Seek(java.lang.Long offset, SeekOrigin origin) {
    try {
      java.lang.Long res = javonetHandle.invoke("Seek", offset, NEnum.fromJavaEnum(origin));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetLength(java.lang.Long value) {
    try {
      javonetHandle.invoke("SetLength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Write(java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("Write", new Object[] {buffer}, offset, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean VerifyAuthenticationValue() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("VerifyAuthenticationValue");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean VerifyAuthenticationValue(java.lang.Boolean throwException) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("VerifyAuthenticationValue", throwException);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean VerifyAuthenticationValue(jio.System.Exception exception) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("VerifyAuthenticationValue", exception);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
