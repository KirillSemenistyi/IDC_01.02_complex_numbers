package org.example;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        ComplexService cs = new ComplexService();
        System.out.println("a: " + cs.str(a));
        System.out.println("b: " + cs.str(b));
        System.out.println("Сумма: " + cs.str(cs.add(a,b)));
        System.out.println("Разность: " + cs.str(cs.sub(a,b)));
        System.out.println("Произведение: " + cs.str(cs.mul(a,b)));
        try {
            System.out.println("Частное: " + cs.str(cs.div(a,b)));
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        try {
            System.out.println("Частное: " + cs.str(cs.div(a,new Complex())));
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("Модуль a: " + cs.mod(a));
        System.out.println("Мoдуль b: " + cs.mod(b));
        System.out.println("Сравнение a и перегруженного конструктора: " + cs.equal(a, new Complex()));
        System.out.println("Сравнение a и b: " + cs.equal(a,b));
    }
}