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
import jio.System.*;
import Xceed.FileSystem.Threading.*;

public abstract class AbstractFile extends FileSystemItem {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getSize() {
    try {
      java.lang.Long res = javonetHandle.get("Size");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultStreamBufferSize(java.lang.Integer value) {
    try {
      Javonet.getType("Xceed.FileSystem.AbstractFile").set("DefaultStreamBufferSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getDefaultStreamBufferSize() {
    try {
      java.lang.Integer res =
          Javonet.getType("Xceed.FileSystem.AbstractFile").get("DefaultStreamBufferSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static FileShare getDefaultReadFileShare() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.AbstractFile").<NEnum>get("DefaultReadFileShare");
      if (res == null) return null;
      return FileShare.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultReadFileShare(FileShare param) {
    try {
      Javonet.getType("Xceed.FileSystem.AbstractFile")
          .set("DefaultReadFileShare", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static FileShare getDefaultWriteFileShare() {
    try {
      Object res =
          Javonet.getType("Xceed.FileSystem.AbstractFile").<NEnum>get("DefaultWriteFileShare");
      if (res == null) return null;
      return FileShare.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultWriteFileShare(FileShare param) {
    try {
      Javonet.getType("Xceed.FileSystem.AbstractFile")
          .set("DefaultWriteFileShare", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AbstractFile(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead() {
    try {
      Object res = javonetHandle.invoke("OpenRead");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead(FileShare share) {
    try {
      Object res = javonetHandle.invoke("OpenRead", NEnum.fromJavaEnum(share));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead(FileSystemEvents events, Object userData) {
    try {
      Object res = javonetHandle.invoke("OpenRead", events, userData);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead(FileSystemEvents events, Object userData, FileShare share) {
    try {
      Object res = javonetHandle.invoke("OpenRead", events, userData, NEnum.fromJavaEnum(share));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead(
      FileSystemEvents events, Object userData, FileShare share, FileOptions fileOptions) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenRead",
              events,
              userData,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(java.lang.Boolean overwrite) {
    try {
      Object res = javonetHandle.invoke("OpenWrite", overwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(java.lang.Boolean overwrite, FileShare share) {
    try {
      Object res = javonetHandle.invoke("OpenWrite", overwrite, NEnum.fromJavaEnum(share));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(FileSystemEvents events, Object userData, java.lang.Boolean overwrite) {
    try {
      Object res = javonetHandle.invoke("OpenWrite", events, userData, overwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(
      FileSystemEvents events, Object userData, java.lang.Boolean overwrite, FileShare share) {
    try {
      Object res =
          javonetHandle.invoke("OpenWrite", events, userData, overwrite, NEnum.fromJavaEnum(share));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(
      FileSystemEvents events,
      Object userData,
      java.lang.Boolean overwrite,
      FileShare share,
      FileOptions fileOptions) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              events,
              userData,
              overwrite,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(
      FileSystemEvents events,
      Object userData,
      java.lang.Boolean overwrite,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              events,
              userData,
              overwrite,
              sourceFileHint,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenWrite(
      FileSystemEvents events,
      Object userData,
      java.lang.Boolean overwrite,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions,
      java.lang.Boolean openPhysicalStreamOnly,
      Stream outputStream) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              events,
              userData,
              overwrite,
              sourceFileHint,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions),
              openPhysicalStreamOnly,
              outputStream);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite() {
    try {
      Object res = javonetHandle.invoke("CreateWrite");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite(FileShare share) {
    try {
      Object res = javonetHandle.invoke("CreateWrite", NEnum.fromJavaEnum(share));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite(FileSystemEvents events, Object userData) {
    try {
      Object res = javonetHandle.invoke("CreateWrite", events, userData);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite(FileSystemEvents events, Object userData, FileShare share) {
    try {
      Object res = javonetHandle.invoke("CreateWrite", events, userData, NEnum.fromJavaEnum(share));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite(
      FileSystemEvents events, Object userData, FileShare share, FileOptions fileOptions) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateWrite",
              events,
              userData,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite(
      FileSystemEvents events,
      Object userData,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateWrite",
              events,
              userData,
              sourceFileHint,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream CreateWrite(
      FileSystemEvents events,
      Object userData,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions,
      java.lang.Boolean openPhysicalStreamOnly,
      Stream outputStream) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateWrite",
              events,
              userData,
              sourceFileHint,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(fileOptions),
              openPhysicalStreamOnly,
              outputStream);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem CopyTo(AbstractFile destinationFile, java.lang.Boolean replaceIfExists) {
    try {
      Object res = javonetHandle.invoke("CopyTo", destinationFile, replaceIfExists);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem CopyTo(
      FileSystemEvents events,
      Object userData,
      AbstractFile destinationFile,
      java.lang.Boolean replaceIfExists) {
    try {
      Object res =
          javonetHandle.invoke("CopyTo", events, userData, destinationFile, replaceIfExists);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem MoveTo(AbstractFile destinationFile, java.lang.Boolean replaceIfExists) {
    try {
      Object res = javonetHandle.invoke("MoveTo", destinationFile, replaceIfExists);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemItem MoveTo(
      FileSystemEvents events,
      Object userData,
      AbstractFile destinationFile,
      java.lang.Boolean replaceIfExists) {
    try {
      Object res =
          javonetHandle.invoke("MoveTo", events, userData, destinationFile, replaceIfExists);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DoCopyToSetup(
      FileSystemEventsSession session,
      FileSystemItem destination,
      java.lang.Boolean replaceExistingFiles,
      Stream outputStream,
      Stream sourceStream,
      AbstractFile destinationFile,
      Stream destinationStream,
      AtomicReference<java.lang.Boolean> created,
      AtomicReference<java.lang.Byte[]> buffer,
      AtomicReference<java.lang.Integer> bufferOffset,
      AtomicReference<java.lang.Integer> bufferSize) {
    try {
      javonetHandle.invoke(
          "DoCopyToSetup",
          session,
          destination,
          replaceExistingFiles,
          outputStream,
          sourceStream,
          destinationFile,
          destinationStream,
          new NOut(created, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)),
          new NOut(buffer, JavonetHelper.JavaToDotnetType.get(java.lang.Byte[].class)),
          new NOut(bufferOffset, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)),
          new NOut(bufferSize, JavonetHelper.JavaToDotnetType.get(java.lang.Integer.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DoCopyToLoop(
      FileSystemEventsSession session,
      FileSystemItem destination,
      java.lang.Boolean replaceExistingFiles,
      Stream sourceStream,
      AbstractFile destinationFile,
      Stream destinationStream,
      java.lang.Boolean created,
      java.lang.Byte[] buffer,
      java.lang.Integer bufferOffset,
      java.lang.Integer bufferSize,
      ByteProgressionEventArgs byteProgressionEventArgs,
      java.lang.Boolean throwException,
      jio.System.Exception exception,
      IMultiThreadItem multiThreadItem) {
    try {
      javonetHandle.invoke(
          "DoCopyToLoop",
          session,
          destination,
          replaceExistingFiles,
          sourceStream,
          destinationFile,
          destinationStream,
          created,
          new Object[] {buffer},
          bufferOffset,
          bufferSize,
          byteProgressionEventArgs,
          throwException,
          exception,
          multiThreadItem);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void DoCopyToComplete(
      FileSystemEventsSession session,
      FileSystemItem destination,
      java.lang.Boolean replaceExistingFiles,
      AbstractFile destinationFile,
      java.lang.Boolean created,
      java.lang.Boolean success,
      jio.System.Exception exception) {
    try {
      javonetHandle.invoke(
          "DoCopyToComplete",
          session,
          destination,
          replaceExistingFiles,
          destinationFile,
          created,
          success,
          exception);
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
