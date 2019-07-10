package org.dimigo.oop;

public class Calculator {
    private int num1,num2; // 인스턴스 필드
    private boolean powerFlag;
    public Calculator(){

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void powerOn(){
        if(!powerFlag) {
            System.out.println("전원을 켭니다");
        }
    }
    public  void powerOff(){
        if(powerFlag) {
            System.out.println("전원을 끕니다");
        }
    }
    public int add(){
        powerOn();
        System.out.printf("%d + %d = ",num1,num2);
        return num1+num2;
    }
    public int sub(){
        powerOn();
        System.out.printf("%d - %d = ",num1,num2);
        return num1-num2;
    }
    public int mul(){
        powerOn();
        System.out.printf("%d * %d = ",num1,num2);
        return num1*num2;
    }
    public double div(){
        powerOn();
        System.out.printf("%d / %d = ",num1,num2);
        return (double)num1/num2;
    }
}
