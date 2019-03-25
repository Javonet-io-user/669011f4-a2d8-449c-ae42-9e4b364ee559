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
import Xceed.FileSystem.*;
import jio.System.*;
import jio.System.Text.*;
import Xceed.Compression.*;
import Xceed.Zip.Sfx.*;
import jio.System.IO.*;

public class ZipArchive extends ZippedFolder implements IBatchUpdateable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCommentAsZipArchive(java.lang.String value) {
    try {
      javonetHandle.set("Comment", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCommentAsZipArchive() {
    try {
      java.lang.String res = javonetHandle.get("Comment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultDecryptionPassword(java.lang.String value) {
    try {
      javonetHandle.set("DefaultDecryptionPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultDecryptionPassword() {
    try {
      java.lang.String res = javonetHandle.get("DefaultDecryptionPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultEncryptionPassword(java.lang.String value) {
    try {
      javonetHandle.set("DefaultEncryptionPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultEncryptionPassword() {
    try {
      java.lang.String res = javonetHandle.get("DefaultEncryptionPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultPasswordTextEncoding(Encoding value) {
    try {
      javonetHandle.set("DefaultPasswordTextEncoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Encoding getDefaultPasswordTextEncoding() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultPasswordTextEncoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultEncryptionMethod(EncryptionMethod value) {
    try {
      javonetHandle.set("DefaultEncryptionMethod", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EncryptionMethod getDefaultEncryptionMethod() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultEncryptionMethod");
      if (res == null) return null;
      return EncryptionMethod.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultEncryptionStrength(java.lang.Integer value) {
    try {
      javonetHandle.set("DefaultEncryptionStrength", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDefaultEncryptionStrength() {
    try {
      java.lang.Integer res = javonetHandle.get("DefaultEncryptionStrength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultCompressionMethod(CompressionMethod value) {
    try {
      javonetHandle.set("DefaultCompressionMethod", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CompressionMethod getDefaultCompressionMethod() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultCompressionMethod");
      if (res == null) return null;
      return CompressionMethod.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultCompressionLevel(CompressionLevel value) {
    try {
      javonetHandle.set("DefaultCompressionLevel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CompressionLevel getDefaultCompressionLevel() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultCompressionLevel");
      if (res == null) return null;
      return CompressionLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultTextEncoding(TextEncoding value) {
    try {
      javonetHandle.set("DefaultTextEncoding", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TextEncoding getDefaultTextEncoding() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultTextEncoding");
      if (res == null) return null;
      return TextEncoding.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultUnicodeUsagePolicy(UnicodeUsagePolicy value) {
    try {
      javonetHandle.set("DefaultUnicodeUsagePolicy", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public UnicodeUsagePolicy getDefaultUnicodeUsagePolicy() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultUnicodeUsagePolicy");
      if (res == null) return null;
      return UnicodeUsagePolicy.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AbstractFile getZipFile() {
    try {
      Object res = javonetHandle.<NObject>get("ZipFile");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSfxPrefix(SfxPrefix value) {
    try {
      javonetHandle.set("SfxPrefix", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SfxPrefix getSfxPrefix() {
    try {
      Object res = javonetHandle.<NObject>get("SfxPrefix");
      if (res == null) return null;
      return new SfxPrefix((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSplitSize(java.lang.Long value) {
    try {
      javonetHandle.set("SplitSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getSplitSize() {
    try {
      java.lang.Long res = javonetHandle.get("SplitSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSplitNameFormat(SplitNameFormat value) {
    try {
      javonetHandle.set("SplitNameFormat", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SplitNameFormat getSplitNameFormat() {
    try {
      Object res = javonetHandle.<NEnum>get("SplitNameFormat");
      if (res == null) return null;
      return SplitNameFormat.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowSpanning(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowSpanning", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowSpanning() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowSpanning");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultTempFolder(AbstractFolder value) {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").set("DefaultTempFolder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static AbstractFolder getDefaultTempFolder() {
    try {
      Object res = Javonet.getType("Xceed.Zip.ZipArchive").<NObject>get("DefaultTempFolder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTempFolder(AbstractFolder value) {
    try {
      javonetHandle.set("TempFolder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AbstractFolder getTempFolder() {
    try {
      Object res = javonetHandle.<NObject>get("TempFolder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultFolderPersistence(FolderPersistence value) {
    try {
      javonetHandle.set("DefaultFolderPersistence", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FolderPersistence getDefaultFolderPersistence() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultFolderPersistence");
      if (res == null) return null;
      return FolderPersistence.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultExtraHeaders(ExtraHeaders value) {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").set("DefaultExtraHeaders", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static ExtraHeaders getDefaultExtraHeaders() {
    try {
      Object res = Javonet.getType("Xceed.Zip.ZipArchive").<NEnum>get("DefaultExtraHeaders");
      if (res == null) return null;
      return ExtraHeaders.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getPendingActionCount() {
    try {
      java.lang.Long res = javonetHandle.get("PendingActionCount");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAesAlgorithmManager(IAesAlgorithmManager value) {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").set("AesAlgorithmManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static IAesAlgorithmManager getAesAlgorithmManager() {
    try {
      Object res = Javonet.getType("Xceed.Zip.ZipArchive").<NObject>get("AesAlgorithmManager");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseLocalMachineOEMCodePageForFilenames(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseLocalMachineOEMCodePageForFilenames", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseLocalMachineOEMCodePageForFilenames() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseLocalMachineOEMCodePageForFilenames");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnknownCharacterFallbackConversion(java.lang.Byte value) {
    try {
      javonetHandle.set("UnknownCharacterFallbackConversion", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte getUnknownCharacterFallbackConversion() {
    try {
      java.lang.Byte res = javonetHandle.get("UnknownCharacterFallbackConversion");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseUnsafeCompressionMethodVersions(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseUnsafeCompressionMethodVersions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseUnsafeCompressionMethodVersions() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseUnsafeCompressionMethodVersions");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMultiThreadManager(ZipMultiThreadManager value) {
    try {
      javonetHandle.set("MultiThreadManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ZipMultiThreadManager getMultiThreadManager() {
    try {
      Object res = javonetHandle.<NObject>get("MultiThreadManager");
      if (res == null) return null;
      return new ZipMultiThreadManager((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNumAutoRetries(java.lang.Integer value) {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").set("NumAutoRetries", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getNumAutoRetries() {
    try {
      java.lang.Integer res = Javonet.getType("Xceed.Zip.ZipArchive").get("NumAutoRetries");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAutoRetryDelay(java.lang.Integer value) {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").set("AutoRetryDelay", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getAutoRetryDelay() {
    try {
      java.lang.Integer res = Javonet.getType("Xceed.Zip.ZipArchive").get("AutoRetryDelay");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSkipChecksumOnStoredFiles(java.lang.Boolean value) {
    try {
      javonetHandle.set("SkipChecksumOnStoredFiles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSkipChecksumOnStoredFiles() {
    try {
      java.lang.Boolean res = javonetHandle.get("SkipChecksumOnStoredFiles");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTraceWriter(TextWriter value) {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").set("TraceWriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static TextWriter getTraceWriter() {
    try {
      Object res = Javonet.getType("Xceed.Zip.ZipArchive").<NObject>get("TraceWriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ZipArchive(AbstractFile zipFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipArchive", zipFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipArchive(FileSystemEvents events, Object userData, AbstractFile zipFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipArchive", events, userData, zipFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipArchive(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ClearCachedZipHandlers() {
    try {
      Javonet.getType("Xceed.Zip.ZipArchive").invoke("ClearCachedZipHandlers");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BeginUpdate() {
    try {
      javonetHandle.explicitInterface("Xceed.FileSystem.IBatchUpdateable").invoke("BeginUpdate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BeginUpdate(FileSystemEvents events, Object userData) {
    try {
      javonetHandle
          .explicitInterface("Xceed.FileSystem.IBatchUpdateable")
          .invoke("BeginUpdate", events, userData);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndUpdate() {
    try {
      javonetHandle.explicitInterface("Xceed.FileSystem.IBatchUpdateable").invoke("EndUpdate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndUpdate(FileSystemEvents events, Object userData) {
    try {
      javonetHandle
          .explicitInterface("Xceed.FileSystem.IBatchUpdateable")
          .invoke("EndUpdate", events, userData);
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
