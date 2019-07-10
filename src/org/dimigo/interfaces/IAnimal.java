package org.dimigo.interfaces;

// 인터페이스 : 하나의 표준/규약/명세
public interface IAnimal {
    // 상수처리 (public static final 자동 붙임)
    String FARM_NAME = "디미 동물농장";
    // 인터페이스의 모든 메소드는 추상 메소드
    default void eat(){ // default : abstract 붙이지마!  (( JDK 8부터 추가
        System.out.println("냠냠");
    }
    void bark();  // public abstract가 붙어 있다고 생각하면 됌

    //정적 메소드
    static void welcome(){
        System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
    }
}
