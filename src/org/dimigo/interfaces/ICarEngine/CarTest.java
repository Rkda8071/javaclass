package org.dimigo.interfaces.ICarEngine;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new BenzEngine());
        car.start();
        car.stop();
        car.setEngine(new BMWEngine());
        System.out.println("=== 엔진 교체 ===");
        car.start();
        car.stop();
    }
}
