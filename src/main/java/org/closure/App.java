package org.closure;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
      String url = "http://www.google.com";
      String email = "thee.closure@gmail.com";
      System.out.println(url.length());
      
      String[] results = url.split("\\.");
      System.out.println(results[0]);

      System.out.println(url.substring(5,10));

      System.out.println(url.indexOf("www"));

      System.out.println(url.charAt(7));

      System.out.println(url.compareTo("http://www.google.coM"));

      System.out.println(url.compareToIgnoreCase("Http://WwW.GooGlE.CoM"));

      System.out.println(url.concat("?user=java&password=123"));

      System.out.println(url.contains("www"));

      System.out.println(url.contentEquals("http://www.google.coM"));

      System.out.println(url.equalsIgnoreCase("http://www.google.coM"));

      System.out.println(url.endsWith("net"));

      System.out.println(url.startsWith("http"));
      
      String.format("url.com?var1=%d&var2=%s", 1,email);

      String.valueOf(3);
      
    }
}
