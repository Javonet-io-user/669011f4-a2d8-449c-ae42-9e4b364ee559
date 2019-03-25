package Xceed.Zip;

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
import Xceed.Zip.*;
import Xceed.FileSystem.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class InvalidZipStructureException extends ZipException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public InvalidZipStructureException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.InvalidZipStructureException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidZipStructureException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.InvalidZipStructureException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidZipStructureException(AbstractFile zipFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.InvalidZipStructureException", zipFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidZipStructureException(java.lang.String message, AbstractFile zipFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.InvalidZipStructureException", message, zipFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidZipStructureException(AbstractFile zipFile, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.InvalidZipStructureException", zipFile, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidZipStructureException(
      java.lang.String message, AbstractFile zipFile, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Xceed.Zip.InvalidZipStructureException", message, zipFile, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvalidZipStructureException(NObject handle) {
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
