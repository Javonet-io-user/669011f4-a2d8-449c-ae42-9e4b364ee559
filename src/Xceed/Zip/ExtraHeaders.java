package Xceed.Zip;

public enum ExtraHeaders {
  None(0L),
  Unicode(1L),
  FileTimes(2L),
  ExtendedTimeStamp(4L),
  UTF8Filename(8L),
  UTF8Comment(16L),
  ;
  private long numVal;

  ExtraHeaders(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
