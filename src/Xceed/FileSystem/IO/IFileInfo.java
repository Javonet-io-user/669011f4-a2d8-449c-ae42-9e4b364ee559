package Xceed.FileSystem.IO;

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
import Xceed.FileSystem.IO.*;
import jio.System.IO.*;

public interface IFileInfo extends IFileSystemInfo {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void MoveTo(java.lang.String destFileName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Delete();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FileStream Create();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FileStream Open(FileMode mode, FileAccess access, FileShare share);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FileStream Open(
      FileMode mode,
      FileAccess access,
      FileShare share,
      java.lang.Integer bufferSize,
      FileOptions fileOptions);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDirectoryName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IDirectoryInfo getDirectory();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getLength();
}
