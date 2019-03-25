package Xceed.Zip;

public enum FolderPersistence {
  NotPersisted(0L),
  Persisted(1L),
  ;
  private long numVal;

  FolderPersistence(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
