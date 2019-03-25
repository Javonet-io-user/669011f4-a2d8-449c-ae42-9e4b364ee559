package Xceed.FileSystem.Threading;

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
import Xceed.FileSystem.Threading.*;
import jio.System.IO.*;
import jio.System.*;

public interface IMultiThreadItem {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean CanBeProcessed();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Setup(Stream outputStream);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Process(jio.System.Exception exception);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ProcessEnded(jio.System.Exception exception);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Complete(java.lang.Boolean success, jio.System.Exception exception);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MultiThreadExceptionAction OnException(jio.System.Exception exception);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Reset();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream OpenPhysicalDestination();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDisplayName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSourceName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDestinationName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Exception getException();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAborted();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setException(jio.System.Exception value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAborted(java.lang.Boolean value);
}
