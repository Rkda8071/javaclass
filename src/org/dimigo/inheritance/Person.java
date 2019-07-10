package org.dimigo.inheritance;

public class Person {
    //부모 객체가 먼저 생성되고 자식 객체가 그 후에 생성된다
    private String name;    // +
    protected int age;      // #
    int height;             // ~
    private int weight;     // -
    public Person(){ }
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println(name + "이 밥을 먹는다.");
    }

    public void sleep() {
        System.out.println(name + "이 잠을 잔다.");
    }
}
