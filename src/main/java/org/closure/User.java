package org.closure;

public class User {
    private String name;
    private int age;
    private String auth;

    public void addArticle(String username,String content)
    {}

    public void printInfo()
    {
        System.out.println("name : "+name+", age : "+age+", auth : "+auth);
        System.out.println(String.format("name : %s , age : %d , auth : %s", name,age,auth));
    }

    public User(){}
    public User(String name,int age,String auth)
    {
        this.name = name;
        this.age = age;
        this.auth = auth;
    }



}
