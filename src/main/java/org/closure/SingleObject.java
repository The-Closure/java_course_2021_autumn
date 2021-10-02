package org.closure;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void getMessage(){
        System.out.println("hello world");
    }
    
}
