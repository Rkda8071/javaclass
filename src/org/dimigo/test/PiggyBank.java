package org.dimigo.test;

public class PiggyBank {
    private static int balance;

    public static void putMoney(FamilyMember member, int amount){
        System.out.printf("%s : %,d원 넣음\n",member.getMemberName(),amount);
        balance += amount;
    }
    public static void printBalance(){
        System.out.printf("돼지저금통 총 금액 : %,d원\n",balance);
    }
}
