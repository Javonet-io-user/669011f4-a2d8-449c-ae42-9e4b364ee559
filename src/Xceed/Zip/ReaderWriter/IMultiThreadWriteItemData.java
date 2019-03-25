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

public interface IMultiThreadWriteItemData {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(Stream itemData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(Stream itemData, java.lang.Integer bufferSize);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(Stream itemData, java.lang.Byte[] buffer);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long WriteItemData(
      Stream itemData, java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void WriteItemData(java.lang.Byte[] itemData);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void WriteItemData(
      java.lang.Byte[] buffer, java.lang.Integer offset, java.lang.Integer count);
}
