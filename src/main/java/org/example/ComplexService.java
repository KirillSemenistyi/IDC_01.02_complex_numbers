package org.example;

public class ComplexService {
    public String str(Complex a){
        return a.getY()<0 ? Double.toString(a.getX())+a.getY() +"i" :
                a.getX()+"+"+a.getY() +"i";
    }
    public Complex add(Complex a, Complex b) {
        return new Complex(a.getX()+b.getX(),a.getY()+b.getY());
    }
    public Complex sub(Complex a, Complex b) {
        return new Complex(a.getX()-b.getX(),a.getY()-b.getY());
    }
    public Complex mul(Complex a, Complex b) {
        return new Complex(a.getX()*b.getX()-a.getY()*b.getY(), a.getX()*b.getY()+b.getX()*a.getY());
    }
    public Complex div(Complex a, Complex b) throws Exception {

        if (b.getX()==0 && b.getY()==0) {
            throw new Exception("Division by zero");
        }
        double x = a.getX();
        double x1 = b.getX();
        double y = a.getY();
        double y1 = b.getY();
        return new Complex((x*x1+y*y1)/(Math.pow(x1,2)+Math.pow(y1,2)),(x1*y-x*y1)/(Math.pow(x1,2)+Math.pow(y1,2)));
    }
    public boolean equal(Complex a, Complex b) {
        return (a.getX()==b.getX())&&(a.getY()==b.getY());
    }
    public double mod(Complex a) {
        return Math.sqrt(Math.pow(a.getX(),2) + Math.pow(a.getY(),2));
    }
}
