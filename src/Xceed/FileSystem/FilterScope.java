package Xceed.FileSystem;

public enum FilterScope {
  File(1L),
  Folder(2L),
  All(3L),
  Recurse(4L),
  ;
  private long numVal;

  FilterScope(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
