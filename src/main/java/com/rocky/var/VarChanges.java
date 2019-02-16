package com.rocky.var;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class VarChanges {


  public static void main(String[] args) throws IOException {
    var list   = new ArrayList<String>();
    var stream = list.stream();

    var newList = List.of("hello", "namaste");
    newList.forEach(System.out::println);

    String fileName = "./pom.xml";

    var path  = Paths.get(fileName);
    var bytes = Files.readAllBytes(path);

    System.out.println("Hello Bytes: " + bytes);

    for (var b : bytes) {
      // TODO
    }

    try (var foo = new FileInputStream(new File(""))) {
      System.out.println(foo);
    } catch (Exception e) {
      // ignore
    }
  }

}
