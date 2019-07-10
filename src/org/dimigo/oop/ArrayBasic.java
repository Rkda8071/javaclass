package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 타입 배열
        //int, float, double, char, boolean, byte, Long, short
        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        //double 타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = new double[5];
        printArray(doubleArr);

        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "문진호";

        printArray(strArr);

        String[] strArr2 = {"ITZY", "소녀시대", "걸스데이"};
        printArray(strArr2);

        //Book 타입 배열 2개짜리 생성
        //Book 객체 생성

        Book[] bookArr = {new Book("미생","손강민",200),new Book("똥 잘싸는 법","김규민",300)};
        printArray(bookArr);

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);
    }
    private static void printArray(Book[] doubleArr) {
        for(Book value : doubleArr){
            System.out.println(value);
        }
        System.out.println();
    }

    private static void printArray(String[] doubleArr) {
        for(String value : doubleArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }
}
