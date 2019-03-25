package Xceed.Compression.LZMA;

public enum LZMAHeaderType {
  None(0L),
  Properties(1L),
  Zip(3L),
  ;
  private long numVal;

  LZMAHeaderType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
