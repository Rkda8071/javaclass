package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark(); // Animal의 bark() "멍멍"

        Animal d = new Dog("멍멍이");
        System.out.println(d);
        d.bark(); // Animal의 bark() (오버라이딩 안했음)
        //d.wag();

        Animal c = new Cat("야옹이");
        System.out.println(c);
        c.bark(); // Cat 고유의 bark() "야옹"
        //c.scratch();

        Animal t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        //t.hunt();


        Animal aa = new Dog("a"); // 업케스팅
        Animal bb = new Cat("a");

        //Dog c = new Animal(); X
        //Cat d = new Animal(); X
        //Dog e = new Cat(); X
        aa.bark(); // Dog의 bark();
        bb.bark();
        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        ((Dog) dog).wag();

        Dog dog2 = (Dog) dog;
        dog2.wag();

        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Object); //Object는 모든 클래스의 최고 클래스
    }
    private static void doAction(Animal a){
        if(a instanceof Cat) {
            Cat c = (Cat) a; // Dog가 들어오면 에러남
            c.scratch();
        }
        else if(a instanceof Dog){
            ((Dog) a).wag();
        }
    }
}
