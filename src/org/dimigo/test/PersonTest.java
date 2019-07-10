package org.dimigo.test;

public class PersonTest {
    public static void main(String[] args) {
        Person p[] = new Person[]{
            new Person("Tom"),
                    new Korean("홍길동"),
                    new Japanese("다나카"),
                    new Chinese("왕밍")
        };

        for(Person value: p){
            greeting(value);
        }

    }

    private static void greeting(Person p){
        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }
}
