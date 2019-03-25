package Xceed.Zip;

public enum UnicodeUsagePolicy {
  Always(0L),
  NonASCIIOnly(1L),
  ;
  private long numVal;

  UnicodeUsagePolicy(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
