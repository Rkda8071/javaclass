package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] attackPoint={100,100,100,100};
        String[] question={"가수는? ","배우는? ","과목은? "};
        String[] answer={"아이유","원빈","자료구조"};
        String ang;
        int menu = 0;
        int num=-1;
        do {
            System.out.println("------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.print("메뉴 입력 => ");
            menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        num = new Random().nextInt(3);
                        System.out.printf("가장 좋아하는 %s",question[num]);
                        ang = scanner.next();
                        System.out.println(ang.equals(answer[num]) ? "정답입니다!" : "틀렸습니다!");
                        break;
                    case 2:
                        System.out.println("<< 정답 출력 >>");
                        StringBuilder sb = new StringBuilder();
                        for(int i=0;i<3;i++) {
                            sb.append("가장 좋아하는 ").append(question[i]).append(answer[i]).append("입니다.");
                            if(i!=2) sb.append("\n");
                        }
                        System.out.println(sb.toString());
                        break;
                    case 9:
                        System.out.println("Bye~");
                        scanner.close();
                        break;
                    default:
                        System.out.println("없는 메뉴입니다.");
                }
        } while (menu != 9);
    }
}