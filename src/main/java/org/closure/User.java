package org.closure;

public class User {
    static int a;
    String name;
    String password;
    final int id;

    public static void test(){
        System.out.println(a);
        // System.out.println(id);
    }

    public User(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }
    public final void testFinal (){}
}
