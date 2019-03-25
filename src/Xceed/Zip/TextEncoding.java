package Xceed.Zip;

public enum TextEncoding {
  Standard(0L),
  Unicode(1L),
  ;
  private long numVal;

  TextEncoding(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
