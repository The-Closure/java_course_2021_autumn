package org.closure;

public class User {
    static int a;
    private String name;
    private String password;
    private final int id;

    public User(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }


    public static void test(){
        System.out.println(a);
        // System.out.println(id);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

  
}
