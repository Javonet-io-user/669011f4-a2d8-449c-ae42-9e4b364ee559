package Xceed.Zip.Sfx;

public enum ExistingFileBehavior {
  Prompt(0L),
  SkipAlways(1L),
  OverwriteAlways(2L),
  OverwriteOlderOnly(3L),
  ;
  private long numVal;

  ExistingFileBehavior(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
