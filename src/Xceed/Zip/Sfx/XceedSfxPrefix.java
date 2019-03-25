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
import jio.System.Drawing.*;
import Xceed.FileSystem.*;

public class XceedSfxPrefix extends SfxPrefix {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultPassword(java.lang.String value) {
    try {
      javonetHandle.set("DefaultPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultPassword() {
    try {
      java.lang.String res = javonetHandle.get("DefaultPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultDestinationFolder(java.lang.String value) {
    try {
      javonetHandle.set("DefaultDestinationFolder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultDestinationFolder() {
    try {
      java.lang.String res = javonetHandle.get("DefaultDestinationFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringList getExecuteAfter() {
    try {
      Object res = javonetHandle.<NObject>get("ExecuteAfter");
      if (res == null) return null;
      return new StringList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExistingFileBehavior(ExistingFileBehavior value) {
    try {
      javonetHandle.set("ExistingFileBehavior", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExistingFileBehavior getExistingFileBehavior() {
    try {
      Object res = javonetHandle.<NEnum>get("ExistingFileBehavior");
      if (res == null) return null;
      return ExistingFileBehavior.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtensionAssociationList getExtensionsToAssociate() {
    try {
      Object res = javonetHandle.<NObject>get("ExtensionsToAssociate");
      if (res == null) return null;
      return new ExtensionAssociationList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileCopyList getFilesToCopy() {
    try {
      Object res = javonetHandle.<NObject>get("FilesToCopy");
      if (res == null) return null;
      return new FileCopyList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringList getDllsToRegister() {
    try {
      Object res = javonetHandle.<NObject>get("DllsToRegister");
      if (res == null) return null;
      return new StringList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIcon(Icon value) {
    try {
      javonetHandle.set("Icon", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Icon getIcon() {
    try {
      Object res = javonetHandle.<NObject>get("Icon");
      if (res == null) return null;
      return new Icon((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeleteUnzippedFiles(java.lang.Boolean value) {
    try {
      javonetHandle.set("DeleteUnzippedFiles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDeleteUnzippedFiles() {
    try {
      java.lang.Boolean res = javonetHandle.get("DeleteUnzippedFiles");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgramGroup getProgramGroup() {
    try {
      Object res = javonetHandle.<NObject>get("ProgramGroup");
      if (res == null) return null;
      return new ProgramGroup((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RegistryKeyList getRegistryKeys() {
    try {
      Object res = javonetHandle.<NObject>get("RegistryKeys");
      if (res == null) return null;
      return new RegistryKeyList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ButtonCaptionList getButtonCaptions() {
    try {
      Object res = javonetHandle.<NObject>get("ButtonCaptions");
      if (res == null) return null;
      return new ButtonCaptionList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DialogMessageList getDialogMessages() {
    try {
      Object res = javonetHandle.<NObject>get("DialogMessages");
      if (res == null) return null;
      return new DialogMessageList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DialogStringList getDialogStrings() {
    try {
      Object res = javonetHandle.<NObject>get("DialogStrings");
      if (res == null) return null;
      return new DialogStringList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWriteConfigurationStringsAsUnicode(java.lang.Boolean value) {
    try {
      javonetHandle.set("WriteConfigurationStringsAsUnicode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getWriteConfigurationStringsAsUnicode() {
    try {
      java.lang.Boolean res = javonetHandle.get("WriteConfigurationStringsAsUnicode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public XceedSfxPrefix(AbstractFile sourceModule) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.Sfx.XceedSfxPrefix", sourceModule);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XceedSfxPrefix(NObject handle) {
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
