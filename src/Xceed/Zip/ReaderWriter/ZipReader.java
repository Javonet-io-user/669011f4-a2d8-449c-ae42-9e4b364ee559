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

public class ZipReader implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Stream getInputStream() {
    try {
      Object res = javonetHandle.<NObject>get("InputStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAllowInputStreamClosure(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowInputStreamClosure", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAllowInputStreamClosure() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowInputStreamClosure");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  public void setIgnoredExtraHeaders(ExtraHeaders value) {
    try {
      javonetHandle.set("IgnoredExtraHeaders", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtraHeaders getIgnoredExtraHeaders() {
    try {
      Object res = javonetHandle.<NEnum>get("IgnoredExtraHeaders");
      if (res == null) return null;
      return ExtraHeaders.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public ZipReader(Stream inputStream) {
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ReaderWriter.ZipReader", inputStream);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InvalidPassword",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderInvalidPasswordEventArgs> handler :
                  _InvalidPasswordListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderInvalidPasswordEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipReader(Stream inputStream, java.lang.String decryptionPassword) {
    try {
      javonetHandle =
          Javonet.New("Xceed.Zip.ReaderWriter.ZipReader", inputStream, decryptionPassword);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InvalidPassword",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderInvalidPasswordEventArgs> handler :
                  _InvalidPasswordListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderInvalidPasswordEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipReader(Stream inputStream, java.lang.Boolean allowInputStreamClosure) {
    try {
      javonetHandle =
          Javonet.New("Xceed.Zip.ReaderWriter.ZipReader", inputStream, allowInputStreamClosure);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InvalidPassword",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderInvalidPasswordEventArgs> handler :
                  _InvalidPasswordListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderInvalidPasswordEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipReader(
      Stream inputStream,
      java.lang.Boolean allowInputStreamClosure,
      java.lang.String decryptionPassword) {
    try {
      javonetHandle =
          Javonet.New(
              "Xceed.Zip.ReaderWriter.ZipReader",
              inputStream,
              allowInputStreamClosure,
              decryptionPassword);
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderByteProgressionEventArgs> handler :
                  _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "InvalidPassword",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<ZipReaderInvalidPasswordEventArgs> handler :
                  _InvalidPasswordListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ZipReaderInvalidPasswordEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipReader(NObject handle) {
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
  public ZipItemLocalHeader ReadItemLocalHeader() {
    try {
      Object res = javonetHandle.invoke("ReadItemLocalHeader");
      if (res == null) return null;
      return new ZipItemLocalHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ZipItemLocalHeader ReadItemLocalHeader(ZipItemLocalHeader itemLocalHeader) {
    try {
      Object res = javonetHandle.invoke("ReadItemLocalHeader", itemLocalHeader);
      if (res == null) return null;
      return new ZipItemLocalHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  public java.lang.Long ReadItemData(Stream stream) {
    try {
      java.lang.Long res = javonetHandle.invoke("ReadItemData", stream);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ReadItemData(Stream stream, java.lang.Integer bufferSize) {
    try {
      java.lang.Long res = javonetHandle.invoke("ReadItemData", stream, bufferSize);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ReadItemData(Stream stream, java.lang.Byte[] buffer) {
    try {
      java.lang.Long res = javonetHandle.invoke("ReadItemData", stream, new Object[] {buffer});
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ReadItemData(
      Stream stream, java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      java.lang.Long res =
          javonetHandle.invoke("ReadItemData", stream, new Object[] {buffer}, offset, count);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ReadItemData(java.lang.Byte[] buffer) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ReadItemData", new Object[] {buffer});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ReadItemData(
      java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("ReadItemData", new Object[] {buffer}, offset, count);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ZipEndHeader ReadEndHeader() {
    try {
      Object res = javonetHandle.invoke("ReadEndHeader");
      if (res == null) return null;
      return new ZipEndHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ZipReaderByteProgressionEventArgs>>
      _ByteProgressionListeners =
          new java.util.ArrayList<EventHandler<ZipReaderByteProgressionEventArgs>>();

  public void addByteProgression(EventHandler<ZipReaderByteProgressionEventArgs> toAdd) {
    _ByteProgressionListeners.add(toAdd);
  }

  public void removeByteProgression(EventHandler<ZipReaderByteProgressionEventArgs> toRemove) {
    _ByteProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EventHandler<ZipReaderInvalidPasswordEventArgs>>
      _InvalidPasswordListeners =
          new java.util.ArrayList<EventHandler<ZipReaderInvalidPasswordEventArgs>>();

  public void addInvalidPassword(EventHandler<ZipReaderInvalidPasswordEventArgs> toAdd) {
    _InvalidPasswordListeners.add(toAdd);
  }

  public void removeInvalidPassword(EventHandler<ZipReaderInvalidPasswordEventArgs> toRemove) {
    _InvalidPasswordListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
