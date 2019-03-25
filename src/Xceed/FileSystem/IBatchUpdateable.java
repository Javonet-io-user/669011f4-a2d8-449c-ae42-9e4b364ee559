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

public interface IBatchUpdateable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void BeginUpdate();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void BeginUpdate(FileSystemEvents events, Object userData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndUpdate();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void EndUpdate(FileSystemEvents events, Object userData);
}
