package Xceed.Zip;

public enum SplitNameFormat {
  None(0L),
  XceedZipActiveX(1L),
  PkZip(2L),
  WinZip(3L),
  ;
  private long numVal;

  SplitNameFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
