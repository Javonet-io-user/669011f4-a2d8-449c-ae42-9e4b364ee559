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
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class ItemIsReadOnlyException extends FileSystemException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public ItemIsReadOnlyException(FileSystemItem item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.ItemIsReadOnlyException", item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemIsReadOnlyException(java.lang.String message, FileSystemItem item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.ItemIsReadOnlyException", message, item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemIsReadOnlyException(FileSystemItem item, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.ItemIsReadOnlyException", item, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemIsReadOnlyException(
      java.lang.String message, FileSystemItem item, jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.ItemIsReadOnlyException", message, item, inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ItemIsReadOnlyException(NObject handle) {
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
