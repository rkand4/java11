package com.rocky.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * there is no need to use finally block and close these file resources explictly.
 */
public class TryWithResources {


  private static final String FILE_NAME = "testFile.txt";

  public static void main(String[] args) throws IOException {
    BufferedReader reader1 = new BufferedReader(new FileReader(Thread.currentThread().getContextClassLoader().getResource(FILE_NAME).getFile()));
    try (reader1) {
      while(reader1.ready()){
        System.out.println(reader1.readLine());
      }
    }
  }

}
