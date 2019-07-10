package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr, 10);
        printfArray(intArr);

        String[] names = {"홍길동","홍길서","홍길남","홍길북"};
        changeName(names);
        printfArray(names);
    }

    private static void changeName(String[] names) {
        for(int i=0;i<names.length;i++){
            names[i] = "김" + names[i].substring(1);
        }
        System.out.println();
    }
    private static void printfArray(String[] intArr) {
        for(String value: intArr){
            System.out.print(value + "|");
        }
        System.out.println();
    }
    private static void printfArray(int[] intArr) {
        for(int value: intArr){
            System.out.print(value + "|");
        }
    }

    private static void add(int[] Arr,int plus){
        for(int i=0;i<Arr.length;i++){
            Arr[i] += plus;
        }
    }

}
