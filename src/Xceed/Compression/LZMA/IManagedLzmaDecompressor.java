package Xceed.Compression.LZMA;

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
import Xceed.Compression.LZMA.*;

public interface IManagedLzmaDecompressor {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void SetLZMAProperties(java.lang.Byte[] properties);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public LZMAHeaderType getHeaderType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getCompressedSize();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getUncompressedSize();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCompressedSize(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUncompressedSize(java.lang.Long value);
}
