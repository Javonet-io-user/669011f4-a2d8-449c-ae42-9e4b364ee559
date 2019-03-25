package Xceed.Compression.LZMA;

public enum MatchFinder {
  bt2(0L),
  bt4(1L),
  ;
  private long numVal;

  MatchFinder(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
