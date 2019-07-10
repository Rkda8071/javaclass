package org.dimigo.abstractclass;

public class BWMEngine extends Engine{
    public void startEngine() {
        System.out.println("BWM 엔진 기동");
    }

    @Override
    public void stopEngine() {
        System.out.println("BWM 엔진 멈춤");
    }
}
