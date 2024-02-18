package org.example;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex();
        Complex b = new Complex(1,2);
        ComplexService cs = new ComplexService();
        System.out.println("a: " + cs.str(a));
        System.out.println("b: " + cs.str(b));
        System.out.println("Сумма: " + cs.str(cs.add(a,b)));
        System.out.println("Разность: " + cs.str(cs.sub(a,b)));
        System.out.println("Произведение: " + cs.str(cs.mul(a,b)));
        System.out.println("Частное: " + cs.str(cs.div(a,b)));
        System.out.println("Модуль a: " + cs.mod(a));
        System.out.println("Модуль b: " + cs.mod(b));
        System.out.println("Сравнение a и перегруженного конструктора: " + cs.equal(a, new Complex()));
        System.out.println("Сравнение a и b: " + cs.equal(a,b));
    }
}