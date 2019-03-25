package jio.System.IO;

public enum FileAttributes {
  ReadOnly(1L),
  Hidden(2L),
  System(4L),
  Directory(16L),
  Archive(32L),
  Device(64L),
  Normal(128L),
  Temporary(256L),
  SparseFile(512L),
  ReparsePoint(1024L),
  Compressed(2048L),
  Offline(4096L),
  NotContentIndexed(8192L),
  Encrypted(16384L),
  IntegrityStream(32768L),
  NoScrubData(131072L),
  ;
  private long numVal;

  FileAttributes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
