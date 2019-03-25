package Xceed.FileSystem;

public enum ReparsePointTags {
  None(0L),
  ReparseTagNameSurrogate(536870912L),
  ReparseTagMicrosoft(-2147483648L),
  ReparseTagHsm2(-2147483642L),
  ReparseTagSis(-2147483641L),
  ReparseTagWim(-2147483640L),
  ReparseTagCsv(-2147483639L),
  ReparseTagDfs(-2147483638L),
  ReparseTagFilterManager(-2147483637L),
  ReparseTagDfs2(-2147483630L),
  ReparseTagDeDup(-2147483629L),
  ReparseTagNfs(-2147483628L),
  ReparseTagMountPoint(-1610612733L),
  ReparseTagSymLink(-1610612724L),
  ReparseTagHsm(-1073741820L),
  ;
  private long numVal;

  ReparsePointTags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
