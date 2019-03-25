package Xceed.Zip.ReaderWriter;

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
import Xceed.Zip.ReaderWriter.*;
import Xceed.Compression.*;
import Xceed.Zip.*;
import jio.System.*;

public class ZipItemLocalHeader {
  protected NObject javonetHandle;
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
  public void setEncryptionMethod(EncryptionMethod value) {
    try {
      javonetHandle.set("EncryptionMethod", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFileName(java.lang.String value) {
    try {
      javonetHandle.set("FileName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFileName() {
    try {
      java.lang.String res = javonetHandle.get("FileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  public java.lang.Boolean getIsFolder() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsFolder");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLastWriteDateTime(DateTime value) {
    try {
      javonetHandle.set("LastWriteDateTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastWriteDateTime() {
    try {
      Object res = javonetHandle.<NObject>get("LastWriteDateTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUncompressedSize(Nullable<java.lang.Long> value) {
    try {
      javonetHandle.set("UncompressedSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getUncompressedSize() {
    try {
      Object res = javonetHandle.<NObject>get("UncompressedSize");
      if (res == null) return null;
      return new Nullable<java.lang.Long>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ZipItemLocalHeader() {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ReaderWriter.ZipItemLocalHeader");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipItemLocalHeader(java.lang.String fileName) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ReaderWriter.ZipItemLocalHeader", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipItemLocalHeader(
      java.lang.String fileName,
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Zip.ReaderWriter.ZipItemLocalHeader",
              fileName,
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipItemLocalHeader(
      java.lang.String fileName,
      CompressionMethod compressionMethod,
      CompressionLevel compressionLevel,
      EncryptionMethod encryptionMethod,
      java.lang.String encryptionPassword) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Zip.ReaderWriter.ZipItemLocalHeader",
              fileName,
              NEnum.fromJavaEnum(compressionMethod),
              NEnum.fromJavaEnum(compressionLevel),
              NEnum.fromJavaEnum(encryptionMethod),
              encryptionPassword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipItemLocalHeader(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ZipItemLocalHeader Clone() {
    try {
      Object res = javonetHandle.invoke("Clone");
      if (res == null) return null;
      return new ZipItemLocalHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
