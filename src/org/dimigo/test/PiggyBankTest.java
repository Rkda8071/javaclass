package org.dimigo.test;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] Family = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };
        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(Family[0],10000);
        PiggyBank.putMoney(Family[1],5000);
        PiggyBank.putMoney(Family[2],2000);
        PiggyBank.putMoney(Family[3],1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(Family[2],1000);
        PiggyBank.printBalance();
    }
}
