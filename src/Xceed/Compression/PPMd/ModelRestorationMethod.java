package Xceed.Compression.PPMd;

public enum ModelRestorationMethod {
  Restart(0L),
  CutOff(1L),
  Freeze(2L),
  ;
  private long numVal;

  ModelRestorationMethod(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
