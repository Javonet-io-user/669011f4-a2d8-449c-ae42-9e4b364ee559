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
import Xceed.FileSystem.*;
import jio.System.*;

public interface IFileSystemInfo {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Refresh();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getExists();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public FileAttributes getAttributes();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ReparsePointTags getReparsePointTags();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFullName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getCreationTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastWriteTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastAccessTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getCreationTimeUtc();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastWriteTimeUtc();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastAccessTimeUtc();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAttributes(FileAttributes value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCreationTime(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLastWriteTime(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLastAccessTime(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCreationTimeUtc(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLastWriteTimeUtc(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLastAccessTimeUtc(DateTime value);
}
