package com.rocky;

public class StringChanges {


  public static void main(String[] args) {
    var netflixStr = "Netflix";
    var emptyStr = "";
    var spaceStr = "   ";
    String nullStr = null;
    //.isBlank()
    System.out.println(netflixStr.isBlank()); //false
    System.out.println(emptyStr.isBlank()); // true
    System.out.println(spaceStr.isBlank()); // true
    //System.out.println(nullStr.isBlank()); //NPE

    var leadingAndTrailingSpaces = "   Netflix  ";
    //.strip()
    System.out.println(leadingAndTrailingSpaces.strip()); // "Netflix"
    System.out.println(leadingAndTrailingSpaces.stripLeading()); // "Netflix  "
    System.out.println(leadingAndTrailingSpaces.stripTrailing()); // "   Netflix"

    var repeatStr = "&".repeat(2);
    //.repeat()
    System.out.println(repeatStr); // &&
    // Edge cases for .repeat()
    var result = netflixStr.repeat(0);
    System.out.println(result); // ""
    var resultAfterMaxRepeat = emptyStr.repeat(Integer.MAX_VALUE);
    System.out.println(resultAfterMaxRepeat); // ""

    //.lines()
    "movies\nicecreams".lines().forEach(System.out::println);












  }

}
