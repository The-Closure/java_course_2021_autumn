package org.closure;

public class App {
    public static void drawShape(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape circle = new Shape(){
            @Override
            public void draw(){
                System.out.println("circle");
            }
        };
        
        circle.draw();
    }
    
}
