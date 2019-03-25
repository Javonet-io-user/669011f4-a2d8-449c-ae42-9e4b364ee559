package Xceed.Zip;

public enum DiskRequiredAction {
  Fail(0L),
  Continue(1L),
  ;
  private long numVal;

  DiskRequiredAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
