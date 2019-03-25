package Xceed.Zip;

public enum EncryptionMethod {
  Compatible(1L),
  WinZipAes(2L),
  ;
  private long numVal;

  EncryptionMethod(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
