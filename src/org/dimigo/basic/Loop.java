package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1.for 문

        //구구단 출력하기
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++) System.out.printf("%d*%d=%d\t",i,j,i*j);
            System.out.println("");
        }

        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++) System.out.printf("%d ",arr[i]);

        //2. for - each문
        System.out.println("");
        for(int value:arr) System.out.printf("%d ",value);

        String[] BTS = {"타조", "돼지", "형도"};
        for (String i:BTS) {
            System.out.println(i);
        }

        // 3.while, do~while
        Scanner scanner = new Scanner(System.in);
        int menu=0;
        do{
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. 빅뱅");
            System.out.println("3. 걸스데이");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("ITZY를 선택하셨네요");
                    break;
                case 2:
                    System.out.println("빅뱅을 선택하셨네요");
                    break;
                case 3:
                    System.out.println("걸스데이를 선택하셨네요");
                    break;
                case 9:
                    System.out.println("GoodBye World!");
                    scanner.close();
                    break;
                    default:
                        System.out.println("뭘 선택한거에오??");
            }
        }while(menu!=9);

    }
}
