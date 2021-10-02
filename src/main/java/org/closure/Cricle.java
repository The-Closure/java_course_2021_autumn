package org.closure;

public class Cricle implements Shape {
    private int posX, posY, radius;

    public Cricle(int posX, int posY, int radius) {
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
    }

    public int getPosX() {
        return this.posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        for (int i = 0; i <= posX + radius; i++) {
            for (int j = 1; j <= posY + radius; j++) {
                int xSquared = (i - posX) * (i - posX);
                int ySquared = (j - posY) * (j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
