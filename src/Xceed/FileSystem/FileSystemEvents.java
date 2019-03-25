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

public class FileSystemEvents {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public static FileSystemEvents getEmpty() {
    try {
      Object res = Javonet.getType("Xceed.FileSystem.FileSystemEvents").<NObject>get("Empty");
      if (res == null) return null;
      return new FileSystemEvents((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FileSystemEvents() {
    try {
      javonetHandle = Javonet.New("Xceed.FileSystem.FileSystemEvents");
      javonetHandle.addEventListener(
          "ScanningFolder",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ScanningFolderEventHandler handler : _ScanningFolderListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ScanningFolderEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "AddingItemToProcess",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ItemProcessingEventHandler handler : _AddingItemToProcessListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemProcessingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PropertiesAppliedToItem",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ItemProcessingEventHandler handler : _PropertiesAppliedToItemListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemProcessingEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ItemProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ItemProgressionEventHandler handler : _ItemProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ItemCompletion",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ItemProgressionEventHandler handler : _ItemCompletionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ByteProgressionEventHandler handler : _ByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ItemException",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ItemExceptionEventHandler handler : _ItemExceptionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemExceptionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "PathException",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (PathExceptionEventHandler handler : _PathExceptionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], PathExceptionEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileSystemEvents(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public FileSystemEventsSession CreateSession(Object sender, Object userData) {
    try {
      Object res = javonetHandle.invoke("CreateSession", sender, userData);
      if (res == null) return null;
      return new FileSystemEventsSession((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void BeginSubOperation() {
    try {
      javonetHandle.invoke("BeginSubOperation");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void EndSubOperation() {
    try {
      javonetHandle.invoke("EndSubOperation");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<ScanningFolderEventHandler> _ScanningFolderListeners =
      new java.util.ArrayList<ScanningFolderEventHandler>();

  public void addScanningFolder(ScanningFolderEventHandler toAdd) {
    _ScanningFolderListeners.add(toAdd);
  }

  public void removeScanningFolder(ScanningFolderEventHandler toRemove) {
    _ScanningFolderListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ItemProcessingEventHandler> _AddingItemToProcessListeners =
      new java.util.ArrayList<ItemProcessingEventHandler>();

  public void addAddingItemToProcess(ItemProcessingEventHandler toAdd) {
    _AddingItemToProcessListeners.add(toAdd);
  }

  public void removeAddingItemToProcess(ItemProcessingEventHandler toRemove) {
    _AddingItemToProcessListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ItemProcessingEventHandler> _PropertiesAppliedToItemListeners =
      new java.util.ArrayList<ItemProcessingEventHandler>();

  public void addPropertiesAppliedToItem(ItemProcessingEventHandler toAdd) {
    _PropertiesAppliedToItemListeners.add(toAdd);
  }

  public void removePropertiesAppliedToItem(ItemProcessingEventHandler toRemove) {
    _PropertiesAppliedToItemListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ItemProgressionEventHandler> _ItemProgressionListeners =
      new java.util.ArrayList<ItemProgressionEventHandler>();

  public void addItemProgression(ItemProgressionEventHandler toAdd) {
    _ItemProgressionListeners.add(toAdd);
  }

  public void removeItemProgression(ItemProgressionEventHandler toRemove) {
    _ItemProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ItemProgressionEventHandler> _ItemCompletionListeners =
      new java.util.ArrayList<ItemProgressionEventHandler>();

  public void addItemCompletion(ItemProgressionEventHandler toAdd) {
    _ItemCompletionListeners.add(toAdd);
  }

  public void removeItemCompletion(ItemProgressionEventHandler toRemove) {
    _ItemCompletionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ByteProgressionEventHandler> _ByteProgressionListeners =
      new java.util.ArrayList<ByteProgressionEventHandler>();

  public void addByteProgression(ByteProgressionEventHandler toAdd) {
    _ByteProgressionListeners.add(toAdd);
  }

  public void removeByteProgression(ByteProgressionEventHandler toRemove) {
    _ByteProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ItemExceptionEventHandler> _ItemExceptionListeners =
      new java.util.ArrayList<ItemExceptionEventHandler>();

  public void addItemException(ItemExceptionEventHandler toAdd) {
    _ItemExceptionListeners.add(toAdd);
  }

  public void removeItemException(ItemExceptionEventHandler toRemove) {
    _ItemExceptionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<PathExceptionEventHandler> _PathExceptionListeners =
      new java.util.ArrayList<PathExceptionEventHandler>();

  public void addPathException(PathExceptionEventHandler toAdd) {
    _PathExceptionListeners.add(toAdd);
  }

  public void removePathException(PathExceptionEventHandler toRemove) {
    _PathExceptionListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
