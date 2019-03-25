package Xceed.Zip.Sfx;

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
import Xceed.Zip.Sfx.*;
import Xceed.FileSystem.*;

public class SfxPrefix {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getSourceModuleSize() {
    try {
      java.lang.Long res = javonetHandle.get("SourceModuleSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SfxPrefix() {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.Sfx.SfxPrefix");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SfxPrefix(AbstractFile sfxModule) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.Sfx.SfxPrefix", sfxModule);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SfxPrefix(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetSourceModule(AbstractFile sfxModule) {
    try {
      javonetHandle.invoke("SetSourceModule", sfxModule);
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
