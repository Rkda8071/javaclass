package org.dimigo.inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    // Dog에만 있는 메소드
    public void wag(){
        System.out.println(name + "이 꼬리 흔들기!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
