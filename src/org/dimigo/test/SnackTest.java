package org.dimigo.test;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snack = {new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
        new Snack("허니버터칩", "해태", 1500, 4) };

        printArray(snack);



    }

    private static void printArray(Snack[] Arr) {
        int hap=0;
        for(Snack value : Arr){
            System.out.println(value);
            hap+=value.getPrice()*value.getNumber();
        }
        System.out.printf("총 구매 금액 : %,d원",hap);
    }
}
