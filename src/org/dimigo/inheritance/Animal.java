package org.dimigo.inheritance;

public class Animal {
    protected String name;
    //기본 생성자 없으면 위험함
    /*
        부모 클래스의 메소드와 자식 클래스의 메소드의
        이름, 매게 변수의 개수와 타입들,
     */
    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("냠냠");
    }

    public void sleep(){
        System.out.println("쿨쿨");
    }

    void bark(){
        System.out.println("멍멍");
    }
    public String toString(){
        return "제 이름은 " + name + "입니다";
    }
}
