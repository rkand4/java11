package com.rocky.interfaces;


/**
 * The supported members in an interface from Java 9 onwards are static constants,
 * abstract methods, default methods, static methods, private methods,
 * nested classes, nested interfaces, nested enums, and nested annotations.
 *
 * ONLY Private implementation methods allowed.
 *
 * Check this for more information: https://www.journaldev.com/12850/java-9-private-methods-interfaces
 * @param <T>
 */
interface InterfaceChanges<T> {

  int SOME_CONSTANT = 35; // variable declaration

  int abstractMethod(int x, int y);   // method declaration

  T abstractMethodUsingGenericType(T[] array, int i); // method using type parameter

  default int defaultMethod(int x, int y) {
    // implementation of method
    // can call the privateMethod and privateStaticMethod here
    return x;
  }

  static void main(String[] args) {
    // any static method, including main can be included in interface
    // can call privateStatic method here
  }

  private int privateMethod1(int x, int y) {
    // private method implementation
    return x;
  }

  private int privateMethod2(int x, int y) {
    // private method implementation
    return x;
  }

  private static void privateStaticMethod(int x, int y) {
    // private method implementation
  }

  // nested class definition
  class NestedClass {
    // members of a class
  }

  // nested interface definition
  interface NestedInterface {
    // member of an interface
  }

  // nested enum definition
  enum NestedEnum {
    OBJECT1,
    OBJECT2,
    ;
    // methods, variables and constructors
  }

  // nested annotation definition
  @interface NestedAnnotation {

    String attrib1();
  }


}