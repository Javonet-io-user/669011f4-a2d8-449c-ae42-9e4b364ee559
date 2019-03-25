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
import jio.System.IO.*;

public interface IFileOperationSourceHint {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream DoOpenWrite(
      FileSystemEventsSession session,
      java.lang.Boolean overwrite,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions,
      java.lang.Boolean openPhysicalStreamOnly,
      Stream outputStream);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Stream DoCreateWrite(
      FileSystemEventsSession session,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions,
      java.lang.Boolean openPhysicalStreamOnly,
      Stream outputStream);
}
