package org.closure;

public class Circle implements Shape, Size {
    public int a;

    @Override
    public void draw() {
        System.out.println("I am circle");
    }

    @Override
    public double CircleSize(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double TriangleSize(int base, int height) throws Exception {
        throw new Exception("this is a circle");
    }

    @Override
    public double RectangleSize(int length, int width) throws Exception {
        throw new Exception("this is a cirlce");
    }

}
