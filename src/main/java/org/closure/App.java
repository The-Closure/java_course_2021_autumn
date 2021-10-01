package org.closure;

import java.io.File;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

  public static void drawShape(Shape s){
    s.draw();
  }
  
  public static void main(String[] args) {
   Shape circle = new Circle(); //upcast
   Circle c = (Circle) circle; //downcast
   drawShape(circle);
    
   System.out.println(User.a); //valid access

   User u = new User("name", "password", 12);
   u.a = 10;
   User u1 = new User("username", "pass",22);
   System.out.println(u1.a);

   User.test();


  }
}
