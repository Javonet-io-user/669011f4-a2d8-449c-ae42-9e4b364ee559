package Xceed.Compression;

public enum StreamingEncryptionMethod {
  Compatible(1L),
  WinZipAes(2L),
  ;
  private long numVal;

  StreamingEncryptionMethod(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
