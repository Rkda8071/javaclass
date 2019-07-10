package org.dimigo.basic;

public class dimibene {
    public static void main(String[] args) {
        int a,b,c;
        a=1700000; b=3; c=1500;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n",a);
        System.out.printf("점포 내 직원 수 : %,d명\n",b);
        System.out.printf("점포 수 : %,d개\n\n",c);
        System.out.printf("연간 인건비 : %,d원\n",(long)a*12*b*c);

    }
}
