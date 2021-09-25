package org.closure;

import java.io.File;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    Math.min(1, 3); // 1

    Math.max(1, 3); // 3

    Math.abs(-2); // 2

    Math.sqrt(4); // 2

    Math.pow(2, 4); // 16

    double e = Math.E; // 2.71.....

    double pi = Math.PI; // 3.14

    Math.acos(0.5); // 60 degree

    Math.asin(0.5); // 30 degree

    Math.atan(1); // 45 degree

    Math.ceil(4.1); // 5

    Math.floor(4.9); // 4

    Math.cbrt(27); // 3

    Math.cos(60); // 0.5

    Math.sin(30); // 0.5

    Math.exp(1); // 2.71....

    Math.random(); // random between 0.0 -> 1.0

    double rand = Math.random() * 20 + 30; // random between 30 -> 50

    Gson gson = new Gson();

    User u = new User("java", "P@ss", 1);
    String json = gson.toJson(u);
    System.out.println(json);

    User result = gson.fromJson(json, User.class);

    System.out.println(result.name);

  }
}
