package org.dimigo.oop2;

public class Singleton {
    private static Singleton instance;
    //new로 객체 생성 못함 ㅅㄱ
    private Singleton(){

    }

    public static Singleton getInstance() {
        return instance;
    }
    public static synchronized Singleton getInstance2() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
