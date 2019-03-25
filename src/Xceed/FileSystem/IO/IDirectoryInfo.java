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

public interface IDirectoryInfo extends IFileSystemInfo {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Create();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IDirectoryInfo[] GetDirectories(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFileInfo[] GetFiles(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFileSystemInfo[] GetFileSystemInfos(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void MoveTo(java.lang.String destDirName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Delete();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IDirectoryInfo getParent();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IDirectoryInfo getRoot();
}
