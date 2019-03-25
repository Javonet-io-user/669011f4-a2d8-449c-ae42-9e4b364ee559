package Xceed.Compression;

public enum CompressionMethod {
  Stored(0L),
  Deflated(8L),
  Deflated64(9L),
  BZip2(12L),
  LZMA(14L),
  BWT(18L),
  PPMd(98L),
  ;
  private long numVal;

  CompressionMethod(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
