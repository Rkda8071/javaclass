package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        String[][] strArr2 = {{"C", "C#","Python"},{"JAVA","PHP","C++"}};
        String[][] strArr3 = new String[][]{{"C", "C#","Python"},{"JAVA","PHP","C++"}};
        String[][] strArr4 = {
                new String[]{"C", "C#","Python"},
                new String[]{"JAVA","PHP","C++"}
        };
        printArray(strArr2);
        printArray(strArr3);
    }

    private static void printArray(int[][] Arr) {
        for (int[] value: Arr){
            for(int value2:value){
                System.out.print(value2);
            }
            System.out.println();
        }
    }
    private static void printArray(String[][] Arr) {
        for (String[] value: Arr){
            for(String value2:value){
                System.out.print(value2);
            }
            System.out.println();
        }
    }
}
