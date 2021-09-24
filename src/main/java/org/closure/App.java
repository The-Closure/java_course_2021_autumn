package org.closure;

/**
 * Hello world!
 *
 */
public class App {

  public static void checkAge(int i) throws Exception {
    if (i > 18 && i < 42) {
      throw new Exception("our army is waiting you");
    }
    System.out.println("safety age");
  }

  public static void main(String[] args) {
    String s = "test";
    try {
      System.out.println("connecting ...");
      System.out.println(s.charAt(100)); // processing
    } catch (Exception e) {
      System.out.println("Exception occured");
    } finally {
      System.out.println("close");
    }

    try {
      checkAge(20);
      System.out.println("hi");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
