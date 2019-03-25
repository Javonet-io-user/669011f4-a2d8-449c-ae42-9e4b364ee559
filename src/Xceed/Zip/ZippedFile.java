package Xceed.Zip;

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
import Xceed.Zip.*;
import jio.System.IO.*;
import jio.System.*;
import Xceed.Compression.*;

public class ZippedFile extends AbstractFile implements IFileOperationSourceHint {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCompressionLevel(CompressionLevel value) {
    try {
      javonetHandle.set("CompressionLevel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CompressionLevel getCompressionLevel() {
    try {
      Object res = javonetHandle.<NEnum>get("CompressionLevel");
      if (res == null) return null;
      return CompressionLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCompressionMethod(CompressionMethod value) {
    try {
      javonetHandle.set("CompressionMethod", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CompressionMethod getCompressionMethod() {
    try {
      Object res = javonetHandle.<NEnum>get("CompressionMethod");
      if (res == null) return null;
      return CompressionMethod.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCrc32() {
    try {
      java.lang.Integer res = javonetHandle.get("Crc32");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getCompressedSize() {
    try {
      java.lang.Long res = javonetHandle.get("CompressedSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setComment(java.lang.String value) {
    try {
      javonetHandle.set("Comment", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getComment() {
    try {
      java.lang.String res = javonetHandle.get("Comment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getEncrypted() {
    try {
      java.lang.Boolean res = javonetHandle.get("Encrypted");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EncryptionMethod getEncryptionMethod() {
    try {
      Object res = javonetHandle.<NEnum>get("EncryptionMethod");
      if (res == null) return null;
      return EncryptionMethod.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getEncryptionStrength() {
    try {
      java.lang.Integer res = javonetHandle.get("EncryptionStrength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncryptionPassword(java.lang.String value) {
    try {
      javonetHandle.set("EncryptionPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEncryptionPassword() {
    try {
      java.lang.String res = javonetHandle.get("EncryptionPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDecryptionPassword(java.lang.String value) {
    try {
      javonetHandle.set("DecryptionPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDecryptionPassword() {
    try {
      java.lang.String res = javonetHandle.get("DecryptionPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDiskNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("DiskNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtraHeaders(ExtraHeaders value) {
    try {
      javonetHandle.set("ExtraHeaders", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtraHeaders getExtraHeaders() {
    try {
      Object res = javonetHandle.<NEnum>get("ExtraHeaders");
      if (res == null) return null;
      return ExtraHeaders.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AbstractFile getHostFileAsZippedFile() {
    try {
      Object res = javonetHandle.<NObject>get("HostFile");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TextEncoding getTextEncoding() {
    try {
      Object res = javonetHandle.<NEnum>get("TextEncoding");
      if (res == null) return null;
      return TextEncoding.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public UnicodeUsagePolicy getUnicodeUsagePolicy() {
    try {
      Object res = javonetHandle.<NEnum>get("UnicodeUsagePolicy");
      if (res == null) return null;
      return UnicodeUsagePolicy.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getRelativeOffset() {
    try {
      java.lang.Long res = javonetHandle.get("RelativeOffset");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getHeaderSize() {
    try {
      java.lang.Long res = javonetHandle.get("HeaderSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ZippedFile(AbstractFile zipFile, java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZippedFile", zipFile, fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZippedFile(
      FileSystemEvents events, Object userData, AbstractFile zipFile, java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZippedFile", events, userData, zipFile, fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZippedFile(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead(java.lang.String decryptionPassword) {
    try {
      Object res = javonetHandle.invoke("OpenRead", decryptionPassword);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream OpenRead(FileShare share, java.lang.String decryptionPassword) {
    try {
      Object res = javonetHandle.invoke("OpenRead", NEnum.fromJavaEnum(share), decryptionPassword);
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
      FileSystemEvents events, Object userData, java.lang.String decryptionPassword) {
    try {
      Object res = javonetHandle.invoke("OpenRead", events, userData, decryptionPassword);
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
      FileSystemEvents events,
      Object userData,
      FileShare share,
      java.lang.String decryptionPassword) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenRead", events, userData, NEnum.fromJavaEnum(share), decryptionPassword);
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
      java.lang.Boolean overwrite,
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      java.lang.String encryptionPassword) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              overwrite,
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              encryptionPassword);
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
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      java.lang.Integer encryptionStrength) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              encryptionStrength);
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
      java.lang.Boolean overwrite,
      FileShare share,
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      java.lang.String encryptionPassword) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              overwrite,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              encryptionPassword);
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
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      java.lang.String encryptionPassword) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              events,
              userData,
              overwrite,
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              encryptionPassword);
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
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      java.lang.Integer encryptionStrength) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              events,
              userData,
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              encryptionStrength);
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
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      java.lang.String encryptionPassword) {
    try {
      Object res =
          javonetHandle.invoke(
              "OpenWrite",
              events,
              userData,
              overwrite,
              NEnum.fromJavaEnum(share),
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              encryptionPassword);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsSameAs(FileSystemItem target) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSameAs", target);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream DoOpenWrite(
      FileSystemEventsSession session,
      java.lang.Boolean overwrite,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions,
      java.lang.Boolean openPhysicalStreamOnly,
      Stream outputStream) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IFileOperationSourceHint")
              .invoke(
                  "DoOpenWrite",
                  session,
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
  public Stream DoCreateWrite(
      FileSystemEventsSession session,
      AbstractFile sourceFileHint,
      FileShare share,
      FileOptions fileOptions,
      java.lang.Boolean openPhysicalStreamOnly,
      Stream outputStream) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Xceed.FileSystem.IFileOperationSourceHint")
              .invoke(
                  "DoCreateWrite",
                  session,
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
