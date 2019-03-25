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

public interface IPathDelegate {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Trim(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetFullPath(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetFileName(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsPathRooted(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetPathRoot(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDirectoryName(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Combine(java.lang.String path1, java.lang.String path2);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getAltDirectorySeparatorChar();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Character getDirectorySeparatorChar();
}
