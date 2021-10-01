package org.closure;

public class Report<T> {
    private T requiredObject;
    private String errorMessage;

    public void printReport() {
        System.out.println(requiredObject.toString());
    }


    public T getRequiredObject() {
        return this.requiredObject;
    }

    public void setRequiredObject(T requiredObject) {
        this.requiredObject = requiredObject;
    }

}
