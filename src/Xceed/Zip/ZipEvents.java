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
import jio.System.*;

public class ZipEvents extends FileSystemEvents {
  protected NObject javonetHandle;

  public ZipEvents() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Xceed.Zip.ZipEvents");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ReadingZipItemProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ReadingZipItemProgressionEventHandler handler :
                  _ReadingZipItemProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BuildingZipItemProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BuildingZipItemProgressionEventHandler handler :
                  _BuildingZipItemProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ItemProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "BuildingZipByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (BuildingZipByteProgressionEventHandler handler :
                  _BuildingZipByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CopyingZipByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CopyingZipByteProgressionEventHandler handler :
                  _CopyingZipByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GatheringZipContentByteProgression",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GatheringZipContentByteProgressionEventHandler handler :
                  _GatheringZipContentByteProgressionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ByteProgressionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DiskRequired",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DiskRequiredEventHandler handler : _DiskRequiredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DiskRequiredEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ZipEvents(NObject handle) {
    super(handle);
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
  /** Event */

  private java.util.ArrayList<ReadingZipItemProgressionEventHandler>
      _ReadingZipItemProgressionListeners =
          new java.util.ArrayList<ReadingZipItemProgressionEventHandler>();

  public void addReadingZipItemProgression(ReadingZipItemProgressionEventHandler toAdd) {
    _ReadingZipItemProgressionListeners.add(toAdd);
  }

  public void removeReadingZipItemProgression(ReadingZipItemProgressionEventHandler toRemove) {
    _ReadingZipItemProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<BuildingZipItemProgressionEventHandler>
      _BuildingZipItemProgressionListeners =
          new java.util.ArrayList<BuildingZipItemProgressionEventHandler>();

  public void addBuildingZipItemProgression(BuildingZipItemProgressionEventHandler toAdd) {
    _BuildingZipItemProgressionListeners.add(toAdd);
  }

  public void removeBuildingZipItemProgression(BuildingZipItemProgressionEventHandler toRemove) {
    _BuildingZipItemProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<BuildingZipByteProgressionEventHandler>
      _BuildingZipByteProgressionListeners =
          new java.util.ArrayList<BuildingZipByteProgressionEventHandler>();

  public void addBuildingZipByteProgression(BuildingZipByteProgressionEventHandler toAdd) {
    _BuildingZipByteProgressionListeners.add(toAdd);
  }

  public void removeBuildingZipByteProgression(BuildingZipByteProgressionEventHandler toRemove) {
    _BuildingZipByteProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CopyingZipByteProgressionEventHandler>
      _CopyingZipByteProgressionListeners =
          new java.util.ArrayList<CopyingZipByteProgressionEventHandler>();

  public void addCopyingZipByteProgression(CopyingZipByteProgressionEventHandler toAdd) {
    _CopyingZipByteProgressionListeners.add(toAdd);
  }

  public void removeCopyingZipByteProgression(CopyingZipByteProgressionEventHandler toRemove) {
    _CopyingZipByteProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GatheringZipContentByteProgressionEventHandler>
      _GatheringZipContentByteProgressionListeners =
          new java.util.ArrayList<GatheringZipContentByteProgressionEventHandler>();

  public void addGatheringZipContentByteProgression(
      GatheringZipContentByteProgressionEventHandler toAdd) {
    _GatheringZipContentByteProgressionListeners.add(toAdd);
  }

  public void removeGatheringZipContentByteProgression(
      GatheringZipContentByteProgressionEventHandler toRemove) {
    _GatheringZipContentByteProgressionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DiskRequiredEventHandler> _DiskRequiredListeners =
      new java.util.ArrayList<DiskRequiredEventHandler>();

  public void addDiskRequired(DiskRequiredEventHandler toAdd) {
    _DiskRequiredListeners.add(toAdd);
  }

  public void removeDiskRequired(DiskRequiredEventHandler toRemove) {
    _DiskRequiredListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
