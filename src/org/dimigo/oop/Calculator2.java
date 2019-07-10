package org.dimigo.oop;

public class Calculator2 {
    private boolean powerFlag;
    public static double PI;
    private void powerOn(){
        if(!powerFlag) {
            System.out.println("전원을 킵니다");
            powerFlag = true;
        }
    }
    public static int add(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 + num2;
    }
    public static int sub(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c){
        c.powerOn();
        return num1 * num2;
    }
    public static double div(int num1, int num2, Calculator2 c){
        c.powerOn();
        return (double)num1 / num2;
    }
}
