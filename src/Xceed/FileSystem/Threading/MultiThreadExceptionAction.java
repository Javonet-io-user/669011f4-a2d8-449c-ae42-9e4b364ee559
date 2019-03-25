package Xceed.FileSystem.Threading;

public enum MultiThreadExceptionAction {
  Abort(0L),
  Retry(1L),
  Ignore(2L),
  ;
  private long numVal;

  MultiThreadExceptionAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
