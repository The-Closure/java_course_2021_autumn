package org.closure;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
      User admin = new User("zain", 20, "ADMIN");
      admin.printInfo();
      System.out.println(String.format("birth year : %d", admin.calcBirthYear()));
    }
}
