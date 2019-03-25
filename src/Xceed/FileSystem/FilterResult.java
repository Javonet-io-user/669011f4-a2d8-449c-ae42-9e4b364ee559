package Xceed.FileSystem;

public enum FilterResult {
  Reject(0L),
  Accept(1L),
  NotApplicable(2L),
  ;
  private long numVal;

  FilterResult(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
