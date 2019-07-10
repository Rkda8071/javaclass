package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10,20);
        cal.powerOn();
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());
        cal.powerOff();
    }
}
