package Xceed.Compression;

public enum CompressionLevel {
  None(0L),
  Lowest(1L),
  Normal(6L),
  Highest(9L),
  ;
  private long numVal;

  CompressionLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
