package org.dimigo.interfaces.ICarEngine;

public class BMWEngine implements IEngine{
    public void startEngine(){
        System.out.println("BWM 엔진 가동");
    }
    public void stopEngine(){
        System.out.println("BWM 엔진 멈춤");
    }
}
