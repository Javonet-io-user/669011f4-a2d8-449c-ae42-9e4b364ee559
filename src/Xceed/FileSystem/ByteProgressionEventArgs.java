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

public class ByteProgressionEventArgs extends FileSystemEventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ProgressionInfo getCurrentFileBytes() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentFileBytes");
      if (res == null) return null;
      return new ProgressionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgressionInfo getAllFilesBytes() {
    try {
      Object res = javonetHandle.<NObject>get("AllFilesBytes");
      if (res == null) return null;
      return new ProgressionInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ByteProgressionEventArgs(ProgressionInfo currentFileBytes, ProgressionInfo allFilesBytes) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Xceed.FileSystem.ByteProgressionEventArgs", currentFileBytes, allFilesBytes);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ByteProgressionEventArgs(NObject handle) {
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
