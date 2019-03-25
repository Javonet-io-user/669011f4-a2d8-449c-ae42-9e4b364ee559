package Xceed.Zip.Sfx;

public enum DialogMessages {
  Success(0L),
  Error(1L),
  ErrorCreatingFolder(2L),
  Introduction(3L),
  License(4L),
  DestinationFolder(5L),
  Password(6L),
  InsertLastDisk(7L),
  InsertDisk(8L),
  AbortUnzip(9L),
  CreateFolder(10L),
  Overwrite(11L),
  Progress(12L),
  ;
  private long numVal;

  DialogMessages(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
