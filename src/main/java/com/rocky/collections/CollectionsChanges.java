package com.rocky.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * All changes can be found https://gunnarmorling.github.io/jdk-api-diff/jdk10-jdk11-api-diff.html
 */

public class CollectionsChanges {


  public static void main(String[] args) {

    List<Integer> immutableIntList = List.of(1,2,3,4);
    //immutableIntList.add(1); // java.lang.UnsupportedOperationException because above it immmutable. You don't need to wrap in Collections.unmodifieable

    //Immutable Map. No need for Guava or wrapping in Collections.unmodifiable
    Map<String, String> capitalMap = Map.of("usa", "dc", "india", "delhi", "spain", "madrid");//K,V,K,V

    // Create Map out of entries together for readability
    Map<Integer,String> mapFromEntries = Map.ofEntries(
      Map.entry(1,"ramesh"),
      Map.entry(2,"john"),
        Map.entry(3,"sinatra")
    );

    Map.Entry<Integer,String> immutableEntry = Map.entry(1,"calipari");
    Map<Integer, String> mapFromEntry = Map.ofEntries(immutableEntry);

    //Immutable Set
    Set<String> greenSet = Set.of("kale", "spinach", "chard");

  }


}
