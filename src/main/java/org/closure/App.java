package org.closure;

public class App {
    public static void drawShape(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape circle = new Cricle(5, 15, 5);
        drawShape(circle);
        Shape triangle = new Triangle(10, 5);
        drawShape(triangle);

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.getMessage();

        SingleObject singleObject2 = SingleObject.getInstance();
        singleObject2.getMessage();
        
    }
    
}
