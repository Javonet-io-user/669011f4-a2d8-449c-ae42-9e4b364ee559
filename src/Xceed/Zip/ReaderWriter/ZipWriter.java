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
import jio.System.IO.*;
import jio.System.*;
import Xceed.Compression.*;
import Xceed.Zip.*;
import jio.System.Text.*;

public class ZipWriter implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Stream getOutputStream() {
    try {
      Object res = javonetHandle.<NObject>get("OutputStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowOutputStreamClosure(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowOutputStreamClosure", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowOutputStreamClosure() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowOutputStreamClosure");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowZip64Extensions() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowZip64Extensions");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAesAlgorithmManager(IAesAlgorithmManager value) {
    try {
      javonetHandle.set("AesAlgorithmManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IAesAlgorithmManager getAesAlgorithmManager() {
    try {
      Object res = javonetHandle.<NObject>get("AesAlgorithmManager");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowUncompressedData(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowUncompressedData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowUncompressedData() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowUncompressedData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextEncoding(TextEncoding value) {
    try {
      javonetHandle.set("TextEncoding", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  public void setMultiThreadManager(ZipWriterMultiThreadManager value) {
    try {
      javonetHandle.set("MultiThreadManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ZipWriterMultiThreadManager getMultiThreadManager() {
    try {
      Object res = javonetHandle.<NObject>get("MultiThreadManager");
      if (res == null) return null;
      return new ZipWriterMultiThreadManager((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ZipWriter(Stream outputStream) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ReaderWriter.ZipWriter", outputStream);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipWriterByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipWriterByteProgressionEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriter(Stream outputStream, java.lang.Boolean allowZip64Extensions) {
    try {
      javonetHandle =
          Javonet.New("Xceed.Zip.ReaderWriter.ZipWriter", outputStream, allowZip64Extensions);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipWriterByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipWriterByteProgressionEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriter(
      Stream outputStream,
      java.lang.Boolean allowZip64Extensions,
      java.lang.Boolean allowOutputStreamClosure) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Zip.ReaderWriter.ZipWriter",
              outputStream,
              allowZip64Extensions,
              allowOutputStreamClosure);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipWriterByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipWriterByteProgressionEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipWriter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteItemLocalHeader(ZipItemLocalHeader zipItemLocalHeader) {
    try {
      javonetHandle.invoke("WriteItemLocalHeader", zipItemLocalHeader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Stream GetItemDataStream() {
    try {
      Object res = javonetHandle.invoke("GetItemDataStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(Stream itemData) {
    try {
      java.lang.Long res = javonetHandle.invoke("WriteItemData", itemData);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(Stream itemData, java.lang.Integer bufferSize) {
    try {
      java.lang.Long res = javonetHandle.invoke("WriteItemData", itemData, bufferSize);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(Stream itemData, java.lang.Byte[] buffer) {
    try {
      java.lang.Long res = javonetHandle.invoke("WriteItemData", itemData, new Object[] {buffer});
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(
      Stream itemData, java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      java.lang.Long res =
          javonetHandle.invoke("WriteItemData", itemData, new Object[] {buffer}, offset, count);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteItemData(java.lang.Byte[] itemData) {
    try {
      javonetHandle.invoke("WriteItemData", new Object[] {itemData});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteItemData(
      java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      javonetHandle.invoke("WriteItemData", new Object[] {buffer}, offset, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CloseZipFile() {
    try {
      javonetHandle.invoke("CloseZipFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CloseZipFile(ZipEndHeader endHeader) {
    try {
      javonetHandle.invoke("CloseZipFile", endHeader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void QueueItem(
      ZipItemLocalHeader zipItemLocalHeader, ZipItemDataProvider zipItemDataProvider) {
    try {
      javonetHandle.invoke("QueueItem", zipItemLocalHeader, zipItemDataProvider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void QueueItem(
      ZipItemLocalHeader zipItemLocalHeader,
      Object userData,
      ZipItemDataProvider zipItemDataProvider) {
    try {
      javonetHandle.invoke("QueueItem", zipItemLocalHeader, userData, zipItemDataProvider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ZipWriterByteProgressionEventArgs>>
      _ByteProgressionListeners =
          new java.util.ArrayList<EventHandler<ZipWriterByteProgressionEventArgs>>();

  public void addByteProgression(EventHandler<ZipWriterByteProgressionEventArgs> toAdd) {
    _ByteProgressionListeners.add(toAdd);
  }

  public void removeByteProgression(EventHandler<ZipWriterByteProgressionEventArgs> toRemove) {
    _ByteProgressionListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
