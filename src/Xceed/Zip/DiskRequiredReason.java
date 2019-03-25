package Xceed.Zip;

public enum DiskRequiredReason {
  Reading(0L),
  Updating(1L),
  DiskFull(2L),
  SplitSizeReached(3L),
  Deleting(4L),
  MovingExistingItems(5L),
  Renaming(6L),
  ;
  private long numVal;

  DiskRequiredReason(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
