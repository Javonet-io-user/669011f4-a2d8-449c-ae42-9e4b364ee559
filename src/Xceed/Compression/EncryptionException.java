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
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class EncryptionException extends IOException implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public EncryptionException(java.lang.String format, Object[] arg0) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Xceed.Compression.EncryptionException", format, new Object[] {arg0});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EncryptionException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Compression.EncryptionException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EncryptionException(
      java.lang.String format, jio.System.Exception innerException, Object[] arg0) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Compression.EncryptionException", format, innerException, new Object[] {arg0});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EncryptionException(NObject handle) {
    super(handle);
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
