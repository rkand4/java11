package com.rocky.lambda;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;

public class LambdaChanges {


  public static void main(String[] args) {

    List<String> icecreamFlavors = List.of("VAnilla","chocolate",null);
    // You can use annotations with lambda parameters with var instead of String in below in java 11
    List<String> upperCaseList = icecreamFlavors.stream()
        .map((@NotNull var s) -> s.toUpperCase())
        .collect(Collectors.toList());
    upperCaseList.forEach(icecream -> System.out.println(icecream));



  }

}
