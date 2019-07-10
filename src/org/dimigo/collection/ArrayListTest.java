package org.dimigo.collection;

import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;
public class ArrayListTest {
    public static void main(String[] args) {
        // 1.List계열 : ArrayList
        List list = new ArrayList();
        list.add("나자바");
        list.add(100);
        list.add(new Dog("멍멍이"));

        String str = (String) list.get(0);

        // 제네릭
        List<String> list2 = new ArrayList<>();
        list2.add("사과");
        list2.add("배");
        list2.add("딸기");
        list2.add("딸기");
        list2.add(1,"포도");
        list2.set(2,"바나나");

        printList(list2);

        System.out.println(list2.size() - 1);
        list2.remove(0);
        list2.remove("딸기"); // 하나만 지워지노
        printList(list2);

        list2.clear(); // 펑펑펑펑
        printList(list2);
    }
    private static void printList(List<String> list){
        for(String s : list){
            System.out.print(s + " | ");
        }
        System.out.println();
    }
}
