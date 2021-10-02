package org.closure;

public class Triangle implements Shape {

    private double height;
    private double userRowNumber;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getUserRowNumber() {
        return this.userRowNumber;
    }

    public void setUserRowNumber(double userRowNumber) {
        this.userRowNumber = userRowNumber;
    }


    public Triangle(double height, double userRowNumber) {
        this.height = height;
        this.userRowNumber = userRowNumber;
    }

    @Override
    public void draw() {
        String charToPrint;
        for (int rows=1; rows <= height; rows++)
        {
            charToPrint = "*";
            if(rows == userRowNumber){
                charToPrint = "x";
            }
            // for (int spaces=1; spaces <= number_of_stars; spaces++)
            // {
            //     System.out.print(" ");
            // }
            for (int star=1; star <= rows; star++)
            {
                System.out.print(charToPrint);
                System.out.print(" ");
            }
            System.out.println("");
            // number_of_stars = number_of_stars - 1;
        }
    }
    
}
