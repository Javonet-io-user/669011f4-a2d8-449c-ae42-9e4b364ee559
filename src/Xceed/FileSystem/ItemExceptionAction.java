package Xceed.FileSystem;

public enum ItemExceptionAction {
  Abort(0L),
  Retry(1L),
  Ignore(2L),
  ;
  private long numVal;

  ItemExceptionAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
