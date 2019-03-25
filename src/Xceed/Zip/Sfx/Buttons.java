package Xceed.Zip.Sfx;

public enum Buttons {
  Ok(0L),
  Cancel(1L),
  Abort(2L),
  Skip(3L),
  AlwaysSkip(4L),
  Yes(5L),
  No(6L),
  OverwriteAll(7L),
  OverwriteNone(8L),
  Continue(9L),
  Exit(10L),
  Agree(11L),
  Refuse(12L),
  ;
  private long numVal;

  Buttons(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
