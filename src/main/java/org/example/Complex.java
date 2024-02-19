package org.example;

public class Complex {
    private double x, y;

    Complex(double real, double imaginary){
        this.x=real;
        this.y=imaginary;
    }
    Complex(){
        x=0;
        y=0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
