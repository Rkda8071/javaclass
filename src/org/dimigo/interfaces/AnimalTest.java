package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Duck(), new Cow(), new Pig()
        };
        for(IAnimal a: animals){
            a.eat();
        }
        System.out.println("=== 늑대가 나타났다 ===");
        for(IAnimal a : animals){
            a.bark();
        }
    }
}
