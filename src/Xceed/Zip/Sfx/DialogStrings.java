package Xceed.Zip.Sfx;

public enum DialogStrings {
  ProgressBar(0L),
  Title(1L),
  CurrentFolder(2L),
  ;
  private long numVal;

  DialogStrings(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
