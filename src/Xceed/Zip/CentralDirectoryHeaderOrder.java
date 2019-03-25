package Xceed.Zip;

public enum CentralDirectoryHeaderOrder {
  Default(0L),
  Fast(1L),
  Physical(2L),
  ;
  private long numVal;

  CentralDirectoryHeaderOrder(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
