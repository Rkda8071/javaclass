package org.dimigo.abstractclass;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new BenzEngine());
        car.start();
        car.stop();
        System.out.println("=== 엔진 교체 ===");
        car.setEngine(new BWMEngine());
        car.start();
        car.stop();
    }
}
