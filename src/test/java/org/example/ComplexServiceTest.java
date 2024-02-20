package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexServiceTest {

    Complex c1;
    Complex c2;
    @BeforeEach
    void init() {
        c1 = new Complex(1,2);
        c2 = new Complex(3,4);
    }
    @Test
    void str() {
        ComplexService comServ = new ComplexService();
        assertEquals("1.0+2.0i", comServ.str(c1));
        assertEquals("3.0+4.0i", comServ.str(c2));
    }

    @Test
    void add() {
        ComplexService comServ = new ComplexService();
        assertEquals(new Complex(4,6), comServ.add(c1,c2));
    }

    @Test
    void sub() {
        ComplexService comServ = new ComplexService();
        assertEquals(new Complex(-2,-2), comServ.sub(c1,c2));
    }

    @Test
    void mul() {
        ComplexService comServ = new ComplexService();
        assertEquals(new Complex(-5,10), comServ.mul(c1,c2));
    }

    @Test
    void div() {
        ComplexService comServ = new ComplexService();
        assertEquals(new Complex(0.44,0.08), comServ.div(c1,c2));
    }

    @Test
    void equal() {
        ComplexService comServ = new ComplexService();
        assertEquals(false, comServ.equal(c1,c2));
        assertEquals(true, comServ.equal(new Complex(),new Complex()));
    }

    @Test
    void mod() {
        Double n = 2.23606797749979;
        Double n1 = 5.0;
        ComplexService comServ = new ComplexService();
        assertEquals(n, comServ.mod(c1));
        assertEquals(n1, comServ.mod(c2));
    }
}