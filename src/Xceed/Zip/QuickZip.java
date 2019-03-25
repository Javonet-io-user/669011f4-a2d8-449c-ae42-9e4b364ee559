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
import Xceed.Zip.*;
import Xceed.Compression.*;
import jio.System.*;
import Xceed.Zip.Sfx.*;

public class QuickZip {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QuickZipItem[] GetZipContents(
      java.lang.String zipFileName, java.lang.String[] fileMasks, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Zip.QuickZip")
              .invoke("GetZipContents", zipFileName, new Object[] {fileMasks});
      if (res == null) return null;
      return (QuickZipItem[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QuickZipItem[] GetZipContents(
      java.lang.String zipFileName,
      java.lang.Boolean recursive,
      java.lang.String[] fileMasks,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Zip.QuickZip")
              .invoke("GetZipContents", zipFileName, recursive, new Object[] {fileMasks});
      if (res == null) return null;
      return (QuickZipItem[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QuickZipItem[] GetZipContents(
      java.lang.String zipFileName,
      java.lang.String decryptionPassword,
      java.lang.Boolean recursive,
      java.lang.String[] fileMasks,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("Xceed.Zip.QuickZip")
              .invoke(
                  "GetZipContents",
                  zipFileName,
                  decryptionPassword,
                  recursive,
                  new Object[] {fileMasks});
      if (res == null) return null;
      return (QuickZipItem[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(java.lang.String zipFileName, java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip").invoke("Zip", zipFileName, new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              replaceExistingFiles,
              recursive,
              preservePaths,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              replaceExistingFiles,
              recursive,
              preservePaths,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      CompressionMethod compressionMethod,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              NEnum.fromJavaEnum(compressionMethod),
              replaceExistingFiles,
              recursive,
              preservePaths,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.Long splitSize,
      SplitNameFormat splitNameFormat,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              splitSize,
              NEnum.fromJavaEnum(splitNameFormat),
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.Long splitSize,
      SplitNameFormat splitNameFormat,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              replaceExistingFiles,
              recursive,
              preservePaths,
              splitSize,
              NEnum.fromJavaEnum(splitNameFormat),
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      Object userParams,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              diskRequiredCallback,
              userParams,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      Object userParams,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              replaceExistingFiles,
              recursive,
              preservePaths,
              diskRequiredCallback,
              userParams,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      SfxPrefix sfx,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              sfx,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      SfxPrefix sfx,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      Object userParams,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              sfx,
              diskRequiredCallback,
              userParams,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.Long splitSize,
      SplitNameFormat splitNameFormat,
      SfxPrefix sfx,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      QuickZip.ByteProgressionCallback byteProgressionCallback,
      QuickZip.ItemProgressionCallback itemProgressionCallback,
      Object userParams,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              replaceExistingFiles,
              recursive,
              preservePaths,
              splitSize,
              NEnum.fromJavaEnum(splitNameFormat),
              sfx,
              diskRequiredCallback,
              byteProgressionCallback,
              itemProgressionCallback,
              userParams,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Zip(
      java.lang.String zipFileName,
      java.lang.String encryptionPassword,
      EncryptionMethod encryptionMethod,
      CompressionMethod compressionMethod,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.Long splitSize,
      SplitNameFormat splitNameFormat,
      SfxPrefix sfx,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      QuickZip.ByteProgressionCallback byteProgressionCallback,
      QuickZip.ItemProgressionCallback itemProgressionCallback,
      Object userParams,
      java.lang.String[] filesToZip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Zip",
              zipFileName,
              encryptionPassword,
              NEnum.fromJavaEnum(encryptionMethod),
              NEnum.fromJavaEnum(compressionMethod),
              replaceExistingFiles,
              recursive,
              preservePaths,
              splitSize,
              NEnum.fromJavaEnum(splitNameFormat),
              sfx,
              diskRequiredCallback,
              byteProgressionCallback,
              itemProgressionCallback,
              userParams,
              new Object[] {filesToZip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Unzip(
      java.lang.String zipFileName,
      java.lang.String destinationFolder,
      java.lang.String[] filesToUnzip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke("Unzip", zipFileName, destinationFolder, new Object[] {filesToUnzip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Unzip(
      java.lang.String zipFileName,
      java.lang.String destinationFolder,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.String[] filesToUnzip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Unzip",
              zipFileName,
              destinationFolder,
              replaceExistingFiles,
              recursive,
              preservePaths,
              new Object[] {filesToUnzip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Unzip(
      java.lang.String zipFileName,
      java.lang.String destinationFolder,
      java.lang.String decryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      java.lang.String[] filesToUnzip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Unzip",
              zipFileName,
              destinationFolder,
              decryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              new Object[] {filesToUnzip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Unzip(
      java.lang.String zipFileName,
      java.lang.String destinationFolder,
      java.lang.String decryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      Object userParams,
      java.lang.String[] filesToUnzip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Unzip",
              zipFileName,
              destinationFolder,
              decryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              diskRequiredCallback,
              userParams,
              new Object[] {filesToUnzip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Unzip(
      java.lang.String zipFileName,
      java.lang.String destinationFolder,
      java.lang.String decryptionPassword,
      java.lang.Boolean replaceExistingFiles,
      java.lang.Boolean recursive,
      java.lang.Boolean preservePaths,
      QuickZip.DiskRequiredCallback diskRequiredCallback,
      QuickZip.ByteProgressionCallback byteProgressionCallback,
      QuickZip.ItemProgressionCallback itemProgressionCallback,
      Object userParams,
      java.lang.String[] filesToUnzip) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke(
              "Unzip",
              zipFileName,
              destinationFolder,
              decryptionPassword,
              replaceExistingFiles,
              recursive,
              preservePaths,
              diskRequiredCallback,
              byteProgressionCallback,
              itemProgressionCallback,
              userParams,
              new Object[] {filesToUnzip});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Remove(java.lang.String zipFileName, java.lang.String[] filesToRemove) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke("Remove", zipFileName, new Object[] {filesToRemove});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Remove(
      java.lang.String zipFileName, java.lang.Boolean recursive, java.lang.String[] filesToRemove) {
    try {
      Javonet.getType("Xceed.Zip.QuickZip")
          .invoke("Remove", zipFileName, recursive, new Object[] {filesToRemove});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public interface DiskRequiredCallback {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public java.lang.Boolean Invoke(
        java.lang.String zipFileName, java.lang.Integer diskNumber, Object userParams);
  }

  public interface ByteProgressionCallback {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(
        java.lang.String currentItemName,
        java.lang.Long currentItemBytesProcessed,
        java.lang.Long currentItemTotalBytes,
        java.lang.Byte currentItemPercent,
        java.lang.Long allFilesBytesProcessed,
        java.lang.Long allFilesTotalBytes,
        java.lang.Byte allFilesPercent,
        Object userParams);
  }

  public interface ItemProgressionCallback {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(
        java.lang.String currentItemName,
        java.lang.Long itemsProcessed,
        java.lang.Long totalItemsCount,
        java.lang.Byte totalItemsPercent,
        AtomicReference<java.lang.Boolean> abort,
        Object userParams);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
